package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CallInstructionsMessageType extends StObject {
  
  /**
    * The language to use when delivering the message. For a complete list of supported languages, see the Amazon Polly Developer Guide.
    */
  var Text: js.UndefOr[NonEmptyString] = js.undefined
}
object CallInstructionsMessageType {
  
  @scala.inline
  def apply(): CallInstructionsMessageType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallInstructionsMessageType]
  }
  
  @scala.inline
  implicit class CallInstructionsMessageTypeMutableBuilder[Self <: CallInstructionsMessageType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: NonEmptyString): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
  }
}
