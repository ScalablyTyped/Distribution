package typings.awsSdk.lakeformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceInfo extends StObject {
  
  /**
    * The date and time the resource was last modified.
    */
  var LastModified: js.UndefOr[LastModifiedTimestamp] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var ResourceArn: js.UndefOr[ResourceArnString] = js.undefined
  
  /**
    * The IAM role that registered a resource.
    */
  var RoleArn: js.UndefOr[IAMRoleArn] = js.undefined
}
object ResourceInfo {
  
  @scala.inline
  def apply(): ResourceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceInfo]
  }
  
  @scala.inline
  implicit class ResourceInfoMutableBuilder[Self <: ResourceInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLastModified(value: LastModifiedTimestamp): Self = StObject.set(x, "LastModified", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedUndefined: Self = StObject.set(x, "LastModified", js.undefined)
    
    @scala.inline
    def setResourceArn(value: ResourceArnString): Self = StObject.set(x, "ResourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnUndefined: Self = StObject.set(x, "ResourceArn", js.undefined)
    
    @scala.inline
    def setRoleArn(value: IAMRoleArn): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
