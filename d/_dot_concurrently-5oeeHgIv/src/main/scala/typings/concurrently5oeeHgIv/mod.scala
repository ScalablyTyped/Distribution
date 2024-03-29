package typings.concurrently5oeeHgIv

import typings.concurrently5oeeHgIv.anon.CommandInfoindexnumber
import typings.concurrently5oeeHgIv.anon.Conditions
import typings.concurrently5oeeHgIv.anon.DefaultInputTarget
import typings.concurrently5oeeHgIv.anon.Delay
import typings.concurrently5oeeHgIv.anon.Hide
import typings.concurrently5oeeHgIv.anon.PartialConcurrentlyOption
import typings.concurrently5oeeHgIv.anon.PartialConcurrentlyOptionAdditionalArguments
import typings.concurrently5oeeHgIv.anon.Process
import typings.concurrently5oeeHgIv.anon.TimestampFormat
import typings.concurrently5oeeHgIv.commandDTsMod.ChildProcess
import typings.concurrently5oeeHgIv.commandDTsMod.CloseEvent
import typings.concurrently5oeeHgIv.commandDTsMod.CommandIdentifier
import typings.concurrently5oeeHgIv.commandDTsMod.KillProcess
import typings.concurrently5oeeHgIv.commandDTsMod.SpawnCommand
import typings.concurrently5oeeHgIv.concurrentlyDTsMod.ConcurrentlyCommandInput
import typings.concurrently5oeeHgIv.concurrentlyDTsMod.ConcurrentlyResult
import typings.concurrently5oeeHgIv.flowControllerDTsMod.FlowController
import typings.concurrently5oeeHgIv.killOthersDTsMod.ProcessCloseCondition
import typings.concurrently5oeeHgIv.logTimingsDTsMod.TimingInfo
import typings.node.childProcessMod.SpawnOptions
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport(".concurrently-5oeeHgIv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(commands: js.Array[ConcurrentlyCommandInput]): ConcurrentlyResult = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(commands.asInstanceOf[js.Any]).asInstanceOf[ConcurrentlyResult]
  inline def default(
    commands: js.Array[ConcurrentlyCommandInput],
    options: PartialConcurrentlyOptionAdditionalArguments
  ): ConcurrentlyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(commands.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ConcurrentlyResult]
  
  @JSImport(".concurrently-5oeeHgIv", "Command")
  @js.native
  open class Command protected ()
    extends typings.concurrently5oeeHgIv.commandDTsMod.Command {
    def this(
      hasIndexNameCommandPrefixColorEnvCwd: CommandInfoindexnumber,
      spawnOpts: SpawnOptions,
      spawn: SpawnCommand,
      killProcess: KillProcess
    ) = this()
  }
  
  @JSImport(".concurrently-5oeeHgIv", "InputHandler")
  @js.native
  open class InputHandler protected ()
    extends typings.concurrently5oeeHgIv.inputHandlerDTsMod.InputHandler {
    def this(hasDefaultInputTargetInputStreamPauseInputStreamOnFinishLogger: DefaultInputTarget) = this()
  }
  
  @JSImport(".concurrently-5oeeHgIv", "KillOnSignal")
  @js.native
  open class KillOnSignal protected ()
    extends typings.concurrently5oeeHgIv.killOnSignalDTsMod.KillOnSignal {
    def this(hasProcess: Process) = this()
  }
  
  @JSImport(".concurrently-5oeeHgIv", "KillOthers")
  @js.native
  open class KillOthers protected ()
    extends typings.concurrently5oeeHgIv.killOthersDTsMod.KillOthers {
    def this(hasLoggerConditions: Conditions) = this()
  }
  
  @JSImport(".concurrently-5oeeHgIv", "LogError")
  @js.native
  open class LogError protected ()
    extends typings.concurrently5oeeHgIv.logErrorDTsMod.LogError {
    def this(hasLogger: typings.concurrently5oeeHgIv.anon.Logger) = this()
  }
  
  @JSImport(".concurrently-5oeeHgIv", "LogExit")
  @js.native
  open class LogExit protected ()
    extends typings.concurrently5oeeHgIv.logExitDTsMod.LogExit {
    def this(hasLogger: typings.concurrently5oeeHgIv.anon.Logger) = this()
  }
  
  @JSImport(".concurrently-5oeeHgIv", "LogOutput")
  @js.native
  open class LogOutput protected ()
    extends typings.concurrently5oeeHgIv.logOutputDTsMod.LogOutput {
    def this(hasLogger: typings.concurrently5oeeHgIv.anon.Logger) = this()
  }
  
  @JSImport(".concurrently-5oeeHgIv", "LogTimings")
  @js.native
  open class LogTimings protected ()
    extends typings.concurrently5oeeHgIv.logTimingsDTsMod.LogTimings {
    def this(hasLoggerTimestampFormat: TimestampFormat) = this()
  }
  /* static members */
  object LogTimings {
    
    @JSImport(".concurrently-5oeeHgIv", "LogTimings")
    @js.native
    val ^ : js.Any = js.native
    
    inline def mapCloseEventToTimingInfo(hasCommandTimingsKilledExitCode: CloseEvent): TimingInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("mapCloseEventToTimingInfo")(hasCommandTimingsKilledExitCode.asInstanceOf[js.Any]).asInstanceOf[TimingInfo]
  }
  
  @JSImport(".concurrently-5oeeHgIv", "Logger")
  @js.native
  open class Logger protected ()
    extends typings.concurrently5oeeHgIv.loggerDTsMod.Logger {
    def this(hasHidePrefixFormatPrefixLengthRawTimestampFormat: Hide) = this()
  }
  
  @JSImport(".concurrently-5oeeHgIv", "RestartProcess")
  @js.native
  open class RestartProcess protected ()
    extends typings.concurrently5oeeHgIv.restartProcessDTsMod.RestartProcess {
    def this(hasDelayTriesLoggerScheduler: Delay) = this()
  }
  
  inline def concurrently(baseCommands: js.Array[ConcurrentlyCommandInput]): ConcurrentlyResult = ^.asInstanceOf[js.Dynamic].applyDynamic("concurrently")(baseCommands.asInstanceOf[js.Any]).asInstanceOf[ConcurrentlyResult]
  inline def concurrently(baseCommands: js.Array[ConcurrentlyCommandInput], baseOptions: PartialConcurrentlyOption): ConcurrentlyResult = (^.asInstanceOf[js.Dynamic].applyDynamic("concurrently")(baseCommands.asInstanceOf[js.Any], baseOptions.asInstanceOf[js.Any])).asInstanceOf[ConcurrentlyResult]
  
  trait ConcurrentlyOptions
    extends StObject
       with typings.concurrently5oeeHgIv.concurrentlyDTsMod.ConcurrentlyOptions {
    
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
    
    extension [Self <: ConcurrentlyOptions](x: Self) {
      
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
