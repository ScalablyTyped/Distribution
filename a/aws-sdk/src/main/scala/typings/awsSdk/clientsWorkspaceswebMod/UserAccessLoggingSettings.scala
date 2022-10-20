package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAccessLoggingSettings extends StObject {
  
  /**
    * A list of web portal ARNs that this user access logging settings is associated with.
    */
  var associatedPortalArns: js.UndefOr[ArnList] = js.undefined
  
  /**
    * The ARN of the Kinesis stream.
    */
  var kinesisStreamArn: js.UndefOr[KinesisStreamArn] = js.undefined
  
  /**
    * The ARN of the user access logging settings.
    */
  var userAccessLoggingSettingsArn: ARN
}
object UserAccessLoggingSettings {
  
  inline def apply(userAccessLoggingSettingsArn: ARN): UserAccessLoggingSettings = {
    val __obj = js.Dynamic.literal(userAccessLoggingSettingsArn = userAccessLoggingSettingsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserAccessLoggingSettings]
  }
  
  extension [Self <: UserAccessLoggingSettings](x: Self) {
    
    inline def setAssociatedPortalArns(value: ArnList): Self = StObject.set(x, "associatedPortalArns", value.asInstanceOf[js.Any])
    
    inline def setAssociatedPortalArnsUndefined: Self = StObject.set(x, "associatedPortalArns", js.undefined)
    
    inline def setAssociatedPortalArnsVarargs(value: ARN*): Self = StObject.set(x, "associatedPortalArns", js.Array(value*))
    
    inline def setKinesisStreamArn(value: KinesisStreamArn): Self = StObject.set(x, "kinesisStreamArn", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamArnUndefined: Self = StObject.set(x, "kinesisStreamArn", js.undefined)
    
    inline def setUserAccessLoggingSettingsArn(value: ARN): Self = StObject.set(x, "userAccessLoggingSettingsArn", value.asInstanceOf[js.Any])
  }
}
