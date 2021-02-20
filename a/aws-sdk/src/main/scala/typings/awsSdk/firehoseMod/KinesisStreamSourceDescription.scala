package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KinesisStreamSourceDescription extends StObject {
  
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
  implicit class KinesisStreamSourceDescriptionMutableBuilder[Self <: KinesisStreamSourceDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStartTimestamp(value: DeliveryStartTimestamp): Self = StObject.set(x, "DeliveryStartTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryStartTimestampUndefined: Self = StObject.set(x, "DeliveryStartTimestamp", js.undefined)
    
    @scala.inline
    def setKinesisStreamARN(value: KinesisStreamARN): Self = StObject.set(x, "KinesisStreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamARNUndefined: Self = StObject.set(x, "KinesisStreamARN", js.undefined)
    
    @scala.inline
    def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleARNUndefined: Self = StObject.set(x, "RoleARN", js.undefined)
  }
}
