package typings
package commanderLib.commanderMod.localNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command
  extends nodeLib.NodeJSNs.EventEmitter
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var args: js.Array[java.lang.String] = js.native
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
  def action(fn: js.Function1[/* repeated */ js.Any, scala.Unit]): Command = js.native
  def alias(): java.lang.String = js.native
  /**
    * Set an alias for the command.
    *
    * @param {string} alias
    * @return {(Command | string)}
    */
  def alias(alias: java.lang.String): Command = js.native
  /**
    * Allow unknown options on the command line.
    *
    * @param {boolean} [arg] if `true` or omitted, no error will be thrown for unknown options.
    * @returns {Command} for chaining
    */
  def allowUnknownOption(): Command = js.native
  def allowUnknownOption(arg: scala.Boolean): Command = js.native
  /**
    * Define argument syntax for the top-level command.
    *
    * @param {string} desc
    * @returns {Command} for chaining
    */
  def arguments(desc: java.lang.String): Command = js.native
  /**
    * Add command `name`.
    *
    * The `.action()` callback is invoked when the
    * command `name` is specified via __ARGV__,
    * and the remaining arguments are applied to the
    * function for access.
    *
    * When the `name` is "*" an un-matched command
    * will be passed as the first arg, followed by
    * the rest of __ARGV__ remaining.
    *
    * @example
    *      program
    *        .version('0.0.1')
    *        .option('-C, --chdir <path>', 'change the working directory')
    *        .option('-c, --config <path>', 'set config path. defaults to ./deploy.conf')
    *        .option('-T, --no-tests', 'ignore test hook')
    *
    *      program
    *        .command('setup')
    *        .description('run remote setup commands')
    *        .action(function() {
    *          console.log('setup');
    *        });
    *
    *      program
    *        .command('exec <cmd>')
    *        .description('run the given remote command')
    *        .action(function(cmd) {
    *          console.log('exec "%s"', cmd);
    *        });
    *
    *      program
    *        .command('teardown <dir> [otherDirs...]')
    *        .description('run teardown commands')
    *        .action(function(dir, otherDirs) {
    *          console.log('dir "%s"', dir);
    *          if (otherDirs) {
    *            otherDirs.forEach(function (oDir) {
    *              console.log('dir "%s"', oDir);
    *            });
    *          }
    *        });
    *
    *      program
    *        .command('*')
    *        .description('deploy the given env')
    *        .action(function(env) {
    *          console.log('deploying "%s"', env);
    *        });
    *
    *      program.parse(process.argv);
    *
    * @param {string} name
    * @param {string} [desc] for git-style sub-commands
    * @param {CommandOptions} [opts] command options
    * @returns {Command} the new command
    */
  def command(name: java.lang.String): Command = js.native
  def command(name: java.lang.String, desc: java.lang.String): Command = js.native
  def command(
    name: java.lang.String,
    desc: java.lang.String,
    opts: commanderLib.commanderMod.commanderNs.CommandOptions
  ): Command = js.native
  def description(): java.lang.String = js.native
  /**
    * Set the description to `str`.
    *
    * @param {string} str
    * @param {{[argName: string]: string}} argsDescription
    * @return {(Command | string)}
    */
  def description(str: java.lang.String): Command = js.native
  def description(
    str: java.lang.String,
    argsDescription: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ): Command = js.native
  /** Output help information and exit.
    *
    * @param {(str: string) => string} [cb]
    */
  def help(): scala.Nothing = js.native
  def help(cb: js.Function1[/* str */ java.lang.String, java.lang.String]): scala.Nothing = js.native
  /**
    * Get the name of the command.
    *
    * @return {string}
    */
  def name(): java.lang.String = js.native
  /**
    * Set the name of the command.
    *
    * @param {string} str
    * @return {Command}
    */
  def name(str: java.lang.String): Command = js.native
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
  def option(flags: java.lang.String): Command = js.native
  def option(flags: java.lang.String, description: java.lang.String): Command = js.native
  def option(flags: java.lang.String, description: java.lang.String, defaultValue: js.Any): Command = js.native
  def option(
    flags: java.lang.String,
    description: java.lang.String,
    fn: js.Function2[/* arg1 */ js.Any, /* arg2 */ js.Any, scala.Unit]
  ): Command = js.native
  def option(
    flags: java.lang.String,
    description: java.lang.String,
    fn: js.Function2[/* arg1 */ js.Any, /* arg2 */ js.Any, scala.Unit],
    defaultValue: js.Any
  ): Command = js.native
  def option(flags: java.lang.String, description: java.lang.String, fn: stdLib.RegExp): Command = js.native
  def option(flags: java.lang.String, description: java.lang.String, fn: stdLib.RegExp, defaultValue: js.Any): Command = js.native
  /**
    * Return an object containing options as key-value pairs
    *
    * @returns {{[key: string]: any}}
    */
  def opts(): org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
  /**
    * Output help information for this command.
    *
    * @param {(str: string) => string} [cb]
    */
  def outputHelp(): scala.Unit = js.native
  def outputHelp(cb: js.Function1[/* str */ java.lang.String, java.lang.String]): scala.Unit = js.native
  /**
    * Parse `argv`, settings options and invoking commands when defined.
    *
    * @param {string[]} argv
    * @returns {Command} for chaining
    */
  def parse(argv: js.Array[java.lang.String]): Command = js.native
  /**
    * Parse expected `args`.
    *
    * For example `["[type]"]` becomes `[{ required: false, name: 'type' }]`.
    *
    * @param {string[]} args
    * @returns {Command} for chaining
    */
  def parseExpectedArgs(args: js.Array[java.lang.String]): Command = js.native
  /**
    * Parse options from `argv` returning `argv` void of these options.
    *
    * @param {string[]} argv
    * @returns {ParseOptionsResult}
    */
  def parseOptions(argv: js.Array[java.lang.String]): commanderLib.commanderMod.commanderNs.ParseOptionsResult = js.native
  def usage(): java.lang.String = js.native
  /**
    * Set or get the command usage.
    *
    * @param {string} str
    * @return {(Command | string)}
    */
  def usage(str: java.lang.String): Command = js.native
  /**
    * Set the program version to `str`.
    *
    * This method auto-registers the "-V, --version" flag
    * which will print the version number when passed.
    *
    * @param {string} str
    * @param {string} [flags]
    * @returns {Command} for chaining
    */
  def version(str: java.lang.String): Command = js.native
  def version(str: java.lang.String, flags: java.lang.String): Command = js.native
}

