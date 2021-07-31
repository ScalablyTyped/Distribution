package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SamplingStrategy extends StObject {
  
  /**
    * The name of a sampling rule.
    */
  var Name: js.UndefOr[SamplingStrategyName] = js.undefined
  
  /**
    * The value of a sampling rule.
    */
  var Value: js.UndefOr[NullableDouble] = js.undefined
}
object SamplingStrategy {
  
  @scala.inline
  def apply(): SamplingStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SamplingStrategy]
  }
  
  @scala.inline
  implicit class SamplingStrategyMutableBuilder[Self <: SamplingStrategy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: SamplingStrategyName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setValue(value: NullableDouble): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
