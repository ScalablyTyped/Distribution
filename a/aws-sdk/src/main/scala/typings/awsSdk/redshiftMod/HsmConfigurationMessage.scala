package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HsmConfigurationMessage extends StObject {
  
  /**
    * A list of HsmConfiguration objects.
    */
  var HsmConfigurations: js.UndefOr[HsmConfigurationList] = js.native
  
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
}
object HsmConfigurationMessage {
  
  @scala.inline
  def apply(): HsmConfigurationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HsmConfigurationMessage]
  }
  
  @scala.inline
  implicit class HsmConfigurationMessageMutableBuilder[Self <: HsmConfigurationMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHsmConfigurations(value: HsmConfigurationList): Self = StObject.set(x, "HsmConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHsmConfigurationsUndefined: Self = StObject.set(x, "HsmConfigurations", js.undefined)
    
    @scala.inline
    def setHsmConfigurationsVarargs(value: HsmConfiguration*): Self = StObject.set(x, "HsmConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
