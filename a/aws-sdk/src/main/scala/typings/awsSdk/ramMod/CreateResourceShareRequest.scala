package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateResourceShareRequest extends StObject {
  
  /**
    * Indicates whether principals outside your AWS organization can be associated with a resource share.
    */
  var allowExternalPrincipals: js.UndefOr[Boolean] = js.native
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.native
  
  /**
    * The name of the resource share.
    */
  var name: String = js.native
  
  /**
    * The ARNs of the permissions to associate with the resource share. If you do not specify an ARN for the permission, AWS RAM automatically attaches the default version of the permission for each resource type.
    */
  var permissionArns: js.UndefOr[PermissionArnList] = js.native
  
  /**
    * The principals to associate with the resource share. The possible values are IDs of AWS accounts, the ARN of an OU or organization from AWS Organizations.
    */
  var principals: js.UndefOr[PrincipalArnOrIdList] = js.native
  
  /**
    * The Amazon Resource Names (ARN) of the resources to associate with the resource share.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.native
  
  /**
    * One or more tags.
    */
  var tags: js.UndefOr[TagList] = js.native
}
object CreateResourceShareRequest {
  
  @scala.inline
  def apply(name: String): CreateResourceShareRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceShareRequest]
  }
  
  @scala.inline
  implicit class CreateResourceShareRequestMutableBuilder[Self <: CreateResourceShareRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowExternalPrincipals(value: Boolean): Self = StObject.set(x, "allowExternalPrincipals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowExternalPrincipalsUndefined: Self = StObject.set(x, "allowExternalPrincipals", js.undefined)
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionArns(value: PermissionArnList): Self = StObject.set(x, "permissionArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissionArnsUndefined: Self = StObject.set(x, "permissionArns", js.undefined)
    
    @scala.inline
    def setPermissionArnsVarargs(value: String*): Self = StObject.set(x, "permissionArns", js.Array(value :_*))
    
    @scala.inline
    def setPrincipals(value: PrincipalArnOrIdList): Self = StObject.set(x, "principals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrincipalsUndefined: Self = StObject.set(x, "principals", js.undefined)
    
    @scala.inline
    def setPrincipalsVarargs(value: String*): Self = StObject.set(x, "principals", js.Array(value :_*))
    
    @scala.inline
    def setResourceArns(value: ResourceArnList): Self = StObject.set(x, "resourceArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceArnsUndefined: Self = StObject.set(x, "resourceArns", js.undefined)
    
    @scala.inline
    def setResourceArnsVarargs(value: String*): Self = StObject.set(x, "resourceArns", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
  }
}
