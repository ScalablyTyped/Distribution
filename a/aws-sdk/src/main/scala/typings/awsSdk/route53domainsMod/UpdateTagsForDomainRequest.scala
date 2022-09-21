package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateTagsForDomainRequest extends StObject {
  
  /**
    * The domain for which you want to add or update tags.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName
  
  /**
    * A list of the tag keys and values that you want to add or update. If you specify a key that already exists, the corresponding value will be replaced.
    */
  var TagsToUpdate: js.UndefOr[TagList] = js.undefined
}
object UpdateTagsForDomainRequest {
  
  inline def apply(DomainName: DomainName): UpdateTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTagsForDomainRequest]
  }
  
  extension [Self <: UpdateTagsForDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
    
    inline def setTagsToUpdate(value: TagList): Self = StObject.set(x, "TagsToUpdate", value.asInstanceOf[js.Any])
    
    inline def setTagsToUpdateUndefined: Self = StObject.set(x, "TagsToUpdate", js.undefined)
    
    inline def setTagsToUpdateVarargs(value: Tag*): Self = StObject.set(x, "TagsToUpdate", js.Array(value*))
  }
}
