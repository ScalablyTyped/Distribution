package typings.awsSdk.datapipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryObjectsInput extends StObject {
  
  /**
    * The maximum number of object names that QueryObjects will return in a single call. The default value is 100. 
    */
  var limit: js.UndefOr[int] = js.undefined
  
  /**
    * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call QueryObjects with the marker value from the previous call to retrieve the next set of results.
    */
  var marker: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id
  
  /**
    * The query that defines the objects to be returned. The Query object can contain a maximum of ten selectors. The conditions in the query are limited to top-level String fields in the object. These filters can be applied to components, instances, and attempts.
    */
  var query: js.UndefOr[Query] = js.undefined
  
  /**
    * Indicates whether the query applies to components or instances. The possible values are: COMPONENT, INSTANCE, and ATTEMPT.
    */
  var sphere: String
}
object QueryObjectsInput {
  
  @scala.inline
  def apply(pipelineId: id, sphere: String): QueryObjectsInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any], sphere = sphere.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsInput]
  }
  
  @scala.inline
  implicit class QueryObjectsInputMutableBuilder[Self <: QueryObjectsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: int): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setMarker(value: String): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
    
    @scala.inline
    def setPipelineId(value: id): Self = StObject.set(x, "pipelineId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Query): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSphere(value: String): Self = StObject.set(x, "sphere", value.asInstanceOf[js.Any])
  }
}
