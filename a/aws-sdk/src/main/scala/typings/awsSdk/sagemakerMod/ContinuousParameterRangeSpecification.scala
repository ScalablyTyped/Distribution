package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContinuousParameterRangeSpecification extends StObject {
  
  /**
    * The maximum floating-point value allowed.
    */
  var MaxValue: ParameterValue = js.native
  
  /**
    * The minimum floating-point value allowed.
    */
  var MinValue: ParameterValue = js.native
}
object ContinuousParameterRangeSpecification {
  
  @scala.inline
  def apply(MaxValue: ParameterValue, MinValue: ParameterValue): ContinuousParameterRangeSpecification = {
    val __obj = js.Dynamic.literal(MaxValue = MaxValue.asInstanceOf[js.Any], MinValue = MinValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousParameterRangeSpecification]
  }
  
  @scala.inline
  implicit class ContinuousParameterRangeSpecificationMutableBuilder[Self <: ContinuousParameterRangeSpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxValue(value: ParameterValue): Self = StObject.set(x, "MaxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValue(value: ParameterValue): Self = StObject.set(x, "MinValue", value.asInstanceOf[js.Any])
  }
}
