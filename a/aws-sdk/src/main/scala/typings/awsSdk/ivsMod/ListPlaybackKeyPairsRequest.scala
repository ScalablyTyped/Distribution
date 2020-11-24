package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListPlaybackKeyPairsRequest extends js.Object {
  
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
  implicit class ListPlaybackKeyPairsRequestOps[Self <: ListPlaybackKeyPairsRequest] (val x: Self) extends AnyVal {
    
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
    def setMaxResults(value: MaxPlaybackKeyPairResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
