package typings.awsSdk.workdocsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeCommentsResponse extends StObject {
  
  /**
    * The list of comments for the specified document version.
    */
  var Comments: js.UndefOr[CommentList] = js.native
  
  /**
    * The marker for the next set of results. This marker was received from a previous call.
    */
  var Marker: js.UndefOr[MarkerType] = js.native
}
object DescribeCommentsResponse {
  
  @scala.inline
  def apply(): DescribeCommentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCommentsResponse]
  }
  
  @scala.inline
  implicit class DescribeCommentsResponseMutableBuilder[Self <: DescribeCommentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComments(value: CommentList): Self = StObject.set(x, "Comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentsUndefined: Self = StObject.set(x, "Comments", js.undefined)
    
    @scala.inline
    def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "Comments", js.Array(value :_*))
    
    @scala.inline
    def setMarker(value: MarkerType): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
  }
}
