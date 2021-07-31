package typings.awsSdk.pinpointemailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  /**
    * The character set for the content. Because of the constraints of the SMTP protocol, Amazon Pinpoint uses 7-bit ASCII by default. If the text includes characters outside of the ASCII range, you have to specify a character set. For example, you could specify UTF-8, ISO-8859-1, or Shift_JIS.
    */
  var Charset: js.UndefOr[typings.awsSdk.pinpointemailMod.Charset] = js.undefined
  
  /**
    * The content of the message itself.
    */
  var Data: MessageData
}
object Content {
  
  @scala.inline
  def apply(Data: MessageData): Content = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  @scala.inline
  implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCharset(value: Charset): Self = StObject.set(x, "Charset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharsetUndefined: Self = StObject.set(x, "Charset", js.undefined)
    
    @scala.inline
    def setData(value: MessageData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
  }
}
