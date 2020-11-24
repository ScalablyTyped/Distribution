package typings.awsSdk.frauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldValidationMessage extends js.Object {
  
  /**
    * The message content.
    */
  var content: js.UndefOr[String] = js.native
  
  /**
    * The field name.
    */
  var fieldName: js.UndefOr[String] = js.native
  
  /**
    * The message ID.
    */
  var identifier: js.UndefOr[String] = js.native
  
  /**
    * The message title.
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * The message type.
    */
  var `type`: js.UndefOr[String] = js.native
}
object FieldValidationMessage {
  
  @scala.inline
  def apply(): FieldValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldValidationMessage]
  }
  
  @scala.inline
  implicit class FieldValidationMessageOps[Self <: FieldValidationMessage] (val x: Self) extends AnyVal {
    
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    
    @scala.inline
    def setIdentifier(value: String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
