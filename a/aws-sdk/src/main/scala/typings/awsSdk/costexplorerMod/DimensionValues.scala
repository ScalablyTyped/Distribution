package typings.awsSdk.costexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionValues extends StObject {
  
  /**
    * The names of the metadata types that you can use to filter and group your results. For example, AZ returns a list of Availability Zones.
    */
  var Key: js.UndefOr[Dimension] = js.undefined
  
  /**
    * The match options that you can use to filter your results. MatchOptions is only applicable for actions related to Cost Category. The default values for MatchOptions are EQUALS and CASE_SENSITIVE.
    */
  var MatchOptions: js.UndefOr[typings.awsSdk.costexplorerMod.MatchOptions] = js.undefined
  
  /**
    * The metadata values that you can use to filter and group your results. You can use GetDimensionValues to find specific values.
    */
  var Values: js.UndefOr[typings.awsSdk.costexplorerMod.Values] = js.undefined
}
object DimensionValues {
  
  inline def apply(): DimensionValues = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionValues]
  }
  
  extension [Self <: DimensionValues](x: Self) {
    
    inline def setKey(value: Dimension): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setMatchOptions(value: MatchOptions): Self = StObject.set(x, "MatchOptions", value.asInstanceOf[js.Any])
    
    inline def setMatchOptionsUndefined: Self = StObject.set(x, "MatchOptions", js.undefined)
    
    inline def setMatchOptionsVarargs(value: MatchOption*): Self = StObject.set(x, "MatchOptions", js.Array(value :_*))
    
    inline def setValues(value: Values): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "Values", js.undefined)
    
    inline def setValuesVarargs(value: Value*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
