package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DvbSdtSettings extends js.Object {
  /**
    * Selects method of inserting SDT information into output stream.  "Follow input SDT" copies SDT information from input stream to  output stream. "Follow input SDT if present" copies SDT information from  input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. Enter "SDT  Manually" means user will enter the SDT information. "No SDT" means output  stream will not contain SDT information.
    */
  var OutputSdt: js.UndefOr[typings.awsSdk.mediaconvertMod.OutputSdt] = js.native
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var SdtInterval: js.UndefOr[integerMin25Max2000] = js.native
  /**
    * The service name placed in the service_descriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceName: js.UndefOr[stringMin1Max256] = js.native
  /**
    * The service provider name placed in the service_descriptor in the Service Description Table. Maximum length is 256 characters.
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
    def setOutputSdt(value: OutputSdt): Self = this.set("OutputSdt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputSdt: Self = this.set("OutputSdt", js.undefined)
    @scala.inline
    def setSdtInterval(value: integerMin25Max2000): Self = this.set("SdtInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSdtInterval: Self = this.set("SdtInterval", js.undefined)
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

