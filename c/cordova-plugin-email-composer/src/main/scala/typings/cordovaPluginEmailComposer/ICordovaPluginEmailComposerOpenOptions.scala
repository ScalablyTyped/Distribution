package typings.cordovaPluginEmailComposer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICordovaPluginEmailComposerOpenOptions extends js.Object {
  
  /** Attachments can be either base64 encoded datas, files from the the device storage or assets from within the www folder */
  var attachments: js.UndefOr[js.Array[_]] = js.native
  
  var bcc: js.UndefOr[js.Array[String]] = js.native
  
  var body: js.UndefOr[String] = js.native
  
  var cc: js.UndefOr[js.Array[String]] = js.native
  
  /** The default value for isHTML is true */
  var isHtml: js.UndefOr[Boolean] = js.native
  
  var subject: js.UndefOr[String] = js.native
  
  /** An configured email account is required to send emails */
  var to: js.UndefOr[js.Array[String]] = js.native
}
object ICordovaPluginEmailComposerOpenOptions {
  
  @scala.inline
  def apply(): ICordovaPluginEmailComposerOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICordovaPluginEmailComposerOpenOptions]
  }
  
  @scala.inline
  implicit class ICordovaPluginEmailComposerOpenOptionsOps[Self <: ICordovaPluginEmailComposerOpenOptions] (val x: Self) extends AnyVal {
    
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
    def setAttachmentsVarargs(value: js.Any*): Self = this.set("attachments", js.Array(value :_*))
    
    @scala.inline
    def setAttachments(value: js.Array[_]): Self = this.set("attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachments: Self = this.set("attachments", js.undefined)
    
    @scala.inline
    def setBccVarargs(value: String*): Self = this.set("bcc", js.Array(value :_*))
    
    @scala.inline
    def setBcc(value: js.Array[String]): Self = this.set("bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCcVarargs(value: String*): Self = this.set("cc", js.Array(value :_*))
    
    @scala.inline
    def setCc(value: js.Array[String]): Self = this.set("cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
    
    @scala.inline
    def setIsHtml(value: Boolean): Self = this.set("isHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsHtml: Self = this.set("isHtml", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
    
    @scala.inline
    def setToVarargs(value: String*): Self = this.set("to", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: js.Array[String]): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTo: Self = this.set("to", js.undefined)
  }
}
