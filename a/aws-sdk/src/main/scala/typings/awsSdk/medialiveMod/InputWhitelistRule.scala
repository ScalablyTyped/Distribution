package typings.awsSdk.medialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputWhitelistRule extends StObject {
  
  /**
    * The IPv4 CIDR that's whitelisted.
    */
  var Cidr: js.UndefOr[string] = js.undefined
}
object InputWhitelistRule {
  
  @scala.inline
  def apply(): InputWhitelistRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputWhitelistRule]
  }
  
  @scala.inline
  implicit class InputWhitelistRuleMutableBuilder[Self <: InputWhitelistRule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCidr(value: string): Self = StObject.set(x, "Cidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCidrUndefined: Self = StObject.set(x, "Cidr", js.undefined)
  }
}
