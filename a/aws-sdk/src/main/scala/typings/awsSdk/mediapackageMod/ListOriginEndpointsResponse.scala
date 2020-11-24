package typings.awsSdk.mediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListOriginEndpointsResponse extends js.Object {
  
  /**
    * A token that can be used to resume pagination from the end of the collection.
    */
  var NextToken: js.UndefOr[string] = js.native
  
  /**
    * A list of OriginEndpoint records.
    */
  var OriginEndpoints: js.UndefOr[listOfOriginEndpoint] = js.native
}
object ListOriginEndpointsResponse {
  
  @scala.inline
  def apply(): ListOriginEndpointsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOriginEndpointsResponse]
  }
  
  @scala.inline
  implicit class ListOriginEndpointsResponseOps[Self <: ListOriginEndpointsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: string): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setOriginEndpointsVarargs(value: OriginEndpoint*): Self = this.set("OriginEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setOriginEndpoints(value: listOfOriginEndpoint): Self = this.set("OriginEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOriginEndpoints: Self = this.set("OriginEndpoints", js.undefined)
  }
}
