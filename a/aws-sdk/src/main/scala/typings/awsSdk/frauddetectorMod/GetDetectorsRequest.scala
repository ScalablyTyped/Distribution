package typings.awsSdk.frauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDetectorsRequest extends StObject {
  
  /**
    * The detector ID.
    */
  var detectorId: js.UndefOr[identifier] = js.native
  
  /**
    * The maximum number of objects to return for the request.
    */
  var maxResults: js.UndefOr[DetectorsMaxResults] = js.native
  
  /**
    * The next token for the subsequent request.
    */
  var nextToken: js.UndefOr[String] = js.native
}
object GetDetectorsRequest {
  
  @scala.inline
  def apply(): GetDetectorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDetectorsRequest]
  }
  
  @scala.inline
  implicit class GetDetectorsRequestMutableBuilder[Self <: GetDetectorsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDetectorId(value: identifier): Self = StObject.set(x, "detectorId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetectorIdUndefined: Self = StObject.set(x, "detectorId", js.undefined)
    
    @scala.inline
    def setMaxResults(value: DetectorsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
