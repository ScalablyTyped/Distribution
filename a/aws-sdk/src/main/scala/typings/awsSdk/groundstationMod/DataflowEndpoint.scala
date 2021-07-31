package typings.awsSdk.groundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataflowEndpoint extends StObject {
  
  /**
    * Socket address of a dataflow endpoint.
    */
  var address: js.UndefOr[SocketAddress] = js.undefined
  
  /**
    * Maximum transmission unit (MTU) size in bytes of a dataflow endpoint.
    */
  var mtu: js.UndefOr[DataflowEndpointmtuInteger] = js.undefined
  
  /**
    * Name of a dataflow endpoint.
    */
  var name: js.UndefOr[SafeName] = js.undefined
  
  /**
    * Status of a dataflow endpoint.
    */
  var status: js.UndefOr[EndpointStatus] = js.undefined
}
object DataflowEndpoint {
  
  @scala.inline
  def apply(): DataflowEndpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataflowEndpoint]
  }
  
  @scala.inline
  implicit class DataflowEndpointMutableBuilder[Self <: DataflowEndpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: SocketAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setMtu(value: DataflowEndpointmtuInteger): Self = StObject.set(x, "mtu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMtuUndefined: Self = StObject.set(x, "mtu", js.undefined)
    
    @scala.inline
    def setName(value: SafeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setStatus(value: EndpointStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
