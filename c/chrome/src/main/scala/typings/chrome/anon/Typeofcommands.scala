package typings.chrome.anon

import typings.chrome.chrome.commands.Command
import typings.chrome.chrome.commands.CommandEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofcommands extends StObject {
  
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit = js.native
  
  var onCommand: CommandEvent = js.native
}
object Typeofcommands {
  
  @scala.inline
  def apply(getAll: js.Function1[/* commands */ js.Array[Command], Unit] => Unit, onCommand: CommandEvent): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1(getAll), onCommand = onCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcommands]
  }
  
  @scala.inline
  implicit class TypeofcommandsMutableBuilder[Self <: Typeofcommands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetAll(value: js.Function1[/* commands */ js.Array[Command], Unit] => Unit): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnCommand(value: CommandEvent): Self = StObject.set(x, "onCommand", value.asInstanceOf[js.Any])
  }
}
