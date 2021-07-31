package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkHeader extends StObject {
  
  /**
    * Information about the destination of the component.
    */
  var Destination: js.UndefOr[NetworkPathComponentDetails] = js.undefined
  
  /**
    * The protocol used for the component.
    */
  var Protocol: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the origin of the component.
    */
  var Source: js.UndefOr[NetworkPathComponentDetails] = js.undefined
}
object NetworkHeader {
  
  @scala.inline
  def apply(): NetworkHeader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkHeader]
  }
  
  @scala.inline
  implicit class NetworkHeaderMutableBuilder[Self <: NetworkHeader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestination(value: NetworkPathComponentDetails): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    @scala.inline
    def setProtocol(value: NonEmptyString): Self = StObject.set(x, "Protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolUndefined: Self = StObject.set(x, "Protocol", js.undefined)
    
    @scala.inline
    def setSource(value: NetworkPathComponentDetails): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
  }
}
