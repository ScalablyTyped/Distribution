package typings.cucumberCucumber.anon

import typings.cucumberCucumber.libRuntimeParallelCommandTypesMod.ICoordinatorReport
import typings.cucumberCucumber.libRuntimeParallelWorkerMod.IExitFunction
import typings.cucumberCucumber.libRuntimeParallelWorkerMod.IMessageSender
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exit extends StObject {
  
  var cwd: String
  
  def exit(exitCode: Double): Unit
  def exit(exitCode: Double, error: js.Error): Unit
  def exit(exitCode: Double, error: js.Error, message: String): Unit
  def exit(exitCode: Double, error: Unit, message: String): Unit
  @JSName("exit")
  var exit_Original: IExitFunction
  
  var id: String
  
  def sendMessage(command: ICoordinatorReport): Unit
  @JSName("sendMessage")
  var sendMessage_Original: IMessageSender
}
object Exit {
  
  inline def apply(
    cwd: String,
    exit: (/* exitCode */ Double, /* error */ js.UndefOr[js.Error], /* message */ js.UndefOr[String]) => Unit,
    id: String,
    sendMessage: /* command */ ICoordinatorReport => Unit
  ): Exit = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any], exit = js.Any.fromFunction3(exit), id = id.asInstanceOf[js.Any], sendMessage = js.Any.fromFunction1(sendMessage))
    __obj.asInstanceOf[Exit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Exit] (val x: Self) extends AnyVal {
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setExit(
      value: (/* exitCode */ Double, /* error */ js.UndefOr[js.Error], /* message */ js.UndefOr[String]) => Unit
    ): Self = StObject.set(x, "exit", js.Any.fromFunction3(value))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSendMessage(value: /* command */ ICoordinatorReport => Unit): Self = StObject.set(x, "sendMessage", js.Any.fromFunction1(value))
  }
}
