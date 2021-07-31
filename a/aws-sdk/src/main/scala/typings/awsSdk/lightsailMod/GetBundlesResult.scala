package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBundlesResult extends StObject {
  
  /**
    * An array of key-value pairs that contains information about the available bundles.
    */
  var bundles: js.UndefOr[BundleList] = js.undefined
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetBundles request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.undefined
}
object GetBundlesResult {
  
  @scala.inline
  def apply(): GetBundlesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBundlesResult]
  }
  
  @scala.inline
  implicit class GetBundlesResultMutableBuilder[Self <: GetBundlesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBundles(value: BundleList): Self = StObject.set(x, "bundles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBundlesUndefined: Self = StObject.set(x, "bundles", js.undefined)
    
    @scala.inline
    def setBundlesVarargs(value: Bundle*): Self = StObject.set(x, "bundles", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
