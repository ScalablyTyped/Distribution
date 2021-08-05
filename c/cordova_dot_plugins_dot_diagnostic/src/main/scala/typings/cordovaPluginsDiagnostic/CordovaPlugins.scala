package typings.cordovaPluginsDiagnostic

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  var diagnostic: Diagnostic
}
object CordovaPlugins {
  
  inline def apply(diagnostic: Diagnostic): CordovaPlugins = {
    val __obj = js.Dynamic.literal(diagnostic = diagnostic.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  extension [Self <: CordovaPlugins](x: Self) {
    
    inline def setDiagnostic(value: Diagnostic): Self = StObject.set(x, "diagnostic", value.asInstanceOf[js.Any])
  }
}
