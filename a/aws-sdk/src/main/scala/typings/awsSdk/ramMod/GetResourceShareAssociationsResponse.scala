package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResourceShareAssociationsResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the associations.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
}
object GetResourceShareAssociationsResponse {
  
  @scala.inline
  def apply(): GetResourceShareAssociationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResourceShareAssociationsResponse]
  }
  
  @scala.inline
  implicit class GetResourceShareAssociationsResponseMutableBuilder[Self <: GetResourceShareAssociationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceShareAssociations(value: ResourceShareAssociationList): Self = StObject.set(x, "resourceShareAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareAssociationsUndefined: Self = StObject.set(x, "resourceShareAssociations", js.undefined)
    
    @scala.inline
    def setResourceShareAssociationsVarargs(value: ResourceShareAssociation*): Self = StObject.set(x, "resourceShareAssociations", js.Array(value :_*))
  }
}
