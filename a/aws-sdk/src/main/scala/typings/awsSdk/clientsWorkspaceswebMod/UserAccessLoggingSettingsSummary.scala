package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserAccessLoggingSettingsSummary extends StObject {
  
  /**
    * The ARN of the Kinesis stream.
    */
  var kinesisStreamArn: js.UndefOr[KinesisStreamArn] = js.undefined
  
  /**
    * The ARN of the user access logging settings.
    */
  var userAccessLoggingSettingsArn: js.UndefOr[ARN] = js.undefined
}
object UserAccessLoggingSettingsSummary {
  
  inline def apply(): UserAccessLoggingSettingsSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserAccessLoggingSettingsSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserAccessLoggingSettingsSummary] (val x: Self) extends AnyVal {
    
    inline def setKinesisStreamArn(value: KinesisStreamArn): Self = StObject.set(x, "kinesisStreamArn", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamArnUndefined: Self = StObject.set(x, "kinesisStreamArn", js.undefined)
    
    inline def setUserAccessLoggingSettingsArn(value: ARN): Self = StObject.set(x, "userAccessLoggingSettingsArn", value.asInstanceOf[js.Any])
    
    inline def setUserAccessLoggingSettingsArnUndefined: Self = StObject.set(x, "userAccessLoggingSettingsArn", js.undefined)
  }
}
