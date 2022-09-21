package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableImageDeprecationRequest extends StObject {
  
  /**
    * The date and time to deprecate the AMI, in UTC, in the following format: YYYY-MM-DDTHH:MM:SSZ. If you specify a value for seconds, Amazon EC2 rounds the seconds to the nearest minute. You can’t specify a date in the past. The upper limit for DeprecateAt is 10 years from now.
    */
  var DeprecateAt: js.Date
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The ID of the AMI.
    */
  var ImageId: typings.awsSdk.ec2Mod.ImageId
}
object EnableImageDeprecationRequest {
  
  inline def apply(DeprecateAt: js.Date, ImageId: ImageId): EnableImageDeprecationRequest = {
    val __obj = js.Dynamic.literal(DeprecateAt = DeprecateAt.asInstanceOf[js.Any], ImageId = ImageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableImageDeprecationRequest]
  }
  
  extension [Self <: EnableImageDeprecationRequest](x: Self) {
    
    inline def setDeprecateAt(value: js.Date): Self = StObject.set(x, "DeprecateAt", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setImageId(value: ImageId): Self = StObject.set(x, "ImageId", value.asInstanceOf[js.Any])
  }
}
