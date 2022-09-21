package typings.commanderVersion

import typings.commander.mod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("commander-version/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(dirname: String): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dirname.asInstanceOf[js.Any]).asInstanceOf[Command]
  inline def default(dirname: String, flags: String): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dirname.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[Command]
  inline def default(dirname: String, flags: String, description: String): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dirname.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Command]
  inline def default(dirname: String, flags: Unit, description: String): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(dirname.asInstanceOf[js.Any], flags.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[Command]
  
  object commander {
    
    @JSImport("commander-version/build", "commander")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("commander-version/build", "commander.Argument")
    @js.native
    open class Argument protected ()
      extends typings.commander.mod.Argument {
      /**
        * Initialize a new command argument with the given name and description.
        * The default is that the argument is required, and you can explicitly
        * indicate this with <> around the name. Put [] around the name for an optional argument.
        */
      def this(arg: String) = this()
      def this(arg: String, description: String) = this()
    }
    
    @JSImport("commander-version/build", "commander.Command")
    @js.native
    open class Command ()
      extends typings.commander.mod.Command {
      def this(name: String) = this()
    }
    
    @JSImport("commander-version/build", "commander.CommanderError")
    @js.native
    open class CommanderError protected ()
      extends typings.commander.mod.CommanderError {
      /**
        * Constructs the CommanderError class
        * @param exitCode - suggested exit code which could be used with process.exit
        * @param code - an id string representing the error
        * @param message - human-readable description of the error
        * @constructor
        */
      def this(exitCode: Double, code: String, message: String) = this()
    }
    
    @JSImport("commander-version/build", "commander.Help")
    @js.native
    open class Help ()
      extends typings.commander.mod.Help
    
    @JSImport("commander-version/build", "commander.InvalidArgumentError")
    @js.native
    open class InvalidArgumentError protected ()
      extends typings.commander.mod.InvalidArgumentError {
      /**
        * Constructs the InvalidArgumentError class
        * @param message - explanation of why argument is invalid
        * @constructor
        */
      def this(message: String) = this()
    }
    
    @JSImport("commander-version/build", "commander.InvalidOptionArgumentError")
    @js.native
    open class InvalidOptionArgumentError protected ()
      extends typings.commander.mod.InvalidOptionArgumentError {
      /**
        * Constructs the InvalidArgumentError class
        * @param message - explanation of why argument is invalid
        * @constructor
        */
      def this(message: String) = this()
    }
    
    @JSImport("commander-version/build", "commander.Option")
    @js.native
    open class Option protected ()
      extends typings.commander.mod.Option {
      def this(flags: String) = this()
      def this(flags: String, description: String) = this()
    }
    
    inline def createArgument(name: String): typings.commander.mod.Argument = ^.asInstanceOf[js.Dynamic].applyDynamic("createArgument")(name.asInstanceOf[js.Any]).asInstanceOf[typings.commander.mod.Argument]
    inline def createArgument(name: String, description: String): typings.commander.mod.Argument = (^.asInstanceOf[js.Dynamic].applyDynamic("createArgument")(name.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[typings.commander.mod.Argument]
    
    inline def createCommand(): typings.commander.mod.Command = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommand")().asInstanceOf[typings.commander.mod.Command]
    inline def createCommand(name: String): typings.commander.mod.Command = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommand")(name.asInstanceOf[js.Any]).asInstanceOf[typings.commander.mod.Command]
    
    inline def createOption(flags: String): typings.commander.mod.Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")(flags.asInstanceOf[js.Any]).asInstanceOf[typings.commander.mod.Option]
    inline def createOption(flags: String, description: String): typings.commander.mod.Option = (^.asInstanceOf[js.Dynamic].applyDynamic("createOption")(flags.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[typings.commander.mod.Option]
    
    @JSImport("commander-version/build", "commander.program")
    @js.native
    val program: typings.commander.mod.Command = js.native
  }
  
  inline def createCommand(): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommand")().asInstanceOf[Command]
  inline def createCommand(name: String): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("createCommand")(name.asInstanceOf[js.Any]).asInstanceOf[Command]
}
