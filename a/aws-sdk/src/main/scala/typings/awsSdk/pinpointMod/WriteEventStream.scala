package typings.awsSdk.pinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteEventStream extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Kinesis data stream or Amazon Kinesis Data Firehose delivery stream that you want to publish event data to. For a Kinesis data stream, the ARN format is: arn:aws:kinesis:region:account-id:stream/stream_name
    For a Kinesis Data Firehose delivery stream, the ARN format is: arn:aws:firehose:region:account-id:deliverystream/stream_name
    
    */
  var DestinationStreamArn: string
  
  /**
    * The AWS Identity and Access Management (IAM) role that authorizes Amazon Pinpoint to publish event data to the stream in your AWS account.
    */
  var RoleArn: string
}
object WriteEventStream {
  
  inline def apply(DestinationStreamArn: string, RoleArn: string): WriteEventStream = {
    val __obj = js.Dynamic.literal(DestinationStreamArn = DestinationStreamArn.asInstanceOf[js.Any], RoleArn = RoleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteEventStream]
  }
  
  extension [Self <: WriteEventStream](x: Self) {
    
    inline def setDestinationStreamArn(value: string): Self = StObject.set(x, "DestinationStreamArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
  }
}
