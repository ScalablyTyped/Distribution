package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateAccountSettingsRequest extends StObject {
  
  /**
    * The ID for the AWS account that contains the QuickSight settings that you want to list.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  
  /**
    * The default namespace for this AWS account. Currently, the default is default. AWS Identity and Access Management (IAM) users that register for the first time with QuickSight provide an email that becomes associated with the default namespace.
    */
  var DefaultNamespace: Namespace = js.native
  
  /**
    * The email address that you want QuickSight to send notifications to regarding your AWS account or QuickSight subscription.
    */
  var NotificationEmail: js.UndefOr[String] = js.native
}
object UpdateAccountSettingsRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DefaultNamespace: Namespace): UpdateAccountSettingsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DefaultNamespace = DefaultNamespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAccountSettingsRequest]
  }
  
  @scala.inline
  implicit class UpdateAccountSettingsRequestMutableBuilder[Self <: UpdateAccountSettingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultNamespace(value: Namespace): Self = StObject.set(x, "DefaultNamespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEmail(value: String): Self = StObject.set(x, "NotificationEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationEmailUndefined: Self = StObject.set(x, "NotificationEmail", js.undefined)
  }
}
