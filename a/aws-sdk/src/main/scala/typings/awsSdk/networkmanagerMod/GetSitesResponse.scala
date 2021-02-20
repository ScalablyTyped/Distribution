package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSitesResponse extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
  
  /**
    * The sites.
    */
  var Sites: js.UndefOr[SiteList] = js.native
}
object GetSitesResponse {
  
  @scala.inline
  def apply(): GetSitesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSitesResponse]
  }
  
  @scala.inline
  implicit class GetSitesResponseMutableBuilder[Self <: GetSitesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setSites(value: SiteList): Self = StObject.set(x, "Sites", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSitesUndefined: Self = StObject.set(x, "Sites", js.undefined)
    
    @scala.inline
    def setSitesVarargs(value: Site*): Self = StObject.set(x, "Sites", js.Array(value :_*))
  }
}
