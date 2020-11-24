package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListDeliveryStreamsInput extends js.Object {
  
  /**
    * The delivery stream type. This can be one of the following values:    DirectPut: Provider applications access the delivery stream directly.    KinesisStreamAsSource: The delivery stream uses a Kinesis data stream as a source.   This parameter is optional. If this parameter is omitted, delivery streams of all types are returned.
    */
  var DeliveryStreamType: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStreamType] = js.native
  
  /**
    * The list of delivery streams returned by this call to ListDeliveryStreams will start with the delivery stream whose name comes alphabetically immediately after the name you specify in ExclusiveStartDeliveryStreamName.
    */
  var ExclusiveStartDeliveryStreamName: js.UndefOr[DeliveryStreamName] = js.native
  
  /**
    * The maximum number of delivery streams to list. The default value is 10.
    */
  var Limit: js.UndefOr[ListDeliveryStreamsInputLimit] = js.native
}
object ListDeliveryStreamsInput {
  
  @scala.inline
  def apply(): ListDeliveryStreamsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeliveryStreamsInput]
  }
  
  @scala.inline
  implicit class ListDeliveryStreamsInputOps[Self <: ListDeliveryStreamsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeliveryStreamType(value: DeliveryStreamType): Self = this.set("DeliveryStreamType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryStreamType: Self = this.set("DeliveryStreamType", js.undefined)
    
    @scala.inline
    def setExclusiveStartDeliveryStreamName(value: DeliveryStreamName): Self = this.set("ExclusiveStartDeliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveStartDeliveryStreamName: Self = this.set("ExclusiveStartDeliveryStreamName", js.undefined)
    
    @scala.inline
    def setLimit(value: ListDeliveryStreamsInputLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
  }
}
