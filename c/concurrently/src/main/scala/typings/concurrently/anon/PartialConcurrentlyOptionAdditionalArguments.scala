package typings.concurrently.anon

import typings.concurrently.distSrcCommandMod.ChildProcess
import typings.concurrently.distSrcCommandMod.CommandIdentifier
import typings.concurrently.distSrcCommandMod.KillProcess
import typings.concurrently.distSrcCommandMod.SpawnCommand
import typings.concurrently.distSrcCompletionListenerMod.SuccessCondition
import typings.concurrently.distSrcFlowControlFlowControllerMod.FlowController
import typings.concurrently.distSrcFlowControlKillOthersMod.ProcessCloseCondition
import typings.node.childProcessMod.SpawnOptions
import typings.node.streamMod.Readable
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<concurrently.concurrently.ConcurrentlyOptions> */
trait PartialConcurrentlyOptionAdditionalArguments extends StObject {
  
  var additionalArguments: js.UndefOr[js.Array[String]] = js.undefined
  
  var controllers: js.UndefOr[js.Array[FlowController]] = js.undefined
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var defaultInputTarget: js.UndefOr[CommandIdentifier] = js.undefined
  
  var group: js.UndefOr[Boolean] = js.undefined
  
  var handleInput: js.UndefOr[Boolean] = js.undefined
  
  var hide: js.UndefOr[CommandIdentifier | js.Array[CommandIdentifier]] = js.undefined
  
  var inputStream: js.UndefOr[Readable] = js.undefined
  
  var kill: js.UndefOr[KillProcess] = js.undefined
  
  var killOthers: js.UndefOr[ProcessCloseCondition | js.Array[ProcessCloseCondition]] = js.undefined
  
  var killSignal: js.UndefOr[String] = js.undefined
  
  var logger: js.UndefOr[typings.concurrently.distSrcLoggerMod.Logger] = js.undefined
  
  var maxProcesses: js.UndefOr[Double | String] = js.undefined
  
  var outputStream: js.UndefOr[Writable] = js.undefined
  
  var pauseInputStreamOnFinish: js.UndefOr[Boolean] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
  
  var prefixColors: js.UndefOr[js.Array[String]] = js.undefined
  
  var prefixLength: js.UndefOr[Double] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var restartDelay: js.UndefOr[Double] = js.undefined
  
  var restartTries: js.UndefOr[Double] = js.undefined
  
  var spawn: js.UndefOr[SpawnCommand] = js.undefined
  
  var successCondition: js.UndefOr[SuccessCondition] = js.undefined
  
  var timestampFormat: js.UndefOr[String] = js.undefined
  
  var timings: js.UndefOr[Boolean] = js.undefined
}
object PartialConcurrentlyOptionAdditionalArguments {
  
  inline def apply(): PartialConcurrentlyOptionAdditionalArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConcurrentlyOptionAdditionalArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialConcurrentlyOptionAdditionalArguments] (val x: Self) extends AnyVal {
    
    inline def setAdditionalArguments(value: js.Array[String]): Self = StObject.set(x, "additionalArguments", value.asInstanceOf[js.Any])
    
    inline def setAdditionalArgumentsUndefined: Self = StObject.set(x, "additionalArguments", js.undefined)
    
    inline def setAdditionalArgumentsVarargs(value: String*): Self = StObject.set(x, "additionalArguments", js.Array(value*))
    
    inline def setControllers(value: js.Array[FlowController]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
    
    inline def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
    
    inline def setControllersVarargs(value: FlowController*): Self = StObject.set(x, "controllers", js.Array(value*))
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setDefaultInputTarget(value: CommandIdentifier): Self = StObject.set(x, "defaultInputTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultInputTargetUndefined: Self = StObject.set(x, "defaultInputTarget", js.undefined)
    
    inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHandleInput(value: Boolean): Self = StObject.set(x, "handleInput", value.asInstanceOf[js.Any])
    
    inline def setHandleInputUndefined: Self = StObject.set(x, "handleInput", js.undefined)
    
    inline def setHide(value: CommandIdentifier | js.Array[CommandIdentifier]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
    
    inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
    
    inline def setHideVarargs(value: CommandIdentifier*): Self = StObject.set(x, "hide", js.Array(value*))
    
    inline def setInputStream(value: Readable): Self = StObject.set(x, "inputStream", value.asInstanceOf[js.Any])
    
    inline def setInputStreamUndefined: Self = StObject.set(x, "inputStream", js.undefined)
    
    inline def setKill(value: (/* pid */ Double, /* signal */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction2(value))
    
    inline def setKillOthers(value: ProcessCloseCondition | js.Array[ProcessCloseCondition]): Self = StObject.set(x, "killOthers", value.asInstanceOf[js.Any])
    
    inline def setKillOthersUndefined: Self = StObject.set(x, "killOthers", js.undefined)
    
    inline def setKillOthersVarargs(value: ProcessCloseCondition*): Self = StObject.set(x, "killOthers", js.Array(value*))
    
    inline def setKillSignal(value: String): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    inline def setKillUndefined: Self = StObject.set(x, "kill", js.undefined)
    
    inline def setLogger(value: typings.concurrently.distSrcLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    
    inline def setMaxProcesses(value: Double | String): Self = StObject.set(x, "maxProcesses", value.asInstanceOf[js.Any])
    
    inline def setMaxProcessesUndefined: Self = StObject.set(x, "maxProcesses", js.undefined)
    
    inline def setOutputStream(value: Writable): Self = StObject.set(x, "outputStream", value.asInstanceOf[js.Any])
    
    inline def setOutputStreamUndefined: Self = StObject.set(x, "outputStream", js.undefined)
    
    inline def setPauseInputStreamOnFinish(value: Boolean): Self = StObject.set(x, "pauseInputStreamOnFinish", value.asInstanceOf[js.Any])
    
    inline def setPauseInputStreamOnFinishUndefined: Self = StObject.set(x, "pauseInputStreamOnFinish", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixColors(value: js.Array[String]): Self = StObject.set(x, "prefixColors", value.asInstanceOf[js.Any])
    
    inline def setPrefixColorsUndefined: Self = StObject.set(x, "prefixColors", js.undefined)
    
    inline def setPrefixColorsVarargs(value: String*): Self = StObject.set(x, "prefixColors", js.Array(value*))
    
    inline def setPrefixLength(value: Double): Self = StObject.set(x, "prefixLength", value.asInstanceOf[js.Any])
    
    inline def setPrefixLengthUndefined: Self = StObject.set(x, "prefixLength", js.undefined)
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setRestartDelay(value: Double): Self = StObject.set(x, "restartDelay", value.asInstanceOf[js.Any])
    
    inline def setRestartDelayUndefined: Self = StObject.set(x, "restartDelay", js.undefined)
    
    inline def setRestartTries(value: Double): Self = StObject.set(x, "restartTries", value.asInstanceOf[js.Any])
    
    inline def setRestartTriesUndefined: Self = StObject.set(x, "restartTries", js.undefined)
    
    inline def setSpawn(value: (/* command */ String, /* options */ SpawnOptions) => ChildProcess): Self = StObject.set(x, "spawn", js.Any.fromFunction2(value))
    
    inline def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    
    inline def setSuccessCondition(value: SuccessCondition): Self = StObject.set(x, "successCondition", value.asInstanceOf[js.Any])
    
    inline def setSuccessConditionUndefined: Self = StObject.set(x, "successCondition", js.undefined)
    
    inline def setTimestampFormat(value: String): Self = StObject.set(x, "timestampFormat", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormatUndefined: Self = StObject.set(x, "timestampFormat", js.undefined)
    
    inline def setTimings(value: Boolean): Self = StObject.set(x, "timings", value.asInstanceOf[js.Any])
    
    inline def setTimingsUndefined: Self = StObject.set(x, "timings", js.undefined)
  }
}
