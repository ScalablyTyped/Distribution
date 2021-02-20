package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDeliveryStreamInput extends StObject {
  
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
  implicit class DescribeDeliveryStreamInputMutableBuilder[Self <: DescribeDeliveryStreamInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeliveryStreamName(value: DeliveryStreamName): Self = StObject.set(x, "DeliveryStreamName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartDestinationId(value: DestinationId): Self = StObject.set(x, "ExclusiveStartDestinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExclusiveStartDestinationIdUndefined: Self = StObject.set(x, "ExclusiveStartDestinationId", js.undefined)
    
    @scala.inline
    def setLimit(value: DescribeDeliveryStreamInputLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
  }
}
