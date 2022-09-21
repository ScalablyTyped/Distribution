package typings.awsSdk.cloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPublicKeysResponse extends StObject {
  
  /**
    * Reserved for future use.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Contains an array of PublicKey objects.  The returned public keys may have validity time ranges that overlap. 
    */
  var PublicKeyList: js.UndefOr[typings.awsSdk.cloudtrailMod.PublicKeyList] = js.undefined
}
object ListPublicKeysResponse {
  
  inline def apply(): ListPublicKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPublicKeysResponse]
  }
  
  extension [Self <: ListPublicKeysResponse](x: Self) {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPublicKeyList(value: PublicKeyList): Self = StObject.set(x, "PublicKeyList", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyListUndefined: Self = StObject.set(x, "PublicKeyList", js.undefined)
    
    inline def setPublicKeyListVarargs(value: PublicKey*): Self = StObject.set(x, "PublicKeyList", js.Array(value*))
  }
}
