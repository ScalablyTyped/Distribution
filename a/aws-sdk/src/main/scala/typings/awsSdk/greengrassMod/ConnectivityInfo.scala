package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectivityInfo extends StObject {
  
  /**
    * The endpoint for the Greengrass core. Can be an IP address or DNS.
    */
  var HostAddress: js.UndefOr[string] = js.undefined
  
  /**
    * The ID of the connectivity information.
    */
  var Id: js.UndefOr[string] = js.undefined
  
  /**
    * Metadata for this endpoint.
    */
  var Metadata: js.UndefOr[string] = js.undefined
  
  /**
    * The port of the Greengrass core. Usually 8883.
    */
  var PortNumber: js.UndefOr[integer] = js.undefined
}
object ConnectivityInfo {
  
  @scala.inline
  def apply(): ConnectivityInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectivityInfo]
  }
  
  @scala.inline
  implicit class ConnectivityInfoMutableBuilder[Self <: ConnectivityInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostAddress(value: string): Self = StObject.set(x, "HostAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostAddressUndefined: Self = StObject.set(x, "HostAddress", js.undefined)
    
    @scala.inline
    def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setMetadata(value: string): Self = StObject.set(x, "Metadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetadataUndefined: Self = StObject.set(x, "Metadata", js.undefined)
    
    @scala.inline
    def setPortNumber(value: integer): Self = StObject.set(x, "PortNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortNumberUndefined: Self = StObject.set(x, "PortNumber", js.undefined)
  }
}
