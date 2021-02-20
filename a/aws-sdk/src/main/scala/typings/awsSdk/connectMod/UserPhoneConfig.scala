package typings.awsSdk.connectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPhoneConfig extends StObject {
  
  /**
    * The After Call Work (ACW) timeout setting, in seconds.
    */
  var AfterContactWorkTimeLimit: js.UndefOr[typings.awsSdk.connectMod.AfterContactWorkTimeLimit] = js.native
  
  /**
    * The Auto accept setting.
    */
  var AutoAccept: js.UndefOr[typings.awsSdk.connectMod.AutoAccept] = js.native
  
  /**
    * The phone number for the user's desk phone.
    */
  var DeskPhoneNumber: js.UndefOr[PhoneNumber] = js.native
  
  /**
    * The phone type.
    */
  var PhoneType: typings.awsSdk.connectMod.PhoneType = js.native
}
object UserPhoneConfig {
  
  @scala.inline
  def apply(PhoneType: PhoneType): UserPhoneConfig = {
    val __obj = js.Dynamic.literal(PhoneType = PhoneType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPhoneConfig]
  }
  
  @scala.inline
  implicit class UserPhoneConfigMutableBuilder[Self <: UserPhoneConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAfterContactWorkTimeLimit(value: AfterContactWorkTimeLimit): Self = StObject.set(x, "AfterContactWorkTimeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterContactWorkTimeLimitUndefined: Self = StObject.set(x, "AfterContactWorkTimeLimit", js.undefined)
    
    @scala.inline
    def setAutoAccept(value: AutoAccept): Self = StObject.set(x, "AutoAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoAcceptUndefined: Self = StObject.set(x, "AutoAccept", js.undefined)
    
    @scala.inline
    def setDeskPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "DeskPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeskPhoneNumberUndefined: Self = StObject.set(x, "DeskPhoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneType(value: PhoneType): Self = StObject.set(x, "PhoneType", value.asInstanceOf[js.Any])
  }
}
