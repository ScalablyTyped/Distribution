package typings.awsSdk.directconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteFilterPrefix extends StObject {
  
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
  implicit class RouteFilterPrefixMutableBuilder[Self <: RouteFilterPrefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: CIDR): Self = StObject.set(x, "cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "cidr", js.undefined)
  }
}
