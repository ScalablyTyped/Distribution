package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CostCategoryValues extends StObject {
  
  var Key: js.UndefOr[CostCategoryName] = js.native
  
  /**
    *  The match options that you can use to filter your results. MatchOptions is only applicable for only applicable for actions related to cost category. The default values for MatchOptions is EQUALS and CASE_SENSITIVE. 
    */
  var MatchOptions: js.UndefOr[typings.awsSdk.costexplorerMod.MatchOptions] = js.native
  
  /**
    * The specific value of the Cost Category.
    */
  var Values: js.UndefOr[typings.awsSdk.costexplorerMod.Values] = js.native
}
object CostCategoryValues {
  
  @scala.inline
  def apply(): CostCategoryValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostCategoryValues]
  }
  
  @scala.inline
  implicit class CostCategoryValuesMutableBuilder[Self <: CostCategoryValues] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: CostCategoryName): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    @scala.inline
    def setMatchOptions(value: MatchOptions): Self = StObject.set(x, "MatchOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchOptionsUndefined: Self = StObject.set(x, "MatchOptions", js.undefined)
    
    @scala.inline
    def setMatchOptionsVarargs(value: MatchOption*): Self = StObject.set(x, "MatchOptions", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Value*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
