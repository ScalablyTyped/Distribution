package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CostCategoryValues extends StObject {
  
  var Key: js.UndefOr[CostCategoryName] = js.undefined
  
  /**
    *  The match options that you can use to filter your results. MatchOptions is only applicable for only applicable for actions related to cost category. The default values for MatchOptions is EQUALS and CASE_SENSITIVE. 
    */
  var MatchOptions: js.UndefOr[typings.awsSdk.costexplorerMod.MatchOptions] = js.undefined
  
  /**
    * The specific value of the Cost Category.
    */
  var Values: js.UndefOr[typings.awsSdk.costexplorerMod.Values] = js.undefined
}
object CostCategoryValues {
  
  inline def apply(): CostCategoryValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CostCategoryValues]
  }
  
  extension [Self <: CostCategoryValues](x: Self) {
    
    inline def setKey(value: CostCategoryName): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setMatchOptions(value: MatchOptions): Self = StObject.set(x, "MatchOptions", value.asInstanceOf[js.Any])
    
    inline def setMatchOptionsUndefined: Self = StObject.set(x, "MatchOptions", js.undefined)
    
    inline def setMatchOptionsVarargs(value: MatchOption*): Self = StObject.set(x, "MatchOptions", js.Array(value :_*))
    
    inline def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
