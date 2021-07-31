package typings.awsSdkClientS3Node.mod

import typings.awsSdkClientS3Node.typesNotificationConfigurationDeprecatedMod.NotificationConfigurationDeprecated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketNotificationInput
  extends StObject
     with typings.awsSdkClientS3Node.typesPutBucketNotificationInputMod.PutBucketNotificationInput
object PutBucketNotificationInput {
  
  @scala.inline
  def apply(Bucket: String, NotificationConfiguration: NotificationConfigurationDeprecated): PutBucketNotificationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketNotificationInput]
  }
}
