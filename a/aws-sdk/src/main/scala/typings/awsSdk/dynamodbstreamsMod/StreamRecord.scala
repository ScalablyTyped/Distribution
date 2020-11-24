package typings.awsSdk.dynamodbstreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamRecord extends js.Object {
  
  /**
    * The approximate date and time when the stream record was created, in UNIX epoch time format.
    */
  var ApproximateCreationDateTime: js.UndefOr[Date] = js.native
  
  /**
    * The primary key attribute(s) for the DynamoDB item that was modified.
    */
  var Keys: js.UndefOr[AttributeMap] = js.native
  
  /**
    * The item in the DynamoDB table as it appeared after it was modified.
    */
  var NewImage: js.UndefOr[AttributeMap] = js.native
  
  /**
    * The item in the DynamoDB table as it appeared before it was modified.
    */
  var OldImage: js.UndefOr[AttributeMap] = js.native
  
  /**
    * The sequence number of the stream record.
    */
  var SequenceNumber: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.SequenceNumber] = js.native
  
  /**
    * The size of the stream record, in bytes.
    */
  var SizeBytes: js.UndefOr[PositiveLongObject] = js.native
  
  /**
    * The type of data from the modified DynamoDB item that was captured in this stream record:    KEYS_ONLY - only the key attributes of the modified item.    NEW_IMAGE - the entire item, as it appeared after it was modified.    OLD_IMAGE - the entire item, as it appeared before it was modified.    NEW_AND_OLD_IMAGES - both the new and the old item images of the item.  
    */
  var StreamViewType: js.UndefOr[typings.awsSdk.dynamodbstreamsMod.StreamViewType] = js.native
}
object StreamRecord {
  
  @scala.inline
  def apply(): StreamRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamRecord]
  }
  
  @scala.inline
  implicit class StreamRecordOps[Self <: StreamRecord] (val x: Self) extends AnyVal {
    
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
    def setApproximateCreationDateTime(value: Date): Self = this.set("ApproximateCreationDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApproximateCreationDateTime: Self = this.set("ApproximateCreationDateTime", js.undefined)
    
    @scala.inline
    def setKeys(value: AttributeMap): Self = this.set("Keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("Keys", js.undefined)
    
    @scala.inline
    def setNewImage(value: AttributeMap): Self = this.set("NewImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewImage: Self = this.set("NewImage", js.undefined)
    
    @scala.inline
    def setOldImage(value: AttributeMap): Self = this.set("OldImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOldImage: Self = this.set("OldImage", js.undefined)
    
    @scala.inline
    def setSequenceNumber(value: SequenceNumber): Self = this.set("SequenceNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSequenceNumber: Self = this.set("SequenceNumber", js.undefined)
    
    @scala.inline
    def setSizeBytes(value: PositiveLongObject): Self = this.set("SizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeBytes: Self = this.set("SizeBytes", js.undefined)
    
    @scala.inline
    def setStreamViewType(value: StreamViewType): Self = this.set("StreamViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamViewType: Self = this.set("StreamViewType", js.undefined)
  }
}
