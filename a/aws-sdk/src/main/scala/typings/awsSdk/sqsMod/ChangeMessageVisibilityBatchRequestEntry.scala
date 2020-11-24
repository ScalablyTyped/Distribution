package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeMessageVisibilityBatchRequestEntry extends js.Object {
  
  /**
    * An identifier for this particular receipt handle used to communicate the result.  The Ids of a batch request need to be unique within a request. This identifier can have up to 80 characters. The following characters are accepted: alphanumeric characters, hyphens(-), and underscores (_). 
    */
  var Id: String = js.native
  
  /**
    * A receipt handle.
    */
  var ReceiptHandle: String = js.native
  
  /**
    * The new value (in seconds) for the message's visibility timeout.
    */
  var VisibilityTimeout: js.UndefOr[Integer] = js.native
}
object ChangeMessageVisibilityBatchRequestEntry {
  
  @scala.inline
  def apply(Id: String, ReceiptHandle: String): ChangeMessageVisibilityBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], ReceiptHandle = ReceiptHandle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeMessageVisibilityBatchRequestEntry]
  }
  
  @scala.inline
  implicit class ChangeMessageVisibilityBatchRequestEntryOps[Self <: ChangeMessageVisibilityBatchRequestEntry] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReceiptHandle(value: String): Self = this.set("ReceiptHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibilityTimeout(value: Integer): Self = this.set("VisibilityTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibilityTimeout: Self = this.set("VisibilityTimeout", js.undefined)
  }
}
