package typings.awsSdk.fmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNotificationChannelResponse extends StObject {
  
  /**
    * The IAM role that is used by AWS Firewall Manager to record activity to SNS.
    */
  var SnsRoleName: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The SNS topic that records AWS Firewall Manager activity. 
    */
  var SnsTopicArn: js.UndefOr[ResourceArn] = js.undefined
}
object GetNotificationChannelResponse {
  
  inline def apply(): GetNotificationChannelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNotificationChannelResponse]
  }
  
  extension [Self <: GetNotificationChannelResponse](x: Self) {
    
    inline def setSnsRoleName(value: ResourceArn): Self = StObject.set(x, "SnsRoleName", value.asInstanceOf[js.Any])
    
    inline def setSnsRoleNameUndefined: Self = StObject.set(x, "SnsRoleName", js.undefined)
    
    inline def setSnsTopicArn(value: ResourceArn): Self = StObject.set(x, "SnsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "SnsTopicArn", js.undefined)
  }
}
