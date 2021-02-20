package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocalIpDetails extends StObject {
  
  /**
    * The IPv4 local address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.native
}
object LocalIpDetails {
  
  @scala.inline
  def apply(): LocalIpDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocalIpDetails]
  }
  
  @scala.inline
  implicit class LocalIpDetailsMutableBuilder[Self <: LocalIpDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddressV4(value: String): Self = StObject.set(x, "IpAddressV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressV4Undefined: Self = StObject.set(x, "IpAddressV4", js.undefined)
  }
}
