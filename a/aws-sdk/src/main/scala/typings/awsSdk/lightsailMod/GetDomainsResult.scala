package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDomainsResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about each of the domain entries in the user's account.
    */
  var domains: js.UndefOr[DomainList] = js.native
  
  /**
    * The token to advance to the next page of results from your request. A next page token is not returned if there are no more results to display. To get the next page of results, perform another GetDomains request and specify the next page token using the pageToken parameter.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}
object GetDomainsResult {
  
  @scala.inline
  def apply(): GetDomainsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDomainsResult]
  }
  
  @scala.inline
  implicit class GetDomainsResultMutableBuilder[Self <: GetDomainsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomains(value: DomainList): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
    
    @scala.inline
    def setDomainsVarargs(value: Domain*): Self = StObject.set(x, "domains", js.Array(value :_*))
    
    @scala.inline
    def setNextPageToken(value: String): Self = StObject.set(x, "nextPageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextPageTokenUndefined: Self = StObject.set(x, "nextPageToken", js.undefined)
  }
}
