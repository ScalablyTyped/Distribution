package typings.beanstalkd

import typings.beanstalkd.beanstalkdStrings.close
import typings.beanstalkd.beanstalkdStrings.connect
import typings.beanstalkd.beanstalkdStrings.data
import typings.beanstalkd.beanstalkdStrings.drain
import typings.beanstalkd.beanstalkdStrings.end
import typings.beanstalkd.beanstalkdStrings.error
import typings.beanstalkd.beanstalkdStrings.lookup
import typings.beanstalkd.beanstalkdStrings.on
import typings.beanstalkd.beanstalkdStrings.timeout
import typings.beanstalkd.beanstalkdStrings.unref
import typings.node.Buffer
import typings.node.netMod.Socket
import typings.std.Error
import typings.std.Exclude
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("beanstalkd", JSImport.Default)
  @js.native
  class default () extends BeanstalkdClient {
    def this(host: String) = this()
    def this(host: js.UndefOr[scala.Nothing], port: Double) = this()
    def this(host: String, port: Double) = this()
    def this(host: js.UndefOr[scala.Nothing], port: js.UndefOr[scala.Nothing], options: js.Object) = this()
    def this(host: js.UndefOr[scala.Nothing], port: Double, options: js.Object) = this()
    def this(host: String, port: js.UndefOr[scala.Nothing], options: js.Object) = this()
    def this(host: String, port: Double, options: js.Object) = this()
  }
  /* static members */
  object default {
    
    /**
      * Prepare a command which will be applied on the Client.
      *
      * @param command The command to prepare.
      * @param expected The expected reply.
      */
    @JSImport("beanstalkd", "default.addCommand")
    @js.native
    def addCommand(command: String, expected: String): Unit = js.native
    
    /**
      * Prepare a command which will be applied on the Client.
      *
      * @param command The command to prepare.
      * @param expected The expected reply.
      */
    @JSImport("beanstalkd", "default.addYamlCommand")
    @js.native
    def addYamlCommand(command: String, expected: String): Unit = js.native
  }
  
  type ArgsType[T] = js.Any
  
  @js.native
  trait BasicReader extends StObject {
    
    def handle(
      protocol: BeanstalkdProtocol,
      data: js.Any,
      resolve: js.Function1[/* data */ js.UndefOr[js.Any], Unit],
      reject: js.Function1[/* err */ js.UndefOr[js.Any], _]
    ): Buffer = js.native
    
    def parseData(data: String): js.Any = js.native
  }
  object BasicReader {
    
    @scala.inline
    def apply(
      handle: (BeanstalkdProtocol, js.Any, js.Function1[/* data */ js.UndefOr[js.Any], Unit], js.Function1[/* err */ js.UndefOr[js.Any], _]) => Buffer,
      parseData: String => js.Any
    ): BasicReader = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction4(handle), parseData = js.Any.fromFunction1(parseData))
      __obj.asInstanceOf[BasicReader]
    }
    
    @scala.inline
    implicit class BasicReaderMutableBuilder[Self <: BasicReader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(
        value: (BeanstalkdProtocol, js.Any, js.Function1[/* data */ js.UndefOr[js.Any], Unit], js.Function1[/* err */ js.UndefOr[js.Any], _]) => Buffer
      ): Self = StObject.set(x, "handle", js.Any.fromFunction4(value))
      
      @scala.inline
      def setParseData(value: String => js.Any): Self = StObject.set(x, "parseData", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait BasicWriter extends Writer {
    
    def handle(protocol: BeanstalkdProtocol, connection: Socket, args: js.Any*): js.Promise[_] = js.native
  }
  object BasicWriter {
    
    @scala.inline
    def apply(command: String, handle: (BeanstalkdProtocol, Socket, /* repeated */ js.Any) => js.Promise[_]): BasicWriter = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], handle = js.Any.fromFunction3(handle))
      __obj.asInstanceOf[BasicWriter]
    }
    
    @scala.inline
    implicit class BasicWriterMutableBuilder[Self <: BasicWriter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHandle(value: (BeanstalkdProtocol, Socket, /* repeated */ js.Any) => js.Promise[_]): Self = StObject.set(x, "handle", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait BeanstalkdCaller extends StObject {
    
    def call[K /* <: Exclude[
        FunctionsNames[BeanstalkdClient], 
        on | unref | typings.beanstalkd.beanstalkdStrings.call
      ] */](
      fn: K,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type ArgsType<Required<BeanstalkdClient>[K]> is not an array type */ args: ArgsType[
          /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
        ]
    ): (MergePromise[
        ReturnType[
          /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
        ]
      ]) with BeanstalkdCaller = js.native
  }
  object BeanstalkdCaller {
    
    @scala.inline
    def apply(
      call: (js.Any, ArgsType[
          /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
        ]) => (MergePromise[
          ReturnType[
            /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
          ]
        ]) with BeanstalkdCaller
    ): BeanstalkdCaller = {
      val __obj = js.Dynamic.literal(call = js.Any.fromFunction2(call))
      __obj.asInstanceOf[BeanstalkdCaller]
    }
    
    @scala.inline
    implicit class BeanstalkdCallerMutableBuilder[Self <: BeanstalkdCaller] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCall(
        value: (js.Any, ArgsType[
              /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
            ]) => (MergePromise[
              ReturnType[
                /* import warning: importer.ImportType#apply Failed type conversion: beanstalkd.anon.RequiredBeanstalkdClient[K] */ js.Any
              ]
            ]) with BeanstalkdCaller
      ): Self = StObject.set(x, "call", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait BeanstalkdClient extends StObject {
    
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
    
    var closed: Boolean = js.native
    
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
    
    var host: js.UndefOr[String] = js.native
    
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
    
    var options: js.UndefOr[js.Object] = js.native
    
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
    
    var port: js.UndefOr[Double] = js.native
    
    var protocol: BeanstalkdProtocol = js.native
    
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.beanstalkd.beanstalkdStrings.ready
    - typings.beanstalkd.beanstalkdStrings.delayed
    - typings.beanstalkd.beanstalkdStrings.reserved
    - typings.beanstalkd.beanstalkdStrings.buried
  */
  trait BeanstalkdJobState extends StObject
  object BeanstalkdJobState {
    
    @scala.inline
    def buried: typings.beanstalkd.beanstalkdStrings.buried = "buried".asInstanceOf[typings.beanstalkd.beanstalkdStrings.buried]
    
    @scala.inline
    def delayed: typings.beanstalkd.beanstalkdStrings.delayed = "delayed".asInstanceOf[typings.beanstalkd.beanstalkdStrings.delayed]
    
    @scala.inline
    def ready: typings.beanstalkd.beanstalkdStrings.ready = "ready".asInstanceOf[typings.beanstalkd.beanstalkdStrings.ready]
    
    @scala.inline
    def reserved: typings.beanstalkd.beanstalkdStrings.reserved = "reserved".asInstanceOf[typings.beanstalkd.beanstalkdStrings.reserved]
  }
  
  @js.native
  trait BeanstalkdJobStats extends StObject {
    
    /** The time in seconds since the put command that created this job. */
    var age: Double = js.native
    
    /** The number of times this job has been buried. */
    var buries: Double = js.native
    
    /** The integer number of seconds to wait before putting this job in the ready queue. */
    var delay: Double = js.native
    
    /**
      * The number of the earliest binlog file containing this job.
      * If -b wasn't used, this will be 0.
      */
    var file: Double = js.native
    
    /** The job id. */
    var id: String = js.native
    
    /** The number of times this job has been kicked. */
    var kicks: Double = js.native
    
    /** The priority value set by the put, release, or bury commands. */
    var pri: Double = js.native
    
    /** The number of times a client has released this job from a reservation. */
    var releases: Double = js.native
    
    /** The number of times this job has been reserved. */
    var reserves: Double = js.native
    
    /** The job state. */
    var state: String = js.native
    
    /**
      * The number of seconds left until the server puts this job into the ready queue.
      * This number is only meaningful if the job is reserved or delayed.
      * If the job is reserved and this amount of time elapses before its state changes, it is considered to have timed out.
      */
    var `time-left`: Double = js.native
    
    /** The number of times this job has timed out during a reservation. */
    var timeouts: Double = js.native
    
    /** Time to run: The integer number of seconds a worker is allowed to run this job. */
    var ttr: Double = js.native
    
    /** The name of the tube that contains this job. */
    var tube: String = js.native
  }
  object BeanstalkdJobStats {
    
    @scala.inline
    def apply(
      age: Double,
      buries: Double,
      delay: Double,
      file: Double,
      id: String,
      kicks: Double,
      pri: Double,
      releases: Double,
      reserves: Double,
      state: String,
      `time-left`: Double,
      timeouts: Double,
      ttr: Double,
      tube: String
    ): BeanstalkdJobStats = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], buries = buries.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kicks = kicks.asInstanceOf[js.Any], pri = pri.asInstanceOf[js.Any], releases = releases.asInstanceOf[js.Any], reserves = reserves.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], timeouts = timeouts.asInstanceOf[js.Any], ttr = ttr.asInstanceOf[js.Any], tube = tube.asInstanceOf[js.Any])
      __obj.updateDynamic("time-left")(`time-left`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeanstalkdJobStats]
    }
    
    @scala.inline
    implicit class BeanstalkdJobStatsMutableBuilder[Self <: BeanstalkdJobStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuries(value: Double): Self = StObject.set(x, "buries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFile(value: Double): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKicks(value: Double): Self = StObject.set(x, "kicks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPri(value: Double): Self = StObject.set(x, "pri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleases(value: Double): Self = StObject.set(x, "releases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReserves(value: Double): Self = StObject.set(x, "reserves", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTime-left`(value: Double): Self = StObject.set(x, "time-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeouts(value: Double): Self = StObject.set(x, "timeouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTtr(value: Double): Self = StObject.set(x, "ttr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTube(value: String): Self = StObject.set(x, "tube", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BeanstalkdProtocol extends StObject {
    
    def add(signature: String, key: String): Unit = js.native
    
    def addCommand(signature: String): Unit = js.native
    
    def addReply(signature: String): Unit = js.native
    
    def addType(key: String, `type`: js.Any): Unit = js.native
    
    def build(identifier: String, args: js.Array[_], key: String): Buffer = js.native
    
    def buildCommand(command: String, args: js.Array[_]): Buffer = js.native
    
    def buildPut(args: js.Array[_]): Buffer = js.native
    
    def buildreply(reply: String, args: js.Array[_]): Buffer = js.native
    
    def parse(buffer: Buffer, key: String): js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null] = js.native
    
    def parseCommand(buffer: Buffer): js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null] = js.native
    
    def parseReply(buffer: Buffer): js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null] = js.native
    
    def reset(): Unit = js.native
  }
  object BeanstalkdProtocol {
    
    @scala.inline
    def apply(
      add: (String, String) => Unit,
      addCommand: String => Unit,
      addReply: String => Unit,
      addType: (String, js.Any) => Unit,
      build: (String, js.Array[_], String) => Buffer,
      buildCommand: (String, js.Array[_]) => Buffer,
      buildPut: js.Array[_] => Buffer,
      buildreply: (String, js.Array[_]) => Buffer,
      parse: (Buffer, String) => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null],
      parseCommand: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null],
      parseReply: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null],
      reset: () => Unit
    ): BeanstalkdProtocol = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), addCommand = js.Any.fromFunction1(addCommand), addReply = js.Any.fromFunction1(addReply), addType = js.Any.fromFunction2(addType), build = js.Any.fromFunction3(build), buildCommand = js.Any.fromFunction2(buildCommand), buildPut = js.Any.fromFunction1(buildPut), buildreply = js.Any.fromFunction2(buildreply), parse = js.Any.fromFunction2(parse), parseCommand = js.Any.fromFunction1(parseCommand), parseReply = js.Any.fromFunction1(parseReply), reset = js.Any.fromFunction0(reset))
      __obj.asInstanceOf[BeanstalkdProtocol]
    }
    
    @scala.inline
    implicit class BeanstalkdProtocolMutableBuilder[Self <: BeanstalkdProtocol] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (String, String) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAddCommand(value: String => Unit): Self = StObject.set(x, "addCommand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddReply(value: String => Unit): Self = StObject.set(x, "addReply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAddType(value: (String, js.Any) => Unit): Self = StObject.set(x, "addType", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBuild(value: (String, js.Array[_], String) => Buffer): Self = StObject.set(x, "build", js.Any.fromFunction3(value))
      
      @scala.inline
      def setBuildCommand(value: (String, js.Array[_]) => Buffer): Self = StObject.set(x, "buildCommand", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBuildPut(value: js.Array[_] => Buffer): Self = StObject.set(x, "buildPut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBuildreply(value: (String, js.Array[_]) => Buffer): Self = StObject.set(x, "buildreply", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParse(
        value: (Buffer, String) => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | BeanstalkdProtocolReply | Null]
      ): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      @scala.inline
      def setParseCommand(value: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolCommand | Null]): Self = StObject.set(x, "parseCommand", js.Any.fromFunction1(value))
      
      @scala.inline
      def setParseReply(value: Buffer => js.Tuple2[Buffer | Null, BeanstalkdProtocolReply | Null]): Self = StObject.set(x, "parseReply", js.Any.fromFunction1(value))
      
      @scala.inline
      def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait BeanstalkdProtocolCommand extends StObject {
    
    var args: js.Array[_] = js.native
    
    var command: String = js.native
  }
  object BeanstalkdProtocolCommand {
    
    @scala.inline
    def apply(args: js.Array[_], command: String): BeanstalkdProtocolCommand = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeanstalkdProtocolCommand]
    }
    
    @scala.inline
    implicit class BeanstalkdProtocolCommandMutableBuilder[Self <: BeanstalkdProtocolCommand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BeanstalkdProtocolReply extends StObject {
    
    var args: js.Array[_] = js.native
    
    var reply: String = js.native
  }
  object BeanstalkdProtocolReply {
    
    @scala.inline
    def apply(args: js.Array[_], reply: String): BeanstalkdProtocolReply = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeanstalkdProtocolReply]
    }
    
    @scala.inline
    implicit class BeanstalkdProtocolReplyMutableBuilder[Self <: BeanstalkdProtocolReply] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArgs(value: js.Array[_]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArgsVarargs(value: js.Any*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      @scala.inline
      def setReply(value: String): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BeanstalkdStats extends StObject {
    
    /** The index of the current binlog file being written to. If binlog is not active this value will be 0. */
    var `binlog-current-index`: Double = js.native
    
    /** The maximum size in bytes a binlog file is allowed to get before a new binlog file is opened. */
    var `binlog-max-size`: Double = js.native
    
    /** The index of the oldest binlog file needed to store the current jobs. */
    var `binlog-oldest-index`: Double = js.native
    
    /** The cumulative number of records written as part of compaction. */
    var `binlog-records-migrated`: Double = js.native
    
    /** The cumulative number of records written to the binlog. */
    var `binlog-records-written`: Double = js.native
    
    /** The cumulative number of bury commands. */
    var `cmd-bury`: Double = js.native
    
    /** The cumulative number of delete commands. */
    var `cmd-delete`: Double = js.native
    
    /** The cumulative number of ignore commands. */
    var `cmd-ignore`: Double = js.native
    
    /** The cumulative number of kick commands. */
    var `cmd-kick`: Double = js.native
    
    /** The cumulative number of list-tube-used commands. */
    var `cmd-list-tube-used`: Double = js.native
    
    /** The cumulative number of list-tubes commands. */
    var `cmd-list-tubes`: Double = js.native
    
    /** The cumulative number of list-tubes-watched commands. */
    var `cmd-list-tubes-watched`: Double = js.native
    
    /** The cumulative number of pause-tube commands. */
    var `cmd-pause-tube`: Double = js.native
    
    /** The cumulative number of peek commands. */
    var `cmd-peek`: Double = js.native
    
    /** The cumulative number of peek-buried commands. */
    var `cmd-peek-buried`: Double = js.native
    
    /** The cumulative number of peek-delayed commands. */
    var `cmd-peek-delayed`: Double = js.native
    
    /** The cumulative number of peek-ready commands. */
    var `cmd-peek-ready`: Double = js.native
    
    /** The cumulative number of put commands. */
    var `cmd-put`: Double = js.native
    
    /** The cumulative number of release commands. */
    var `cmd-release`: Double = js.native
    
    /** The cumulative number of reserve commands. */
    var `cmd-reserve`: Double = js.native
    
    /** The cumulative number of stats commands. */
    var `cmd-stats`: Double = js.native
    
    /** The cumulative number of stats-job commands. */
    var `cmd-stats-job`: Double = js.native
    
    /** The cumulative number of stats-tube commands. */
    var `cmd-stats-tube`: Double = js.native
    
    /** The cumulative number of use commands. */
    var `cmd-use`: Double = js.native
    
    /** The cumulative number of watch commands. */
    var `cmd-watch`: Double = js.native
    
    /** The number of currently open connections. */
    var `current-connections`: Double = js.native
    
    /** The number of buried jobs. */
    var `current-jobs-buried`: Double = js.native
    
    /** The number of delayed jobs. */
    var `current-jobs-delayed`: Double = js.native
    
    /** The number of jobs in the ready queue. */
    var `current-jobs-ready`: Double = js.native
    
    /** The number of jobs reserved by all clients. */
    var `current-jobs-reserved`: Double = js.native
    
    /** The number of ready jobs with priority < 1024. */
    var `current-jobs-urgent`: Double = js.native
    
    /** The number of open connections that have each issued at least one put command. */
    var `current-producers`: Double = js.native
    
    /** The number of currently-existing tubes. */
    var `current-tubes`: Double = js.native
    
    /** The number of open connections that have issued a reserve command but not yet received a response. */
    var `current-waiting`: Double = js.native
    
    /** The number of open connections that have each issued at least one reserve command. */
    var `current-workers`: Double = js.native
    
    /** Set to "true" if the server is in drain mode, "false" otherwise. */
    var draining: Boolean = js.native
    
    /** The hostname of the machine as determined by uname. */
    var hostname: String = js.native
    
    /** A random id string for this server process, generated every time beanstalkd process starts. */
    var id: String = js.native
    
    /** The cumulative count of times a job has timed out. */
    var `job-timeouts`: Double = js.native
    
    /** The maximum number of bytes in a job. */
    var `max-job-size`: Double = js.native
    
    /** The OS version as determined by uname */
    var os: String = js.native
    
    /** The process id of the server. */
    var pid: String = js.native
    
    /** The machine architecture as determined by uname */
    var platform: String = js.native
    
    /** The cumulative system CPU time of this process in seconds and microseconds. */
    var `rusage-stime`: Double = js.native
    
    /** The cumulative user CPU time of this process in seconds and microseconds. */
    var `rusage-utime`: Double = js.native
    
    /** The cumulative count of connections. */
    var `total-connections`: Double = js.native
    
    /** The cumulative count of jobs created. */
    var `total-jobs`: Double = js.native
    
    /** The number of seconds since this server process started running. */
    var uptime: Double = js.native
    
    /** The version string of the server. */
    var version: String = js.native
  }
  object BeanstalkdStats {
    
    @scala.inline
    def apply(
      `binlog-current-index`: Double,
      `binlog-max-size`: Double,
      `binlog-oldest-index`: Double,
      `binlog-records-migrated`: Double,
      `binlog-records-written`: Double,
      `cmd-bury`: Double,
      `cmd-delete`: Double,
      `cmd-ignore`: Double,
      `cmd-kick`: Double,
      `cmd-list-tube-used`: Double,
      `cmd-list-tubes`: Double,
      `cmd-list-tubes-watched`: Double,
      `cmd-pause-tube`: Double,
      `cmd-peek`: Double,
      `cmd-peek-buried`: Double,
      `cmd-peek-delayed`: Double,
      `cmd-peek-ready`: Double,
      `cmd-put`: Double,
      `cmd-release`: Double,
      `cmd-reserve`: Double,
      `cmd-stats`: Double,
      `cmd-stats-job`: Double,
      `cmd-stats-tube`: Double,
      `cmd-use`: Double,
      `cmd-watch`: Double,
      `current-connections`: Double,
      `current-jobs-buried`: Double,
      `current-jobs-delayed`: Double,
      `current-jobs-ready`: Double,
      `current-jobs-reserved`: Double,
      `current-jobs-urgent`: Double,
      `current-producers`: Double,
      `current-tubes`: Double,
      `current-waiting`: Double,
      `current-workers`: Double,
      draining: Boolean,
      hostname: String,
      id: String,
      `job-timeouts`: Double,
      `max-job-size`: Double,
      os: String,
      pid: String,
      platform: String,
      `rusage-stime`: Double,
      `rusage-utime`: Double,
      `total-connections`: Double,
      `total-jobs`: Double,
      uptime: Double,
      version: String
    ): BeanstalkdStats = {
      val __obj = js.Dynamic.literal(draining = draining.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], os = os.asInstanceOf[js.Any], pid = pid.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("binlog-current-index")(`binlog-current-index`.asInstanceOf[js.Any])
      __obj.updateDynamic("binlog-max-size")(`binlog-max-size`.asInstanceOf[js.Any])
      __obj.updateDynamic("binlog-oldest-index")(`binlog-oldest-index`.asInstanceOf[js.Any])
      __obj.updateDynamic("binlog-records-migrated")(`binlog-records-migrated`.asInstanceOf[js.Any])
      __obj.updateDynamic("binlog-records-written")(`binlog-records-written`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-bury")(`cmd-bury`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-delete")(`cmd-delete`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-ignore")(`cmd-ignore`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-kick")(`cmd-kick`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-list-tube-used")(`cmd-list-tube-used`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-list-tubes")(`cmd-list-tubes`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-list-tubes-watched")(`cmd-list-tubes-watched`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-pause-tube")(`cmd-pause-tube`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-peek")(`cmd-peek`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-peek-buried")(`cmd-peek-buried`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-peek-delayed")(`cmd-peek-delayed`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-peek-ready")(`cmd-peek-ready`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-put")(`cmd-put`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-release")(`cmd-release`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-reserve")(`cmd-reserve`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-stats")(`cmd-stats`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-stats-job")(`cmd-stats-job`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-stats-tube")(`cmd-stats-tube`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-use")(`cmd-use`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-watch")(`cmd-watch`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-connections")(`current-connections`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-jobs-buried")(`current-jobs-buried`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-jobs-delayed")(`current-jobs-delayed`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-jobs-ready")(`current-jobs-ready`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-jobs-reserved")(`current-jobs-reserved`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-jobs-urgent")(`current-jobs-urgent`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-producers")(`current-producers`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-tubes")(`current-tubes`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-waiting")(`current-waiting`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-workers")(`current-workers`.asInstanceOf[js.Any])
      __obj.updateDynamic("job-timeouts")(`job-timeouts`.asInstanceOf[js.Any])
      __obj.updateDynamic("max-job-size")(`max-job-size`.asInstanceOf[js.Any])
      __obj.updateDynamic("rusage-stime")(`rusage-stime`.asInstanceOf[js.Any])
      __obj.updateDynamic("rusage-utime")(`rusage-utime`.asInstanceOf[js.Any])
      __obj.updateDynamic("total-connections")(`total-connections`.asInstanceOf[js.Any])
      __obj.updateDynamic("total-jobs")(`total-jobs`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeanstalkdStats]
    }
    
    @scala.inline
    implicit class BeanstalkdStatsMutableBuilder[Self <: BeanstalkdStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setBinlog-current-index`(value: Double): Self = StObject.set(x, "binlog-current-index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBinlog-max-size`(value: Double): Self = StObject.set(x, "binlog-max-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBinlog-oldest-index`(value: Double): Self = StObject.set(x, "binlog-oldest-index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBinlog-records-migrated`(value: Double): Self = StObject.set(x, "binlog-records-migrated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setBinlog-records-written`(value: Double): Self = StObject.set(x, "binlog-records-written", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-bury`(value: Double): Self = StObject.set(x, "cmd-bury", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-delete`(value: Double): Self = StObject.set(x, "cmd-delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-ignore`(value: Double): Self = StObject.set(x, "cmd-ignore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-kick`(value: Double): Self = StObject.set(x, "cmd-kick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-list-tube-used`(value: Double): Self = StObject.set(x, "cmd-list-tube-used", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-list-tubes`(value: Double): Self = StObject.set(x, "cmd-list-tubes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-list-tubes-watched`(value: Double): Self = StObject.set(x, "cmd-list-tubes-watched", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-pause-tube`(value: Double): Self = StObject.set(x, "cmd-pause-tube", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-peek`(value: Double): Self = StObject.set(x, "cmd-peek", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-peek-buried`(value: Double): Self = StObject.set(x, "cmd-peek-buried", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-peek-delayed`(value: Double): Self = StObject.set(x, "cmd-peek-delayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-peek-ready`(value: Double): Self = StObject.set(x, "cmd-peek-ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-put`(value: Double): Self = StObject.set(x, "cmd-put", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-release`(value: Double): Self = StObject.set(x, "cmd-release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-reserve`(value: Double): Self = StObject.set(x, "cmd-reserve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-stats`(value: Double): Self = StObject.set(x, "cmd-stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-stats-job`(value: Double): Self = StObject.set(x, "cmd-stats-job", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-stats-tube`(value: Double): Self = StObject.set(x, "cmd-stats-tube", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-use`(value: Double): Self = StObject.set(x, "cmd-use", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-watch`(value: Double): Self = StObject.set(x, "cmd-watch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-connections`(value: Double): Self = StObject.set(x, "current-connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-jobs-buried`(value: Double): Self = StObject.set(x, "current-jobs-buried", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-jobs-delayed`(value: Double): Self = StObject.set(x, "current-jobs-delayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-jobs-ready`(value: Double): Self = StObject.set(x, "current-jobs-ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-jobs-reserved`(value: Double): Self = StObject.set(x, "current-jobs-reserved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-jobs-urgent`(value: Double): Self = StObject.set(x, "current-jobs-urgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-producers`(value: Double): Self = StObject.set(x, "current-producers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-tubes`(value: Double): Self = StObject.set(x, "current-tubes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-waiting`(value: Double): Self = StObject.set(x, "current-waiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-workers`(value: Double): Self = StObject.set(x, "current-workers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraining(value: Boolean): Self = StObject.set(x, "draining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setJob-timeouts`(value: Double): Self = StObject.set(x, "job-timeouts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setMax-job-size`(value: Double): Self = StObject.set(x, "max-job-size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOs(value: String): Self = StObject.set(x, "os", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPid(value: String): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRusage-stime`(value: Double): Self = StObject.set(x, "rusage-stime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setRusage-utime`(value: Double): Self = StObject.set(x, "rusage-utime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTotal-connections`(value: Double): Self = StObject.set(x, "total-connections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTotal-jobs`(value: Double): Self = StObject.set(x, "total-jobs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUptime(value: Double): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BeanstalkdTubeStats extends StObject {
    
    /** The cumulative number of delete commands for this tube. */
    var `cmd-delete`: Double = js.native
    
    /** The cumulative number of pause-tube commands for this tube. */
    var `cmd-pause-tube`: Double = js.native
    
    /** The number of buried jobs in this tube. */
    var `current-jobs-buried`: Double = js.native
    
    /** The number of delayed jobs in this tube. */
    var `current-jobs-delayed`: Double = js.native
    
    /** The number of jobs in the ready queue in this tube. */
    var `current-jobs-ready`: Double = js.native
    
    /** The number of jobs reserved by all clients in this tube. */
    var `current-jobs-reserved`: Double = js.native
    
    /** The number of ready jobs with priority < 1024 in this tube. */
    var `current-jobs-urgent`: Double = js.native
    
    /** The number of open connections that are currently using this tube. */
    var `current-using`: Double = js.native
    
    /** The number of open connections that have issued a reserve command while watching this tube but not yet received a response. */
    var `current-waiting`: Double = js.native
    
    /** The number of open connections that are currently watching this tube. */
    var `current-watching`: Double = js.native
    
    /** The tube's name. */
    var name: String = js.native
    
    /** The number of seconds the tube has been paused for. */
    var pause: Double = js.native
    
    /** The number of seconds until the tube is un-paused. */
    var `pause-time-left`: Double = js.native
    
    /** The cumulative count of jobs created in this tube in the current beanstalkd process. */
    var `total-jobs`: Double = js.native
  }
  object BeanstalkdTubeStats {
    
    @scala.inline
    def apply(
      `cmd-delete`: Double,
      `cmd-pause-tube`: Double,
      `current-jobs-buried`: Double,
      `current-jobs-delayed`: Double,
      `current-jobs-ready`: Double,
      `current-jobs-reserved`: Double,
      `current-jobs-urgent`: Double,
      `current-using`: Double,
      `current-waiting`: Double,
      `current-watching`: Double,
      name: String,
      pause: Double,
      `pause-time-left`: Double,
      `total-jobs`: Double
    ): BeanstalkdTubeStats = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pause = pause.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-delete")(`cmd-delete`.asInstanceOf[js.Any])
      __obj.updateDynamic("cmd-pause-tube")(`cmd-pause-tube`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-jobs-buried")(`current-jobs-buried`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-jobs-delayed")(`current-jobs-delayed`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-jobs-ready")(`current-jobs-ready`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-jobs-reserved")(`current-jobs-reserved`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-jobs-urgent")(`current-jobs-urgent`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-using")(`current-using`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-waiting")(`current-waiting`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-watching")(`current-watching`.asInstanceOf[js.Any])
      __obj.updateDynamic("pause-time-left")(`pause-time-left`.asInstanceOf[js.Any])
      __obj.updateDynamic("total-jobs")(`total-jobs`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BeanstalkdTubeStats]
    }
    
    @scala.inline
    implicit class BeanstalkdTubeStatsMutableBuilder[Self <: BeanstalkdTubeStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setCmd-delete`(value: Double): Self = StObject.set(x, "cmd-delete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCmd-pause-tube`(value: Double): Self = StObject.set(x, "cmd-pause-tube", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-jobs-buried`(value: Double): Self = StObject.set(x, "current-jobs-buried", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-jobs-delayed`(value: Double): Self = StObject.set(x, "current-jobs-delayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-jobs-ready`(value: Double): Self = StObject.set(x, "current-jobs-ready", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-jobs-reserved`(value: Double): Self = StObject.set(x, "current-jobs-reserved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-jobs-urgent`(value: Double): Self = StObject.set(x, "current-jobs-urgent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-using`(value: Double): Self = StObject.set(x, "current-using", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-waiting`(value: Double): Self = StObject.set(x, "current-waiting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setCurrent-watching`(value: Double): Self = StObject.set(x, "current-watching", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPause(value: Double): Self = StObject.set(x, "pause", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setPause-time-left`(value: Double): Self = StObject.set(x, "pause-time-left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setTotal-jobs`(value: Double): Self = StObject.set(x, "total-jobs", value.asInstanceOf[js.Any])
    }
  }
  
  type FunctionsNames[T] = (/* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends (args : ...any): any? K : never}[keyof T] */ js.Any) with String
  
  type MergePromise[T] = js.Promise[UnPromise[T]]
  
  type UnPromise[T] = T
  
  @js.native
  trait Writer extends StObject {
    
    var command: String = js.native
  }
  object Writer {
    
    @scala.inline
    def apply(command: String): Writer = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any])
      __obj.asInstanceOf[Writer]
    }
    
    @scala.inline
    implicit class WriterMutableBuilder[Self <: Writer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait YamlReader extends BasicReader
  object YamlReader {
    
    @scala.inline
    def apply(
      handle: (BeanstalkdProtocol, js.Any, js.Function1[/* data */ js.UndefOr[js.Any], Unit], js.Function1[/* err */ js.UndefOr[js.Any], _]) => Buffer,
      parseData: String => js.Any
    ): YamlReader = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction4(handle), parseData = js.Any.fromFunction1(parseData))
      __obj.asInstanceOf[YamlReader]
    }
  }
}
