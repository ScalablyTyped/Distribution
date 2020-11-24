package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Field extends js.Object {
  
  /**
    * The field identifier.
    */
  var key: fieldNameString = js.native
  
  /**
    * The field value, expressed as the identifier of another object.
    */
  var refValue: js.UndefOr[fieldNameString] = js.native
  
  /**
    * The field value, expressed as a String.
    */
  var stringValue: js.UndefOr[fieldStringValue] = js.native
}
object Field {
  
  @scala.inline
  def apply(key: fieldNameString): Field = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
    
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
    def setKey(value: fieldNameString): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefValue(value: fieldNameString): Self = this.set("refValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRefValue: Self = this.set("refValue", js.undefined)
    
    @scala.inline
    def setStringValue(value: fieldStringValue): Self = this.set("stringValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringValue: Self = this.set("stringValue", js.undefined)
  }
}
