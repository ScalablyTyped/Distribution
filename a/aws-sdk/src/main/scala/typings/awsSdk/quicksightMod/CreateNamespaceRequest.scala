package typings.awsSdk.quicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNamespaceRequest extends StObject {
  
  /**
    * The ID for the AWS account that you want to create the QuickSight namespace in.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId
  
  /**
    * Specifies the type of your user identity directory. Currently, this supports users with an identity type of QUICKSIGHT.
    */
  var IdentityStore: typings.awsSdk.quicksightMod.IdentityStore
  
  /**
    * The name that you want to use to describe the new namespace.
    */
  var Namespace: typings.awsSdk.quicksightMod.Namespace
  
  /**
    * The tags that you want to associate with the namespace that you're creating.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateNamespaceRequest {
  
  inline def apply(AwsAccountId: AwsAccountId, IdentityStore: IdentityStore, Namespace: Namespace): CreateNamespaceRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], IdentityStore = IdentityStore.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNamespaceRequest]
  }
  
  extension [Self <: CreateNamespaceRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setIdentityStore(value: IdentityStore): Self = StObject.set(x, "IdentityStore", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
