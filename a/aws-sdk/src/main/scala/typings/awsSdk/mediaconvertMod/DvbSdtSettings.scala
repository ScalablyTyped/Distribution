package typings.awsSdk.mediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DvbSdtSettings extends StObject {
  
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
  implicit class DvbSdtSettingsMutableBuilder[Self <: DvbSdtSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutputSdt(value: OutputSdt): Self = StObject.set(x, "OutputSdt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSdtUndefined: Self = StObject.set(x, "OutputSdt", js.undefined)
    
    @scala.inline
    def setSdtInterval(value: integerMin25Max2000): Self = StObject.set(x, "SdtInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdtIntervalUndefined: Self = StObject.set(x, "SdtInterval", js.undefined)
    
    @scala.inline
    def setServiceName(value: stringMin1Max256): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    @scala.inline
    def setServiceProviderName(value: stringMin1Max256): Self = StObject.set(x, "ServiceProviderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceProviderNameUndefined: Self = StObject.set(x, "ServiceProviderName", js.undefined)
  }
}
