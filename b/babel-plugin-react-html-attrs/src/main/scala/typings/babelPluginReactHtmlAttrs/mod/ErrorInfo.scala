package typings.babelPluginReactHtmlAttrs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
// Error Interfaces
// ----------------------------------------------------------------------
trait ErrorInfo extends StObject {
  
  /**
    * Captures which component contained the exception, and its ancestors.
    */
  var componentStack: String
}
object ErrorInfo {
  
  inline def apply(componentStack: String): ErrorInfo = {
    val __obj = js.Dynamic.literal(componentStack = componentStack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorInfo]
  }
  
  extension [Self <: ErrorInfo](x: Self) {
    
    inline def setComponentStack(value: String): Self = StObject.set(x, "componentStack", value.asInstanceOf[js.Any])
  }
}
