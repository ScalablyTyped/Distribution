package typings.awsSdk.rekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListStreamProcessorsRequest extends StObject {
  
  /**
    * Maximum number of stream processors you want Amazon Rekognition Video to return in the response. The default is 1000. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.rekognitionMod.MaxResults] = js.native
  
  /**
    * If the previous response was incomplete (because there are more stream processors to retrieve), Amazon Rekognition Video returns a pagination token in the response. You can use this pagination token to retrieve the next set of stream processors. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object ListStreamProcessorsRequest {
  
  @scala.inline
  def apply(): ListStreamProcessorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStreamProcessorsRequest]
  }
  
  @scala.inline
  implicit class ListStreamProcessorsRequestMutableBuilder[Self <: ListStreamProcessorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
