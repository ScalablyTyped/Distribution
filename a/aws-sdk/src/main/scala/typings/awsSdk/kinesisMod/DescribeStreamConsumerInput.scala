package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeStreamConsumerInput extends StObject {
  
  /**
    * The ARN returned by Kinesis Data Streams when you registered the consumer.
    */
  var ConsumerARN: js.UndefOr[typings.awsSdk.kinesisMod.ConsumerARN] = js.native
  
  /**
    * The name that you gave to the consumer.
    */
  var ConsumerName: js.UndefOr[typings.awsSdk.kinesisMod.ConsumerName] = js.native
  
  /**
    * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var StreamARN: js.UndefOr[typings.awsSdk.kinesisMod.StreamARN] = js.native
}
object DescribeStreamConsumerInput {
  
  @scala.inline
  def apply(): DescribeStreamConsumerInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeStreamConsumerInput]
  }
  
  @scala.inline
  implicit class DescribeStreamConsumerInputMutableBuilder[Self <: DescribeStreamConsumerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerARN(value: ConsumerARN): Self = StObject.set(x, "ConsumerARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerARNUndefined: Self = StObject.set(x, "ConsumerARN", js.undefined)
    
    @scala.inline
    def setConsumerName(value: ConsumerName): Self = StObject.set(x, "ConsumerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsumerNameUndefined: Self = StObject.set(x, "ConsumerName", js.undefined)
    
    @scala.inline
    def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARNUndefined: Self = StObject.set(x, "StreamARN", js.undefined)
  }
}
