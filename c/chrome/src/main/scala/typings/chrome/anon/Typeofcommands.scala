package typings.chrome.anon

import typings.chrome.chrome.commands.Command
import typings.chrome.chrome.commands.CommandEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofcommands extends StObject {
  
  def getAll(callback: js.Function1[/* commands */ js.Array[Command], Unit]): Unit
  
  var onCommand: CommandEvent
}
object Typeofcommands {
  
  inline def apply(getAll: js.Function1[/* commands */ js.Array[Command], Unit] => Unit, onCommand: CommandEvent): Typeofcommands = {
    val __obj = js.Dynamic.literal(getAll = js.Any.fromFunction1(getAll), onCommand = onCommand.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeofcommands]
  }
  
  extension [Self <: Typeofcommands](x: Self) {
    
    inline def setGetAll(value: js.Function1[/* commands */ js.Array[Command], Unit] => Unit): Self = StObject.set(x, "getAll", js.Any.fromFunction1(value))
    
    inline def setOnCommand(value: CommandEvent): Self = StObject.set(x, "onCommand", value.asInstanceOf[js.Any])
  }
}
