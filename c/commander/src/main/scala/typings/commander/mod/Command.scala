package typings.commander.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command
  extends /* key */ StringDictionary[js.Any] {
   // options as properties
  var args: js.Array[String] = js.native
  var commands: js.Array[Command] = js.native
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
    * @returns `this` command for chaining
    */
  def action(fn: js.Function1[/* repeated */ js.Any, Unit | js.Promise[Unit]]): this.type = js.native
  /**
    * Add a prepared subcommand.
    *
    * See .command() for creating an attached subcommand which inherits settings from its parent.
    *
    * @returns `this` command for chaining
    */
  def addCommand(cmd: Command): this.type = js.native
  def addCommand(cmd: Command, opts: CommandOptions): this.type = js.native
  /**
    * Get alias for the command.
    */
  def alias(): String = js.native
  /**
    * Set an alias for the command.
    *
    * You may call more than once to add multiple aliases. Only the first alias is shown in the auto-generated help.
    *
    * @returns `this` command for chaining
    */
  def alias(alias: String): this.type = js.native
  /**
    * Get aliases for the command.
    */
  def aliases(): js.Array[String] = js.native
  /**
    * Set aliases for the command.
    *
    * Only the first alias is shown in the auto-generated help.
    *
    * @returns `this` command for chaining
    */
  def aliases(aliases: js.Array[String]): this.type = js.native
  /**
    * Allow unknown options on the command line.
    *
    * @param [arg] if `true` or omitted, no error will be thrown for unknown options.
    * @returns `this` command for chaining
    */
  def allowUnknownOption(): this.type = js.native
  def allowUnknownOption(arg: Boolean): this.type = js.native
  /**
    * Define argument syntax for command.
    *
    * @returns `this` command for chaining
    */
  def arguments(desc: String): this.type = js.native
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
  def command(nameAndArgs: String): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: this['createCommand'] */ js.Any
  ] = js.native
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
    *    .command('stop [service]', 'stop named service, or all if no name supplied');
    * ```
    *
    * @param nameAndArgs - command name and arguments, args are  `<required>` or `[optional]` and last may also be `variadic...`
    * @param description - description of executable command
    * @param opts - configuration options
    * @returns `this` command for chaining
    */
  def command(nameAndArgs: String, description: String): this.type = js.native
  def command(nameAndArgs: String, description: String, opts: ExecutableCommandOptions): this.type = js.native
  def command(nameAndArgs: String, opts: CommandOptions): ReturnType[
    /* import warning: importer.ImportType#apply Failed type conversion: this['createCommand'] */ js.Any
  ] = js.native
  /**
    * Factory routine to create a new unattached command.
    *
    * See .command() for creating an attached subcommand, which uses this routine to
    * create the command. You can override createCommand to customise subcommands.
    */
  def createCommand(): Command = js.native
  def createCommand(name: String): Command = js.native
  /**
    * Get the description.
    */
  def description(): String = js.native
  /**
    * Set the description.
    *
    * @returns `this` command for chaining
    */
  def description(str: String): this.type = js.native
  def description(str: String, argsDescription: StringDictionary[String]): this.type = js.native
  /**
    * Register callback to use as replacement for calling process.exit.
    */
  def exitOverride(): this.type = js.native
  def exitOverride(callback: js.Function1[/* err */ CommanderError, scala.Nothing | Unit]): this.type = js.native
  /**
    * Output help information and exit.
    */
  def help(): scala.Nothing = js.native
  def help(cb: js.Function1[/* str */ String, String]): scala.Nothing = js.native
  /**
    * Return command help documentation.
    */
  def helpInformation(): String = js.native
  /**
    * You can pass in flags and a description to override the help
    * flags and help description for your command.
    */
  def helpOption(): this.type = js.native
  def helpOption(flags: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def helpOption(flags: String): this.type = js.native
  def helpOption(flags: String, description: String): this.type = js.native
  /**
    * Get the name of the command.
    */
  def name(): String = js.native
  /**
    * Set the name of the command.
    *
    * @returns `this` command for chaining
    */
  def name(str: String): this.type = js.native
  /**
    * Add a listener (callback) for when events occur. (Implemented using EventEmitter.)
    *
    * @example
    *     program
    *       .on('--help', () -> {
    *         console.log('See web site for more information.');
    *     });
    */
  def on(event: String, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
  def on(event: js.Symbol, listener: js.Function1[/* repeated */ js.Any, Unit]): this.type = js.native
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
    * @returns `this` command for chaining
    */
  def option(flags: String): this.type = js.native
  def option(flags: String, description: js.UndefOr[scala.Nothing], defaultValue: String): this.type = js.native
  def option(flags: String, description: js.UndefOr[scala.Nothing], defaultValue: Boolean): this.type = js.native
  def option(flags: String, description: String): this.type = js.native
  def option(flags: String, description: String, defaultValue: String): this.type = js.native
  def option(flags: String, description: String, defaultValue: Boolean): this.type = js.native
  def option(flags: String, description: String, regexp: RegExp): this.type = js.native
  def option(flags: String, description: String, regexp: RegExp, defaultValue: String): this.type = js.native
  def option(flags: String, description: String, regexp: RegExp, defaultValue: Boolean): this.type = js.native
  def option[T](flags: String, description: String, fn: js.Function2[/* value */ String, /* previous */ T, T]): this.type = js.native
  def option[T](
    flags: String,
    description: String,
    fn: js.Function2[/* value */ String, /* previous */ T, T],
    defaultValue: T
  ): this.type = js.native
  /**
    * Return an object containing options as key-value pairs
    */
  def opts(): StringDictionary[js.Any] = js.native
  /**
    * Output help information for this command.
    *
    * When listener(s) are available for the helpLongFlag
    * those callbacks are invoked.
    */
  def outputHelp(): Unit = js.native
  def outputHelp(cb: js.Function1[/* str */ String, String]): Unit = js.native
  /**
    * Parse `argv`, setting options and invoking commands when defined.
    *
    * The default expectation is that the arguments are from node and have the application as argv[0]
    * and the script being run in argv[1], with user parameters after that.
    *
    * Examples:
    *
    *      program.parse(process.argv);
    *      program.parse(); // implicitly use process.argv and auto-detect node vs electron conventions
    *      program.parse(my-args, { from: 'user' }); // just user supplied arguments, nothing special about argv[0]
    *
    * @returns `this` command for chaining
    */
  def parse(): this.type = js.native
  def parse(argv: js.UndefOr[scala.Nothing], options: ParseOptions): this.type = js.native
  def parse(argv: js.Array[String]): this.type = js.native
  def parse(argv: js.Array[String], options: ParseOptions): this.type = js.native
  /**
    * Parse `argv`, setting options and invoking commands when defined.
    *
    * Use parseAsync instead of parse if any of your action handlers are async. Returns a Promise.
    *
    * The default expectation is that the arguments are from node and have the application as argv[0]
    * and the script being run in argv[1], with user parameters after that.
    *
    * Examples:
    *
    *      program.parseAsync(process.argv);
    *      program.parseAsync(); // implicitly use process.argv and auto-detect node vs electron conventions
    *      program.parseAsync(my-args, { from: 'user' }); // just user supplied arguments, nothing special about argv[0]
    *
    * @returns Promise
    */
  def parseAsync(): js.Promise[this.type] = js.native
  def parseAsync(argv: js.UndefOr[scala.Nothing], options: ParseOptions): js.Promise[this.type] = js.native
  def parseAsync(argv: js.Array[String]): js.Promise[this.type] = js.native
  def parseAsync(argv: js.Array[String], options: ParseOptions): js.Promise[this.type] = js.native
  /**
    * Parse options from `argv` removing known options,
    * and return argv split into operands and unknown arguments.
    *
    * @example
    *    argv => operands, unknown
    *    --known kkk op => [op], []
    *    op --known kkk => [op], []
    *    sub --unknown uuu op => [sub], [--unknown uuu op]
    *    sub -- --unknown uuu op => [sub --unknown uuu op], []
    */
  def parseOptions(argv: js.Array[String]): ParseOptionsResult = js.native
  /**
    * Whether to pass command to action handler,
    * or just the options (specify false).
    *
    * @returns `this` command for chaining
    */
  def passCommandToAction(): this.type = js.native
  def passCommandToAction(value: Boolean): this.type = js.native
  /**
    * Define a required option, which must have a value after parsing. This usually means
    * the option must be specified on the command line. (Otherwise the same as .option().)
    *
    * The `flags` string should contain both the short and long flags, separated by comma, a pipe or space.
    */
  def requiredOption(flags: String): this.type = js.native
  def requiredOption(flags: String, description: js.UndefOr[scala.Nothing], defaultValue: String): this.type = js.native
  def requiredOption(flags: String, description: js.UndefOr[scala.Nothing], defaultValue: Boolean): this.type = js.native
  def requiredOption(flags: String, description: String): this.type = js.native
  def requiredOption(flags: String, description: String, defaultValue: String): this.type = js.native
  def requiredOption(flags: String, description: String, defaultValue: Boolean): this.type = js.native
  def requiredOption(flags: String, description: String, regexp: RegExp): this.type = js.native
  def requiredOption(flags: String, description: String, regexp: RegExp, defaultValue: String): this.type = js.native
  def requiredOption(flags: String, description: String, regexp: RegExp, defaultValue: Boolean): this.type = js.native
  def requiredOption[T](flags: String, description: String, fn: js.Function2[/* value */ String, /* previous */ T, T]): this.type = js.native
  def requiredOption[T](
    flags: String,
    description: String,
    fn: js.Function2[/* value */ String, /* previous */ T, T],
    defaultValue: T
  ): this.type = js.native
  /**
    * Whether to store option values as properties on command object,
    * or store separately (specify false). In both cases the option values can be accessed using .opts().
    *
    * @returns `this` command for chaining
    */
  def storeOptionsAsProperties(): this.type = js.native
  def storeOptionsAsProperties(value: Boolean): this.type = js.native
  /**
    * Get the command usage.
    */
  def usage(): String = js.native
  /**
    * Set the command usage.
    *
    * @returns `this` command for chaining
    */
  def usage(str: String): this.type = js.native
  /**
    * Set the program version to `str`.
    *
    * This method auto-registers the "-V, --version" flag
    * which will print the version number when passed.
    *
    * You can optionally supply the  flags and description to override the defaults.
    */
  def version(str: String): this.type = js.native
  def version(str: String, flags: js.UndefOr[scala.Nothing], description: String): this.type = js.native
  def version(str: String, flags: String): this.type = js.native
  def version(str: String, flags: String, description: String): this.type = js.native
}

