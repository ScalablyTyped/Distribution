package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCACertificateResponse extends StObject {
  
  /**
    * The CA certificate description.
    */
  var certificateDescription: js.UndefOr[CACertificateDescription] = js.undefined
  
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
}
object DescribeCACertificateResponse {
  
  @scala.inline
  def apply(): DescribeCACertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCACertificateResponse]
  }
  
  @scala.inline
  implicit class DescribeCACertificateResponseMutableBuilder[Self <: DescribeCACertificateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificateDescription(value: CACertificateDescription): Self = StObject.set(x, "certificateDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateDescriptionUndefined: Self = StObject.set(x, "certificateDescription", js.undefined)
    
    @scala.inline
    def setRegistrationConfig(value: RegistrationConfig): Self = StObject.set(x, "registrationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegistrationConfigUndefined: Self = StObject.set(x, "registrationConfig", js.undefined)
  }
}
