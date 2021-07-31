package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteNamespaceRequest extends StObject {
  
  /**
    * The ID for the AWS account that you want to delete the QuickSight namespace from.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * The namespace that you want to delete.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace
}
object DeleteNamespaceRequest {
  
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, Namespace: Namespace): DeleteNamespaceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteNamespaceRequest]
  }
  
  @scala.inline
  implicit class DeleteNamespaceRequestMutableBuilder[Self <: DeleteNamespaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
