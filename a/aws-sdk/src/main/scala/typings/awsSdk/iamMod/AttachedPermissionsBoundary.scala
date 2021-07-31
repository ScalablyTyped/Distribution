package typings.awsSdk.iamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachedPermissionsBoundary extends StObject {
  
  /**
    *  The ARN of the policy used to set the permissions boundary for the user or role.
    */
  var PermissionsBoundaryArn: js.UndefOr[arnType] = js.undefined
  
  /**
    *  The permissions boundary usage type that indicates what type of IAM resource is used as the permissions boundary for an entity. This data type can only have a value of Policy.
    */
  var PermissionsBoundaryType: js.UndefOr[PermissionsBoundaryAttachmentType] = js.undefined
}
object AttachedPermissionsBoundary {
  
  @scala.inline
  def apply(): AttachedPermissionsBoundary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachedPermissionsBoundary]
  }
  
  @scala.inline
  implicit class AttachedPermissionsBoundaryMutableBuilder[Self <: AttachedPermissionsBoundary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermissionsBoundaryArn(value: arnType): Self = StObject.set(x, "PermissionsBoundaryArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsBoundaryArnUndefined: Self = StObject.set(x, "PermissionsBoundaryArn", js.undefined)
    
    @scala.inline
    def setPermissionsBoundaryType(value: PermissionsBoundaryAttachmentType): Self = StObject.set(x, "PermissionsBoundaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionsBoundaryTypeUndefined: Self = StObject.set(x, "PermissionsBoundaryType", js.undefined)
  }
}
