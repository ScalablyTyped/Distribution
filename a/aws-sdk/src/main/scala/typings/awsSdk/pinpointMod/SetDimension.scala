package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetDimension extends StObject {
  
  /**
    * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
    */
  var DimensionType: js.UndefOr[typings.awsSdk.pinpointMod.DimensionType] = js.undefined
  
  /**
    * The criteria values to use for the segment dimension. Depending on the value of the DimensionType property, endpoints are included or excluded from the segment if their values match the criteria values.
    */
  var Values: ListOfString
}
object SetDimension {
  
  inline def apply(Values: ListOfString): SetDimension = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetDimension]
  }
  
  extension [Self <: SetDimension](x: Self) {
    
    inline def setDimensionType(value: DimensionType): Self = StObject.set(x, "DimensionType", value.asInstanceOf[js.Any])
    
    inline def setDimensionTypeUndefined: Self = StObject.set(x, "DimensionType", js.undefined)
    
    inline def setValues(value: ListOfString): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: string*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
