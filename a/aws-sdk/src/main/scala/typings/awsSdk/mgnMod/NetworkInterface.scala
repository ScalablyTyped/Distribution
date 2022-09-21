package typings.awsSdk.mgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkInterface extends StObject {
  
  /**
    * Network interface IPs.
    */
  var ips: js.UndefOr[IPsList] = js.undefined
  
  /**
    * Network interface primary IP.
    */
  var isPrimary: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Network interface Mac address.
    */
  var macAddress: js.UndefOr[BoundedString] = js.undefined
}
object NetworkInterface {
  
  inline def apply(): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkInterface]
  }
  
  extension [Self <: NetworkInterface](x: Self) {
    
    inline def setIps(value: IPsList): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
    
    inline def setIpsUndefined: Self = StObject.set(x, "ips", js.undefined)
    
    inline def setIpsVarargs(value: BoundedString*): Self = StObject.set(x, "ips", js.Array(value*))
    
    inline def setIsPrimary(value: Boolean): Self = StObject.set(x, "isPrimary", value.asInstanceOf[js.Any])
    
    inline def setIsPrimaryUndefined: Self = StObject.set(x, "isPrimary", js.undefined)
    
    inline def setMacAddress(value: BoundedString): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "macAddress", js.undefined)
  }
}
