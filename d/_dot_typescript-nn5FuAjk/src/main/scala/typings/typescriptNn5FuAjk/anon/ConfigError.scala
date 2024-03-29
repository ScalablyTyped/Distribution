package typings.typescriptNn5FuAjk.anon

import typings.typescriptNn5FuAjk.ts.Diagnostic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigError extends StObject {
  
  var config: js.UndefOr[Any] = js.undefined
  
  var error: js.UndefOr[Diagnostic] = js.undefined
}
object ConfigError {
  
  inline def apply(): ConfigError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigError]
  }
  
  extension [Self <: ConfigError](x: Self) {
    
    inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
    
    inline def setError(value: Diagnostic): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
