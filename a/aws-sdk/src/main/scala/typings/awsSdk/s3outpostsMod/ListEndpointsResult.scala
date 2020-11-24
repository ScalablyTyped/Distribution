package typings.awsSdk.s3outpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListEndpointsResult extends js.Object {
  
  /**
    * Returns an array of endpoints associated with AWS Outpost.
    */
  var Endpoints: js.UndefOr[typings.awsSdk.s3outpostsMod.Endpoints] = js.native
  
  /**
    * The next endpoint returned in the list.
    */
  var NextToken: js.UndefOr[typings.awsSdk.s3outpostsMod.NextToken] = js.native
}
object ListEndpointsResult {
  
  @scala.inline
  def apply(): ListEndpointsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListEndpointsResult]
  }
  
  @scala.inline
  implicit class ListEndpointsResultOps[Self <: ListEndpointsResult] (val x: Self) extends AnyVal {
    
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
    def setEndpointsVarargs(value: Endpoint*): Self = this.set("Endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: Endpoints): Self = this.set("Endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpoints: Self = this.set("Endpoints", js.undefined)
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
}
