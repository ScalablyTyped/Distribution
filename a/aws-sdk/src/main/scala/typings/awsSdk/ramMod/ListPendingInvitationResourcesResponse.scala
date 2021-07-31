package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPendingInvitationResourcesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the resources included the resource share.
    */
  var resources: js.UndefOr[ResourceList] = js.undefined
}
object ListPendingInvitationResourcesResponse {
  
  @scala.inline
  def apply(): ListPendingInvitationResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListPendingInvitationResourcesResponse]
  }
  
  @scala.inline
  implicit class ListPendingInvitationResourcesResponseMutableBuilder[Self <: ListPendingInvitationResourcesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResources(value: ResourceList): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
