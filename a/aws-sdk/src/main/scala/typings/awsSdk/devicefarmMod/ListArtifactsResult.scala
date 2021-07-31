package typings.awsSdk.devicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListArtifactsResult extends StObject {
  
  /**
    * Information about the artifacts.
    */
  var artifacts: js.UndefOr[Artifacts] = js.undefined
  
  /**
    * If the number of items that are returned is significantly large, this is an identifier that is also returned. It can be used in a subsequent call to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListArtifactsResult {
  
  @scala.inline
  def apply(): ListArtifactsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListArtifactsResult]
  }
  
  @scala.inline
  implicit class ListArtifactsResultMutableBuilder[Self <: ListArtifactsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifacts(value: Artifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    @scala.inline
    def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
