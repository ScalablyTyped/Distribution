package typings.concurrently

import typings.concurrently.anon.PartialCommandInfo
import typings.concurrently.anon.PartialConcurrentlyOption
import typings.concurrently.distSrcCommandMod.ChildProcess
import typings.concurrently.distSrcCommandMod.CloseEvent
import typings.concurrently.distSrcCommandMod.Command
import typings.concurrently.distSrcCommandMod.KillProcess
import typings.concurrently.distSrcCommandMod.SpawnCommand
import typings.concurrently.distSrcCompletionListenerMod.SuccessCondition
import typings.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import typings.concurrently.distSrcLoggerMod.Logger
import typings.node.childProcessMod.SpawnOptions
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcConcurrentlyMod {
  
  @JSImport("concurrently/dist/src/concurrently", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concurrently(baseCommands: js.Array[ConcurrentlyCommandInput]): ConcurrentlyResult = ^.asInstanceOf[js.Dynamic].applyDynamic("concurrently")(baseCommands.asInstanceOf[js.Any]).asInstanceOf[ConcurrentlyResult]
  inline def concurrently(baseCommands: js.Array[ConcurrentlyCommandInput], baseOptions: PartialConcurrentlyOption): ConcurrentlyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("concurrently")(baseCommands.asInstanceOf[js.Any], baseOptions.asInstanceOf[js.Any])).asInstanceOf[ConcurrentlyResult]
  
  type ConcurrentlyCommandInput = String | PartialCommandInfo
  
  trait ConcurrentlyOptions extends StObject {
    
    /**
      * List of additional arguments passed that will get replaced in each command.
      * If not defined, no argument replacing will happen.
      *
      * @see ExpandArguments
      */
    var additionalArguments: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Which flow controllers should be applied on commands spawned by concurrently.
      * Defaults to an empty array.
      */
    var controllers: js.Array[FlowController]
    
    /**
      * The current working directory of commands which didn't specify one.
      * Defaults to `process.cwd()`.
      */
    var cwd: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the output should be ordered as if the commands were run sequentially.
      */
    var group: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that will kill processes.
      * Defaults to the `tree-kill` module.
      */
    def kill(pid: Double): Unit
    def kill(pid: Double, signal: String): Unit
    /**
      * A function that will kill processes.
      * Defaults to the `tree-kill` module.
      */
    @JSName("kill")
    var kill_Original: KillProcess
    
    var logger: js.UndefOr[Logger] = js.undefined
    
    /**
      * Maximum number of commands to run at once.
      *
      * If undefined, then all processes will start in parallel.
      * Setting this value to 1 will achieve sequential running.
      */
    var maxProcesses: js.UndefOr[Double] = js.undefined
    
    /**
      * Which stream should the commands output be written to.
      */
    var outputStream: js.UndefOr[Writable] = js.undefined
    
    /**
      * Comma-separated list of chalk colors to use on prefixes.
      */
    var prefixColors: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Whether commands should be spawned in raw mode.
      * Defaults to false.
      */
    var raw: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function that will spawn commands.
      * Defaults to the `spawn-command` module.
      */
    def spawn(command: String, options: SpawnOptions): ChildProcess
    /**
      * A function that will spawn commands.
      * Defaults to the `spawn-command` module.
      */
    @JSName("spawn")
    var spawn_Original: SpawnCommand
    
    /**
      * @see CompletionListener
      */
    var successCondition: js.UndefOr[SuccessCondition] = js.undefined
  }
  object ConcurrentlyOptions {
    
    inline def apply(
      controllers: js.Array[FlowController],
      kill: (/* pid */ Double, /* signal */ js.UndefOr[String]) => Unit,
      spawn: (/* command */ String, /* options */ SpawnOptions) => ChildProcess
    ): ConcurrentlyOptions = {
      val __obj = js.Dynamic.literal(controllers = controllers.asInstanceOf[js.Any], kill = js.Any.fromFunction2(kill), spawn = js.Any.fromFunction2(spawn))
      __obj.asInstanceOf[ConcurrentlyOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConcurrentlyOptions] (val x: Self) extends AnyVal {
      
      inline def setAdditionalArguments(value: js.Array[String]): Self = StObject.set(x, "additionalArguments", value.asInstanceOf[js.Any])
      
      inline def setAdditionalArgumentsUndefined: Self = StObject.set(x, "additionalArguments", js.undefined)
      
      inline def setAdditionalArgumentsVarargs(value: String*): Self = StObject.set(x, "additionalArguments", js.Array(value*))
      
      inline def setControllers(value: js.Array[FlowController]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
      
      inline def setControllersVarargs(value: FlowController*): Self = StObject.set(x, "controllers", js.Array(value*))
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setKill(value: (/* pid */ Double, /* signal */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction2(value))
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxProcesses(value: Double): Self = StObject.set(x, "maxProcesses", value.asInstanceOf[js.Any])
      
      inline def setMaxProcessesUndefined: Self = StObject.set(x, "maxProcesses", js.undefined)
      
      inline def setOutputStream(value: Writable): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
      
      inline def setOutputStreamUndefined: Self = StObject.set(x, "outputStream", js.undefined)
      
      inline def setPrefixColors(value: js.Array[String]): Self = StObject.set(x, "prefixColors", value.asInstanceOf[js.Any])
      
      inline def setPrefixColorsUndefined: Self = StObject.set(x, "prefixColors", js.undefined)
      
      inline def setPrefixColorsVarargs(value: String*): Self = StObject.set(x, "prefixColors", js.Array(value*))
      
      inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
      
      inline def setSpawn(value: (/* command */ String, /* options */ SpawnOptions) => ChildProcess): Self = StObject.set(x, "spawn", js.Any.fromFunction2(value))
      
      inline def setSuccessCondition(value: SuccessCondition): Self = StObject.set(x, "successCondition", value.asInstanceOf[js.Any])
      
      inline def setSuccessConditionUndefined: Self = StObject.set(x, "successCondition", js.undefined)
    }
  }
  
  trait ConcurrentlyResult extends StObject {
    
    /**
      * All commands created and ran by concurrently.
      */
    var commands: js.Array[Command]
    
    /**
      * A promise that resolves when concurrently ran successfully according to the specified
      * success condition, or reject otherwise.
      *
      * Both the resolved and rejected value is the list of all command's close events.
      */
    var result: js.Promise[js.Array[CloseEvent]]
  }
  object ConcurrentlyResult {
    
    inline def apply(commands: js.Array[Command], result: js.Promise[js.Array[CloseEvent]]): ConcurrentlyResult = {
      val __obj = js.Dynamic.literal(commands = commands.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcurrentlyResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConcurrentlyResult] (val x: Self) extends AnyVal {
      
      inline def setCommands(value: js.Array[Command]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
      
      inline def setCommandsVarargs(value: Command*): Self = StObject.set(x, "commands", js.Array(value*))
      
      inline def setResult(value: js.Promise[js.Array[CloseEvent]]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
