package typings.awsSdk.sqsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeMessageVisibilityBatchRequestEntry extends StObject {
  
  /**
    * An identifier for this particular receipt handle used to communicate the result.  The Ids of a batch request need to be unique within a request. This identifier can have up to 80 characters. The following characters are accepted: alphanumeric characters, hyphens(-), and underscores (_). 
    */
  var Id: String
  
  /**
    * A receipt handle.
    */
  var ReceiptHandle: String
  
  /**
    * The new value (in seconds) for the message's visibility timeout.
    */
  var VisibilityTimeout: js.UndefOr[Integer] = js.undefined
}
object ChangeMessageVisibilityBatchRequestEntry {
  
  @scala.inline
  def apply(Id: String, ReceiptHandle: String): ChangeMessageVisibilityBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
  }
  
  @scala.inline
  implicit class ChangeMessageVisibilityBatchRequestEntryMutableBuilder[Self <: ChangeMessageVisibilityBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptHandle(value: String): Self = StObject.set(x, "ReceiptHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityTimeout(value: Integer): Self = StObject.set(x, "VisibilityTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityTimeoutUndefined: Self = StObject.set(x, "VisibilityTimeout", js.undefined)
  }
}
