package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdvertiseByoipCidrResult extends StObject {
  
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.ec2Mod.ByoipCidr] = js.undefined
}
object AdvertiseByoipCidrResult {
  
  inline def apply(): AdvertiseByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiseByoipCidrResult]
  }
  
  extension [Self <: AdvertiseByoipCidrResult](x: Self) {
    
    inline def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    inline def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
