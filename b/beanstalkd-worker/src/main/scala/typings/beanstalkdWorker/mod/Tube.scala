package typings.beanstalkdWorker.mod

import typings.beanstalkd.mod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tube extends js.Object {
  
  /**
    * Executes given command on this Tube.
    *
    * @param command The command to execute.
    * @param args The arguments for the command.
    */
  def command(command: String, args: js.Any*): js.Promise[_] = js.native
  
  /**
    * Gets or creates a new Client for given id.
    *
    * @param id The id for the connection.
    */
  def connection(id: String): js.Promise[default] = js.native
  
  /**
    * Handle jobs from this Tube.
    *
    * @param handler The callback for handling jobs.
    * @param options The options for the handler.
    */
  def handle(handler: TubeHandler): Unit = js.native
  def handle(handler: TubeHandler, options: BeanstalkdHandleOptions): Unit = js.native
  
  /** Start watchers for this Tube. */
  def start(): Unit = js.native
  
  /** Stop watching for new Job on this Tube. */
  def stop(): js.Promise[Unit] = js.native
  
  /** Check whether this Tube is currently working. */
  def working(): Boolean = js.native
}
