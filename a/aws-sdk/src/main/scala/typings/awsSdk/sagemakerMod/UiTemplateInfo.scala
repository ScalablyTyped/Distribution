package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UiTemplateInfo extends js.Object {
  
  /**
    * The SHA-256 digest of the contents of the template.
    */
  var ContentSha256: js.UndefOr[TemplateContentSha256] = js.native
  
  /**
    * The URL for the user interface template.
    */
  var Url: js.UndefOr[TemplateUrl] = js.native
}
object UiTemplateInfo {
  
  @scala.inline
  def apply(): UiTemplateInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UiTemplateInfo]
  }
  
  @scala.inline
  implicit class UiTemplateInfoOps[Self <: UiTemplateInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContentSha256(value: TemplateContentSha256): Self = this.set("ContentSha256", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentSha256: Self = this.set("ContentSha256", js.undefined)
    
    @scala.inline
    def setUrl(value: TemplateUrl): Self = this.set("Url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("Url", js.undefined)
  }
}
