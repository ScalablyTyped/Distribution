package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceAccessPolicy extends StObject {
  
  /**
    * The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro'' (read-only).
    */
  var Permission: js.UndefOr[typings.awsSdk.greengrassMod.Permission] = js.undefined
  
  /**
    * The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.)
    */
  var ResourceId: string
}
object ResourceAccessPolicy {
  
  @scala.inline
  def apply(ResourceId: string): ResourceAccessPolicy = {
    val __obj = js.Dynamic.literal(ResourceId = ResourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceAccessPolicy]
  }
  
  @scala.inline
  implicit class ResourceAccessPolicyMutableBuilder[Self <: ResourceAccessPolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPermission(value: Permission): Self = StObject.set(x, "Permission", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionUndefined: Self = StObject.set(x, "Permission", js.undefined)
    
    @scala.inline
    def setResourceId(value: string): Self = StObject.set(x, "ResourceId", value.asInstanceOf[js.Any])
  }
}
