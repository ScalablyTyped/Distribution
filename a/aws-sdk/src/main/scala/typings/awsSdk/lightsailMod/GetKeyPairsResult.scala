package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetKeyPairsResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about the key pairs.
    */
  var keyPairs: js.UndefOr[KeyPairList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetKeyPairs request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetKeyPairsResult {
  
  @scala.inline
  def apply(): GetKeyPairsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetKeyPairsResult]
  }
  
  @scala.inline
  implicit class GetKeyPairsResultMutableBuilder[Self <: GetKeyPairsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPairs(value: KeyPairList): Self = StObject.set(x, "keyPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairsUndefined: Self = StObject.set(x, "keyPairs", js.undefined)
    
    @scala.inline
    def setKeyPairsVarargs(value: KeyPair*): Self = StObject.set(x, "keyPairs", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
