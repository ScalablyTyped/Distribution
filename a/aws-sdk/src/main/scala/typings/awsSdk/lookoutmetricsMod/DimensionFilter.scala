package typings.awsSdk.lookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionFilter extends StObject {
  
  /**
    * The name of the dimension to filter on.
    */
  var DimensionName: js.UndefOr[ColumnName] = js.undefined
  
  /**
    * The list of values for the dimension specified in DimensionName that you want to filter on.
    */
  var DimensionValueList: js.UndefOr[typings.awsSdk.lookoutmetricsMod.DimensionValueList] = js.undefined
}
object DimensionFilter {
  
  inline def apply(): DimensionFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionFilter]
  }
  
  extension [Self <: DimensionFilter](x: Self) {
    
    inline def setDimensionName(value: ColumnName): Self = StObject.set(x, "DimensionName", value.asInstanceOf[js.Any])
    
    inline def setDimensionNameUndefined: Self = StObject.set(x, "DimensionName", js.undefined)
    
    inline def setDimensionValueList(value: DimensionValueList): Self = StObject.set(x, "DimensionValueList", value.asInstanceOf[js.Any])
    
    inline def setDimensionValueListUndefined: Self = StObject.set(x, "DimensionValueList", js.undefined)
    
    inline def setDimensionValueListVarargs(value: DimensionValue*): Self = StObject.set(x, "DimensionValueList", js.Array(value*))
  }
}
