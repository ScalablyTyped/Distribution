package typings.cordovaPluginEmailComposer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICordovaPluginEmailComposerOpenOptions extends StObject {
  
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
  implicit class ICordovaPluginEmailComposerOpenOptionsMutableBuilder[Self <: ICordovaPluginEmailComposerOpenOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttachments(value: js.Array[_]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    @scala.inline
    def setAttachmentsVarargs(value: js.Any*): Self = StObject.set(x, "attachments", js.Array(value :_*))
    
    @scala.inline
    def setBcc(value: js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    @scala.inline
    def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value :_*))
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setCc(value: js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    @scala.inline
    def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value :_*))
    
    @scala.inline
    def setIsHtml(value: Boolean): Self = StObject.set(x, "isHtml", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHtmlUndefined: Self = StObject.set(x, "isHtml", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    @scala.inline
    def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value :_*))
  }
}
