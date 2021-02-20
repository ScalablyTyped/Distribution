package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigDetails extends StObject {
  
  /**
    * Details for antenna demod decode Config in a contact.
    */
  var antennaDemodDecodeDetails: js.UndefOr[AntennaDemodDecodeDetails] = js.native
  
  var endpointDetails: js.UndefOr[EndpointDetails] = js.native
}
object ConfigDetails {
  
  @scala.inline
  def apply(): ConfigDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigDetails]
  }
  
  @scala.inline
  implicit class ConfigDetailsMutableBuilder[Self <: ConfigDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAntennaDemodDecodeDetails(value: AntennaDemodDecodeDetails): Self = StObject.set(x, "antennaDemodDecodeDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAntennaDemodDecodeDetailsUndefined: Self = StObject.set(x, "antennaDemodDecodeDetails", js.undefined)
    
    @scala.inline
    def setEndpointDetails(value: EndpointDetails): Self = StObject.set(x, "endpointDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointDetailsUndefined: Self = StObject.set(x, "endpointDetails", js.undefined)
  }
}
