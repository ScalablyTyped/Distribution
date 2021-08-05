package typings.ddTrace.mod

import typings.std.Number
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingRule extends StObject {
  
  /**
    * Operation name on which to apply this rule. The rule will apply to all operation names if not provided.
    */
  var name: js.UndefOr[String | RegExp] = js.undefined
  
  /**
    * Sampling rate for this rule.
    */
  var sampleRate: Number
  
  /**
    * Service on which to apply this rule. The rule will apply to all services if not provided.
    */
  var service: js.UndefOr[String | RegExp] = js.undefined
}
object SamplingRule {
  
  inline def apply(sampleRate: Number): SamplingRule = {
    val __obj = js.Dynamic.literal(sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRule]
  }
  
  extension [Self <: SamplingRule](x: Self) {
    
    inline def setName(value: String | RegExp): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSampleRate(value: Number): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setService(value: String | RegExp): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
