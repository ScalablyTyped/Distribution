package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryLineageRequest extends StObject {
  
  /**
    * Associations between lineage entities have a direction. This parameter determines the direction from the StartArn(s) that the query traverses.
    */
  var Direction: js.UndefOr[typings.awsSdk.sagemakerMod.Direction] = js.undefined
  
  /**
    * A set of filtering parameters that allow you to specify which entities should be returned.   Properties - Key-value pairs to match on the lineage entities' properties.   LineageTypes - A set of lineage entity types to match on. For example: TrialComponent, Artifact, or Context.   CreatedBefore - Filter entities created before this date.   ModifiedBefore - Filter entities modified before this date.   ModifiedAfter - Filter entities modified after this date.  
    */
  var Filters: js.UndefOr[QueryFilters] = js.undefined
  
  /**
    *  Setting this value to True retrieves not only the entities of interest but also the Associations and lineage entities on the path. Set to False to only return lineage entities that match your query.
    */
  var IncludeEdges: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The maximum depth in lineage relationships from the StartArns that are traversed. Depth is a measure of the number of Associations from the StartArn entity to the matched results.
    */
  var MaxDepth: js.UndefOr[QueryLineageMaxDepth] = js.undefined
  
  /**
    * Limits the number of vertices in the results. Use the NextToken in a response to to retrieve the next page of results.
    */
  var MaxResults: js.UndefOr[QueryLineageMaxResults] = js.undefined
  
  /**
    * Limits the number of vertices in the request. Use the NextToken in a response to to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String8192] = js.undefined
  
  /**
    * A list of resource Amazon Resource Name (ARN) that represent the starting point for your lineage query.
    */
  var StartArns: js.UndefOr[QueryLineageStartArns] = js.undefined
}
object QueryLineageRequest {
  
  inline def apply(): QueryLineageRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryLineageRequest]
  }
  
  extension [Self <: QueryLineageRequest](x: Self) {
    
    inline def setDirection(value: Direction): Self = StObject.set(x, "Direction", value.asInstanceOf[js.Any])
    
    inline def setDirectionUndefined: Self = StObject.set(x, "Direction", js.undefined)
    
    inline def setFilters(value: QueryFilters): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setIncludeEdges(value: Boolean): Self = StObject.set(x, "IncludeEdges", value.asInstanceOf[js.Any])
    
    inline def setIncludeEdgesUndefined: Self = StObject.set(x, "IncludeEdges", js.undefined)
    
    inline def setMaxDepth(value: QueryLineageMaxDepth): Self = StObject.set(x, "MaxDepth", value.asInstanceOf[js.Any])
    
    inline def setMaxDepthUndefined: Self = StObject.set(x, "MaxDepth", js.undefined)
    
    inline def setMaxResults(value: QueryLineageMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String8192): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStartArns(value: QueryLineageStartArns): Self = StObject.set(x, "StartArns", value.asInstanceOf[js.Any])
    
    inline def setStartArnsUndefined: Self = StObject.set(x, "StartArns", js.undefined)
    
    inline def setStartArnsVarargs(value: AssociationEntityArn*): Self = StObject.set(x, "StartArns", js.Array(value*))
  }
}
