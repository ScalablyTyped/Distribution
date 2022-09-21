package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAMRoleIdentity extends StObject {
  
  /**
    * The ARN of the IAM role. For more information, see IAM ARNs in the IAM User Guide.
    */
  var arn: ARN
}
object IAMRoleIdentity {
  
  inline def apply(arn: ARN): IAMRoleIdentity = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAMRoleIdentity]
  }
  
  extension [Self <: IAMRoleIdentity](x: Self) {
    
    inline def setArn(value: ARN): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
