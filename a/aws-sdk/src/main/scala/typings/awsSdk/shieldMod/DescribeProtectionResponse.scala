package typings.awsSdk.shieldMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeProtectionResponse extends StObject {
  
  /**
    * The Protection object that is described.
    */
  var Protection: js.UndefOr[typings.awsSdk.shieldMod.Protection] = js.native
}
object DescribeProtectionResponse {
  
  @scala.inline
  def apply(): DescribeProtectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProtectionResponse]
  }
  
  @scala.inline
  implicit class DescribeProtectionResponseMutableBuilder[Self <: DescribeProtectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProtection(value: Protection): Self = StObject.set(x, "Protection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtectionUndefined: Self = StObject.set(x, "Protection", js.undefined)
  }
}
