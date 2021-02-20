package typings.awsSdk.directoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpRoute extends StObject {
  
  /**
    * IP address block using CIDR format, for example 10.0.0.0/24. This is often the address block of the DNS server used for your on-premises domain. For a single IP address use a CIDR address block with /32. For example 10.0.0.0/32.
    */
  var CidrIp: js.UndefOr[typings.awsSdk.directoryserviceMod.CidrIp] = js.native
  
  /**
    * Description of the address block.
    */
  var Description: js.UndefOr[typings.awsSdk.directoryserviceMod.Description] = js.native
}
object IpRoute {
  
  @scala.inline
  def apply(): IpRoute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpRoute]
  }
  
  @scala.inline
  implicit class IpRouteMutableBuilder[Self <: IpRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidrIp(value: CidrIp): Self = StObject.set(x, "CidrIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrIpUndefined: Self = StObject.set(x, "CidrIp", js.undefined)
    
    @scala.inline
    def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
  }
}
