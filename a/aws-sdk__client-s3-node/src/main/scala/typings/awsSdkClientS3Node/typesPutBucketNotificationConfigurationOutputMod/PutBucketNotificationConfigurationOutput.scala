package typings.awsSdkClientS3Node.typesPutBucketNotificationConfigurationOutputMod

import typings.awsSdkClientS3Node.outputTypesUnionMod._OutputTypesUnion
import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutBucketNotificationConfigurationOutput
  extends MetadataBearer
     with _OutputTypesUnion

object PutBucketNotificationConfigurationOutput {
  @scala.inline
  def apply($metadata: ResponseMetadata): PutBucketNotificationConfigurationOutput = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutBucketNotificationConfigurationOutput]
  }
}

