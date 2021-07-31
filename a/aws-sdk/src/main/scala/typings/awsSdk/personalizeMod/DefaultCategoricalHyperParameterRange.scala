package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultCategoricalHyperParameterRange extends StObject {
  
  /**
    * Whether the hyperparameter is tunable.
    */
  var isTunable: js.UndefOr[Tunable] = js.undefined
  
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.undefined
  
  /**
    * A list of the categories for the hyperparameter.
    */
  var values: js.UndefOr[CategoricalValues] = js.undefined
}
object DefaultCategoricalHyperParameterRange {
  
  @scala.inline
  def apply(): DefaultCategoricalHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultCategoricalHyperParameterRange]
  }
  
  @scala.inline
  implicit class DefaultCategoricalHyperParameterRangeMutableBuilder[Self <: DefaultCategoricalHyperParameterRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsTunable(value: Tunable): Self = StObject.set(x, "isTunable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTunableUndefined: Self = StObject.set(x, "isTunable", js.undefined)
    
    @scala.inline
    def setName(value: ParameterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setValues(value: CategoricalValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: CategoricalValue*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
