package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultIntegerHyperParameterRange extends StObject {
  
  /**
    * Indicates whether the hyperparameter is tunable.
    */
  var isTunable: js.UndefOr[Tunable] = js.undefined
  
  /**
    * The maximum allowable value for the hyperparameter.
    */
  var maxValue: js.UndefOr[IntegerMaxValue] = js.undefined
  
  /**
    * The minimum allowable value for the hyperparameter.
    */
  var minValue: js.UndefOr[IntegerMinValue] = js.undefined
  
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.undefined
}
object DefaultIntegerHyperParameterRange {
  
  @scala.inline
  def apply(): DefaultIntegerHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultIntegerHyperParameterRange]
  }
  
  @scala.inline
  implicit class DefaultIntegerHyperParameterRangeMutableBuilder[Self <: DefaultIntegerHyperParameterRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTunable(value: Tunable): Self = StObject.set(x, "isTunable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTunableUndefined: Self = StObject.set(x, "isTunable", js.undefined)
    
    @scala.inline
    def setMaxValue(value: IntegerMaxValue): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: IntegerMinValue): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setName(value: ParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
