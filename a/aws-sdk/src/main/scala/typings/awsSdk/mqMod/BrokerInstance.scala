package typings.awsSdk.mqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BrokerInstance extends StObject {
  
  /**
    * The URL of the broker's Web Console.
    */
  var ConsoleURL: js.UndefOr[string] = js.undefined
  
  /**
    * The broker's wire-level protocol endpoints.
    */
  var Endpoints: js.UndefOr[listOfString] = js.undefined
  
  /**
    * The IP address of the Elastic Network Interface (ENI) attached to the broker. Does not apply to RabbitMQ brokers
    */
  var IpAddress: js.UndefOr[string] = js.undefined
}
object BrokerInstance {
  
  @scala.inline
  def apply(): BrokerInstance = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokerInstance]
  }
  
  @scala.inline
  implicit class BrokerInstanceMutableBuilder[Self <: BrokerInstance] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConsoleURL(value: string): Self = StObject.set(x, "ConsoleURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConsoleURLUndefined: Self = StObject.set(x, "ConsoleURL", js.undefined)
    
    @scala.inline
    def setEndpoints(value: listOfString): Self = StObject.set(x, "Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsUndefined: Self = StObject.set(x, "Endpoints", js.undefined)
    
    @scala.inline
    def setEndpointsVarargs(value: string*): Self = StObject.set(x, "Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setIpAddress(value: string): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
  }
}
