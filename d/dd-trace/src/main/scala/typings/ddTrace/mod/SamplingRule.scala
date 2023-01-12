package typings.ddTrace.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingRule extends StObject {
  
  /**
    * Operation name on which to apply this rule. The rule will apply to all operation names if not provided.
    */
  var name: js.UndefOr[String | js.RegExp] = js.undefined
  
  /**
    * Sampling rate for this rule.
    */
  var sampleRate: Double
  
  /**
    * Service on which to apply this rule. The rule will apply to all services if not provided.
    */
  var service: js.UndefOr[String | js.RegExp] = js.undefined
}
object SamplingRule {
  
  inline def apply(sampleRate: Double): SamplingRule = {
    val __obj = js.Dynamic.literal(sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SamplingRule] (val x: Self) extends AnyVal {
    
    inline def setName(value: String | js.RegExp): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSampleRate(value: Double): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setService(value: String | js.RegExp): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
