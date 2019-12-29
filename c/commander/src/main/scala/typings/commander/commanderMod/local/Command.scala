package typings.commander.commanderMod.local

import org.scalablytyped.runtime.StringDictionary
import typings.commander.commanderMod.CommandOptions
import typings.commander.commanderMod.ParseOptionsResult
import typings.node.NodeJS.EventEmitter
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command
  extends EventEmitter
     with /* key */ StringDictionary[js.Any] {
  var args: js.Array[String] = js.native
  /**
    * Register callback `fn` for the command.
    *
    * @example
    *      program
    *        .command('help')
    *        .description('display verbose help')
    *        .action(function() {
    *           // output help here
    *        });
    *
    * @param {(...args: any[]) => void} fn
    * @returns {Command} for chaining
    */
  def action(fn: js.Function1[/* repeated */ js.Any, Unit]): Command = js.native
  def alias(): String = js.native
  /**
    * Set an alias for the command.
    *
    * @param {string} alias
    * @return {(Command | string)}
    */
  def alias(alias: String): Command = js.native
  /**
    * Allow unknown options on the command line.
    *
    * @param {boolean} [arg] if `true` or omitted, no error will be thrown for unknown options.
    * @returns {Command} for chaining
    */
  def allowUnknownOption(): Command = js.native
  def allowUnknownOption(arg: Boolean): Command = js.native
  /**
    * Define argument syntax for the top-level command.
    *
    * @param {string} desc
    * @returns {Command} for chaining
    */
  def arguments(desc: String): Command = js.native
  /**
    * Define a command, implemented using an action handler.
    * 
    * @remarks
    * The command description is supplied using `.description`, not as a parameter to `.command`.
    * 
    * @example
    * ```ts
    *  program
    *    .command('clone <source> [destination]')
    *    .description('clone a repository into a newly created directory')
    *    .action((source, destination) => {
    *      console.log('clone command called');
    *    });
    * ```
    * 
    * @param nameAndArgs - command name and arguments, args are  `<required>` or `[optional]` and last may also be `variadic...`
    * @param opts - configuration options
    * @returns new command
    */
  def command(nameAndArgs: String): Command = js.native
  /**
    * Define a command, implemented in a separate executable file.
    * 
    * @remarks
    * The command description is supplied as the second parameter to `.command`.
    * 
    * @example
    * ```ts
    *  program
    *    .command('start <service>', 'start named service')
    *    .command('stop [service]', 'stop named serice, or all if no name supplied');
    * ```
    * 
    * @param nameAndArgs - command name and arguments, args are  `<required>` or `[optional]` and last may also be `variadic...`
    * @param description - description of executable command
    * @param opts - configuration options
    * @returns top level command for chaining more command definitions
    */
  def command(nameAndArgs: String, description: String): Command = js.native
  def command(nameAndArgs: String, description: String, opts: CommandOptions): Command = js.native
  def command(nameAndArgs: String, opts: CommandOptions): Command = js.native
  def description(): String = js.native
  /**
    * Set the description to `str`.
    *
    * @param {string} str
    * @param {{[argName: string]: string}} argsDescription
    * @return {(Command | string)}
    */
  def description(str: String): Command = js.native
  def description(str: String, argsDescription: StringDictionary[String]): Command = js.native
  /** 
    * Output help information and exit.
    */
  def help(): scala.Nothing = js.native
  def help(cb: js.Function1[/* str */ String, String]): scala.Nothing = js.native
  /**
    * You can pass in flags and a description to override the help
    * flags and help description for your command.
    */
  def helpOption(): Command = js.native
  def helpOption(flags: String): Command = js.native
  def helpOption(flags: String, description: String): Command = js.native
  /**
    * Get the name of the command.
    *
    * @return {string}
    */
  def name(): String = js.native
  /**
    * Set the name of the command.
    *
    * @param {string} str
    * @return {Command}
    */
  def name(str: String): Command = js.native
  /**
    * Define option with `flags`, `description` and optional
    * coercion `fn`.
    *
    * The `flags` string should contain both the short and long flags,
    * separated by comma, a pipe or space. The following are all valid
    * all will output this way when `--help` is used.
    *
    *    "-p, --pepper"
    *    "-p|--pepper"
    *    "-p --pepper"
    *
    * @example
    *     // simple boolean defaulting to false
    *     program.option('-p, --pepper', 'add pepper');
    *
    *     --pepper
    *     program.pepper
    *     // => Boolean
    *
    *     // simple boolean defaulting to true
    *     program.option('-C, --no-cheese', 'remove cheese');
    *
    *     program.cheese
    *     // => true
    *
    *     --no-cheese
    *     program.cheese
    *     // => false
    *
    *     // required argument
    *     program.option('-C, --chdir <path>', 'change the working directory');
    *
    *     --chdir /tmp
    *     program.chdir
    *     // => "/tmp"
    *
    *     // optional argument
    *     program.option('-c, --cheese [type]', 'add cheese [marble]');
    *
    * @param {string} flags
    * @param {string} [description]
    * @param {((arg1: any, arg2: any) => void) | RegExp} [fn] function or default
    * @param {*} [defaultValue]
    * @returns {Command} for chaining
    */
  def option(flags: String): Command = js.native
  def option(flags: String, description: String): Command = js.native
  def option(flags: String, description: String, defaultValue: js.Any): Command = js.native
  def option(flags: String, description: String, fn: js.Function2[/* arg1 */ js.Any, /* arg2 */ js.Any, Unit]): Command = js.native
  def option(
    flags: String,
    description: String,
    fn: js.Function2[/* arg1 */ js.Any, /* arg2 */ js.Any, Unit],
    defaultValue: js.Any
  ): Command = js.native
  def option(flags: String, description: String, fn: RegExp): Command = js.native
  def option(flags: String, description: String, fn: RegExp, defaultValue: js.Any): Command = js.native
  /**
    * Return an object containing options as key-value pairs
    *
    * @returns {{[key: string]: any}}
    */
  def opts(): StringDictionary[js.Any] = js.native
  /**
    * Output help information for this command.
    *
    * When listener(s) are available for the helpLongFlag
    * those callbacks are invoked.
    * 
    * @param {(str: string) => string} [cb]
    */
  def outputHelp(): Unit = js.native
  def outputHelp(cb: js.Function1[/* str */ String, String]): Unit = js.native
  /**
    * Parse `argv`, settings options and invoking commands when defined.
    *
    * @param {string[]} argv
    * @returns {Command} for chaining
    */
  def parse(argv: js.Array[String]): Command = js.native
  /**
    * Parse expected `args`.
    *
    * For example `["[type]"]` becomes `[{ required: false, name: 'type' }]`.
    *
    * @param {string[]} args
    * @returns {Command} for chaining
    */
  def parseExpectedArgs(args: js.Array[String]): Command = js.native
  /**
    * Parse options from `argv` returning `argv` void of these options.
    *
    * @param {string[]} argv
    * @returns {ParseOptionsResult}
    */
  def parseOptions(argv: js.Array[String]): ParseOptionsResult = js.native
  def usage(): String = js.native
  /**
    * Set or get the command usage.
    *
    * @param {string} str
    * @return {(Command | string)}
    */
  def usage(str: String): Command = js.native
  /**
    * Set the program version to `str`. 
    *
    * This method auto-registers the "-V, --version" flag
    * which will print the version number when passed.
    * 
    * You can optionally supply the  flags and description to override the defaults.
    *
    */
  def version(str: String): Command = js.native
  def version(str: String, flags: String): Command = js.native
  def version(str: String, flags: String, description: String): Command = js.native
}

