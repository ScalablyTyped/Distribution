package typings.terserMCwkxx7L.mod

import typings.sourceMap.mod.RawSourceMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MinifyOutput extends StObject {
  
  var ast: js.UndefOr[ASTNode] = js.undefined
  
  var code: js.UndefOr[String] = js.undefined
  
  var error: js.UndefOr[js.Error] = js.undefined
  
  var map: js.UndefOr[RawSourceMap | String] = js.undefined
  
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object MinifyOutput {
  
  inline def apply(): MinifyOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MinifyOutput]
  }
  
  extension [Self <: MinifyOutput](x: Self) {
    
    inline def setAst(value: ASTNode): Self = StObject.set(x, "ast", value.asInstanceOf[js.Any])
    
    inline def setAstUndefined: Self = StObject.set(x, "ast", js.undefined)
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMap(value: RawSourceMap | String): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
    
    inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
