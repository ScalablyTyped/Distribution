package typings.awsSdk.cloudtrailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTrailsResponse extends js.Object {
  
  /**
    * The token to use to get the next page of results after a previous API call. If the token does not appear, there are no more results to return. The token must be passed in with the same parameters as the previous call. For example, if the original call specified an AttributeKey of 'Username' with a value of 'root', the call with NextToken should include those same parameters.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * Returns the name, ARN, and home region of trails in the current account.
    */
  var Trails: js.UndefOr[typings.awsSdk.cloudtrailMod.Trails] = js.native
}
object ListTrailsResponse {
  
  @scala.inline
  def apply(): ListTrailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTrailsResponse]
  }
  
  @scala.inline
  implicit class ListTrailsResponseOps[Self <: ListTrailsResponse] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setTrailsVarargs(value: TrailInfo*): Self = this.set("Trails", js.Array(value :_*))
    
    @scala.inline
    def setTrails(value: Trails): Self = this.set("Trails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrails: Self = this.set("Trails", js.undefined)
  }
}
