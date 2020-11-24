package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisStreamSourceDescription extends js.Object {
  
  /**
    * Kinesis Data Firehose starts retrieving records from the Kinesis data stream starting with this timestamp.
    */
  var DeliveryStartTimestamp: js.UndefOr[typings.awsSdk.firehoseMod.DeliveryStartTimestamp] = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the source Kinesis data stream. For more information, see Amazon Kinesis Data Streams ARN Format.
    */
  var KinesisStreamARN: js.UndefOr[typings.awsSdk.firehoseMod.KinesisStreamARN] = js.native
  
  /**
    * The ARN of the role used by the source Kinesis data stream. For more information, see AWS Identity and Access Management (IAM) ARN Format.
    */
  var RoleARN: js.UndefOr[typings.awsSdk.firehoseMod.RoleARN] = js.native
}
object KinesisStreamSourceDescription {
  
  @scala.inline
  def apply(): KinesisStreamSourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisStreamSourceDescription]
  }
  
  @scala.inline
  implicit class KinesisStreamSourceDescriptionOps[Self <: KinesisStreamSourceDescription] (val x: Self) extends AnyVal {
    
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
    def setDeliveryStartTimestamp(value: DeliveryStartTimestamp): Self = this.set("DeliveryStartTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeliveryStartTimestamp: Self = this.set("DeliveryStartTimestamp", js.undefined)
    
    @scala.inline
    def setKinesisStreamARN(value: KinesisStreamARN): Self = this.set("KinesisStreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamARN: Self = this.set("KinesisStreamARN", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = this.set("RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoleARN: Self = this.set("RoleARN", js.undefined)
  }
}
