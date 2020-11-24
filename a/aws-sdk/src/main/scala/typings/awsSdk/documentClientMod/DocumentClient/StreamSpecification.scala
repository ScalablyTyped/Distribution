package typings.awsSdk.documentClientMod.DocumentClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamSpecification extends js.Object {
  
  /**
    * Indicates whether DynamoDB Streams is enabled (true) or disabled (false) on the table.
    */
  var StreamEnabled: typings.awsSdk.documentClientMod.DocumentClient.StreamEnabled = js.native
  
  /**
    *  When an item in the table is modified, StreamViewType determines what information is written to the stream for this table. Valid values for StreamViewType are:    KEYS_ONLY - Only the key attributes of the modified item are written to the stream.    NEW_IMAGE - The entire item, as it appears after it was modified, is written to the stream.    OLD_IMAGE - The entire item, as it appeared before it was modified, is written to the stream.    NEW_AND_OLD_IMAGES - Both the new and the old item images of the item are written to the stream.  
    */
  var StreamViewType: js.UndefOr[typings.awsSdk.documentClientMod.DocumentClient.StreamViewType] = js.native
}
object StreamSpecification {
  
  @scala.inline
  def apply(StreamEnabled: StreamEnabled): StreamSpecification = {
    val __obj = js.Dynamic.literal(StreamEnabled = StreamEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamSpecification]
  }
  
  @scala.inline
  implicit class StreamSpecificationOps[Self <: StreamSpecification] (val x: Self) extends AnyVal {
    
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
    def setStreamEnabled(value: StreamEnabled): Self = this.set("StreamEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamViewType(value: StreamViewType): Self = this.set("StreamViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamViewType: Self = this.set("StreamViewType", js.undefined)
  }
}
