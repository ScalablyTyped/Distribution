package typings.awsSdk.firehoseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamSourceConfiguration extends StObject {
  
  /**
    * The ARN of the source Kinesis data stream. For more information, see Amazon Kinesis Data Streams ARN Format.
    */
  var KinesisStreamARN: typings.awsSdk.firehoseMod.KinesisStreamARN
  
  /**
    * The ARN of the role that provides access to the source Kinesis data stream. For more information, see AWS Identity and Access Management (IAM) ARN Format.
    */
  var RoleARN: typings.awsSdk.firehoseMod.RoleARN
}
object KinesisStreamSourceConfiguration {
  
  inline def apply(KinesisStreamARN: KinesisStreamARN, RoleARN: RoleARN): KinesisStreamSourceConfiguration = {
    val __obj = js.Dynamic.literal(KinesisStreamARN = KinesisStreamARN.asInstanceOf[js.Any], RoleARN = RoleARN.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamSourceConfiguration]
  }
  
  extension [Self <: KinesisStreamSourceConfiguration](x: Self) {
    
    inline def setKinesisStreamARN(value: KinesisStreamARN): Self = StObject.set(x, "KinesisStreamARN", value.asInstanceOf[js.Any])
    
    inline def setRoleARN(value: RoleARN): Self = StObject.set(x, "RoleARN", value.asInstanceOf[js.Any])
  }
}
