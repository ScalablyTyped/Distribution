package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParameterObject extends js.Object {
  
  /**
    * The attributes of the parameter object.
    */
  var attributes: ParameterAttributeList = js.native
  
  /**
    * The ID of the parameter object. 
    */
  var id: fieldNameString = js.native
}
object ParameterObject {
  
  @scala.inline
  def apply(attributes: ParameterAttributeList, id: fieldNameString): ParameterObject = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParameterObject]
  }
  
  @scala.inline
  implicit class ParameterObjectOps[Self <: ParameterObject] (val x: Self) extends AnyVal {
    
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
    def setAttributesVarargs(value: ParameterAttribute*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: ParameterAttributeList): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: fieldNameString): Self = this.set("id", value.asInstanceOf[js.Any])
  }
}
