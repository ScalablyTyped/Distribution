package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTagsForDomainRequest extends StObject {
  
  /**
    * The domain for which you want to delete one or more tags.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName
  
  /**
    * A list of tag keys to delete.
    */
  var TagsToDelete: TagKeyList
}
object DeleteTagsForDomainRequest {
  
  inline def apply(DomainName: DomainName, TagsToDelete: TagKeyList): DeleteTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any], TagsToDelete = TagsToDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTagsForDomainRequest]
  }
  
  extension [Self <: DeleteTagsForDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setTagsToDelete(value: TagKeyList): Self = StObject.set(x, "TagsToDelete", value.asInstanceOf[js.Any])
    
    inline def setTagsToDeleteVarargs(value: TagKey*): Self = StObject.set(x, "TagsToDelete", js.Array(value :_*))
  }
}
