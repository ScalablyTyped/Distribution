package typings.concurrently.anon

import typings.concurrently.distSrcFlowControlKillOthersMod.ProcessCloseCondition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conditions extends StObject {
  
  var conditions: ProcessCloseCondition | js.Array[ProcessCloseCondition]
  
  var killSignal: js.UndefOr[String] = js.undefined
  
  var logger: typings.concurrently.distSrcLoggerMod.Logger
}
object Conditions {
  
  inline def apply(
    conditions: ProcessCloseCondition | js.Array[ProcessCloseCondition],
    logger: typings.concurrently.distSrcLoggerMod.Logger
  ): Conditions = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conditions] (val x: Self) extends AnyVal {
    
    inline def setConditions(value: ProcessCloseCondition | js.Array[ProcessCloseCondition]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: ProcessCloseCondition*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setKillSignal(value: String): Self = StObject.set(x, "killSignal", value.asInstanceOf[js.Any])
    
    inline def setKillSignalUndefined: Self = StObject.set(x, "killSignal", js.undefined)
    
    inline def setLogger(value: typings.concurrently.distSrcLoggerMod.Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
