package typings.awsSdkClientS3Browser.mod

import typings.awsSdkClientS3Browser.typesNotificationConfigurationMod.NotificationConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketNotificationConfigurationInput
  extends StObject
     with typings.awsSdkClientS3Browser.typesPutBucketNotificationConfigurationInputMod.PutBucketNotificationConfigurationInput
object PutBucketNotificationConfigurationInput {
  
  inline def apply(Bucket: String, NotificationConfiguration: NotificationConfiguration): PutBucketNotificationConfigurationInput = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], NotificationConfiguration = NotificationConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketNotificationConfigurationInput]
  }
}
