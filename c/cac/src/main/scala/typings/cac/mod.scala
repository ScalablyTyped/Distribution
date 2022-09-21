package typings.cac

import org.scalablytyped.runtime.StringDictionary
import typings.cac.anon.Run
import typings.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("cac", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param name The program name to display in help and version message
    */
  inline def default(): CAC_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[CAC_]
  inline def default(name: String): CAC_ = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(name.asInstanceOf[js.Any]).asInstanceOf[CAC_]
  
  @JSImport("cac", "CAC")
  @js.native
  /**
    * @param name The program name to display in help and version message
    */
  open class CAC_ () extends EventEmitter {
    def this(name: String) = this()
    
    /**
      * Parsed CLI arguments
      */
    var args: js.Array[String] = js.native
    
    /**
      * Add a sub-command
      */
    def command(rawName: String): Command = js.native
    def command(rawName: String, description: String): Command = js.native
    def command(rawName: String, description: String, config: CommandConfig): Command = js.native
    def command(rawName: String, description: Unit, config: CommandConfig): Command = js.native
    
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
    
    /* private */ var mri: Any = js.native
    
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
    var options: StringDictionary[Any] = js.native
    
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
    def parse(argv: js.Array[String]): ParsedArgv = js.native
    def parse(argv: js.Array[String], hasRun: Run): ParsedArgv = js.native
    def parse(argv: Unit, hasRun: Run): ParsedArgv = js.native
    
    /**
      * Raw CLI arguments
      */
    var rawArgs: js.Array[String] = js.native
    
    def runMatchedCommand(): Any = js.native
    
    /* private */ var setParsedInfo: Any = js.native
    
    var showHelpOnExit: js.UndefOr[Boolean] = js.native
    
    var showVersionOnExit: js.UndefOr[Boolean] = js.native
    
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
  
  @JSImport("cac", "Command")
  @js.native
  open class Command protected () extends StObject {
    def this(rawName: String, description: String, config: CommandConfig, cli: CAC_) = this()
    
    def action(callback: js.Function1[/* repeated */ Any, Any]): this.type = js.native
    
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
    
    var commandAction: js.UndefOr[js.Function1[/* repeated */ Any, Any]] = js.native
    
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
  
  /**
    * @param name The program name to display in help and version message
    */
  inline def cac(): CAC_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cac")().asInstanceOf[CAC_]
  inline def cac(name: String): CAC_ = ^.asInstanceOf[js.Dynamic].applyDynamic("cac")(name.asInstanceOf[js.Any]).asInstanceOf[CAC_]
  
  trait CommandArg extends StObject {
    
    var required: Boolean
    
    var value: String
    
    var variadic: Boolean
  }
  object CommandArg {
    
    inline def apply(required: Boolean, value: String, variadic: Boolean): CommandArg = {
      val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], variadic = variadic.asInstanceOf[js.Any])
      __obj.asInstanceOf[CommandArg]
    }
    
    extension [Self <: CommandArg](x: Self) {
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVariadic(value: Boolean): Self = StObject.set(x, "variadic", value.asInstanceOf[js.Any])
    }
  }
  
  trait CommandConfig extends StObject {
    
    var allowUnknownOptions: js.UndefOr[Boolean] = js.undefined
    
    var ignoreOptionDefaultValue: js.UndefOr[Boolean] = js.undefined
  }
  object CommandConfig {
    
    inline def apply(): CommandConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandConfig]
    }
    
    extension [Self <: CommandConfig](x: Self) {
      
      inline def setAllowUnknownOptions(value: Boolean): Self = StObject.set(x, "allowUnknownOptions", value.asInstanceOf[js.Any])
      
      inline def setAllowUnknownOptionsUndefined: Self = StObject.set(x, "allowUnknownOptions", js.undefined)
      
      inline def setIgnoreOptionDefaultValue(value: Boolean): Self = StObject.set(x, "ignoreOptionDefaultValue", value.asInstanceOf[js.Any])
      
      inline def setIgnoreOptionDefaultValueUndefined: Self = StObject.set(x, "ignoreOptionDefaultValue", js.undefined)
    }
  }
  
  type CommandExample = (js.Function1[/* bin */ String, String]) | String
  
  type GlobalCommand = Command
  
  type HelpCallback = js.Function1[/* sections */ js.Array[HelpSection], Unit | js.Array[HelpSection]]
  
  trait HelpSection extends StObject {
    
    var body: String
    
    var title: js.UndefOr[String] = js.undefined
  }
  object HelpSection {
    
    inline def apply(body: String): HelpSection = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelpSection]
    }
    
    extension [Self <: HelpSection](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait Option extends StObject {
    
    var config: OptionConfig
    
    var description: String
    
    var isBoolean: js.UndefOr[Boolean] = js.undefined
    
    /** Option name */
    var name: String
    
    /** Option name and aliases */
    var names: js.Array[String]
    
    var negated: Boolean
    
    var rawName: String
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object Option {
    
    inline def apply(
      config: OptionConfig,
      description: String,
      name: String,
      names: js.Array[String],
      negated: Boolean,
      rawName: String
    ): Option = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], names = names.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Option]
    }
    
    extension [Self <: Option](x: Self) {
      
      inline def setConfig(value: OptionConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setIsBoolean(value: Boolean): Self = StObject.set(x, "isBoolean", value.asInstanceOf[js.Any])
      
      inline def setIsBooleanUndefined: Self = StObject.set(x, "isBoolean", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
      
      inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
      
      inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
      
      inline def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait OptionConfig extends StObject {
    
    var default: js.UndefOr[Any] = js.undefined
    
    var `type`: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object OptionConfig {
    
    inline def apply(): OptionConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionConfig]
    }
    
    extension [Self <: OptionConfig](x: Self) {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setType(value: js.Array[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setTypeVarargs(value: Any*): Self = StObject.set(x, "type", js.Array(value*))
    }
  }
  
  trait ParsedArgv extends StObject {
    
    var args: js.Array[String]
    
    var options: StringDictionary[Any]
  }
  object ParsedArgv {
    
    inline def apply(args: js.Array[String], options: StringDictionary[Any]): ParsedArgv = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedArgv]
    }
    
    extension [Self <: ParsedArgv](x: Self) {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setOptions(value: StringDictionary[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
}
