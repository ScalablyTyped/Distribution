package typings.awsSdk.rolesanywhereMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTrustAnchorsResponse extends StObject {
  
  /**
    * A token that indicates where the output should continue from, if a previous operation did not show all results. To get the next results, call the operation again with this value.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * A list of trust anchors.
    */
  var trustAnchors: js.UndefOr[TrustAnchorDetails] = js.undefined
}
object ListTrustAnchorsResponse {
  
  inline def apply(): ListTrustAnchorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrustAnchorsResponse]
  }
  
  extension [Self <: ListTrustAnchorsResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setTrustAnchors(value: TrustAnchorDetails): Self = StObject.set(x, "trustAnchors", value.asInstanceOf[js.Any])
    
    inline def setTrustAnchorsUndefined: Self = StObject.set(x, "trustAnchors", js.undefined)
    
    inline def setTrustAnchorsVarargs(value: TrustAnchorDetail*): Self = StObject.set(x, "trustAnchors", js.Array(value*))
  }
}
