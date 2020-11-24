package typings.awsSdkClientPinpointBrowser.typesAttributesResourceMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttributesResource extends js.Object {
  
  /**
    * The unique ID for the application.
    */
  var ApplicationId: js.UndefOr[String] = js.native
  
  /**
    * The attribute type for the application.
    */
  var AttributeType: js.UndefOr[String] = js.native
  
  /**
    * The attributes for the application.
    */
  var Attributes: js.UndefOr[js.Array[String] | Iterable[String]] = js.native
}
object AttributesResource {
  
  @scala.inline
  def apply(): AttributesResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttributesResource]
  }
  
  @scala.inline
  implicit class AttributesResourceOps[Self <: AttributesResource] (val x: Self) extends AnyVal {
    
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
    def setApplicationId(value: String): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationId: Self = this.set("ApplicationId", js.undefined)
    
    @scala.inline
    def setAttributeType(value: String): Self = this.set("AttributeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributeType: Self = this.set("AttributeType", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: String*): Self = this.set("Attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: js.Array[String] | Iterable[String]): Self = this.set("Attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("Attributes", js.undefined)
  }
}
