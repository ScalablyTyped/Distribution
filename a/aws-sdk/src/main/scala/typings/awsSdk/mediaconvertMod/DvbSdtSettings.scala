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
  def apply(
    OutputSdt: OutputSdt = null,
    SdtInterval: Int | Double = null,
    ServiceName: stringMin1Max256 = null,
    ServiceProviderName: stringMin1Max256 = null
  ): DvbSdtSettings = {
    val __obj = js.Dynamic.literal()
    if (OutputSdt != null) __obj.updateDynamic("OutputSdt")(OutputSdt.asInstanceOf[js.Any])
    if (SdtInterval != null) __obj.updateDynamic("SdtInterval")(SdtInterval.asInstanceOf[js.Any])
    if (ServiceName != null) __obj.updateDynamic("ServiceName")(ServiceName.asInstanceOf[js.Any])
    if (ServiceProviderName != null) __obj.updateDynamic("ServiceProviderName")(ServiceProviderName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DvbSdtSettings]
  }
}

