package typings.azdata.mod.nb

import typings.vscode.Thenable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SessionManager extends StObject {
  
  /**
    * Indicates whether the manager is ready.
    */
  val isReady: Boolean = js.native
  
  /**
    * A Thenable that is fulfilled when the manager is ready.
    */
  val ready: Thenable[Unit] = js.native
  
  def shutdown(id: String): Thenable[Unit] = js.native
  
  val specs: js.UndefOr[IAllKernels] = js.native
  
  def startNew(options: ISessionOptions): Thenable[ISession] = js.native
}
object SessionManager {
  
  @scala.inline
  def apply(
    isReady: Boolean,
    ready: Thenable[Unit],
    shutdown: String => Thenable[Unit],
    startNew: ISessionOptions => Thenable[ISession]
  ): SessionManager = {
    val __obj = js.Dynamic.literal(isReady = isReady.asInstanceOf[js.Any], ready = ready.asInstanceOf[js.Any], shutdown = js.Any.fromFunction1(shutdown), startNew = js.Any.fromFunction1(startNew))
    __obj.asInstanceOf[SessionManager]
  }
  
  @scala.inline
  implicit class SessionManagerMutableBuilder[Self <: SessionManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsReady(value: Boolean): Self = StObject.set(x, "isReady", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReady(value: Thenable[Unit]): Self = StObject.set(x, "ready", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShutdown(value: String => Thenable[Unit]): Self = StObject.set(x, "shutdown", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSpecs(value: IAllKernels): Self = StObject.set(x, "specs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecsUndefined: Self = StObject.set(x, "specs", js.undefined)
    
    @scala.inline
    def setStartNew(value: ISessionOptions => Thenable[ISession]): Self = StObject.set(x, "startNew", js.Any.fromFunction1(value))
  }
}
