package typings.commandLineCommands

import typings.commandLineCommands.anon.Argv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(commands: js.Array[String | Null]): Argv = ^.asInstanceOf[js.Dynamic].apply(commands.asInstanceOf[js.Any]).asInstanceOf[Argv]
  @scala.inline
  def apply(commands: js.Array[String | Null], argv: js.Array[String]): Argv = (^.asInstanceOf[js.Dynamic].apply(commands.asInstanceOf[js.Any], argv.asInstanceOf[js.Any])).asInstanceOf[Argv]
  
  @JSImport("command-line-commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
