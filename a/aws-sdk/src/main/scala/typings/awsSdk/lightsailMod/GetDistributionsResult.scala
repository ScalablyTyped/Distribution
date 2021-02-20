package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDistributionsResult extends StObject {
  
  /**
    * An array of objects that describe your distributions.
    */
  var distributions: js.UndefOr[DistributionList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDistributions request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetDistributionsResult {
  
  @scala.inline
  def apply(): GetDistributionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionsResult]
  }
  
  @scala.inline
  implicit class GetDistributionsResultMutableBuilder[Self <: GetDistributionsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDistributions(value: DistributionList): Self = StObject.set(x, "distributions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributionsUndefined: Self = StObject.set(x, "distributions", js.undefined)
    
    @scala.inline
    def setDistributionsVarargs(value: LightsailDistribution*): Self = StObject.set(x, "distributions", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
