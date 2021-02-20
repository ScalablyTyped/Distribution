package typings.ddTrace.mod

import typings.std.Number
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SamplingRule extends StObject {
  
  /**
    * Operation name on which to apply this rule. The rule will apply to all operation names if not provided.
    */
  var name: js.UndefOr[String | RegExp] = js.native
  
  /**
    * Sampling rate for this rule.
    */
  var sampleRate: Number = js.native
  
  /**
    * Service on which to apply this rule. The rule will apply to all services if not provided.
    */
  var service: js.UndefOr[String | RegExp] = js.native
}
object SamplingRule {
  
  @scala.inline
  def apply(sampleRate: Number): SamplingRule = {
    val __obj = js.Dynamic.literal(sampleRate = sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SamplingRule]
  }
  
  @scala.inline
  implicit class SamplingRuleMutableBuilder[Self <: SamplingRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String | RegExp): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSampleRate(value: Number): Self = StObject.set(x, "sampleRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setService(value: String | RegExp): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
  }
}
