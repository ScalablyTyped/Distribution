package typings.azdata.mod.nb

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SessionManager extends StObject {
  
  /**
    * Indicates whether the manager is ready.
    */
  val isReady: Boolean
  
  /**
    * A Thenable that is fulfilled when the manager is ready.
    */
  val ready: Thenable[Unit]
  
  def shutdown(id: String): Thenable[Unit]
  
  val specs: js.UndefOr[IAllKernels] = js.undefined
  
  def startNew(options: ISessionOptions): Thenable[ISession]
}
object SessionManager {
  
  inline def apply(
    isReady: Boolean,
    ready: Thenable[Unit],
    shutdown: String => Thenable[Unit],
    startNew: ISessionOptions => Thenable[ISession]
  ): SessionManager = {
    val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], shutdown = js.Any.fromFunction1(shutdown), startNew = js.Any.fromFunction1(startNew))
    __obj.asInstanceOf[SessionManager]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SessionManager] (val x: Self) extends AnyVal {
    
    inline def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    
    inline def setReady(value: Thenable[Unit]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    inline def setShutdown(value: String => Thenable[Unit]): Self = StObject.set(x, "shutdown", js.Any.fromFunction1(value))
    
    inline def setSpecs(value: IAllKernels): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    inline def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
    
    inline def setStartNew(value: ISessionOptions => Thenable[ISession]): Self = StObject.set(x, "startNew", js.Any.fromFunction1(value))
  }
}
