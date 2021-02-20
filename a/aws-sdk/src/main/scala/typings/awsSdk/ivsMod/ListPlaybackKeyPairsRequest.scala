package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlaybackKeyPairsRequest extends StObject {
  
  /**
    * The first key pair to retrieve. This is used for pagination; see the nextToken response field.
    */
  var maxResults: js.UndefOr[MaxPlaybackKeyPairResults] = js.native
  
  /**
    * Maximum number of key pairs to return.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListPlaybackKeyPairsRequest {
  
  @scala.inline
  def apply(): ListPlaybackKeyPairsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPlaybackKeyPairsRequest]
  }
  
  @scala.inline
  implicit class ListPlaybackKeyPairsRequestMutableBuilder[Self <: ListPlaybackKeyPairsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxPlaybackKeyPairResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
