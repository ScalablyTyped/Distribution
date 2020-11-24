package typings.dashdash.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("dashdash", "Parser")
@js.native
class Parser protected () extends js.Object {
  def this(config: ParserConfiguration) = this()
  
  /** Don't allow unknown flags. @default true */
  var allowUnknown: Boolean = js.native
  
  /**  Return a string suitable for a Bash completion file for this tool. */
  def bashCompletion(args: BashCompletionConfiguration): String = js.native
  
  /**
    * Return help output for the current options.
    *
    * E.g.: if the current options are:
    *      [{names: ['help', 'h'], type: 'bool', help: 'Show help and exit.'}]
    * then this would return:
    *      '  -h, --help     Show help and exit.\n'
    */
  def help(): String = js.native
  def help(config: HelpConfiguration): String = js.native
  
  /**  Allow interspersed arguments. @default true */
  var interpersed: Boolean = js.native
  
  /** Parse options from the given argv. */
  def parse(): Results = js.native
  def parse(inputs: js.Array[String]): Results = js.native
  def parse(inputs: ParsingConfiguration): Results = js.native
}
