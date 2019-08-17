package typings.atAwsDashSdkClientDashS3DashBrowser.typesUnderscoreSseKmsEncryptedObjectsMod

import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Disabled
import typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SseKmsEncryptedObjects extends js.Object {
  /**
    * <p>The replication for KMS encrypted S3 objects is disabled if status is not Enabled.</p>
    */
  var Status: Enabled | Disabled | String
}

object _SseKmsEncryptedObjects {
  @scala.inline
  def apply(Status: Enabled | Disabled | String): _SseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SseKmsEncryptedObjects]
  }
}

