package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttributeDimension extends StObject {
  
  /**
    * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
    */
  var AttributeType: js.UndefOr[typings.awsSdk.pinpointMod.AttributeType] = js.undefined
  
  /**
    * The criteria values to use for the segment dimension. Depending on the value of the AttributeType property, endpoints are included or excluded from the segment if their attribute values match the criteria values.
    */
  var Values: ListOfString
}
object AttributeDimension {
  
  @scala.inline
  def apply(Values: ListOfString): AttributeDimension = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDimension]
  }
  
  @scala.inline
  implicit class AttributeDimensionMutableBuilder[Self <: AttributeDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeType(value: AttributeType): Self = StObject.set(x, "AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeTypeUndefined: Self = StObject.set(x, "AttributeType", js.undefined)
    
    @scala.inline
    def setValues(value: ListOfString): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: string*): Self = StObject.set(x, "Values", js.Array(value :_*))
  }
}
