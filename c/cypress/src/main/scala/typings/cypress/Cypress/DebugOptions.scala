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
  
  extension [Self <: DebugOptions](x: Self) {
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
