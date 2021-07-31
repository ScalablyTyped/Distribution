package typings.awsSdk.stsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecodeAuthorizationMessageResponse extends StObject {
  
  /**
    * An XML document that contains the decoded message.
    */
  var DecodedMessage: js.UndefOr[decodedMessageType] = js.undefined
}
object DecodeAuthorizationMessageResponse {
  
  @scala.inline
  def apply(): DecodeAuthorizationMessageResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecodeAuthorizationMessageResponse]
  }
  
  @scala.inline
  implicit class DecodeAuthorizationMessageResponseMutableBuilder[Self <: DecodeAuthorizationMessageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecodedMessage(value: decodedMessageType): Self = StObject.set(x, "DecodedMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodedMessageUndefined: Self = StObject.set(x, "DecodedMessage", js.undefined)
  }
}
