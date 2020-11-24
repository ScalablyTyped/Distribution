package typings.commandLineArgs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("command-line-args", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(optionDefinitions: js.Array[OptionDefinition]): CommandLineOptions = js.native
  def apply(optionDefinitions: js.Array[OptionDefinition], options: ParseOptions): CommandLineOptions = js.native
}
