package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvbSdtSettings extends js.Object {
  
  /**
    * Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT information from input stream to output stream. The sdtFollowIfPresent setting copies SDT information from input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. The sdtManual setting means user will enter the SDT information. The sdtNone setting means output stream will not contain SDT information.
    */
  var OutputSdt: js.UndefOr[DvbSdtOutputSdt] = js.native
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[integerMin25Max2000] = js.native
  
  /**
    * The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceName: js.UndefOr[stringMin1Max256] = js.native
  
  /**
    * The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceProviderName: js.UndefOr[stringMin1Max256] = js.native
}
object DvbSdtSettings {
  
  @scala.inline
  def apply(): DvbSdtSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DvbSdtSettings]
  }
  
  @scala.inline
  implicit class DvbSdtSettingsOps[Self <: DvbSdtSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOutputSdt(value: DvbSdtOutputSdt): Self = this.set("OutputSdt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputSdt: Self = this.set("OutputSdt", js.undefined)
    
    @scala.inline
    def setRepInterval(value: integerMin25Max2000): Self = this.set("RepInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepInterval: Self = this.set("RepInterval", js.undefined)
    
    @scala.inline
    def setServiceName(value: stringMin1Max256): Self = this.set("ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceName: Self = this.set("ServiceName", js.undefined)
    
    @scala.inline
    def setServiceProviderName(value: stringMin1Max256): Self = this.set("ServiceProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceProviderName: Self = this.set("ServiceProviderName", js.undefined)
  }
}
