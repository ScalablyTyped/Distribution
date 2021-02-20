package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionsRequest extends StObject {
  
  /**
    * The name of the distribution for which to return information. Use the GetDistributions action to get a list of distribution names that you can specify. When omitted, the response includes all of your distributions in the AWS Region where the request is made.
    */
  var distributionName: js.UndefOr[ResourceName] = js.native
  
  /**
    * The token to advance to the next page of results from your request. To get a page token, perform an initial GetDistributions request. If your results are paginated, the response will return a next page token that you can specify as the page token in a subsequent request.
    */
  var pageToken: js.UndefOr[String] = js.native
}
object GetDistributionsRequest {
  
  @scala.inline
  def apply(): GetDistributionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionsRequest]
  }
  
  @scala.inline
  implicit class GetDistributionsRequestMutableBuilder[Self <: GetDistributionsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributionName(value: ResourceName): Self = StObject.set(x, "distributionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionNameUndefined: Self = StObject.set(x, "distributionName", js.undefined)
    
    @scala.inline
    def setPageToken(value: String): Self = StObject.set(x, "pageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "pageToken", js.undefined)
  }
}
