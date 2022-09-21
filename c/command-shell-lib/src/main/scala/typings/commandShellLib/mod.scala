package typings.commandShellLib

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("command-shell-lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def destroy(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("destroy")().asInstanceOf[Unit]
  
  inline def executeCommander(command: js.Array[String], commands: CommandsObject): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("executeCommander")(command.asInstanceOf[js.Any], commands.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getWriter(): LogWriter = ^.asInstanceOf[js.Dynamic].applyDynamic("getWriter")().asInstanceOf[LogWriter]
  
  inline def handleError(error: js.Error): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("handleError")(error.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def initialize(commands: CommandsObject, promptString: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("initialize")(commands.asInstanceOf[js.Any], promptString.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def notImplemented(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("notImplemented")().asInstanceOf[Unit]
  
  inline def printName(name: String): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("printName")(name.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def prompt(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prompt")().asInstanceOf[Unit]
  
  inline def setWriter(newWriter: LogWriter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setWriter")(newWriter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def showConfig(config: StringDictionary[Any], branch: String): js.Function0[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("showConfig")(config.asInstanceOf[js.Any], branch.asInstanceOf[js.Any])).asInstanceOf[js.Function0[Unit]]
  
  inline def showHelp(commands: CommandsObject): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("showHelp")(commands.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Command extends StObject {
    
    /** Contains the contents that will be shown in the command help. */
    var description: String
    
    /** The function that will be called when the command is executed. */
    def handler(params: js.Array[String]): Unit
    
    /**
      * A list of needed parameters for the command
      * (if its invoked with a different number of parameters an error will be raised).
      */
    var parameters: js.Array[String]
  }
  object Command {
    
    inline def apply(description: String, handler: js.Array[String] => Unit, parameters: js.Array[String]): Command = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], handler = js.Any.fromFunction1(handler), parameters = parameters.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    extension [Self <: Command](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setHandler(value: js.Array[String] => Unit): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setParameters(value: js.Array[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: String*): Self = StObject.set(x, "parameters", js.Array(value*))
    }
  }
  
  type CommandsObject = StringDictionary[Command]
  
  @js.native
  trait LogWriter extends StObject {
    
    def log(message: Any, optionalParams: Any*): Unit = js.native
    def log(message: Unit, optionalParams: Any*): Unit = js.native
  }
}
