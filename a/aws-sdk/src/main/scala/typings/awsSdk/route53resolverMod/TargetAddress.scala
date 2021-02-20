package typings.awsSdk.route53resolverMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TargetAddress extends StObject {
  
  /**
    * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
    */
  var Ip: typings.awsSdk.route53resolverMod.Ip = js.native
  
  /**
    * The port at Ip that you want to forward DNS queries to.
    */
  var Port: js.UndefOr[typings.awsSdk.route53resolverMod.Port] = js.native
}
object TargetAddress {
  
  @scala.inline
  def apply(Ip: Ip): TargetAddress = {
    val __obj = js.Dynamic.literal(Ip = Ip.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetAddress]
  }
  
  @scala.inline
  implicit class TargetAddressMutableBuilder[Self <: TargetAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: Ip): Self = StObject.set(x, "Ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Port): Self = StObject.set(x, "Port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "Port", js.undefined)
  }
}
