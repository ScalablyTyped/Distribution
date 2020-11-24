package typings.awsSdk.directconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteFilterPrefix extends js.Object {
  
  /**
    * The CIDR block for the advertised route. Separate multiple routes using commas. An IPv6 CIDR must use /64 or shorter.
    */
  var cidr: js.UndefOr[CIDR] = js.native
}
object RouteFilterPrefix {
  
  @scala.inline
  def apply(): RouteFilterPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteFilterPrefix]
  }
  
  @scala.inline
  implicit class RouteFilterPrefixOps[Self <: RouteFilterPrefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCidr(value: CIDR): Self = this.set("cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCidr: Self = this.set("cidr", js.undefined)
  }
}
