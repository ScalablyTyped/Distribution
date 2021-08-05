package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePrivateDnsNamespaceRequest extends StObject {
  
  /**
    * A unique string that identifies the request and that allows failed CreatePrivateDnsNamespace requests to be retried without the risk of executing the operation twice. CreatorRequestId can be any unique string, for example, a date/time stamp.
    */
  var CreatorRequestId: js.UndefOr[ResourceId] = js.undefined
  
  /**
    * A description for the namespace.
    */
  var Description: js.UndefOr[ResourceDescription] = js.undefined
  
  /**
    * The name that you want to assign to this namespace. When you create a private DNS namespace, AWS Cloud Map automatically creates an Amazon Route 53 private hosted zone that has the same name as the namespace.
    */
  var Name: NamespaceName
  
  /**
    * The tags to add to the namespace. Each tag consists of a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256 characters.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The ID of the Amazon VPC that you want to associate the namespace with.
    */
  var Vpc: ResourceId
}
object CreatePrivateDnsNamespaceRequest {
  
  inline def apply(Name: NamespaceName, Vpc: ResourceId): CreatePrivateDnsNamespaceRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Vpc = Vpc.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePrivateDnsNamespaceRequest]
  }
  
  extension [Self <: CreatePrivateDnsNamespaceRequest](x: Self) {
    
    inline def setCreatorRequestId(value: ResourceId): Self = StObject.set(x, "CreatorRequestId", value.asInstanceOf[js.Any])
    
    inline def setCreatorRequestIdUndefined: Self = StObject.set(x, "CreatorRequestId", js.undefined)
    
    inline def setDescription(value: ResourceDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: NamespaceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
    
    inline def setVpc(value: ResourceId): Self = StObject.set(x, "Vpc", value.asInstanceOf[js.Any])
  }
}
