package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutNotificationChannelRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the IAM role that allows Amazon SNS to record AWS Firewall Manager activity. 
    */
  var SnsRoleName: ResourceArn = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the SNS topic that collects notifications from AWS Firewall Manager.
    */
  var SnsTopicArn: ResourceArn = js.native
}
object PutNotificationChannelRequest {
  
  @scala.inline
  def apply(SnsRoleName: ResourceArn, SnsTopicArn: ResourceArn): PutNotificationChannelRequest = {
    val __obj = js.Dynamic.literal(SnsRoleName = SnsRoleName.asInstanceOf[js.Any], SnsTopicArn = SnsTopicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutNotificationChannelRequest]
  }
  
  @scala.inline
  implicit class PutNotificationChannelRequestMutableBuilder[Self <: PutNotificationChannelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnsRoleName(value: ResourceArn): Self = StObject.set(x, "SnsRoleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArn(value: ResourceArn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
  }
}
