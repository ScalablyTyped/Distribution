package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSegmentReferencesRequest extends StObject {
  
  /**
    * The maximum number of results to include in the response. If you omit this, the default of 50 is used.
    */
  var maxResults: js.UndefOr[MaxReferences] = js.undefined
  
  /**
    * The token to use when requesting the next set of results. You received this token from a previous ListSegmentReferences operation.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The ARN of the segment that you want to view information for.
    */
  var segment: SegmentRef
  
  /**
    * Specifies whether to return information about launches or experiments that use this segment.
    */
  var `type`: SegmentReferenceResourceType
}
object ListSegmentReferencesRequest {
  
  inline def apply(segment: SegmentRef, `type`: SegmentReferenceResourceType): ListSegmentReferencesRequest = {
    val __obj = js.Dynamic.literal(segment = segment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSegmentReferencesRequest]
  }
  
  extension [Self <: ListSegmentReferencesRequest](x: Self) {
    
    inline def setMaxResults(value: MaxReferences): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSegment(value: SegmentRef): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setType(value: SegmentReferenceResourceType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
