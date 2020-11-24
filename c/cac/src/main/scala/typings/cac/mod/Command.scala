package typings.cac.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cac", "Command")
@js.native
class Command protected () extends js.Object {
  def this(rawName: String, description: String, config: CommandConfig, cli: CAC_) = this()
  
  def action(callback: js.Function1[/* repeated */ js.Any, _]): this.type = js.native
  
  def alias(name: String): this.type = js.native
  
  var aliasNames: js.Array[String] = js.native
  
  def allowUnknownOptions(): this.type = js.native
  
  var args: js.Array[CommandArg] = js.native
  
  /**
    * Check if the required string-type options exist
    */
  def checkOptionValue(): Unit = js.native
  
  def checkRequiredArgs(): Unit = js.native
  
  /**
    * Check if the parsed options contain any unknown options
    *
    * Exit and output error when true
    */
  def checkUnknownOptions(): Unit = js.native
  
  var cli: CAC_ = js.native
  
  var commandAction: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  
  var config: CommandConfig = js.native
  
  var description: String = js.native
  
  def example(example: CommandExample): this.type = js.native
  
  var examples: js.Array[CommandExample] = js.native
  
  var globalCommand: js.UndefOr[GlobalCommand] = js.native
  
  /**
    * Check if an option is registered in this command
    * @param name Option name
    */
  def hasOption(name: String): js.UndefOr[Option] = js.native
  
  var helpCallback: js.UndefOr[HelpCallback] = js.native
  
  def ignoreOptionDefaultValue(): this.type = js.native
  
  def isDefaultCommand: Boolean = js.native
  
  def isGlobalCommand: Boolean = js.native
  
  /**
    * Check if a command name is matched by this command
    * @param name Command name
    */
  def isMatched(name: String): Boolean = js.native
  
  var name: String = js.native
  
  /**
    * Add a option for this command
    * @param rawName Raw option name(s)
    * @param description Option description
    * @param config Option config
    */
  def option(rawName: String, description: String): this.type = js.native
  def option(rawName: String, description: String, config: OptionConfig): this.type = js.native
  
  var options: js.Array[Option] = js.native
  
  def outputHelp(): Unit = js.native
  
  def outputVersion(): Unit = js.native
  
  var rawName: String = js.native
  
  def usage(text: String): this.type = js.native
  
  var usageText: js.UndefOr[String] = js.native
  
  def version(version: String): this.type = js.native
  def version(version: String, customFlags: String): this.type = js.native
  
  var versionNumber: js.UndefOr[String] = js.native
}
