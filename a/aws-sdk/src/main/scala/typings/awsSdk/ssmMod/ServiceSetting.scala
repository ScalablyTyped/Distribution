package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceSetting extends StObject {
  
  /**
    * The ARN of the service setting.
    */
  var ARN: js.UndefOr[String] = js.native
  
  /**
    * The last time the service setting was modified.
    */
  var LastModifiedDate: js.UndefOr[DateTime] = js.native
  
  /**
    * The ARN of the last modified user. This field is populated only if the setting value was overwritten.
    */
  var LastModifiedUser: js.UndefOr[String] = js.native
  
  /**
    * The ID of the service setting.
    */
  var SettingId: js.UndefOr[ServiceSettingId] = js.native
  
  /**
    * The value of the service setting.
    */
  var SettingValue: js.UndefOr[ServiceSettingValue] = js.native
  
  /**
    * The status of the service setting. The value can be Default, Customized or PendingUpdate.   Default: The current setting uses a default value provisioned by the AWS service team.   Customized: The current setting use a custom value specified by the customer.   PendingUpdate: The current setting uses a default or custom value, but a setting change request is pending approval.  
    */
  var Status: js.UndefOr[String] = js.native
}
object ServiceSetting {
  
  @scala.inline
  def apply(): ServiceSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceSetting]
  }
  
  @scala.inline
  implicit class ServiceSettingMutableBuilder[Self <: ServiceSetting] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateTime): Self = StObject.set(x, "LastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "LastModifiedDate", js.undefined)
    
    @scala.inline
    def setLastModifiedUser(value: String): Self = StObject.set(x, "LastModifiedUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUserUndefined: Self = StObject.set(x, "LastModifiedUser", js.undefined)
    
    @scala.inline
    def setSettingId(value: ServiceSettingId): Self = StObject.set(x, "SettingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingIdUndefined: Self = StObject.set(x, "SettingId", js.undefined)
    
    @scala.inline
    def setSettingValue(value: ServiceSettingValue): Self = StObject.set(x, "SettingValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettingValueUndefined: Self = StObject.set(x, "SettingValue", js.undefined)
    
    @scala.inline
    def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
