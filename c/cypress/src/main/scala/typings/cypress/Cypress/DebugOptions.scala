package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DebugOptions extends StObject {
  
  var verbose: Boolean
}
object DebugOptions {
  
  inline def apply(verbose: Boolean): DebugOptions = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DebugOptions] (val x: Self) extends AnyVal {
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
