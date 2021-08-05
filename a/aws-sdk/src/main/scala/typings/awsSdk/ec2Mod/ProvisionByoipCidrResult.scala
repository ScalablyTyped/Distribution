package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisionByoipCidrResult extends StObject {
  
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.ec2Mod.ByoipCidr] = js.undefined
}
object ProvisionByoipCidrResult {
  
  inline def apply(): ProvisionByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisionByoipCidrResult]
  }
  
  extension [Self <: ProvisionByoipCidrResult](x: Self) {
    
    inline def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    inline def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
