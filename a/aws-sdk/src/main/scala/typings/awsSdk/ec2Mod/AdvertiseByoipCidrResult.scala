package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiseByoipCidrResult extends StObject {
  
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.ec2Mod.ByoipCidr] = js.native
}
object AdvertiseByoipCidrResult {
  
  @scala.inline
  def apply(): AdvertiseByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiseByoipCidrResult]
  }
  
  @scala.inline
  implicit class AdvertiseByoipCidrResultMutableBuilder[Self <: AdvertiseByoipCidrResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
