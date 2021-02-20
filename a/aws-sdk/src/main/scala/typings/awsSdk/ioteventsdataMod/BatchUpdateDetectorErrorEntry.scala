package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateDetectorErrorEntry extends StObject {
  
  /**
    * The code of the error.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.native
  
  /**
    * A message describing the error.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  
  /**
    * The "messageId" of the update request that caused the error. (The value of the "messageId" in the update request "Detector" object.)
    */
  var messageId: js.UndefOr[MessageId] = js.native
}
object BatchUpdateDetectorErrorEntry {
  
  @scala.inline
  def apply(): BatchUpdateDetectorErrorEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchUpdateDetectorErrorEntry]
  }
  
  @scala.inline
  implicit class BatchUpdateDetectorErrorEntryMutableBuilder[Self <: BatchUpdateDetectorErrorEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    @scala.inline
    def setMessageId(value: MessageId): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
  }
}
