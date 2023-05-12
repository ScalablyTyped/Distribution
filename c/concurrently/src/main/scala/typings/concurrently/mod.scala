package typings.concurrently

import typings.concurrently.anon.CommandInfoindexnumber
import typings.concurrently.anon.Conditions
import typings.concurrently.anon.DefaultInputTarget
import typings.concurrently.anon.Delay
import typings.concurrently.anon.Hide
import typings.concurrently.anon.PartialConcurrentlyOption
import typings.concurrently.anon.PartialConcurrentlyOptionAdditionalArguments
import typings.concurrently.anon.Process
import typings.concurrently.anon.TimestampFormat
import typings.concurrently.distSrcCommandMod.ChildProcess
import typings.concurrently.distSrcCommandMod.CloseEvent
import typings.concurrently.distSrcCommandMod.CommandIdentifier
import typings.concurrently.distSrcCommandMod.KillProcess
import typings.concurrently.distSrcCommandMod.SpawnCommand
import typings.concurrently.distSrcConcurrentlyMod.ConcurrentlyCommandInput
import typings.concurrently.distSrcConcurrentlyMod.ConcurrentlyResult
import typings.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import typings.concurrently.distSrcFlowControlKillOthersMod.ProcessCloseCondition
import typings.concurrently.distSrcFlowControlLogTimingsMod.TimingInfo
import typings.node.childProcessMod.SpawnOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("concurrently", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(commands: js.Array[ConcurrentlyCommandInput]): ConcurrentlyResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(commands.asInstanceOf[js.Any]).asInstanceOf[ConcurrentlyResult]
  inline def default(
    commands: js.Array[ConcurrentlyCommandInput],
    options: PartialConcurrentlyOptionAdditionalArguments
  ): ConcurrentlyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(commands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ConcurrentlyResult]
  
  @JSImport("concurrently", "Command")
  @js.native
  open class Command protected ()
    extends typings.concurrently.distSrcCommandMod.Command {
    def this(
      param0: CommandInfoindexnumber,
      spawnOpts: SpawnOptions,
      spawn: SpawnCommand,
      killProcess: KillProcess
    ) = this()
  }
  /* static members */
  object Command {
    
    @JSImport("concurrently", "Command")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Detects whether a command can be killed.
      *
      * Also works as a type guard on the input `command`.
      */
    inline def canKill(command: typings.concurrently.distSrcCommandMod.Command): /* is concurrently.anon.CommandpidnumberprocessCh */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("canKill")(command.asInstanceOf[js.Any]).asInstanceOf[/* is concurrently.anon.CommandpidnumberprocessCh */ Boolean]
  }
  
  @JSImport("concurrently", "InputHandler")
  @js.native
  open class InputHandler protected ()
    extends typings.concurrently.distSrcFlowControlInputHandlerMod.InputHandler {
    def this(param0: DefaultInputTarget) = this()
  }
  
  @JSImport("concurrently", "KillOnSignal")
  @js.native
  open class KillOnSignal protected ()
    extends typings.concurrently.distSrcFlowControlKillOnSignalMod.KillOnSignal {
    def this(param0: Process) = this()
  }
  
  @JSImport("concurrently", "KillOthers")
  @js.native
  open class KillOthers protected ()
    extends typings.concurrently.distSrcFlowControlKillOthersMod.KillOthers {
    def this(param0: Conditions) = this()
  }
  
  @JSImport("concurrently", "LogError")
  @js.native
  open class LogError protected ()
    extends typings.concurrently.distSrcFlowControlLogErrorMod.LogError {
    def this(param0: typings.concurrently.anon.Logger) = this()
  }
  
  @JSImport("concurrently", "LogExit")
  @js.native
  open class LogExit protected ()
    extends typings.concurrently.distSrcFlowControlLogExitMod.LogExit {
    def this(param0: typings.concurrently.anon.Logger) = this()
  }
  
  @JSImport("concurrently", "LogOutput")
  @js.native
  open class LogOutput protected ()
    extends typings.concurrently.distSrcFlowControlLogOutputMod.LogOutput {
    def this(param0: typings.concurrently.anon.Logger) = this()
  }
  
  @JSImport("concurrently", "LogTimings")
  @js.native
  open class LogTimings protected ()
    extends typings.concurrently.distSrcFlowControlLogTimingsMod.LogTimings {
    def this(param0: TimestampFormat) = this()
  }
  /* static members */
  object LogTimings {
    
    @JSImport("concurrently", "LogTimings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def mapCloseEventToTimingInfo(param0: CloseEvent): TimingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("mapCloseEventToTimingInfo")(param0.asInstanceOf[js.Any]).asInstanceOf[TimingInfo]
  }
  
  @JSImport("concurrently", "Logger")
  @js.native
  open class Logger protected ()
    extends typings.concurrently.distSrcLoggerMod.Logger {
    def this(param0: Hide) = this()
  }
  
  @JSImport("concurrently", "RestartProcess")
  @js.native
  open class RestartProcess protected ()
    extends typings.concurrently.distSrcFlowControlRestartProcessMod.RestartProcess {
    def this(param0: Delay) = this()
  }
  
  inline def concurrently(baseCommands: js.Array[ConcurrentlyCommandInput]): ConcurrentlyResult = ^.asInstanceOf[js.Dynamic].applyDynamic("concurrently")(baseCommands.asInstanceOf[js.Any]).asInstanceOf[ConcurrentlyResult]
  inline def concurrently(baseCommands: js.Array[ConcurrentlyCommandInput], baseOptions: PartialConcurrentlyOption): ConcurrentlyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("concurrently")(baseCommands.asInstanceOf[js.Any], baseOptions.asInstanceOf[js.Any])).asInstanceOf[ConcurrentlyResult]
  
  trait ConcurrentlyOptions
    extends StObject
       with typings.concurrently.distSrcConcurrentlyMod.ConcurrentlyOptions {
    
    var defaultInputTarget: js.UndefOr[CommandIdentifier] = js.undefined
    
    var handleInput: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which command(s) should have their output hidden.
      */
    var hide: js.UndefOr[CommandIdentifier | js.Array[CommandIdentifier]] = js.undefined
    
    var inputStream: js.UndefOr[Readable] = js.undefined
    
    /**
      * Under which condition(s) should other commands be killed when the first one exits.
      *
      * @see KillOthers
      */
    var killOthers: js.UndefOr[ProcessCloseCondition | js.Array[ProcessCloseCondition]] = js.undefined
    
    var pauseInputStreamOnFinish: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The prefix format to use when logging a command's output.
      * Defaults to the command's index.
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * How many characters should a prefix have at most, used when the prefix format is `command`.
      */
    var prefixLength: js.UndefOr[Double] = js.undefined
    
    /**
      * How much time in milliseconds to wait before restarting a command.
      *
      * @see RestartProcess
      */
    var restartDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * How many times commands should be restarted when they exit with a failure.
      *
      * @see RestartProcess
      */
    var restartTries: js.UndefOr[Double] = js.undefined
    
    /**
      * Date format used when logging date/time.
      * @see https://date-fns.org/v2.0.1/docs/format
      */
    var timestampFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to output timing information for processes.
      *
      * @see LogTimings
      */
    var timings: js.UndefOr[Boolean] = js.undefined
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
      
      inline def setDefaultInputTarget(value: CommandIdentifier): Self = StObject.set(x, "defaultInputTarget", value.asInstanceOf[js.Any])
      
      inline def setDefaultInputTargetUndefined: Self = StObject.set(x, "defaultInputTarget", js.undefined)
      
      inline def setHandleInput(value: Boolean): Self = StObject.set(x, "handleInput", value.asInstanceOf[js.Any])
      
      inline def setHandleInputUndefined: Self = StObject.set(x, "handleInput", js.undefined)
      
      inline def setHide(value: CommandIdentifier | js.Array[CommandIdentifier]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setHideVarargs(value: CommandIdentifier*): Self = StObject.set(x, "hide", js.Array(value*))
      
      inline def setInputStream(value: Readable): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
      
      inline def setInputStreamUndefined: Self = StObject.set(x, "inputStream", js.undefined)
      
      inline def setKillOthers(value: ProcessCloseCondition | js.Array[ProcessCloseCondition]): Self = StObject.set(x, "killOthers", value.asInstanceOf[js.Any])
      
      inline def setKillOthersUndefined: Self = StObject.set(x, "killOthers", js.undefined)
      
      inline def setKillOthersVarargs(value: ProcessCloseCondition*): Self = StObject.set(x, "killOthers", js.Array(value*))
      
      inline def setPauseInputStreamOnFinish(value: Boolean): Self = StObject.set(x, "pauseInputStreamOnFinish", value.asInstanceOf[js.Any])
      
      inline def setPauseInputStreamOnFinishUndefined: Self = StObject.set(x, "pauseInputStreamOnFinish", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixLength(value: Double): Self = StObject.set(x, "prefixLength", value.asInstanceOf[js.Any])
      
      inline def setPrefixLengthUndefined: Self = StObject.set(x, "prefixLength", js.undefined)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setRestartDelay(value: Double): Self = StObject.set(x, "restartDelay", value.asInstanceOf[js.Any])
      
      inline def setRestartDelayUndefined: Self = StObject.set(x, "restartDelay", js.undefined)
      
      inline def setRestartTries(value: Double): Self = StObject.set(x, "restartTries", value.asInstanceOf[js.Any])
      
      inline def setRestartTriesUndefined: Self = StObject.set(x, "restartTries", js.undefined)
      
      inline def setTimestampFormat(value: String): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
      
      inline def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
      
      inline def setTimings(value: Boolean): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
      
      inline def setTimingsUndefined: Self = StObject.set(x, "timings", js.undefined)
    }
  }
}
