package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "MessageDispatcher")
@js.native
open class MessageDispatcher ()
  extends typings.blackEngine.messagesMessageDispatcherMod.MessageDispatcher {
  def this(checkForStage: Boolean) = this()
}
/* static members */
object MessageDispatcher {
  
  @JSImport("black-engine", "MessageDispatcher")
  @js.native
  val ^ : js.Any = js.native
  
  inline def dispose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("dispose")().asInstanceOf[Unit]
}
