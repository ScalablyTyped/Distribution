package typings.commander

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.commander.commanderStrings.electron
import typings.commander.commanderStrings.node
import typings.commander.commanderStrings.user
import typings.std.Error
import typings.std.RegExp
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Declaring namespace AND global
// eslint-disable-next-line @typescript-eslint/no-redeclare
object mod extends Shortcut {
  
  @JSImport("commander", JSImport.Namespace)
  @js.native
  val ^ : CommanderStatic = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("commander", "Command")
  @js.native
  class CommandCls ()
    extends StObject
       with Command {
    def this(name: String) = this()
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("commander", "CommanderError")
  @js.native
  class CommanderErrorCls protected ()
    extends StObject
       with CommanderError {
    def this(exitCode: Double, code: String, message: String) = this()
    
    /* CompleteClass */
    var code: String = js.native
    
    /* CompleteClass */
    var exitCode: Double = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("commander", "Option")
  @js.native
  class OptionCls protected ()
    extends StObject
       with Option {
    def this(flags: String) = this()
    def this(flags: String, description: String) = this()
    
    // The option must have a value after parsing, which usually means it must be specified on command line.
    /* CompleteClass */
    var bool: Boolean = js.native
    
    /* CompleteClass */
    var description: String = js.native
    
    /* CompleteClass */
    var flags: String = js.native
    
    /* CompleteClass */
    var long: String = js.native
    
    // A value is optional when the option is specified.
    /* CompleteClass */
    var mandatory: Boolean = js.native
    
    // A value must be supplied when the option is specified.
    /* CompleteClass */
    var optional: Boolean = js.native
    
    /* CompleteClass */
    var required: Boolean = js.native
  }
  
  @js.native
  trait Command
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
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
      * Override default decision whether to add implicit help command.
      *
      *    addHelpCommand() // force on
      *    addHelpCommand(false); // force off
      *    addHelpCommand('help [cmd]', 'display help for [cmd]'); // force on with custom details
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
    
    // options as properties
    var args: js.Array[String] = js.native
    
    /**
      * Define argument syntax for command.
      *
      * @returns `this` command for chaining
      */
    def arguments(desc: String): this.type = js.native
    
    /**
      * Alter parsing of short flags with optional values.
      *
      * @example
      *    // for `.option('-f,--flag [value]'):
      *   .combineFlagAndOptionalValue(true)  // `-f80` is treated like `--flag=80`, this is the default behaviour
      *   .combineFlagAndOptionalValue(false) // `-fb` is treated like `-f -b`
      *
      * @returns `this` command for chaining
      */
    def combineFlagAndOptionalValue(): this.type = js.native
    def combineFlagAndOptionalValue(arg: Boolean): this.type = js.native
    
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
    
    var commands: js.Array[Command] = js.native
    
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
    def option(flags: String, description: String): this.type = js.native
    def option(flags: String, description: String, defaultValue: String): this.type = js.native
    def option(flags: String, description: String, defaultValue: Boolean): this.type = js.native
    def option(flags: String, description: String, regexp: RegExp): this.type = js.native
    def option(flags: String, description: String, regexp: RegExp, defaultValue: String): this.type = js.native
    def option(flags: String, description: String, regexp: RegExp, defaultValue: Boolean): this.type = js.native
    def option(flags: String, description: Unit, defaultValue: String): this.type = js.native
    def option(flags: String, description: Unit, defaultValue: Boolean): this.type = js.native
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
      * Examples:
      *
      *      program.parseAsync(process.argv);
      *      program.parseAsync(); // implicitly use process.argv and auto-detect node vs electron conventions
      *      program.parseAsync(my-args, { from: 'user' }); // just user supplied arguments, nothing special about argv[0]
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
    def requiredOption(flags: String, description: String): this.type = js.native
    def requiredOption(flags: String, description: String, defaultValue: String): this.type = js.native
    def requiredOption(flags: String, description: String, defaultValue: Boolean): this.type = js.native
    def requiredOption(flags: String, description: String, regexp: RegExp): this.type = js.native
    def requiredOption(flags: String, description: String, regexp: RegExp, defaultValue: String): this.type = js.native
    def requiredOption(flags: String, description: String, regexp: RegExp, defaultValue: Boolean): this.type = js.native
    def requiredOption(flags: String, description: Unit, defaultValue: String): this.type = js.native
    def requiredOption(flags: String, description: Unit, defaultValue: Boolean): this.type = js.native
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
    def version(str: String, flags: String): this.type = js.native
    def version(str: String, flags: String, description: String): this.type = js.native
    def version(str: String, flags: Unit, description: String): this.type = js.native
  }
  
  type CommandConstructor = Instantiable1[/* name */ js.UndefOr[String], Command]
  
  trait CommandOptions extends StObject {
    
    // old name for hidden
    var hidden: js.UndefOr[Boolean] = js.undefined
    
    var isDefault: js.UndefOr[Boolean] = js.undefined
    
    var noHelp: js.UndefOr[Boolean] = js.undefined
  }
  object CommandOptions {
    
    @scala.inline
    def apply(): CommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandOptions]
    }
    
    @scala.inline
    implicit class CommandOptionsMutableBuilder[Self <: CommandOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setIsDefault(value: Boolean): Self = StObject.set(x, "isDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDefaultUndefined: Self = StObject.set(x, "isDefault", js.undefined)
      
      @scala.inline
      def setNoHelp(value: Boolean): Self = StObject.set(x, "noHelp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoHelpUndefined: Self = StObject.set(x, "noHelp", js.undefined)
    }
  }
  
  trait CommanderError
    extends StObject
       with Error {
    
    var code: String
    
    var exitCode: Double
    
    var nestedError: js.UndefOr[String] = js.undefined
  }
  object CommanderError {
    
    @scala.inline
    def apply(code: String, exitCode: Double, message: String, name: String): CommanderError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], exitCode = exitCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommanderError]
    }
    
    @scala.inline
    implicit class CommanderErrorMutableBuilder[Self <: CommanderError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedError(value: String): Self = StObject.set(x, "nestedError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestedErrorUndefined: Self = StObject.set(x, "nestedError", js.undefined)
    }
  }
  
  type CommanderErrorConstructor = Instantiable3[/* exitCode */ Double, /* code */ String, /* message */ String, CommanderError]
  
  @js.native
  trait CommanderStatic
    extends StObject
       with Command {
    
    var Command: CommandConstructor = js.native
    
    var CommanderError: CommanderErrorConstructor = js.native
    
    var Option: OptionConstructor = js.native
    
    var program: Command = js.native
  }
  
  trait ExecutableCommandOptions
    extends StObject
       with CommandOptions {
    
    var executableFile: js.UndefOr[String] = js.undefined
  }
  object ExecutableCommandOptions {
    
    @scala.inline
    def apply(): ExecutableCommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutableCommandOptions]
    }
    
    @scala.inline
    implicit class ExecutableCommandOptionsMutableBuilder[Self <: ExecutableCommandOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutableFile(value: String): Self = StObject.set(x, "executableFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExecutableFileUndefined: Self = StObject.set(x, "executableFile", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    // The option must have a value after parsing, which usually means it must be specified on command line.
    var bool: Boolean
    
    var description: String
    
    var flags: String
    
    var long: String
    
    // A value is optional when the option is specified.
    var mandatory: Boolean
    
    // A value must be supplied when the option is specified.
    var optional: Boolean
    
    var required: Boolean
    
    var short: js.UndefOr[String] = js.undefined
  }
  object Option {
    
    @scala.inline
    def apply(
      bool: Boolean,
      description: String,
      flags: String,
      long: String,
      mandatory: Boolean,
      optional: Boolean,
      required: Boolean
    ): Option = {
      val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], mandatory = mandatory.asInstanceOf[js.Any], optional = optional.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    @scala.inline
    implicit class OptionMutableBuilder[Self <: Option] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMandatory(value: Boolean): Self = StObject.set(x, "mandatory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptional(value: Boolean): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShortUndefined: Self = StObject.set(x, "short", js.undefined)
    }
  }
  
  type OptionConstructor = Instantiable2[/* flags */ String, /* description */ js.UndefOr[String], Option]
  
  trait ParseOptions extends StObject {
    
    var from: node | electron | user
  }
  object ParseOptions {
    
    @scala.inline
    def apply(from: node | electron | user): ParseOptions = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: node | electron | user): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOptionsResult extends StObject {
    
    var operands: js.Array[String]
    
    var unknown: js.Array[String]
  }
  object ParseOptionsResult {
    
    @scala.inline
    def apply(operands: js.Array[String], unknown: js.Array[String]): ParseOptionsResult = {
      val __obj = js.Dynamic.literal(operands = operands.asInstanceOf[js.Any], unknown = unknown.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseOptionsResult]
    }
    
    @scala.inline
    implicit class ParseOptionsResultMutableBuilder[Self <: ParseOptionsResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOperands(value: js.Array[String]): Self = StObject.set(x, "operands", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOperandsVarargs(value: String*): Self = StObject.set(x, "operands", js.Array(value :_*))
      
      @scala.inline
      def setUnknown(value: js.Array[String]): Self = StObject.set(x, "unknown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnknownVarargs(value: String*): Self = StObject.set(x, "unknown", js.Array(value :_*))
    }
  }
  
  type _To = CommanderStatic
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: CommanderStatic = ^
}
