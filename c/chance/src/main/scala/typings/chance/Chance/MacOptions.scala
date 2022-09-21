package typings.chance.Chance

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MacOptions extends StObject {
  
  var networkVersion: Boolean
  
  var separator: String
}
object MacOptions {
  
  inline def apply(networkVersion: Boolean, separator: String): MacOptions = {
    val __obj = js.Dynamic.literal(networkVersion = networkVersion.asInstanceOf[js.Any], separator = separator.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacOptions]
  }
  
  extension [Self <: MacOptions](x: Self) {
    
    inline def setNetworkVersion(value: Boolean): Self = StObject.set(x, "networkVersion", value.asInstanceOf[js.Any])
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
  }
}
