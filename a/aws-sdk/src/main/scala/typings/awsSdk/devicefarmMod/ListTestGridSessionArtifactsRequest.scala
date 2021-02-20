package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestGridSessionArtifactsRequest extends StObject {
  
  /**
    * The maximum number of results to be returned by a request.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.native
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The ARN of a TestGridSession. 
    */
  var sessionArn: DeviceFarmArn = js.native
  
  /**
    * Limit results to a specified type of artifact.
    */
  var `type`: js.UndefOr[TestGridSessionArtifactCategory] = js.native
}
object ListTestGridSessionArtifactsRequest {
  
  @scala.inline
  def apply(sessionArn: DeviceFarmArn): ListTestGridSessionArtifactsRequest = {
    val __obj = js.Dynamic.literal(sessionArn = sessionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionArtifactsRequest]
  }
  
  @scala.inline
  implicit class ListTestGridSessionArtifactsRequestMutableBuilder[Self <: ListTestGridSessionArtifactsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResult(value: MaxPageSize): Self = StObject.set(x, "maxResult", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultUndefined: Self = StObject.set(x, "maxResult", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    @scala.inline
    def setSessionArn(value: DeviceFarmArn): Self = StObject.set(x, "sessionArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: TestGridSessionArtifactCategory): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
