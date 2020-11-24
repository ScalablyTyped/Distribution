package typings.awsSdk.sesv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailTemplateMetadata extends js.Object {
  
  /**
    * The time and date the template was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.native
  
  /**
    * The name of the template.
    */
  var TemplateName: js.UndefOr[EmailTemplateName] = js.native
}
object EmailTemplateMetadata {
  
  @scala.inline
  def apply(): EmailTemplateMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailTemplateMetadata]
  }
  
  @scala.inline
  implicit class EmailTemplateMetadataOps[Self <: EmailTemplateMetadata] (val x: Self) extends AnyVal {
    
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
    def setCreatedTimestamp(value: Timestamp): Self = this.set("CreatedTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedTimestamp: Self = this.set("CreatedTimestamp", js.undefined)
    
    @scala.inline
    def setTemplateName(value: EmailTemplateName): Self = this.set("TemplateName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateName: Self = this.set("TemplateName", js.undefined)
  }
}
