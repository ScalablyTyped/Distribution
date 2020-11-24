package typings.cac.mod

import org.scalablytyped.runtime.StringDictionary
import typings.cac.anon.Run
import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cac", "CAC")
@js.native
/**
  * @param name The program name to display in help and version message
  */
class CAC_ () extends EventEmitter {
  def this(name: String) = this()
  
  /**
    * Parsed CLI arguments
    */
  var args: js.Array[String] = js.native
  
  /**
    * Add a sub-command
    */
  def command(rawName: String): Command = js.native
  def command(rawName: String, description: js.UndefOr[scala.Nothing], config: CommandConfig): Command = js.native
  def command(rawName: String, description: String): Command = js.native
  def command(rawName: String, description: String, config: CommandConfig): Command = js.native
  
  var commands: js.Array[Command] = js.native
  
  /**
    * Add a global example.
    *
    * This example added here will not be used by sub-commands.
    */
  def example(example: CommandExample): this.type = js.native
  
  var globalCommand: GlobalCommand = js.native
  
  /**
    * Show help message when `-h, --help` flags appear.
    *
    */
  def help(): this.type = js.native
  def help(callback: HelpCallback): this.type = js.native
  
  var matchedCommand: js.UndefOr[Command] = js.native
  
  var matchedCommandName: js.UndefOr[String] = js.native
  
  var mri: js.Any = js.native
  
  /** The program name to display in help and version message */
  var name: String = js.native
  
  /**
    * Add a global CLI option.
    *
    * Which is also applied to sub-commands.
    */
  def option(rawName: String, description: String): this.type = js.native
  def option(rawName: String, description: String, config: OptionConfig): this.type = js.native
  
  /**
    * Parsed CLI options, camelCased
    */
  var options: StringDictionary[js.Any] = js.native
  
  /**
    * Output the corresponding help message
    * When a sub-command is matched, output the help message for the command
    * Otherwise output the global one.
    *
    */
  def outputHelp(): Unit = js.native
  
  /**
    * Output the version number.
    *
    */
  def outputVersion(): Unit = js.native
  
  /**
    * Parse argv
    */
  def parse(): ParsedArgv = js.native
  def parse(argv: js.UndefOr[scala.Nothing], hasRun: Run): ParsedArgv = js.native
  def parse(argv: js.Array[String]): ParsedArgv = js.native
  def parse(argv: js.Array[String], hasRun: Run): ParsedArgv = js.native
  
  /**
    * Raw CLI arguments
    */
  var rawArgs: js.Array[String] = js.native
  
  def runMatchedCommand(): js.Any = js.native
  
  var setParsedInfo: js.Any = js.native
  
  var showHelpOnExit: Boolean = js.native
  
  var showVersionOnExit: Boolean = js.native
  
  def unsetMatchedCommand(): Unit = js.native
  
  /**
    * Add a global usage text.
    *
    * This is not used by sub-commands.
    */
  def usage(text: String): this.type = js.native
  
  /**
    * Show version number when `-v, --version` flags appear.
    *
    */
  def version(version: String): this.type = js.native
  def version(version: String, customFlags: String): this.type = js.native
}
