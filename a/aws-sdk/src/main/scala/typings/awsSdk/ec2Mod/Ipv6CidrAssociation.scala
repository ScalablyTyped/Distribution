package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ipv6CidrAssociation extends js.Object {
  
  /**
    * The resource that's associated with the IPv6 CIDR block.
    */
  var AssociatedResource: js.UndefOr[String] = js.native
  
  /**
    * The IPv6 CIDR block.
    */
  var Ipv6Cidr: js.UndefOr[String] = js.native
}
object Ipv6CidrAssociation {
  
  @scala.inline
  def apply(): Ipv6CidrAssociation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ipv6CidrAssociation]
  }
  
  @scala.inline
  implicit class Ipv6CidrAssociationOps[Self <: Ipv6CidrAssociation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAssociatedResource(value: String): Self = this.set("AssociatedResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociatedResource: Self = this.set("AssociatedResource", js.undefined)
    
    @scala.inline
    def setIpv6Cidr(value: String): Self = this.set("Ipv6Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpv6Cidr: Self = this.set("Ipv6Cidr", js.undefined)
  }
}
