package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeliveryChannel extends StObject {
  
  /**
    * The options for how often AWS Config delivers configuration snapshots to the Amazon S3 bucket.
    */
  var configSnapshotDeliveryProperties: js.UndefOr[ConfigSnapshotDeliveryProperties] = js.undefined
  
  /**
    * The name of the delivery channel. By default, AWS Config assigns the name "default" when creating the delivery channel. To change the delivery channel name, you must use the DeleteDeliveryChannel action to delete your current delivery channel, and then you must use the PutDeliveryChannel command to create a delivery channel that has the desired name.
    */
  var name: js.UndefOr[ChannelName] = js.undefined
  
  /**
    * The name of the Amazon S3 bucket to which AWS Config delivers configuration snapshots and configuration history files. If you specify a bucket that belongs to another AWS account, that bucket must have policies that grant access permissions to AWS Config. For more information, see Permissions for the Amazon S3 Bucket in the AWS Config Developer Guide.
    */
  var s3BucketName: js.UndefOr[String] = js.undefined
  
  /**
    * The prefix for the specified Amazon S3 bucket.
    */
  var s3KeyPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon SNS topic to which AWS Config sends notifications about configuration changes. If you choose a topic from another account, the topic must have policies that grant access permissions to AWS Config. For more information, see Permissions for the Amazon SNS Topic in the AWS Config Developer Guide.
    */
  var snsTopicARN: js.UndefOr[String] = js.undefined
}
object DeliveryChannel {
  
  inline def apply(): DeliveryChannel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeliveryChannel]
  }
  
  extension [Self <: DeliveryChannel](x: Self) {
    
    inline def setConfigSnapshotDeliveryProperties(value: ConfigSnapshotDeliveryProperties): Self = StObject.set(x, "configSnapshotDeliveryProperties", value.asInstanceOf[js.Any])
    
    inline def setConfigSnapshotDeliveryPropertiesUndefined: Self = StObject.set(x, "configSnapshotDeliveryProperties", js.undefined)
    
    inline def setName(value: ChannelName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setS3BucketName(value: String): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    inline def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    
    inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
    
    inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
    
    inline def setSnsTopicARN(value: String): Self = StObject.set(x, "snsTopicARN", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicARNUndefined: Self = StObject.set(x, "snsTopicARN", js.undefined)
  }
}
