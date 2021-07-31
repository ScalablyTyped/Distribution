package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRoleAliasResponse extends StObject {
  
  /**
    * The role alias description.
    */
  var roleAliasDescription: js.UndefOr[RoleAliasDescription] = js.undefined
}
object DescribeRoleAliasResponse {
  
  @scala.inline
  def apply(): DescribeRoleAliasResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRoleAliasResponse]
  }
  
  @scala.inline
  implicit class DescribeRoleAliasResponseMutableBuilder[Self <: DescribeRoleAliasResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRoleAliasDescription(value: RoleAliasDescription): Self = StObject.set(x, "roleAliasDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleAliasDescriptionUndefined: Self = StObject.set(x, "roleAliasDescription", js.undefined)
  }
}
