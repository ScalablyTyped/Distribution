package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeFpgaImageAttributeRequest extends StObject {
  
  /**
    * The AFI attribute.
    */
  var Attribute: FpgaImageAttributeName = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typings.awsSdk.ec2Mod.FpgaImageId = js.native
}
object DescribeFpgaImageAttributeRequest {
  
  @scala.inline
  def apply(Attribute: FpgaImageAttributeName, FpgaImageId: FpgaImageId): DescribeFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFpgaImageAttributeRequest]
  }
  
  @scala.inline
  implicit class DescribeFpgaImageAttributeRequestMutableBuilder[Self <: DescribeFpgaImageAttributeRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttribute(value: FpgaImageAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setFpgaImageId(value: FpgaImageId): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
  }
}
