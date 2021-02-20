package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListTestGridSessionArtifactsResult extends StObject {
  
  /**
    * A list of test grid session artifacts for a TestGridSession.
    */
  var artifacts: js.UndefOr[TestGridSessionArtifacts] = js.native
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}
object ListTestGridSessionArtifactsResult {
  
  @scala.inline
  def apply(): ListTestGridSessionArtifactsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListTestGridSessionArtifactsResult]
  }
  
  @scala.inline
  implicit class ListTestGridSessionArtifactsResultMutableBuilder[Self <: ListTestGridSessionArtifactsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: TestGridSessionArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    @scala.inline
    def setArtifactsVarargs(value: TestGridSessionArtifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
