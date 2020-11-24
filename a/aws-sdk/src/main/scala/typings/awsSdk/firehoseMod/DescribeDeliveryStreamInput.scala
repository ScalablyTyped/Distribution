package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDeliveryStreamInput extends js.Object {
  
  /**
    * The name of the delivery stream.
    */
  var DeliveryStreamName: typings.awsSdk.firehoseMod.DeliveryStreamName = js.native
  
  /**
    * The ID of the destination to start returning the destination information. Kinesis Data Firehose supports one destination per delivery stream.
    */
  var ExclusiveStartDestinationId: js.UndefOr[DestinationId] = js.native
  
  /**
    * The limit on the number of destinations to return. You can have one destination per delivery stream.
    */
  var Limit: js.UndefOr[DescribeDeliveryStreamInputLimit] = js.native
}
object DescribeDeliveryStreamInput {
  
  @scala.inline
  def apply(DeliveryStreamName: DeliveryStreamName): DescribeDeliveryStreamInput = {
    val __obj = js.Dynamic.literal(DeliveryStreamName = DeliveryStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDeliveryStreamInput]
  }
  
  @scala.inline
  implicit class DescribeDeliveryStreamInputOps[Self <: DescribeDeliveryStreamInput] (val x: Self) extends AnyVal {
    
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
    def setDeliveryStreamName(value: DeliveryStreamName): Self = this.set("DeliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartDestinationId(value: DestinationId): Self = this.set("ExclusiveStartDestinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclusiveStartDestinationId: Self = this.set("ExclusiveStartDestinationId", js.undefined)
    
    @scala.inline
    def setLimit(value: DescribeDeliveryStreamInputLimit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
  }
}
