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
  
  inline def apply(): ListArtifactsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListArtifactsResult]
  }
  
  extension [Self <: ListArtifactsResult](x: Self) {
    
    inline def setArtifacts(value: Artifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setArtifactsVarargs(value: Artifact*): Self = StObject.set(x, "artifacts", js.Array(value :_*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
