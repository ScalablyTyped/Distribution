package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserPhoneConfig extends js.Object {
  
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
  implicit class UserPhoneConfigOps[Self <: UserPhoneConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPhoneType(value: PhoneType): Self = this.set("PhoneType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAfterContactWorkTimeLimit(value: AfterContactWorkTimeLimit): Self = this.set("AfterContactWorkTimeLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAfterContactWorkTimeLimit: Self = this.set("AfterContactWorkTimeLimit", js.undefined)
    
    @scala.inline
    def setAutoAccept(value: AutoAccept): Self = this.set("AutoAccept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoAccept: Self = this.set("AutoAccept", js.undefined)
    
    @scala.inline
    def setDeskPhoneNumber(value: PhoneNumber): Self = this.set("DeskPhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeskPhoneNumber: Self = this.set("DeskPhoneNumber", js.undefined)
  }
}
