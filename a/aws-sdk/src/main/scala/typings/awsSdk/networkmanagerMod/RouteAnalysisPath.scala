package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteAnalysisPath extends StObject {
  
  /**
    * The status of the analysis at completion.
    */
  var CompletionStatus: js.UndefOr[RouteAnalysisCompletion] = js.undefined
  
  /**
    * The route analysis path.
    */
  var Path: js.UndefOr[PathComponentList] = js.undefined
}
object RouteAnalysisPath {
  
  inline def apply(): RouteAnalysisPath = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteAnalysisPath]
  }
  
  extension [Self <: RouteAnalysisPath](x: Self) {
    
    inline def setCompletionStatus(value: RouteAnalysisCompletion): Self = StObject.set(x, "CompletionStatus", value.asInstanceOf[js.Any])
    
    inline def setCompletionStatusUndefined: Self = StObject.set(x, "CompletionStatus", js.undefined)
    
    inline def setPath(value: PathComponentList): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
    
    inline def setPathVarargs(value: PathComponent*): Self = StObject.set(x, "Path", js.Array(value*))
  }
}
