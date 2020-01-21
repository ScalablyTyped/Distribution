package typings.beanstalkd.mod

import typings.beanstalkd.beanstalkdStrings.close
import typings.beanstalkd.beanstalkdStrings.connect
import typings.beanstalkd.beanstalkdStrings.data
import typings.beanstalkd.beanstalkdStrings.drain
import typings.beanstalkd.beanstalkdStrings.end
import typings.beanstalkd.beanstalkdStrings.error
import typings.beanstalkd.beanstalkdStrings.lookup
import typings.beanstalkd.beanstalkdStrings.timeout
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeanstalkdClient extends js.Object {
  var closed: Boolean = js.native
  var host: js.UndefOr[String] = js.native
  var options: js.UndefOr[js.Object] = js.native
  var port: js.UndefOr[Double] = js.native
  var protocol: BeanstalkdProtocol = js.native
  /**
    * Execute a command on Beanstalkd protocol.
    *
    * @param command Command name to execute.
    * @param args Arguments for the command.
    * @param writer The Writer to use for this command.
    * @param reader The Reader to use for this command.
    */
  def _command(command: String, args: js.Array[_], writer: BasicWriter, reader: BasicReader): js.Promise[_] = js.native
  def _command(command: String, args: js.Array[_], writer: BasicWriter, reader: YamlReader): js.Promise[_] = js.native
  /**
    * Bury the specified job and assign it the given priority. Responds with null if successful, a string error otherwise.
    *
    * @param id The job id to bury.
    * @param priority The new priority to assign.
    */
  def bury(id: Double, priority: Double): js.Promise[Unit] = js.native
  /**
    * Connect the Client to the configured Server.
    */
  def connect(): (js.Promise[this.type with BeanstalkdCaller]) with BeanstalkdCaller = js.native
  /**
    * Delete the specified job. Responds with null if successful, a string error otherwise.
    * This is the only method not named identically to its beanstalkd counterpart, because delete is a reserved word in Javascript.
    *
    * @param id The job id to delete.
    */
  def delete(id: Double): js.Promise[Unit] = js.native
  /**
    * Delete the specified job. Responds with null if successful, a string error otherwise.
    * This is the only method not named identically to its beanstalkd counterpart, because delete is a reserved word in Javascript.
    *
    * @param id The job id to delete.
    */
  def destroy(id: Double): js.Promise[Unit] = js.native
  /**
    * Ignore the named tube.
    * Responds with the number of tubes currently watched by the client.
    *
    * @param tube The Tube name to ignore.
    */
  def ignore(tube: Double): js.Promise[Double] = js.native
  /**
    * Kick at most maxToKick delayed and buried jobs back into the active queue.
    * Responds with the number of jobs kicked.
    *
    * @param maxToKick Max number of job to kick and bury.
    */
  def kick(maxToKick: Double): js.Promise[Double] = js.native
  /**
    * Kick the specified job id. Responds with NOT_FOUND if the job was not found.
    * Supported in beanstalkd versions >= 1.6.
    *
    * @param id The job id to kick.
    */
  def kickJob(id: Double): js.Promise[Unit] = js.native
  /**
    * Responds with the name of the tube currently being used by the client.
    */
  def listTubeUsed(): js.Promise[String] = js.native
  /**
    * Responds with an array containing the names of the tubes currently watched by the client.
    */
  def listTubeWatched(): js.Promise[js.Array[String]] = js.native
  /**
    * List all the existing tubes. Responds with an array of tube names.
    */
  def listTubes(): js.Promise[js.Array[String]] = js.native
  //#region Connection events
  /**
    * Listen on given event.
    *
    * @param event The event to listen on.
    * @param listeners The listeners for this event.
    */
  def on(event: String, listeners: (js.Function1[/* repeated */ js.Any, Unit])*): Unit = js.native
  /**
    * The close event is triggered when connection closes.
    *
    * @param event The event to listen on.
    * @param listener Listeners for the close event.
    */
  @JSName("on")
  def on_close(event: close, listeners: (js.Function1[/* had_error */ Boolean, Unit])*): Unit = js.native
  /**
    * The connect event is triggered when the connection is ready.
    * The drain event is triggered when connection drains.
    * The end event is triggered when connection ends.
    * The timeout event is triggered when connection timeout.
    *
    * @param event The event to listen on.
    * @param listeners Listeners for the event.
    */
  @JSName("on")
  def on_connect(event: connect, listeners: js.Function0[Unit]*): Unit = js.native
  /**
    * The data event is triggered when socket receives data.
    *
    * @param event The event to listen on.
    * @param listener Listeners for the data event.
    */
  @JSName("on")
  def on_data(event: data, listeners: (js.Function1[/* data */ Buffer, Unit])*): Unit = js.native
  @JSName("on")
  def on_drain(event: drain, listeners: js.Function0[Unit]*): Unit = js.native
  @JSName("on")
  def on_end(event: end, listeners: js.Function0[Unit]*): Unit = js.native
  /**
    * The error event is triggered when an error occured on the connection.
    *
    * @param event The event to listen on.
    * @param listeners Listeners for the error event.
    */
  @JSName("on")
  def on_error(event: error, listeners: (js.Function1[/* err */ Error, Unit])*): Unit = js.native
  /**
    * The lookup event is triggered when connection performs a lookup on a new address.
    *
    * @param event The event to listen on.
    * @param listener Listeners for the lookup event.
    */
  @JSName("on")
  def on_lookup(
    event: lookup,
    listeners: (js.Function4[
      /* err */ Error, 
      /* address */ String, 
      /* family */ String | Double, 
      /* host */ String, 
      Unit
    ])*
  ): Unit = js.native
  @JSName("on")
  def on_timeout(event: timeout, listeners: js.Function0[Unit]*): Unit = js.native
  /**
    * Pause the named tube for the given number of seconds.
    * No new jobs may be reserved from the tube while it is paused.
    *
    * @param tube The name of the tube to pause.
    * @param delay The pause duration (in seconds).
    */
  def pauseTube(tube: String, delay: Double): js.Promise[Unit] = js.native
  /**
    * Peek at the data for the specified job.
    * Payload is a Buffer object.
    *
    * @param id The job id to peek.
    */
  def peek(id: Double): js.Promise[Buffer] = js.native
  /**
    * Peek at the data for the next buried job in the tube currently in use.
    * Responds with the job id and payload of the next job, or 'NOT_FOUND' in err if there are no qualifying jobs in the tube.
    * The payload is a Buffer object.
    */
  def peekBuried(): js.Promise[js.Tuple2[String, Buffer]] = js.native
  /**
    * Peek at the data for the delayed job with the shortest delay in the tube currently in use.
    * Responds with the job id and payload of the next job, or 'NOT_FOUND' in err if there are no qualifying jobs in the tube.
    * The payload is a Buffer object.
    */
  def peekDelayed(): js.Promise[js.Tuple2[String, Buffer]] = js.native
  /**
    * Peek at the data for the job at the top of the ready queue of the tube currently in use.
    * Responds with the job id and payload of the next job, or 'NOT_FOUND' if there are no qualifying jobs in the tube.
    * The payload is a Buffer object.
    */
  def peekReady(): js.Promise[js.Tuple2[String, Buffer]] = js.native
  /**
    * Submit a job with the specified priority (smaller integers are higher priority), delay in seconds, and allowed time-to-run in seconds.
    * The payload contains the job data the server will return to clients reserving jobs; it can be either a Buffer object or a string.
    * No processing is done on the data. Responds with the id of the newly-created job.
    *
    * @param priority Priority of the job.
    * @param delay Delay of the job in seconds.
    * @param ttr Time-to-run of the job in seconds.
    * @param payload The job payload.
    */
  def put(priority: Double, delay: Double, ttr: Double): js.Promise[String] = js.native
  def put(priority: Double, delay: Double, ttr: Double, payload: String): js.Promise[String] = js.native
  def put(priority: Double, delay: Double, ttr: Double, payload: Buffer): js.Promise[String] = js.native
  /**
    * Close the Client connection.
    */
  def quit(): js.Promise[Unit] = js.native
  /**
    * Release the specified job and assign it the given priority and delay (in seconds).
    *
    * @param id The job id to release.
    * @param priority The new priority in seconds.
    * @param delay The new delay in seconds.
    */
  def release(id: Double, priority: Double, delay: Double): js.Promise[Unit] = js.native
  /**
    * Reserve a job.
    * Responds with the id and the job data.
    * The payload is a Buffer object.
    */
  def reserve(): js.Promise[js.Tuple2[String, Buffer]] = js.native
  /**
    * Reserve a job, waiting the specified number of seconds before timing out.
    * err contains the string "TIMED_OUT" if the specified time elapsed before a job became available.
    * Payload is a buffer.
    *
    * @param seconds Timeout in seconds.
    */
  def reserveWithTimeout(seconds: Double): js.Promise[Unit] = js.native
  /**
    * Request statistics for the beanstalkd server.
    * Responds with a hash containing information about the server.
    */
  def stats(): js.Promise[BeanstalkdStats] = js.native
  /**
    * Request statistics for the specified job.
    * Responds with a hash containing information about the job.
    *
    * @param id The job id to request stats for.
    */
  def statsJob(id: Double): js.Promise[BeanstalkdJobStats] = js.native
  /**
    * Request statistics for the specified tube.
    * Responds with a hash containing information about the tube.
    *
    * @param tube The name of the Tube to request stats for.
    */
  def statsTube(tube: String): js.Promise[BeanstalkdTubeStats] = js.native
  /**
    * Inform the server that the client is still processing a job, thus requesting more time to work on it.
    *
    * @param id The job id to reset TTR on.
    */
  def touch(id: Double): js.Promise[Unit] = js.native
  /**
    * Calling unref() on a socket will allow the program to exit if this is the only active socket in the event system.
    * If the socket is already unrefed calling unref() again will have no effect.
    */
  def unref(): Unit = js.native
  //#endregion
  //#region Commands
  /**
    * Use the specified tube.
    * Reponds with the name of the tube being used.
    *
    * @param tube Tube name to use.
    */
  def use(tube: String): js.Promise[String] = js.native
  /**
    * Watch the named tube.
    * Responds with the number of tubes currently watched by the client.
    *
    * @param tube The Tube name to watch.
    */
  def watch(tube: Double): js.Promise[Double] = js.native
}

