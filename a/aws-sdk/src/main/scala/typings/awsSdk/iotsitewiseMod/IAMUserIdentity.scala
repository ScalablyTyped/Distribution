package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAMUserIdentity extends StObject {
  
  /**
    * The ARN of the IAM user. For more information, see IAM ARNs in the IAM User Guide.  If you delete the IAM user, access policies that contain this identity include an empty arn. You can delete the access policy for the IAM user that no longer exists. 
    */
  var arn: ARN
}
object IAMUserIdentity {
  
  inline def apply(arn: ARN): IAMUserIdentity = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAMUserIdentity]
  }
  
  extension [Self <: IAMUserIdentity](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
