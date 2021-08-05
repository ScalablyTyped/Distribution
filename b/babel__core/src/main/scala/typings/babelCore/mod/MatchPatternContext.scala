package typings.babelCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MatchPatternContext extends StObject {
  
  var caller: js.UndefOr[TransformCaller] = js.undefined
  
  var dirname: String
  
  var envName: String
}
object MatchPatternContext {
  
  inline def apply(dirname: String, envName: String): MatchPatternContext = {
    val __obj = js.Dynamic.literal(dirname = dirname.asInstanceOf[js.Any], envName = envName.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchPatternContext]
  }
  
  extension [Self <: MatchPatternContext](x: Self) {
    
    inline def setCaller(value: TransformCaller): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
    
    inline def setCallerUndefined: Self = StObject.set(x, "caller", js.undefined)
    
    inline def setDirname(value: String): Self = StObject.set(x, "dirname", value.asInstanceOf[js.Any])
    
    inline def setEnvName(value: String): Self = StObject.set(x, "envName", value.asInstanceOf[js.Any])
  }
}
