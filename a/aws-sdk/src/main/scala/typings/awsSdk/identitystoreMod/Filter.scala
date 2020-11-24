package typings.awsSdk.identitystoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Filter extends js.Object {
  
  /**
    * The attribute path used to specify which attribute name to search. Length limit is 255 characters. For example, UserName is a valid attribute path for the ListUsers API, and DisplayName is a valid attribute path for the ListGroups API.
    */
  var AttributePath: typings.awsSdk.identitystoreMod.AttributePath = js.native
  
  /**
    * Represents the data for an attribute. Each attribute value is described as a name-value pair. 
    */
  var AttributeValue: SensitiveStringType = js.native
}
object Filter {
  
  @scala.inline
  def apply(AttributePath: AttributePath, AttributeValue: SensitiveStringType): Filter = {
    val __obj = js.Dynamic.literal(AttributePath = AttributePath.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
  
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
    
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
    def setAttributePath(value: AttributePath): Self = this.set("AttributePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValue(value: SensitiveStringType): Self = this.set("AttributeValue", value.asInstanceOf[js.Any])
  }
}
