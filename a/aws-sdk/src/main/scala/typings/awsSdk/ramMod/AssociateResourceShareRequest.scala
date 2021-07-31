package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceShareRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The principals.
    */
  var principals: js.UndefOr[PrincipalArnOrIdList] = js.undefined
  
  /**
    * The Amazon Resource Names (ARN) of the resources.
    */
  var resourceArns: js.UndefOr[ResourceArnList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the resource share.
    */
  var resourceShareArn: String
}
object AssociateResourceShareRequest {
  
  @scala.inline
  def apply(resourceShareArn: String): AssociateResourceShareRequest = {
    val __obj = js.Dynamic.literal(resourceShareArn = resourceShareArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateResourceShareRequest]
  }
  
  @scala.inline
  implicit class AssociateResourceShareRequestMutableBuilder[Self <: AssociateResourceShareRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
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
    def setResourceShareArn(value: String): Self = StObject.set(x, "resourceShareArn", value.asInstanceOf[js.Any])
  }
}
