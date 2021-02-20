package typings.awsSdk.globalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprovisionByoipCidrResponse extends StObject {
  
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.globalacceleratorMod.ByoipCidr] = js.native
}
object DeprovisionByoipCidrResponse {
  
  @scala.inline
  def apply(): DeprovisionByoipCidrResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprovisionByoipCidrResponse]
  }
  
  @scala.inline
  implicit class DeprovisionByoipCidrResponseMutableBuilder[Self <: DeprovisionByoipCidrResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
