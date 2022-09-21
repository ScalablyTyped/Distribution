package typings.cordovaPluginEmailComposer

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICordovaPluginEmailComposerOpenOptions extends StObject {
  
  /** Attachments can be either base64 encoded datas, files from the the device storage or assets from within the www folder */
  var attachments: js.UndefOr[js.Array[Any]] = js.undefined
  
  var bcc: js.UndefOr[js.Array[String]] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  var cc: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The default value for isHTML is true */
  var isHtml: js.UndefOr[Boolean] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  /** An configured email account is required to send emails */
  var to: js.UndefOr[js.Array[String]] = js.undefined
}
object ICordovaPluginEmailComposerOpenOptions {
  
  inline def apply(): ICordovaPluginEmailComposerOpenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICordovaPluginEmailComposerOpenOptions]
  }
  
  extension [Self <: ICordovaPluginEmailComposerOpenOptions](x: Self) {
    
    inline def setAttachments(value: js.Array[Any]): Self = StObject.set(x, "attachments", value.asInstanceOf[js.Any])
    
    inline def setAttachmentsUndefined: Self = StObject.set(x, "attachments", js.undefined)
    
    inline def setAttachmentsVarargs(value: Any*): Self = StObject.set(x, "attachments", js.Array(value*))
    
    inline def setBcc(value: js.Array[String]): Self = StObject.set(x, "bcc", value.asInstanceOf[js.Any])
    
    inline def setBccUndefined: Self = StObject.set(x, "bcc", js.undefined)
    
    inline def setBccVarargs(value: String*): Self = StObject.set(x, "bcc", js.Array(value*))
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCc(value: js.Array[String]): Self = StObject.set(x, "cc", value.asInstanceOf[js.Any])
    
    inline def setCcUndefined: Self = StObject.set(x, "cc", js.undefined)
    
    inline def setCcVarargs(value: String*): Self = StObject.set(x, "cc", js.Array(value*))
    
    inline def setIsHtml(value: Boolean): Self = StObject.set(x, "isHtml", value.asInstanceOf[js.Any])
    
    inline def setIsHtmlUndefined: Self = StObject.set(x, "isHtml", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTo(value: js.Array[String]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(value: String*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
