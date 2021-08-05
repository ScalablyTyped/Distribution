package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFpgaImageAttributeRequest extends StObject {
  
  /**
    * The AFI attribute.
    */
  var Attribute: FpgaImageAttributeName
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AFI.
    */
  var FpgaImageId: typings.awsSdk.ec2Mod.FpgaImageId
}
object DescribeFpgaImageAttributeRequest {
  
  inline def apply(Attribute: FpgaImageAttributeName, FpgaImageId: FpgaImageId): DescribeFpgaImageAttributeRequest = {
    val __obj = js.Dynamic.literal(Attribute = Attribute.asInstanceOf[js.Any], FpgaImageId = FpgaImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFpgaImageAttributeRequest]
  }
  
  extension [Self <: DescribeFpgaImageAttributeRequest](x: Self) {
    
    inline def setAttribute(value: FpgaImageAttributeName): Self = StObject.set(x, "Attribute", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFpgaImageId(value: FpgaImageId): Self = StObject.set(x, "FpgaImageId", value.asInstanceOf[js.Any])
  }
}
