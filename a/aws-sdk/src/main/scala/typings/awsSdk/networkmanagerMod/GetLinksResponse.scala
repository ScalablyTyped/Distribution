package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetLinksResponse extends StObject {
  
  /**
    * The links.
    */
  var Links: js.UndefOr[LinkList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object GetLinksResponse {
  
  @scala.inline
  def apply(): GetLinksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetLinksResponse]
  }
  
  @scala.inline
  implicit class GetLinksResponseMutableBuilder[Self <: GetLinksResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLinks(value: LinkList): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "Links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: Link*): Self = StObject.set(x, "Links", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
