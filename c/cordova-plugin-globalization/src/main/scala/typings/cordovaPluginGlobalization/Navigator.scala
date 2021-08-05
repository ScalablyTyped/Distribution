package typings.cordovaPluginGlobalization

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  /** This plugin obtains information and performs operations specific to the user's locale and timezone. */
  var globalization: Globalization
}
object Navigator {
  
  inline def apply(globalization: Globalization): Navigator = {
    val __obj = js.Dynamic.literal(globalization = globalization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setGlobalization(value: Globalization): Self = StObject.set(x, "globalization", value.asInstanceOf[js.Any])
  }
}
