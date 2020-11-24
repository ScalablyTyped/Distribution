package typings.awsSdk.ivsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamKeysResponse extends js.Object {
  
  /**
    * If there are more stream keys than maxResults, use nextToken in the request to get the next set.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * List of stream keys.
    */
  var streamKeys: StreamKeyList = js.native
}
object ListStreamKeysResponse {
  
  @scala.inline
  def apply(streamKeys: StreamKeyList): ListStreamKeysResponse = {
    val __obj = js.Dynamic.literal(streamKeys = streamKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStreamKeysResponse]
  }
  
  @scala.inline
  implicit class ListStreamKeysResponseOps[Self <: ListStreamKeysResponse] (val x: Self) extends AnyVal {
    
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
    def setStreamKeysVarargs(value: StreamKeySummary*): Self = this.set("streamKeys", js.Array(value :_*))
    
    @scala.inline
    def setStreamKeys(value: StreamKeyList): Self = this.set("streamKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
}
