package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpEndpointCommonAttribute extends js.Object {
  
  /**
    * The name of the HTTP endpoint common attribute.
    */
  var AttributeName: HttpEndpointAttributeName = js.native
  
  /**
    * The value of the HTTP endpoint common attribute.
    */
  var AttributeValue: HttpEndpointAttributeValue = js.native
}
object HttpEndpointCommonAttribute {
  
  @scala.inline
  def apply(AttributeName: HttpEndpointAttributeName, AttributeValue: HttpEndpointAttributeValue): HttpEndpointCommonAttribute = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], AttributeValue = AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpEndpointCommonAttribute]
  }
  
  @scala.inline
  implicit class HttpEndpointCommonAttributeOps[Self <: HttpEndpointCommonAttribute] (val x: Self) extends AnyVal {
    
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
    def setAttributeName(value: HttpEndpointAttributeName): Self = this.set("AttributeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeValue(value: HttpEndpointAttributeValue): Self = this.set("AttributeValue", value.asInstanceOf[js.Any])
  }
}
