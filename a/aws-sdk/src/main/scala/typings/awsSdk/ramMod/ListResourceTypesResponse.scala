package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourceTypesResponse extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.native
  
  /**
    * The shareable resource types supported by AWS RAM.
    */
  var resourceTypes: js.UndefOr[ServiceNameAndResourceTypeList] = js.native
}
object ListResourceTypesResponse {
  
  @scala.inline
  def apply(): ListResourceTypesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourceTypesResponse]
  }
  
  @scala.inline
  implicit class ListResourceTypesResponseMutableBuilder[Self <: ListResourceTypesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResourceTypes(value: ServiceNameAndResourceTypeList): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
    
    @scala.inline
    def setResourceTypesVarargs(value: ServiceNameAndResourceType*): Self = StObject.set(x, "resourceTypes", js.Array(value :_*))
  }
}
