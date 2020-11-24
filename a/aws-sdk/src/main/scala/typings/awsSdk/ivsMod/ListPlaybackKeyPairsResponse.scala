package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlaybackKeyPairsResponse extends js.Object {
  
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
  implicit class ListPlaybackKeyPairsResponseOps[Self <: ListPlaybackKeyPairsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setKeyPairsVarargs(value: PlaybackKeyPairSummary*): Self = this.set("keyPairs", js.Array(value :_*))
    
    @scala.inline
    def setKeyPairs(value: PlaybackKeyPairList): Self = this.set("keyPairs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
