package typings.awsSdk.personalizeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CategoricalHyperParameterRange extends StObject {
  
  /**
    * The name of the hyperparameter.
    */
  var name: js.UndefOr[ParameterName] = js.native
  
  /**
    * A list of the categories for the hyperparameter.
    */
  var values: js.UndefOr[CategoricalValues] = js.native
}
object CategoricalHyperParameterRange {
  
  @scala.inline
  def apply(): CategoricalHyperParameterRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CategoricalHyperParameterRange]
  }
  
  @scala.inline
  implicit class CategoricalHyperParameterRangeMutableBuilder[Self <: CategoricalHyperParameterRange] (val x: Self) extends AnyVal {
    
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
