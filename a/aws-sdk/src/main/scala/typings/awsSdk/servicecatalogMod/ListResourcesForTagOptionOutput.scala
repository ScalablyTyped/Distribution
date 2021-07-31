package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListResourcesForTagOptionOutput extends StObject {
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.undefined
  
  /**
    * Information about the resources.
    */
  var ResourceDetails: js.UndefOr[typings.awsSdk.servicecatalogMod.ResourceDetails] = js.undefined
}
object ListResourcesForTagOptionOutput {
  
  @scala.inline
  def apply(): ListResourcesForTagOptionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListResourcesForTagOptionOutput]
  }
  
  @scala.inline
  implicit class ListResourcesForTagOptionOutputMutableBuilder[Self <: ListResourcesForTagOptionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    @scala.inline
    def setResourceDetails(value: ResourceDetails): Self = StObject.set(x, "ResourceDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceDetailsUndefined: Self = StObject.set(x, "ResourceDetails", js.undefined)
    
    @scala.inline
    def setResourceDetailsVarargs(value: ResourceDetail*): Self = StObject.set(x, "ResourceDetails", js.Array(value :_*))
  }
}
