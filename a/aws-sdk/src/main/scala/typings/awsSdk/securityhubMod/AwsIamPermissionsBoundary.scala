package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsIamPermissionsBoundary extends StObject {
  
  /**
    * The ARN of the policy used to set the permissions boundary.
    */
  var PermissionsBoundaryArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The usage type for the permissions boundary.
    */
  var PermissionsBoundaryType: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsIamPermissionsBoundary {
  
  inline def apply(): AwsIamPermissionsBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsIamPermissionsBoundary]
  }
  
  extension [Self <: AwsIamPermissionsBoundary](x: Self) {
    
    inline def setPermissionsBoundaryArn(value: NonEmptyString): Self = StObject.set(x, "PermissionsBoundaryArn", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryArnUndefined: Self = StObject.set(x, "PermissionsBoundaryArn", js.undefined)
    
    inline def setPermissionsBoundaryType(value: NonEmptyString): Self = StObject.set(x, "PermissionsBoundaryType", value.asInstanceOf[js.Any])
    
    inline def setPermissionsBoundaryTypeUndefined: Self = StObject.set(x, "PermissionsBoundaryType", js.undefined)
  }
}
