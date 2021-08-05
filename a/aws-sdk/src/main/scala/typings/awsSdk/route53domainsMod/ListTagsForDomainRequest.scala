package typings.awsSdk.route53domainsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTagsForDomainRequest extends StObject {
  
  /**
    * The domain for which you want to get a list of tags.
    */
  var DomainName: typings.awsSdk.route53domainsMod.DomainName
}
object ListTagsForDomainRequest {
  
  inline def apply(DomainName: DomainName): ListTagsForDomainRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTagsForDomainRequest]
  }
  
  extension [Self <: ListTagsForDomainRequest](x: Self) {
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "DomainName", value.asInstanceOf[js.Any])
  }
}
