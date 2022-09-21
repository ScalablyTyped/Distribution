package typings.concurrently5oeeHgIv.anon

import typings.concurrently5oeeHgIv.commandDTsMod.ChildProcess
import typings.concurrently5oeeHgIv.commandDTsMod.KillProcess
import typings.concurrently5oeeHgIv.commandDTsMod.SpawnCommand
import typings.concurrently5oeeHgIv.completionListenerDTsMod.SuccessCondition
import typings.concurrently5oeeHgIv.flowControllerDTsMod.FlowController
import typings.node.childProcessMod.SpawnOptions
import typings.node.streamMod.Writable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<.concurrently-5oeeHgIv..concurrently-5oeeHgIv/dist/src/concurrently.d.ts.ConcurrentlyOptions> */
trait PartialConcurrentlyOption extends StObject {
  
  var additionalArguments: js.UndefOr[js.Array[String]] = js.undefined
  
  var controllers: js.UndefOr[js.Array[FlowController]] = js.undefined
  
  var cwd: js.UndefOr[String] = js.undefined
  
  var group: js.UndefOr[Boolean] = js.undefined
  
  var kill: js.UndefOr[KillProcess] = js.undefined
  
  var logger: js.UndefOr[typings.concurrently5oeeHgIv.loggerDTsMod.Logger] = js.undefined
  
  var maxProcesses: js.UndefOr[Double] = js.undefined
  
  var outputStream: js.UndefOr[Writable] = js.undefined
  
  var prefixColors: js.UndefOr[js.Array[String]] = js.undefined
  
  var raw: js.UndefOr[Boolean] = js.undefined
  
  var spawn: js.UndefOr[SpawnCommand] = js.undefined
  
  var successCondition: js.UndefOr[SuccessCondition] = js.undefined
}
object PartialConcurrentlyOption {
  
  inline def apply(): PartialConcurrentlyOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConcurrentlyOption]
  }
  
  extension [Self <: PartialConcurrentlyOption](x: Self) {
    
    inline def setAdditionalArguments(value: js.Array[String]): Self = StObject.set(x, "additionalArguments", value.asInstanceOf[js.Any])
    
    inline def setAdditionalArgumentsUndefined: Self = StObject.set(x, "additionalArguments", js.undefined)
    
    inline def setAdditionalArgumentsVarargs(value: String*): Self = StObject.set(x, "additionalArguments", js.Array(value*))
    
    inline def setControllers(value: js.Array[FlowController]): Self = StObject.set(x, "controllers", value.asInstanceOf[js.Any])
    
    inline def setControllersUndefined: Self = StObject.set(x, "controllers", js.undefined)
    
    inline def setControllersVarargs(value: FlowController*): Self = StObject.set(x, "controllers", js.Array(value*))
    
    inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
    
    inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
    
    inline def setGroup(value: Boolean): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setKill(value: (/* pid */ Double, /* signal */ js.UndefOr[String]) => Unit): Self = StObject.set(x, "kill", js.Any.fromFunction2(value))
    
    inline def setKillUndefined: Self = StObject.set(x, "kill", js.undefined)
    
    inline def setLogger(value: typings.concurrently5oeeHgIv.loggerDTsMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
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
    
    inline def setSpawnUndefined: Self = StObject.set(x, "spawn", js.undefined)
    
    inline def setSuccessCondition(value: SuccessCondition): Self = StObject.set(x, "successCondition", value.asInstanceOf[js.Any])
    
    inline def setSuccessConditionUndefined: Self = StObject.set(x, "successCondition", js.undefined)
  }
}
