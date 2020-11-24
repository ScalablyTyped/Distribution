package typings.awsSdk.configserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAggregationAuthorizationResponse extends js.Object {
  
  /**
    * Returns an AggregationAuthorization object. 
    */
  var AggregationAuthorization: js.UndefOr[typings.awsSdk.configserviceMod.AggregationAuthorization] = js.native
}
object PutAggregationAuthorizationResponse {
  
  @scala.inline
  def apply(): PutAggregationAuthorizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutAggregationAuthorizationResponse]
  }
  
  @scala.inline
  implicit class PutAggregationAuthorizationResponseOps[Self <: PutAggregationAuthorizationResponse] (val x: Self) extends AnyVal {
    
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
    def setAggregationAuthorization(value: AggregationAuthorization): Self = this.set("AggregationAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAggregationAuthorization: Self = this.set("AggregationAuthorization", js.undefined)
  }
}
