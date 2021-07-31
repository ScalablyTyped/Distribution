package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesNotificationConfigurationMod.NotificationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketNotificationConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
object PutBucketNotificationConfigurationInput {
  
  @scala.inline
  def apply(Bucket: String, NotificationConfiguration: NotificationConfiguration): PutBucketNotificationConfigurationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketNotificationConfigurationInput]
  }
}
