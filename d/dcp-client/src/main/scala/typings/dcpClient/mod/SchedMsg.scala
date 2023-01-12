package typings.dcpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedMsg extends StObject {
  
  /**
    * This command is an announcement from the scheduler,
    * the provided message should be displayed to the user (modal on web, console on node). The message to be displayed to the user.
    */
  def announce(message: String): Unit
  
  /**
    * This command instructs the worker to immediately stop working, and can optionally disable the worker to prevent restarting.
    * The user will need to manually intervene to restart the worker. When false, the worker will be disabled.
    */
  def kill(temporary: Boolean): Unit
  
  /**
    * This web-only command will open a new webpage to the provided URL. The URL to open the new page to.
    */
  def openPopup(href: String): Unit
  
  /**
    * This command instructs the worker to “hard” reload, in the browser this will trigger a page refresh and in node it will exit the process.
    */
  def reload(): Unit
  
  /**
    * This command instructs the worker to stop working on a specific job. The address of the job to stop working on.
    */
  def remove(jobAddress: String): Unit
  
  /**
    * This command instructs the worker to restart, e.g. call worker.stop() then worker.start().
    */
  def restart(): Unit
}
object SchedMsg {
  
  inline def apply(
    announce: String => Unit,
    kill: Boolean => Unit,
    openPopup: String => Unit,
    reload: () => Unit,
    remove: String => Unit,
    restart: () => Unit
  ): SchedMsg = {
    val __obj = js.Dynamic.literal(announce = js.Any.fromFunction1(announce), kill = js.Any.fromFunction1(kill), openPopup = js.Any.fromFunction1(openPopup), reload = js.Any.fromFunction0(reload), remove = js.Any.fromFunction1(remove), restart = js.Any.fromFunction0(restart))
    __obj.asInstanceOf[SchedMsg]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SchedMsg] (val x: Self) extends AnyVal {
    
    inline def setAnnounce(value: String => Unit): Self = StObject.set(x, "announce", js.Any.fromFunction1(value))
    
    inline def setKill(value: Boolean => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction1(value))
    
    inline def setOpenPopup(value: String => Unit): Self = StObject.set(x, "openPopup", js.Any.fromFunction1(value))
    
    inline def setReload(value: () => Unit): Self = StObject.set(x, "reload", js.Any.fromFunction0(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
  }
}
