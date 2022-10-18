package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesForWebACLResponse extends StObject {
  
  /**
    * An array of ARNs (Amazon Resource Names) of the resources associated with the specified web ACL. An array with zero elements is returned if there are no resources associated with the web ACL.
    */
  var ResourceArns: js.UndefOr[typings.awsSdk.clientsWafregionalMod.ResourceArns] = js.undefined
}
object ListResourcesForWebACLResponse {
  
  inline def apply(): ListResourcesForWebACLResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesForWebACLResponse]
  }
  
  extension [Self <: ListResourcesForWebACLResponse](x: Self) {
    
    inline def setResourceArns(value: ResourceArns): Self = StObject.set(x, "ResourceArns", value.asInstanceOf[js.Any])
    
    inline def setResourceArnsUndefined: Self = StObject.set(x, "ResourceArns", js.undefined)
    
    inline def setResourceArnsVarargs(value: ResourceArn*): Self = StObject.set(x, "ResourceArns", js.Array(value*))
  }
}
