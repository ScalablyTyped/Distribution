package typings.awsSdk.clientsWorkdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCommentsResponse extends StObject {
  
  /**
    * The list of comments for the specified document version.
    */
  var Comments: js.UndefOr[CommentList] = js.undefined
  
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[MarkerType] = js.undefined
}
object DescribeCommentsResponse {
  
  inline def apply(): DescribeCommentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommentsResponse]
  }
  
  extension [Self <: DescribeCommentsResponse](x: Self) {
    
    inline def setComments(value: CommentList): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    inline def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
    
    inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "Comments", js.Array(value*))
    
    inline def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
