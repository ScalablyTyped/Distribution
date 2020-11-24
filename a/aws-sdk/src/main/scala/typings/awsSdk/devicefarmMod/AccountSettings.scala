package typings.awsSdk.devicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountSettings extends js.Object {
  
  /**
    * The AWS account number specified in the AccountSettings container.
    */
  var awsAccountNumber: js.UndefOr[AWSAccountNumber] = js.native
  
  /**
    * The default number of minutes (at the account level) a test run executes before it times out. The default value is 150 minutes.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  
  /**
    * The maximum number of minutes a test run executes before it times out.
    */
  var maxJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.native
  
  /**
    * The maximum number of device slots that the AWS account can purchase. Each maximum is expressed as an offering-id:number pair, where the offering-id represents one of the IDs returned by the ListOfferings command.
    */
  var maxSlots: js.UndefOr[MaxSlotMap] = js.native
  
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.native
  
  /**
    * Information about an AWS account's usage of free trial device minutes.
    */
  var trialMinutes: js.UndefOr[TrialMinutes] = js.native
  
  /**
    * Returns the unmetered devices you have purchased or want to purchase.
    */
  var unmeteredDevices: js.UndefOr[PurchasedDevicesMap] = js.native
  
  /**
    * Returns the unmetered remote access devices you have purchased or want to purchase.
    */
  var unmeteredRemoteAccessDevices: js.UndefOr[PurchasedDevicesMap] = js.native
}
object AccountSettings {
  
  @scala.inline
  def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  @scala.inline
  implicit class AccountSettingsOps[Self <: AccountSettings] (val x: Self) extends AnyVal {
    
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
    def setAwsAccountNumber(value: AWSAccountNumber): Self = this.set("awsAccountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccountNumber: Self = this.set("awsAccountNumber", js.undefined)
    
    @scala.inline
    def setDefaultJobTimeoutMinutes(value: JobTimeoutMinutes): Self = this.set("defaultJobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultJobTimeoutMinutes: Self = this.set("defaultJobTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setMaxJobTimeoutMinutes(value: JobTimeoutMinutes): Self = this.set("maxJobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxJobTimeoutMinutes: Self = this.set("maxJobTimeoutMinutes", js.undefined)
    
    @scala.inline
    def setMaxSlots(value: MaxSlotMap): Self = this.set("maxSlots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSlots: Self = this.set("maxSlots", js.undefined)
    
    @scala.inline
    def setSkipAppResign(value: SkipAppResign): Self = this.set("skipAppResign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipAppResign: Self = this.set("skipAppResign", js.undefined)
    
    @scala.inline
    def setTrialMinutes(value: TrialMinutes): Self = this.set("trialMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrialMinutes: Self = this.set("trialMinutes", js.undefined)
    
    @scala.inline
    def setUnmeteredDevices(value: PurchasedDevicesMap): Self = this.set("unmeteredDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmeteredDevices: Self = this.set("unmeteredDevices", js.undefined)
    
    @scala.inline
    def setUnmeteredRemoteAccessDevices(value: PurchasedDevicesMap): Self = this.set("unmeteredRemoteAccessDevices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnmeteredRemoteAccessDevices: Self = this.set("unmeteredRemoteAccessDevices", js.undefined)
  }
}
