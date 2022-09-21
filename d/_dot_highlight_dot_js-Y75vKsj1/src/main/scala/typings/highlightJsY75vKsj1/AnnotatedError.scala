package typings.highlightJsY75vKsj1

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/************
  PRIVATE API
  ************/
/* for jsdoc annotations in the JS source files */
trait AnnotatedError
  extends StObject
     with Error {
  
  var badRule: js.UndefOr[Mode] = js.undefined
  
  var languageName: js.UndefOr[String] = js.undefined
  
  var mode: js.UndefOr[Mode | Language] = js.undefined
}
object AnnotatedError {
  
  inline def apply(message: String, name: String): AnnotatedError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnotatedError]
  }
  
  extension [Self <: AnnotatedError](x: Self) {
    
    inline def setBadRule(value: Mode): Self = StObject.set(x, "badRule", value.asInstanceOf[js.Any])
    
    inline def setBadRuleUndefined: Self = StObject.set(x, "badRule", js.undefined)
    
    inline def setLanguageName(value: String): Self = StObject.set(x, "languageName", value.asInstanceOf[js.Any])
    
    inline def setLanguageNameUndefined: Self = StObject.set(x, "languageName", js.undefined)
    
    inline def setMode(value: Mode | Language): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
