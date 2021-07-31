package typings.awsSdk.ivsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStreamsRequest extends StObject {
  
  /**
    * Maximum number of streams to return.
    */
  var maxResults: js.UndefOr[MaxStreamResults] = js.undefined
  
  /**
    * The first stream to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListStreamsRequest {
  
  @scala.inline
  def apply(): ListStreamsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamsRequest]
  }
  
  @scala.inline
  implicit class ListStreamsRequestMutableBuilder[Self <: ListStreamsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxStreamResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
