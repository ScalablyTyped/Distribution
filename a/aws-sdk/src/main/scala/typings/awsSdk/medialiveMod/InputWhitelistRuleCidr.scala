package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputWhitelistRuleCidr extends StObject {
  
  /**
    * The IPv4 CIDR to whitelist.
    */
  var Cidr: js.UndefOr[string] = js.undefined
}
object InputWhitelistRuleCidr {
  
  @scala.inline
  def apply(): InputWhitelistRuleCidr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputWhitelistRuleCidr]
  }
  
  @scala.inline
  implicit class InputWhitelistRuleCidrMutableBuilder[Self <: InputWhitelistRuleCidr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: string): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
  }
}
