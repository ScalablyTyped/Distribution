package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeprovisionByoipCidrResult extends StObject {
  
  /**
    * Information about the address range.
    */
  var ByoipCidr: js.UndefOr[typings.awsSdk.ec2Mod.ByoipCidr] = js.native
}
object DeprovisionByoipCidrResult {
  
  @scala.inline
  def apply(): DeprovisionByoipCidrResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeprovisionByoipCidrResult]
  }
  
  @scala.inline
  implicit class DeprovisionByoipCidrResultMutableBuilder[Self <: DeprovisionByoipCidrResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByoipCidr(value: ByoipCidr): Self = StObject.set(x, "ByoipCidr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByoipCidrUndefined: Self = StObject.set(x, "ByoipCidr", js.undefined)
  }
}
