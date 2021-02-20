package typings.awsSdk.codestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListResourcesResult extends StObject {
  
  /**
    * The continuation token to use when requesting the next set of results, if there are more results to be returned.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * An array of resources associated with the project. 
    */
  var resources: js.UndefOr[ResourcesResult] = js.native
}
object ListResourcesResult {
  
  @scala.inline
  def apply(): ListResourcesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesResult]
  }
  
  @scala.inline
  implicit class ListResourcesResultMutableBuilder[Self <: ListResourcesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setResources(value: ResourcesResult): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    @scala.inline
    def setResourcesVarargs(value: Resource*): Self = StObject.set(x, "resources", js.Array(value :_*))
  }
}
