package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdvertiseByoipCidrResponse extends StObject {
  
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.globalacceleratorMod.ByoipCidr] = js.native
}
object AdvertiseByoipCidrResponse {
  
  @scala.inline
  def apply(): AdvertiseByoipCidrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdvertiseByoipCidrResponse]
  }
  
  @scala.inline
  implicit class AdvertiseByoipCidrResponseMutableBuilder[Self <: AdvertiseByoipCidrResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
