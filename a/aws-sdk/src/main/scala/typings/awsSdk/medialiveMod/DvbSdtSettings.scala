package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DvbSdtSettings extends StObject {
  
  /**
    * Selects method of inserting SDT information into output stream. The sdtFollow setting copies SDT information from input stream to output stream. The sdtFollowIfPresent setting copies SDT information from input stream to output stream if SDT information is present in the input, otherwise it will fall back on the user-defined values. The sdtManual setting means user will enter the SDT information. The sdtNone setting means output stream will not contain SDT information.
    */
  var OutputSdt: js.UndefOr[DvbSdtOutputSdt] = js.undefined
  
  /**
    * The number of milliseconds between instances of this table in the output transport stream.
    */
  var RepInterval: js.UndefOr[integerMin25Max2000] = js.undefined
  
  /**
    * The service name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceName: js.UndefOr[stringMin1Max256] = js.undefined
  
  /**
    * The service provider name placed in the serviceDescriptor in the Service Description Table. Maximum length is 256 characters.
    */
  var ServiceProviderName: js.UndefOr[stringMin1Max256] = js.undefined
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
    def setOutputSdt(value: DvbSdtOutputSdt): Self = StObject.set(x, "OutputSdt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputSdtUndefined: Self = StObject.set(x, "OutputSdt", js.undefined)
    
    @scala.inline
    def setRepInterval(value: integerMin25Max2000): Self = StObject.set(x, "RepInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepIntervalUndefined: Self = StObject.set(x, "RepInterval", js.undefined)
    
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
