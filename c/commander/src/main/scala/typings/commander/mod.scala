package typings.commander

import typings.commander.commanderBooleans.`true`
import typings.commander.commanderStrings.electron
import typings.commander.commanderStrings.node
import typings.commander.commanderStrings.user
import typings.std.Error
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("commander", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("commander", "Argument")
  @js.native
  open class Argument protected () extends StObject {
    /**
      * Initialize a new command argument with the given name and description.
      * The default is that the argument is required, and you can explicitly
      * indicate this with <> around the name. Put [] around the name for an optional argument.
      */
    def this(arg: String) = this()
    def this(arg: String, description: String) = this()
    
    /**
      * Set the default value, and optionally supply the description to be displayed in the help.
      */
    def default(value: Any): this.type = js.native
    def default(value: Any, description: String): this.type = js.native
    
    /**
      * Make argument optional.
      */
    def argOptional(): this.type = js.native
    
    /**
      * Set the custom handler for processing CLI command arguments into argument values.
      */
    def argParser[T](fn: js.Function2[/* value */ String, /* previous */ T, T]): this.type = js.native
    
    /**
      * Make argument required.
      */
    def argRequired(): this.type = js.native
    
    /**
      * Only allow argument value to be one of choices.
      */
    def choices(values: js.Array[String]): this.type = js.native
    
    var description: String = js.native
    
    /**
      * Return argument name.
      */
    def name(): String = js.native
    
    var required: Boolean = js.native
    
    var variadic: Boolean = js.native
  }
  
  @JSImport("commander", "Command")
  @js.native
  open class Command () extends StObject {
    def this(name: String) = this()
    
    /**
      * Register callback `fn` for the command.
      *
      * @example
      * ```
      * program
      *   .command('serve')
      *   .description('start service')
      *   .action(function() {
      *     // do work here
      *   });
      * ```
      *
      * @returns `this` command for chaining
      */
    def action(fn: js.Function1[/* repeated */ Any, Unit | js.Promise[Unit]]): this.type = js.native
    
    /**
      * Define argument syntax for command, adding a prepared argument.
      *
      * @returns `this` command for chaining
      */
    def addArgument(arg: Argument): this.type = js.native
    
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
      * Override default decision whether to add implicit help command.
      *
      * @example
      * ```
      * addHelpCommand() // force on
      * addHelpCommand(false); // force off
      * addHelpCommand('help [cmd]', 'display help for [cmd]'); // force on with custom details
      * ```
      *
      * @returns `this` command for chaining
      */
    def addHelpCommand(): this.type = js.native
    def addHelpCommand(enableOrNameAndArgs: String): this.type = js.native
    def addHelpCommand(enableOrNameAndArgs: String, description: String): this.type = js.native
    def addHelpCommand(enableOrNameAndArgs: Boolean): this.type = js.native
    def addHelpCommand(enableOrNameAndArgs: Boolean, description: String): this.type = js.native
    def addHelpCommand(enableOrNameAndArgs: Unit, description: String): this.type = js.native
    
    /**
      * Add additional text to be displayed with the built-in help.
      *
      * Position is 'before' or 'after' to affect just this command,
      * and 'beforeAll' or 'afterAll' to affect this command and all its subcommands.
      */
    def addHelpText(position: AddHelpTextPosition, text: String): this.type = js.native
    def addHelpText(position: AddHelpTextPosition, text: js.Function1[/* context */ AddHelpTextContext, String]): this.type = js.native
    
    /**
      * Add a prepared Option.
      *
      * See .option() and .requiredOption() for creating and attaching an option in a single call.
      */
    def addOption(option: Option): this.type = js.native
    
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
      * Allow excess command-arguments on the command line. Pass false to make excess arguments an error.
      *
      * @returns `this` command for chaining
      */
    def allowExcessArguments(): this.type = js.native
    def allowExcessArguments(allowExcess: Boolean): this.type = js.native
    
    /**
      * Allow unknown options on the command line.
      *
      * @returns `this` command for chaining
      */
    def allowUnknownOption(): this.type = js.native
    def allowUnknownOption(allowUnknown: Boolean): this.type = js.native
    
    var args: js.Array[String] = js.native
    
    def argument(name: String): this.type = js.native
    def argument(name: String, description: String): this.type = js.native
    def argument(name: String, description: String, defaultValue: Any): this.type = js.native
    def argument(name: String, description: Unit, defaultValue: Any): this.type = js.native
    /**
      * Define argument syntax for command.
      *
      * The default is that the argument is required, and you can explicitly
      * indicate this with <> around the name. Put [] around the name for an optional argument.
      *
      * @example
      * ```
      * program.argument('<input-file>');
      * program.argument('[output-file]');
      * ```
      *
      * @returns `this` command for chaining
      */
    def argument[T](flags: String, description: String, fn: js.Function2[/* value */ String, /* previous */ T, T]): this.type = js.native
    def argument[T](
      flags: String,
      description: String,
      fn: js.Function2[/* value */ String, /* previous */ T, T],
      defaultValue: T
    ): this.type = js.native
    
    /**
      * Define argument syntax for command, adding multiple at once (without descriptions).
      *
      * See also .argument().
      *
      * @example
      * ```
      * program.arguments('<cmd> [env]');
      * ```
      *
      * @returns `this` command for chaining
      */
    def arguments(names: String): this.type = js.native
    
    /**
      * Alter parsing of short flags with optional values.
      *
      * @example
      * ```
      * // for `.option('-f,--flag [value]'):
      * .combineFlagAndOptionalValue(true)  // `-f80` is treated like `--flag=80`, this is the default behaviour
      * .combineFlagAndOptionalValue(false) // `-fb` is treated like `-f -b`
      * ```
      *
      * @returns `this` command for chaining
      */
    def combineFlagAndOptionalValue(): this.type = js.native
    def combineFlagAndOptionalValue(combine: Boolean): this.type = js.native
    
    /**
      * Define a command, implemented using an action handler.
      *
      * @remarks
      * The command description is supplied using `.description`, not as a parameter to `.command`.
      *
      * @example
      * ```ts
      * program
      *   .command('clone <source> [destination]')
      *   .description('clone a repository into a newly created directory')
      *   .action((source, destination) => {
      *     console.log('clone command called');
      *   });
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
    
    val commands: js.Array[Command] = js.native
    
    /** Get configuration */
    def configureHelp(): HelpConfiguration = js.native
    /**
      * You can customise the help by overriding Help properties using configureHelp(),
      * or with a subclass of Help by overriding createHelp().
      */
    def configureHelp(configuration: HelpConfiguration): this.type = js.native
    
    /** Get configuration */
    def configureOutput(): OutputConfiguration = js.native
    /**
      * The default output goes to stdout and stderr. You can customise this for special
      * applications. You can also customise the display of errors by overriding outputError.
      *
      * The configuration properties are all functions:
      * ```
      * // functions to change where being written, stdout and stderr
      * writeOut(str)
      * writeErr(str)
      * // matching functions to specify width for wrapping help
      * getOutHelpWidth()
      * getErrHelpWidth()
      * // functions based on what is being written out
      * outputError(str, write) // used for displaying errors, and not used for displaying help
      * ```
      */
    def configureOutput(configuration: OutputConfiguration): this.type = js.native
    
    /**
      * Copy settings that are useful to have in common across root command and subcommands.
      *
      * (Used internally when adding a command using `.command()` so subcommands inherit parent settings.)
      */
    def copyInheritedSettings(sourceCommand: Command): this.type = js.native
    
    /**
      * Factory routine to create a new unattached argument.
      *
      * See .argument() for creating an attached argument, which uses this routine to
      * create the argument. You can override createArgument to return a custom argument.
      */
    def createArgument(name: String): Argument = js.native
    def createArgument(name: String, description: String): Argument = js.native
    
    /**
      * Factory routine to create a new unattached command.
      *
      * See .command() for creating an attached subcommand, which uses this routine to
      * create the command. You can override createCommand to customise subcommands.
      */
    def createCommand(): Command = js.native
    def createCommand(name: String): Command = js.native
    
    /**
      * You can customise the help with a subclass of Help by overriding createHelp,
      * or by overriding Help properties using configureHelp().
      */
    def createHelp(): Help = js.native
    
    /**
      * Factory routine to create a new unattached option.
      *
      * See .option() for creating an attached option, which uses this routine to
      * create the option. You can override createOption to return a custom option.
      */
    def createOption(flags: String): Option = js.native
    def createOption(flags: String, description: String): Option = js.native
    
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
    /** @deprecated since v8, instead use .argument to add command argument with description */
    def description(str: String, argsDescription: Record[String, String]): this.type = js.native
    
    /**
      * Enable positional options. Positional means global options are specified before subcommands which lets
      * subcommands reuse the same option names, and also enables subcommands to turn on passThroughOptions.
      *
      * The default behaviour is non-positional and global options may appear anywhere on the command line.
      *
      * @returns `this` command for chaining
      */
    def enablePositionalOptions(): this.type = js.native
    def enablePositionalOptions(positional: Boolean): this.type = js.native
    
    /**
      * Display error message and exit (or call exitOverride).
      */
    def error(message: String): scala.Nothing = js.native
    def error(message: String, errorOptions: ErrorOptions): scala.Nothing = js.native
    
    /**
      * Get the executable search directory.
      */
    def executableDir(): String = js.native
    /**
      * Set the directory for searching for executable subcommands of this command.
      *
      * @example
      * ```ts
      * program.executableDir(__dirname);
      * // or
      * program.executableDir('subcommands');
      * ```
      *
      * @returns `this` command for chaining
      */
    def executableDir(path: String): this.type = js.native
    
    /**
      * Register callback to use as replacement for calling process.exit.
      */
    def exitOverride(): this.type = js.native
    def exitOverride(callback: js.Function1[/* err */ CommanderError, scala.Nothing | Unit]): this.type = js.native
    
    /**
      * Retrieve option value.
      */
    def getOptionValue(key: String): Any = js.native
    
    /**
      * Get source of option value.
      */
    def getOptionValueSource(key: String): js.UndefOr[OptionValueSource] = js.native
    
    /**
      * Get source of option value. See also .optsWithGlobals().
      */
    def getOptionValueSourceWithGlobals(key: String): js.UndefOr[OptionValueSource] = js.native
    
    /**
      * Output help information and exit.
      *
      * Outputs built-in help, and custom text added using `.addHelpText()`.
      */
    def help(): scala.Nothing = js.native
    def help(cb: js.Function1[/* str */ String, String]): scala.Nothing = js.native
    def help(context: HelpContext): scala.Nothing = js.native
    
    /**
      * Return command help documentation.
      */
    def helpInformation(): String = js.native
    def helpInformation(context: HelpContext): String = js.native
    
    /**
      * You can pass in flags and a description to override the help
      * flags and help description for your command. Pass in false
      * to disable the built-in help option.
      */
    def helpOption(): this.type = js.native
    def helpOption(flags: String): this.type = js.native
    def helpOption(flags: String, description: String): this.type = js.native
    def helpOption(flags: Boolean): this.type = js.native
    def helpOption(flags: Boolean, description: String): this.type = js.native
    def helpOption(flags: Unit, description: String): this.type = js.native
    
    /**
      * Add hook for life cycle event.
      */
    def hook(
      event: HookEvent,
      listener: js.Function2[/* thisCommand */ this.type, /* actionCommand */ this.type, Unit | js.Promise[Unit]]
    ): this.type = js.native
    
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
      * Set the name of the command from script filename, such as process.argv[1],
      * or require.main.filename, or __filename.
      *
      * (Used internally and public although not documented in README.)
      *
      * @example
      * ```ts
      * program.nameFromFilename(require.main.filename);
      * ```
      *
      * @returns `this` command for chaining
      */
    def nameFromFilename(filename: String): this.type = js.native
    
    /**
      * Add a listener (callback) for when events occur. (Implemented using EventEmitter.)
      */
    def on(event: String, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    def on(event: js.Symbol, listener: js.Function1[/* repeated */ Any, Unit]): this.type = js.native
    
    /**
      * Define option with `flags`, `description` and optional
      * coercion `fn`.
      *
      * The `flags` string contains the short and/or long flags,
      * separated by comma, a pipe or space. The following are all valid
      * all will output this way when `--help` is used.
      *
      *     "-p, --pepper"
      *     "-p|--pepper"
      *     "-p --pepper"
      *
      * @example
      * ```
      * // simple boolean defaulting to false
      *  program.option('-p, --pepper', 'add pepper');
      *
      *  --pepper
      *  program.pepper
      *  // => Boolean
      *
      *  // simple boolean defaulting to true
      *  program.option('-C, --no-cheese', 'remove cheese');
      *
      *  program.cheese
      *  // => true
      *
      *  --no-cheese
      *  program.cheese
      *  // => false
      *
      *  // required argument
      *  program.option('-C, --chdir <path>', 'change the working directory');
      *
      *  --chdir /tmp
      *  program.chdir
      *  // => "/tmp"
      *
      *  // optional argument
      *  program.option('-c, --cheese [type]', 'add cheese [marble]');
      * ```
      *
      * @returns `this` command for chaining
      */
    def option(flags: String): this.type = js.native
    def option(flags: String, description: String): this.type = js.native
    def option(flags: String, description: String, defaultValue: String): this.type = js.native
    def option(flags: String, description: String, defaultValue: js.Array[String]): this.type = js.native
    def option(flags: String, description: String, defaultValue: Boolean): this.type = js.native
    /** @deprecated since v7, instead use choices or a custom function */
    def option(flags: String, description: String, regexp: js.RegExp): this.type = js.native
    def option(flags: String, description: String, regexp: js.RegExp, defaultValue: String): this.type = js.native
    def option(flags: String, description: String, regexp: js.RegExp, defaultValue: js.Array[String]): this.type = js.native
    def option(flags: String, description: String, regexp: js.RegExp, defaultValue: Boolean): this.type = js.native
    def option(flags: String, description: Unit, defaultValue: String): this.type = js.native
    def option(flags: String, description: Unit, defaultValue: js.Array[String]): this.type = js.native
    def option(flags: String, description: Unit, defaultValue: Boolean): this.type = js.native
    def option[T](flags: String, description: String, fn: js.Function2[/* value */ String, /* previous */ T, T]): this.type = js.native
    def option[T](
      flags: String,
      description: String,
      fn: js.Function2[/* value */ String, /* previous */ T, T],
      defaultValue: T
    ): this.type = js.native
    
    val options: js.Array[Option] = js.native
    
    /**
      * Return an object containing local option values as key-value pairs
      */
    def opts[T /* <: OptionValues */](): T = js.native
    
    /**
      * Return an object containing merged local and global option values as key-value pairs.
      */
    def optsWithGlobals[T /* <: OptionValues */](): T = js.native
    
    /**
      * Output help information for this command.
      *
      * Outputs built-in help, and custom text added using `.addHelpText()`.
      *
      */
    def outputHelp(): Unit = js.native
    def outputHelp(cb: js.Function1[/* str */ String, String]): Unit = js.native
    def outputHelp(context: HelpContext): Unit = js.native
    
    var parent: Command | Null = js.native
    
    /**
      * Parse `argv`, setting options and invoking commands when defined.
      *
      * The default expectation is that the arguments are from node and have the application as argv[0]
      * and the script being run in argv[1], with user parameters after that.
      *
      * @example
      * ```
      * program.parse(process.argv);
      * program.parse(); // implicitly use process.argv and auto-detect node vs electron conventions
      * program.parse(my-args, { from: 'user' }); // just user supplied arguments, nothing special about argv[0]
      * ```
      *
      * @returns `this` command for chaining
      */
    def parse(): this.type = js.native
    def parse(argv: js.Array[String]): this.type = js.native
    def parse(argv: js.Array[String], options: ParseOptions): this.type = js.native
    def parse(argv: Unit, options: ParseOptions): this.type = js.native
    
    /**
      * Parse `argv`, setting options and invoking commands when defined.
      *
      * Use parseAsync instead of parse if any of your action handlers are async. Returns a Promise.
      *
      * The default expectation is that the arguments are from node and have the application as argv[0]
      * and the script being run in argv[1], with user parameters after that.
      *
      * @example
      * ```
      * program.parseAsync(process.argv);
      * program.parseAsync(); // implicitly use process.argv and auto-detect node vs electron conventions
      * program.parseAsync(my-args, { from: 'user' }); // just user supplied arguments, nothing special about argv[0]
      * ```
      *
      * @returns Promise
      */
    def parseAsync(): js.Promise[this.type] = js.native
    def parseAsync(argv: js.Array[String]): js.Promise[this.type] = js.native
    def parseAsync(argv: js.Array[String], options: ParseOptions): js.Promise[this.type] = js.native
    def parseAsync(argv: Unit, options: ParseOptions): js.Promise[this.type] = js.native
    
    /**
      * Parse options from `argv` removing known options,
      * and return argv split into operands and unknown arguments.
      *
      *     argv => operands, unknown
      *     --known kkk op => [op], []
      *     op --known kkk => [op], []
      *     sub --unknown uuu op => [sub], [--unknown uuu op]
      *     sub -- --unknown uuu op => [sub --unknown uuu op], []
      */
    def parseOptions(argv: js.Array[String]): ParseOptionsResult = js.native
    
    /**
      * Pass through options that come after command-arguments rather than treat them as command-options,
      * so actual command-options come before command-arguments. Turning this on for a subcommand requires
      * positional options to have been enabled on the program (parent commands).
      *
      * The default behaviour is non-positional and options may appear before or after command-arguments.
      *
      * @returns `this` command for chaining
      */
    def passThroughOptions(): this.type = js.native
    def passThroughOptions(passThrough: Boolean): this.type = js.native
    
    var processedArgs: js.Array[Any] = js.native
    
    /**
      * Define a required option, which must have a value after parsing. This usually means
      * the option must be specified on the command line. (Otherwise the same as .option().)
      *
      * The `flags` string contains the short and/or long flags, separated by comma, a pipe or space.
      */
    def requiredOption(flags: String): this.type = js.native
    def requiredOption(flags: String, description: String): this.type = js.native
    def requiredOption(flags: String, description: String, defaultValue: String): this.type = js.native
    def requiredOption(flags: String, description: String, defaultValue: js.Array[String]): this.type = js.native
    def requiredOption(flags: String, description: String, defaultValue: Boolean): this.type = js.native
    /** @deprecated since v7, instead use choices or a custom function */
    def requiredOption(flags: String, description: String, regexp: js.RegExp): this.type = js.native
    def requiredOption(flags: String, description: String, regexp: js.RegExp, defaultValue: String): this.type = js.native
    def requiredOption(flags: String, description: String, regexp: js.RegExp, defaultValue: js.Array[String]): this.type = js.native
    def requiredOption(flags: String, description: String, regexp: js.RegExp, defaultValue: Boolean): this.type = js.native
    def requiredOption(flags: String, description: Unit, defaultValue: String): this.type = js.native
    def requiredOption(flags: String, description: Unit, defaultValue: js.Array[String]): this.type = js.native
    def requiredOption(flags: String, description: Unit, defaultValue: Boolean): this.type = js.native
    def requiredOption[T](flags: String, description: String, fn: js.Function2[/* value */ String, /* previous */ T, T]): this.type = js.native
    def requiredOption[T](
      flags: String,
      description: String,
      fn: js.Function2[/* value */ String, /* previous */ T, T],
      defaultValue: T
    ): this.type = js.native
    
    /**
      * Store option value.
      */
    def setOptionValue(key: String, value: Any): this.type = js.native
    
    /**
      * Store option value and where the value came from.
      */
    def setOptionValueWithSource(key: String, value: Any, source: OptionValueSource): this.type = js.native
    
    /**
      * Display the help or a custom message after an error occurs.
      */
    def showHelpAfterError(): this.type = js.native
    def showHelpAfterError(displayHelp: String): this.type = js.native
    def showHelpAfterError(displayHelp: Boolean): this.type = js.native
    
    /**
      * Display suggestion of similar commands for unknown commands, or options for unknown options.
      */
    def showSuggestionAfterError(): this.type = js.native
    def showSuggestionAfterError(displaySuggestion: Boolean): this.type = js.native
    
    def storeOptionsAsProperties(): this.type = js.native
    def storeOptionsAsProperties(storeAsProperties: Boolean): this.type = js.native
    /**
      * Whether to store option values as properties on command object,
      * or store separately (specify false). In both cases the option values can be accessed using .opts().
      *
      * @returns `this` command for chaining
      */
    @JSName("storeOptionsAsProperties")
    def storeOptionsAsProperties_T_Intersection[T /* <: OptionValues */](): this.type & T = js.native
    @JSName("storeOptionsAsProperties")
    def storeOptionsAsProperties_true[T /* <: OptionValues */](storeAsProperties: `true`): this.type & T = js.native
    
    /**
      * Get the summary.
      */
    def summary(): String = js.native
    /**
      * Set the summary. Used when listed as subcommand of parent.
      *
      * @returns `this` command for chaining
      */
    def summary(str: String): this.type = js.native
    
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
    def version(str: String, flags: String): this.type = js.native
    def version(str: String, flags: String, description: String): this.type = js.native
    def version(str: String, flags: Unit, description: String): this.type = js.native
  }
  
  @JSImport("commander", "CommanderError")
  @js.native
  open class CommanderError protected ()
    extends StObject
       with Error {
    /**
      * Constructs the CommanderError class
      * @param exitCode - suggested exit code which could be used with process.exit
      * @param code - an id string representing the error
      * @param message - human-readable description of the error
      * @constructor
      */
    def this(exitCode: Double, code: String, message: String) = this()
    
    var code: String = js.native
    
    var exitCode: Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    var nestedError: js.UndefOr[String] = js.native
  }
  
  @JSImport("commander", "Help")
  @js.native
  open class Help () extends StObject {
    
    /** Get the argument description to show in the list of arguments. */
    def argumentDescription(argument: Argument): String = js.native
    
    /** Get the argument term to show in the list of arguments. */
    def argumentTerm(argument: Argument): String = js.native
    
    /** Get the description for the command. */
    def commandDescription(cmd: Command): String = js.native
    
    /** Get the command usage to be displayed at the top of the built-in help. */
    def commandUsage(cmd: Command): String = js.native
    
    /** Generate the built-in help text. */
    def formatHelp(cmd: Command, helper: Help): String = js.native
    
    /** output helpWidth, long lines are wrapped to fit */
    var helpWidth: js.UndefOr[Double] = js.native
    
    /** Get the longest argument term length. */
    def longestArgumentTermLength(cmd: Command, helper: Help): Double = js.native
    
    /** Get the longest global option term length. */
    def longestGlobalOptionTermLength(cmd: Command, helper: Help): Double = js.native
    
    /** Get the longest option term length. */
    def longestOptionTermLength(cmd: Command, helper: Help): Double = js.native
    
    /** Get the longest command term length. */
    def longestSubcommandTermLength(cmd: Command, helper: Help): Double = js.native
    
    /** Get the option description to show in the list of options. */
    def optionDescription(option: Option): String = js.native
    
    /** Get the option term to show in the list of options. */
    def optionTerm(option: Option): String = js.native
    
    /** Calculate the pad width from the maximum term length. */
    def padWidth(cmd: Command, helper: Help): Double = js.native
    
    var showGlobalOptions: Boolean = js.native
    
    var sortOptions: Boolean = js.native
    
    var sortSubcommands: Boolean = js.native
    
    /** Get the command summary to show in the list of subcommands. */
    def subcommandDescription(cmd: Command): String = js.native
    
    /** Get the command term to show in the list of subcommands. */
    def subcommandTerm(cmd: Command): String = js.native
    
    /** Get an array of the arguments which have descriptions. */
    def visibleArguments(cmd: Command): js.Array[Argument] = js.native
    
    /** Get an array of the visible subcommands. Includes a placeholder for the implicit help command, if there is one. */
    def visibleCommands(cmd: Command): js.Array[Command] = js.native
    
    /** Get an array of the visible global options. (Not including help.) */
    def visibleGlobalOptions(cmd: Command): js.Array[Option] = js.native
    
    /** Get an array of the visible options. Includes a placeholder for the implicit help option, if there is one. */
    def visibleOptions(cmd: Command): js.Array[Option] = js.native
    
    /**
      * Wrap the given string to width characters per line, with lines after the first indented.
      * Do not wrap if insufficient room for wrapping (minColumnWidth), or string is manually formatted.
      */
    def wrap(str: String, width: Double, indent: Double): String = js.native
    def wrap(str: String, width: Double, indent: Double, minColumnWidth: Double): String = js.native
  }
  
  @JSImport("commander", "InvalidArgumentError")
  @js.native
  open class InvalidArgumentError protected () extends CommanderError {
    /**
      * Constructs the InvalidArgumentError class
      * @param message - explanation of why argument is invalid
      * @constructor
      */
    def this(message: String) = this()
  }
  
  @JSImport("commander", "InvalidOptionArgumentError")
  @js.native
  open class InvalidOptionArgumentError protected () extends InvalidArgumentError {
    /**
      * Constructs the InvalidArgumentError class
      * @param message - explanation of why argument is invalid
      * @constructor
      */
    def this(message: String) = this()
  }
  
  @JSImport("commander", "Option")
  @js.native
  open class Option protected () extends StObject {
    def this(flags: String) = this()
    def this(flags: String, description: String) = this()
    
    /**
      * Set the default value, and optionally supply the description to be displayed in the help.
      */
    def default(value: Any): this.type = js.native
    def default(value: Any, description: String): this.type = js.native
    
    var argChoices: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Set the custom handler for processing CLI option arguments into option values.
      */
    def argParser[T](fn: js.Function2[/* value */ String, /* previous */ T, T]): this.type = js.native
    
    /**
      * Return option name, in a camelcase format that can be used
      * as a object attribute key.
      */
    def attributeName(): String = js.native
    
    /**
      * Only allow option value to be one of choices.
      */
    def choices(values: js.Array[String]): this.type = js.native
    
    /**
      * Add option name(s) that conflict with this option.
      * An error will be displayed if conflicting options are found during parsing.
      *
      * @example
      * ```ts
      * new Option('--rgb').conflicts('cmyk');
      * new Option('--js').conflicts(['ts', 'jsx']);
      * ```
      */
    def conflicts(names: String): this.type = js.native
    def conflicts(names: js.Array[String]): this.type = js.native
    
    var defaultValue: js.UndefOr[Any] = js.native
    
    var defaultValueDescription: js.UndefOr[String] = js.native
    
    var description: String = js.native
    
    /**
      * Set environment variable to check for option value.
      *
      * An environment variables is only used if when processed the current option value is
      * undefined, or the source of the current value is 'default' or 'config' or 'env'.
      */
    def env(name: String): this.type = js.native
    
    var flags: String = js.native
    
    /**
      * Calculate the full description, including defaultValue etc.
      */
    def fullDescription(): String = js.native
    
    var hidden: Boolean = js.native
    
    /**
      * Hide option in help.
      */
    def hideHelp(): this.type = js.native
    def hideHelp(hide: Boolean): this.type = js.native
    
    /**
      * Specify implied option values for when this option is set and the implied options are not.
      *
      * The custom processing (parseArg) is not called on the implied values.
      *
      * @example
      * program
      *   .addOption(new Option('--log', 'write logging information to file'))
      *   .addOption(new Option('--trace', 'log extra details').implies({ log: 'trace.txt' }));
      */
    def implies(optionValues: OptionValues): this.type = js.native
    
    /**
      * Return whether a boolean option.
      *
      * Options are one of boolean, negated, required argument, or optional argument.
      */
    def isBoolean(): Boolean = js.native
    
    var long: js.UndefOr[String] = js.native
    
    /**
      * Whether the option is mandatory and must have a value after parsing.
      */
    def makeOptionMandatory(): this.type = js.native
    def makeOptionMandatory(mandatory: Boolean): this.type = js.native
    
    var mandatory: Boolean = js.native
    
    /**
      * Return option name.
      */
    def name(): String = js.native
    
    var negate: Boolean = js.native
    
    // A value must be supplied when the option is specified.
    var optional: Boolean = js.native
    
    var parseArg: js.UndefOr[js.Function2[/* value */ String, /* previous */ Any, Any]] = js.native
    
    /**
      * Preset to use when option used without option-argument, especially optional but also boolean and negated.
      * The custom processing (parseArg) is called.
      *
      * @example
      * ```ts
      * new Option('--color').default('GREYSCALE').preset('RGB');
      * new Option('--donate [amount]').preset('20').argParser(parseFloat);
      * ```
      */
    def preset(arg: Any): this.type = js.native
    
    var required: Boolean = js.native
    
    // The option must have a value after parsing, which usually means it must be specified on command line.
    var short: js.UndefOr[String] = js.native
    
    // A value is optional when the option is specified.
    var variadic: Boolean = js.native
  }
  
  inline def createArgument(name: String): Argument = ^.asInstanceOf[js.Dynamic].applyDynamic("createArgument")(name.asInstanceOf[js.Any]).asInstanceOf[Argument]
  inline def createArgument(name: String, description: String): Argument = (^.asInstanceOf[js.Dynamic].applyDynamic("createArgument")(name.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Argument]
  
  inline def createCommand(): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommand")().asInstanceOf[Command]
  inline def createCommand(name: String): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommand")(name.asInstanceOf[js.Any]).asInstanceOf[Command]
  
  inline def createOption(flags: String): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")(flags.asInstanceOf[js.Any]).asInstanceOf[Option]
  inline def createOption(flags: String, description: String): Option = (^.asInstanceOf[js.Dynamic].applyDynamic("createOption")(flags.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Option]
  
  @JSImport("commander", "program")
  @js.native
  val program: Command = js.native
  
  trait AddHelpTextContext extends StObject {
    
    var command: Command
    
    // passed to text function used with .addHelpText()
    var error: Boolean
  }
  object AddHelpTextContext {
    
    inline def apply(command: Command, error: Boolean): AddHelpTextContext = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddHelpTextContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AddHelpTextContext] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: Command): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.commander.commanderStrings.beforeAll
    - typings.commander.commanderStrings.before
    - typings.commander.commanderStrings.after
    - typings.commander.commanderStrings.afterAll
  */
  trait AddHelpTextPosition extends StObject
  object AddHelpTextPosition {
    
    inline def after: typings.commander.commanderStrings.after = "after".asInstanceOf[typings.commander.commanderStrings.after]
    
    inline def afterAll: typings.commander.commanderStrings.afterAll = "afterAll".asInstanceOf[typings.commander.commanderStrings.afterAll]
    
    inline def before: typings.commander.commanderStrings.before = "before".asInstanceOf[typings.commander.commanderStrings.before]
    
    inline def beforeAll: typings.commander.commanderStrings.beforeAll = "beforeAll".asInstanceOf[typings.commander.commanderStrings.beforeAll]
  }
  
  trait CommandOptions extends StObject {
    
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var isDefault: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated since v7, replaced by hidden */
    var noHelp: js.UndefOr[Boolean] = js.undefined
  }
  object CommandOptions {
    
    inline def apply(): CommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandOptions] (val x: Self) extends AnyVal {
      
      inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      inline def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      inline def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
      
      inline def setNoHelp(value: Boolean): Self = StObject.set(x, "noHelp", value.asInstanceOf[js.Any])
      
      inline def setNoHelpUndefined: Self = StObject.set(x, "noHelp", js.undefined)
    }
  }
  
  trait ErrorOptions extends StObject {
    
    // optional parameter for error()
    /** an id string representing the error */
    var code: js.UndefOr[String] = js.undefined
    
    /** suggested exit code which could be used with process.exit */
    var exitCode: js.UndefOr[Double] = js.undefined
  }
  object ErrorOptions {
    
    inline def apply(): ErrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorOptions] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    }
  }
  
  trait ExecutableCommandOptions
    extends StObject
       with CommandOptions {
    
    var executableFile: js.UndefOr[String] = js.undefined
  }
  object ExecutableCommandOptions {
    
    inline def apply(): ExecutableCommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutableCommandOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExecutableCommandOptions] (val x: Self) extends AnyVal {
      
      inline def setExecutableFile(value: String): Self = StObject.set(x, "executableFile", value.asInstanceOf[js.Any])
      
      inline def setExecutableFileUndefined: Self = StObject.set(x, "executableFile", js.undefined)
    }
  }
  
  /* Inlined std.Partial<commander.commander.Help> */
  trait HelpConfiguration extends StObject {
    
    var argumentDescription: js.UndefOr[js.Function1[/* argument */ Argument, String]] = js.undefined
    
    var argumentTerm: js.UndefOr[js.Function1[/* argument */ Argument, String]] = js.undefined
    
    var commandDescription: js.UndefOr[js.Function1[/* cmd */ Command, String]] = js.undefined
    
    var commandUsage: js.UndefOr[js.Function1[/* cmd */ Command, String]] = js.undefined
    
    var constructor: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var formatHelp: js.UndefOr[js.Function2[/* cmd */ Command, /* helper */ Help, String]] = js.undefined
    
    var helpWidth: js.UndefOr[Double] = js.undefined
    
    var longestArgumentTermLength: js.UndefOr[js.Function2[/* cmd */ Command, /* helper */ Help, Double]] = js.undefined
    
    var longestGlobalOptionTermLength: js.UndefOr[js.Function2[/* cmd */ Command, /* helper */ Help, Double]] = js.undefined
    
    var longestOptionTermLength: js.UndefOr[js.Function2[/* cmd */ Command, /* helper */ Help, Double]] = js.undefined
    
    var longestSubcommandTermLength: js.UndefOr[js.Function2[/* cmd */ Command, /* helper */ Help, Double]] = js.undefined
    
    var optionDescription: js.UndefOr[js.Function1[/* option */ Option, String]] = js.undefined
    
    var optionTerm: js.UndefOr[js.Function1[/* option */ Option, String]] = js.undefined
    
    var padWidth: js.UndefOr[js.Function2[/* cmd */ Command, /* helper */ Help, Double]] = js.undefined
    
    var showGlobalOptions: js.UndefOr[Boolean] = js.undefined
    
    var sortOptions: js.UndefOr[Boolean] = js.undefined
    
    var sortSubcommands: js.UndefOr[Boolean] = js.undefined
    
    var subcommandDescription: js.UndefOr[js.Function1[/* cmd */ Command, String]] = js.undefined
    
    var subcommandTerm: js.UndefOr[js.Function1[/* cmd */ Command, String]] = js.undefined
    
    var visibleArguments: js.UndefOr[js.Function1[/* cmd */ Command, js.Array[Argument]]] = js.undefined
    
    var visibleCommands: js.UndefOr[js.Function1[/* cmd */ Command, js.Array[Command]]] = js.undefined
    
    var visibleGlobalOptions: js.UndefOr[js.Function1[/* cmd */ Command, js.Array[Option]]] = js.undefined
    
    var visibleOptions: js.UndefOr[js.Function1[/* cmd */ Command, js.Array[Option]]] = js.undefined
    
    var wrap: js.UndefOr[
        js.Function4[
          /* str */ String, 
          /* width */ Double, 
          /* indent */ Double, 
          /* minColumnWidth */ js.UndefOr[Double], 
          String
        ]
      ] = js.undefined
  }
  object HelpConfiguration {
    
    inline def apply(): HelpConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HelpConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelpConfiguration] (val x: Self) extends AnyVal {
      
      inline def setArgumentDescription(value: /* argument */ Argument => String): Self = StObject.set(x, "argumentDescription", js.Any.fromFunction1(value))
      
      inline def setArgumentDescriptionUndefined: Self = StObject.set(x, "argumentDescription", js.undefined)
      
      inline def setArgumentTerm(value: /* argument */ Argument => String): Self = StObject.set(x, "argumentTerm", js.Any.fromFunction1(value))
      
      inline def setArgumentTermUndefined: Self = StObject.set(x, "argumentTerm", js.undefined)
      
      inline def setCommandDescription(value: /* cmd */ Command => String): Self = StObject.set(x, "commandDescription", js.Any.fromFunction1(value))
      
      inline def setCommandDescriptionUndefined: Self = StObject.set(x, "commandDescription", js.undefined)
      
      inline def setCommandUsage(value: /* cmd */ Command => String): Self = StObject.set(x, "commandUsage", js.Any.fromFunction1(value))
      
      inline def setCommandUsageUndefined: Self = StObject.set(x, "commandUsage", js.undefined)
      
      inline def setConstructor(value: () => Any): Self = StObject.set(x, "constructor", js.Any.fromFunction0(value))
      
      inline def setConstructorUndefined: Self = StObject.set(x, "constructor", js.undefined)
      
      inline def setFormatHelp(value: (/* cmd */ Command, /* helper */ Help) => String): Self = StObject.set(x, "formatHelp", js.Any.fromFunction2(value))
      
      inline def setFormatHelpUndefined: Self = StObject.set(x, "formatHelp", js.undefined)
      
      inline def setHelpWidth(value: Double): Self = StObject.set(x, "helpWidth", value.asInstanceOf[js.Any])
      
      inline def setHelpWidthUndefined: Self = StObject.set(x, "helpWidth", js.undefined)
      
      inline def setLongestArgumentTermLength(value: (/* cmd */ Command, /* helper */ Help) => Double): Self = StObject.set(x, "longestArgumentTermLength", js.Any.fromFunction2(value))
      
      inline def setLongestArgumentTermLengthUndefined: Self = StObject.set(x, "longestArgumentTermLength", js.undefined)
      
      inline def setLongestGlobalOptionTermLength(value: (/* cmd */ Command, /* helper */ Help) => Double): Self = StObject.set(x, "longestGlobalOptionTermLength", js.Any.fromFunction2(value))
      
      inline def setLongestGlobalOptionTermLengthUndefined: Self = StObject.set(x, "longestGlobalOptionTermLength", js.undefined)
      
      inline def setLongestOptionTermLength(value: (/* cmd */ Command, /* helper */ Help) => Double): Self = StObject.set(x, "longestOptionTermLength", js.Any.fromFunction2(value))
      
      inline def setLongestOptionTermLengthUndefined: Self = StObject.set(x, "longestOptionTermLength", js.undefined)
      
      inline def setLongestSubcommandTermLength(value: (/* cmd */ Command, /* helper */ Help) => Double): Self = StObject.set(x, "longestSubcommandTermLength", js.Any.fromFunction2(value))
      
      inline def setLongestSubcommandTermLengthUndefined: Self = StObject.set(x, "longestSubcommandTermLength", js.undefined)
      
      inline def setOptionDescription(value: /* option */ Option => String): Self = StObject.set(x, "optionDescription", js.Any.fromFunction1(value))
      
      inline def setOptionDescriptionUndefined: Self = StObject.set(x, "optionDescription", js.undefined)
      
      inline def setOptionTerm(value: /* option */ Option => String): Self = StObject.set(x, "optionTerm", js.Any.fromFunction1(value))
      
      inline def setOptionTermUndefined: Self = StObject.set(x, "optionTerm", js.undefined)
      
      inline def setPadWidth(value: (/* cmd */ Command, /* helper */ Help) => Double): Self = StObject.set(x, "padWidth", js.Any.fromFunction2(value))
      
      inline def setPadWidthUndefined: Self = StObject.set(x, "padWidth", js.undefined)
      
      inline def setShowGlobalOptions(value: Boolean): Self = StObject.set(x, "showGlobalOptions", value.asInstanceOf[js.Any])
      
      inline def setShowGlobalOptionsUndefined: Self = StObject.set(x, "showGlobalOptions", js.undefined)
      
      inline def setSortOptions(value: Boolean): Self = StObject.set(x, "sortOptions", value.asInstanceOf[js.Any])
      
      inline def setSortOptionsUndefined: Self = StObject.set(x, "sortOptions", js.undefined)
      
      inline def setSortSubcommands(value: Boolean): Self = StObject.set(x, "sortSubcommands", value.asInstanceOf[js.Any])
      
      inline def setSortSubcommandsUndefined: Self = StObject.set(x, "sortSubcommands", js.undefined)
      
      inline def setSubcommandDescription(value: /* cmd */ Command => String): Self = StObject.set(x, "subcommandDescription", js.Any.fromFunction1(value))
      
      inline def setSubcommandDescriptionUndefined: Self = StObject.set(x, "subcommandDescription", js.undefined)
      
      inline def setSubcommandTerm(value: /* cmd */ Command => String): Self = StObject.set(x, "subcommandTerm", js.Any.fromFunction1(value))
      
      inline def setSubcommandTermUndefined: Self = StObject.set(x, "subcommandTerm", js.undefined)
      
      inline def setVisibleArguments(value: /* cmd */ Command => js.Array[Argument]): Self = StObject.set(x, "visibleArguments", js.Any.fromFunction1(value))
      
      inline def setVisibleArgumentsUndefined: Self = StObject.set(x, "visibleArguments", js.undefined)
      
      inline def setVisibleCommands(value: /* cmd */ Command => js.Array[Command]): Self = StObject.set(x, "visibleCommands", js.Any.fromFunction1(value))
      
      inline def setVisibleCommandsUndefined: Self = StObject.set(x, "visibleCommands", js.undefined)
      
      inline def setVisibleGlobalOptions(value: /* cmd */ Command => js.Array[Option]): Self = StObject.set(x, "visibleGlobalOptions", js.Any.fromFunction1(value))
      
      inline def setVisibleGlobalOptionsUndefined: Self = StObject.set(x, "visibleGlobalOptions", js.undefined)
      
      inline def setVisibleOptions(value: /* cmd */ Command => js.Array[Option]): Self = StObject.set(x, "visibleOptions", js.Any.fromFunction1(value))
      
      inline def setVisibleOptionsUndefined: Self = StObject.set(x, "visibleOptions", js.undefined)
      
      inline def setWrap(
        value: (/* str */ String, /* width */ Double, /* indent */ Double, /* minColumnWidth */ js.UndefOr[Double]) => String
      ): Self = StObject.set(x, "wrap", js.Any.fromFunction4(value))
      
      inline def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  trait HelpContext extends StObject {
    
    // optional parameter for .help() and .outputHelp()
    var error: Boolean
  }
  object HelpContext {
    
    inline def apply(error: Boolean): HelpContext = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelpContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HelpContext] (val x: Self) extends AnyVal {
      
      inline def setError(value: Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.commander.commanderStrings.preSubcommand
    - typings.commander.commanderStrings.preAction
    - typings.commander.commanderStrings.postAction
  */
  trait HookEvent extends StObject
  object HookEvent {
    
    inline def postAction: typings.commander.commanderStrings.postAction = "postAction".asInstanceOf[typings.commander.commanderStrings.postAction]
    
    inline def preAction: typings.commander.commanderStrings.preAction = "preAction".asInstanceOf[typings.commander.commanderStrings.preAction]
    
    inline def preSubcommand: typings.commander.commanderStrings.preSubcommand = "preSubcommand".asInstanceOf[typings.commander.commanderStrings.preSubcommand]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.commander.commanderStrings.default
    - typings.commander.commanderStrings.config
    - typings.commander.commanderStrings.env
    - typings.commander.commanderStrings.cli
    - typings.commander.commanderStrings.implied
  */
  trait OptionValueSource extends StObject
  object OptionValueSource {
    
    inline def default: typings.commander.commanderStrings.default = "default".asInstanceOf[typings.commander.commanderStrings.default]
    
    inline def cli: typings.commander.commanderStrings.cli = "cli".asInstanceOf[typings.commander.commanderStrings.cli]
    
    inline def config: typings.commander.commanderStrings.config = "config".asInstanceOf[typings.commander.commanderStrings.config]
    
    inline def env: typings.commander.commanderStrings.env = "env".asInstanceOf[typings.commander.commanderStrings.env]
    
    inline def implied: typings.commander.commanderStrings.implied = "implied".asInstanceOf[typings.commander.commanderStrings.implied]
  }
  
  type OptionValues = Record[String, Any]
  
  trait OutputConfiguration extends StObject {
    
    var getErrHelpWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var getOutHelpWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    var outputError: js.UndefOr[
        js.Function2[/* str */ String, /* write */ js.Function1[/* str */ String, Unit], Unit]
      ] = js.undefined
    
    var writeErr: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.undefined
    
    var writeOut: js.UndefOr[js.Function1[/* str */ String, Unit]] = js.undefined
  }
  object OutputConfiguration {
    
    inline def apply(): OutputConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OutputConfiguration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OutputConfiguration] (val x: Self) extends AnyVal {
      
      inline def setGetErrHelpWidth(value: () => Double): Self = StObject.set(x, "getErrHelpWidth", js.Any.fromFunction0(value))
      
      inline def setGetErrHelpWidthUndefined: Self = StObject.set(x, "getErrHelpWidth", js.undefined)
      
      inline def setGetOutHelpWidth(value: () => Double): Self = StObject.set(x, "getOutHelpWidth", js.Any.fromFunction0(value))
      
      inline def setGetOutHelpWidthUndefined: Self = StObject.set(x, "getOutHelpWidth", js.undefined)
      
      inline def setOutputError(value: (/* str */ String, /* write */ js.Function1[/* str */ String, Unit]) => Unit): Self = StObject.set(x, "outputError", js.Any.fromFunction2(value))
      
      inline def setOutputErrorUndefined: Self = StObject.set(x, "outputError", js.undefined)
      
      inline def setWriteErr(value: /* str */ String => Unit): Self = StObject.set(x, "writeErr", js.Any.fromFunction1(value))
      
      inline def setWriteErrUndefined: Self = StObject.set(x, "writeErr", js.undefined)
      
      inline def setWriteOut(value: /* str */ String => Unit): Self = StObject.set(x, "writeOut", js.Any.fromFunction1(value))
      
      inline def setWriteOutUndefined: Self = StObject.set(x, "writeOut", js.undefined)
    }
  }
  
  trait ParseOptions extends StObject {
    
    var from: node | electron | user
  }
  object ParseOptions {
    
    inline def apply(from: node | electron | user): ParseOptions = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: node | electron | user): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOptionsResult extends StObject {
    
    var operands: js.Array[String]
    
    var unknown: js.Array[String]
  }
  object ParseOptionsResult {
    
    inline def apply(operands: js.Array[String], unknown: js.Array[String]): ParseOptionsResult = {
      val __obj = js.Dynamic.literal(operands = operands.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptionsResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ParseOptionsResult] (val x: Self) extends AnyVal {
      
      inline def setOperands(value: js.Array[String]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
      
      inline def setOperandsVarargs(value: String*): Self = StObject.set(x, "operands", js.Array(value*))
      
      inline def setUnknown(value: js.Array[String]): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      inline def setUnknownVarargs(value: String*): Self = StObject.set(x, "unknown", js.Array(value*))
    }
  }
}
