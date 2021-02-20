package typings.awsSdk.configserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutAggregationAuthorizationResponse extends StObject {
  
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
  implicit class PutAggregationAuthorizationResponseMutableBuilder[Self <: PutAggregationAuthorizationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAggregationAuthorization(value: AggregationAuthorization): Self = StObject.set(x, "AggregationAuthorization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAggregationAuthorizationUndefined: Self = StObject.set(x, "AggregationAuthorization", js.undefined)
  }
}
