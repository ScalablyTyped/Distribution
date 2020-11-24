package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributeDimension extends js.Object {
  
  /**
    * The type of segment dimension to use. Valid values are: INCLUSIVE, endpoints that match the criteria are included in the segment; and, EXCLUSIVE, endpoints that match the criteria are excluded from the segment.
    */
  var AttributeType: js.UndefOr[typings.awsSdk.pinpointMod.AttributeType] = js.native
  
  /**
    * The criteria values to use for the segment dimension. Depending on the value of the AttributeType property, endpoints are included or excluded from the segment if their attribute values match the criteria values.
    */
  var Values: ListOfString = js.native
}
object AttributeDimension {
  
  @scala.inline
  def apply(Values: ListOfString): AttributeDimension = {
    val __obj = js.Dynamic.literal(Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeDimension]
  }
  
  @scala.inline
  implicit class AttributeDimensionOps[Self <: AttributeDimension] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setValuesVarargs(value: string*): Self = this.set("Values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: ListOfString): Self = this.set("Values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeType(value: AttributeType): Self = this.set("AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeType: Self = this.set("AttributeType", js.undefined)
  }
}
