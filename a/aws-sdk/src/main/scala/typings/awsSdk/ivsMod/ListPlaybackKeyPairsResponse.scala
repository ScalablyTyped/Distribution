package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlaybackKeyPairsResponse extends StObject {
  
  /**
    * List of key pairs.
    */
  var keyPairs: PlaybackKeyPairList = js.native
  
  /**
    * If there are more key pairs than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListPlaybackKeyPairsResponse {
  
  @scala.inline
  def apply(keyPairs: PlaybackKeyPairList): ListPlaybackKeyPairsResponse = {
    val __obj = js.Dynamic.literal(keyPairs = keyPairs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPlaybackKeyPairsResponse]
  }
  
  @scala.inline
  implicit class ListPlaybackKeyPairsResponseMutableBuilder[Self <: ListPlaybackKeyPairsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyPairs(value: PlaybackKeyPairList): Self = StObject.set(x, "keyPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairsVarargs(value: PlaybackKeyPairSummary*): Self = StObject.set(x, "keyPairs", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
