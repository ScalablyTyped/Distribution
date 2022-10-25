package typings.ddTrace.mod

import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpanSamplingRule extends StObject {
  
  /**
    * Maximum number of spans matching a span sampling rule to be allowed per second.
    */
  var maxPerSecond: js.UndefOr[Number] = js.undefined
  
  /**
    * Operation name or pattern on which to apply this rule. The rule will apply to all operation names if not provided.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Sampling rate for this rule. Will default to 1.0 (always) if not provided.
    */
  var sampleRate: js.UndefOr[Number] = js.undefined
  
  /**
    * Service name or pattern on which to apply this rule. The rule will apply to all services if not provided.
    */
  var service: js.UndefOr[String] = js.undefined
}
object SpanSamplingRule {
  
  inline def apply(): SpanSamplingRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpanSamplingRule]
  }
  
  extension [Self <: SpanSamplingRule](x: Self) {
    
    inline def setMaxPerSecond(value: Number): Self = StObject.set(x, "maxPerSecond", value.asInstanceOf[js.Any])
    
    inline def setMaxPerSecondUndefined: Self = StObject.set(x, "maxPerSecond", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSampleRate(value: Number): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    inline def setSampleRateUndefined: Self = StObject.set(x, "sampleRate", js.undefined)
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
