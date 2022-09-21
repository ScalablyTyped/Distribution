package typings.awsSdk.piMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DimensionGroupDetail extends StObject {
  
  /**
    * The dimensions within a dimension group.
    */
  var Dimensions: js.UndefOr[DimensionDetailList] = js.undefined
  
  /**
    * The name of the dimension group.
    */
  var Group: js.UndefOr[String] = js.undefined
}
object DimensionGroupDetail {
  
  inline def apply(): DimensionGroupDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DimensionGroupDetail]
  }
  
  extension [Self <: DimensionGroupDetail](x: Self) {
    
    inline def setDimensions(value: DimensionDetailList): Self = StObject.set(x, "Dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "Dimensions", js.undefined)
    
    inline def setDimensionsVarargs(value: DimensionDetail*): Self = StObject.set(x, "Dimensions", js.Array(value*))
    
    inline def setGroup(value: String): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "Group", js.undefined)
  }
}
