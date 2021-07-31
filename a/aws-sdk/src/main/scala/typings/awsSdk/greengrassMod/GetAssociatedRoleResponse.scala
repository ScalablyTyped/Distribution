package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssociatedRoleResponse extends StObject {
  
  /**
    * The time when the role was associated with the group.
    */
  var AssociatedAt: js.UndefOr[string] = js.undefined
  
  /**
    * The ARN of the role that is associated with the group.
    */
  var RoleArn: js.UndefOr[string] = js.undefined
}
object GetAssociatedRoleResponse {
  
  @scala.inline
  def apply(): GetAssociatedRoleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssociatedRoleResponse]
  }
  
  @scala.inline
  implicit class GetAssociatedRoleResponseMutableBuilder[Self <: GetAssociatedRoleResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatedAt(value: string): Self = StObject.set(x, "AssociatedAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatedAtUndefined: Self = StObject.set(x, "AssociatedAt", js.undefined)
    
    @scala.inline
    def setRoleArn(value: string): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
  }
}
