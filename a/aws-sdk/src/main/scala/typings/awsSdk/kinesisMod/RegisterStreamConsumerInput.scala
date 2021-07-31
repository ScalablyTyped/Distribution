package typings.awsSdk.kinesisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterStreamConsumerInput extends StObject {
  
  /**
    * For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have to be unique across data streams.
    */
  var ConsumerName: typings.awsSdk.kinesisMod.ConsumerName
  
  /**
    * The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see Amazon Resource Names (ARNs) and AWS Service Namespaces.
    */
  var StreamARN: typings.awsSdk.kinesisMod.StreamARN
}
object RegisterStreamConsumerInput {
  
  @scala.inline
  def apply(ConsumerName: ConsumerName, StreamARN: StreamARN): RegisterStreamConsumerInput = {
    val __obj = js.Dynamic.literal(ConsumerName = ConsumerName.asInstanceOf[js.Any], StreamARN = StreamARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterStreamConsumerInput]
  }
  
  @scala.inline
  implicit class RegisterStreamConsumerInputMutableBuilder[Self <: RegisterStreamConsumerInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsumerName(value: ConsumerName): Self = StObject.set(x, "ConsumerName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamARN(value: StreamARN): Self = StObject.set(x, "StreamARN", value.asInstanceOf[js.Any])
  }
}
