package typings.awsSdk.forecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterRanges extends StObject {
  
  /**
    * Specifies the tunable range for each categorical hyperparameter.
    */
  var CategoricalParameterRanges: js.UndefOr[typings.awsSdk.forecastserviceMod.CategoricalParameterRanges] = js.undefined
  
  /**
    * Specifies the tunable range for each continuous hyperparameter.
    */
  var ContinuousParameterRanges: js.UndefOr[typings.awsSdk.forecastserviceMod.ContinuousParameterRanges] = js.undefined
  
  /**
    * Specifies the tunable range for each integer hyperparameter.
    */
  var IntegerParameterRanges: js.UndefOr[typings.awsSdk.forecastserviceMod.IntegerParameterRanges] = js.undefined
}
object ParameterRanges {
  
  @scala.inline
  def apply(): ParameterRanges = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterRanges]
  }
  
  @scala.inline
  implicit class ParameterRangesMutableBuilder[Self <: ParameterRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategoricalParameterRanges(value: CategoricalParameterRanges): Self = StObject.set(x, "CategoricalParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoricalParameterRangesUndefined: Self = StObject.set(x, "CategoricalParameterRanges", js.undefined)
    
    @scala.inline
    def setCategoricalParameterRangesVarargs(value: CategoricalParameterRange*): Self = StObject.set(x, "CategoricalParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setContinuousParameterRanges(value: ContinuousParameterRanges): Self = StObject.set(x, "ContinuousParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinuousParameterRangesUndefined: Self = StObject.set(x, "ContinuousParameterRanges", js.undefined)
    
    @scala.inline
    def setContinuousParameterRangesVarargs(value: ContinuousParameterRange*): Self = StObject.set(x, "ContinuousParameterRanges", js.Array(value :_*))
    
    @scala.inline
    def setIntegerParameterRanges(value: IntegerParameterRanges): Self = StObject.set(x, "IntegerParameterRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntegerParameterRangesUndefined: Self = StObject.set(x, "IntegerParameterRanges", js.undefined)
    
    @scala.inline
    def setIntegerParameterRangesVarargs(value: IntegerParameterRange*): Self = StObject.set(x, "IntegerParameterRanges", js.Array(value :_*))
  }
}
