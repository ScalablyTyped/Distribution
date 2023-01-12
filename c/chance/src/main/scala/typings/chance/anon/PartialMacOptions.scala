package typings.chance.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<chance.Chance.MacOptions> */
trait PartialMacOptions extends StObject {
  
  var networkVersion: js.UndefOr[Boolean] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
}
object PartialMacOptions {
  
  inline def apply(): PartialMacOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialMacOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialMacOptions] (val x: Self) extends AnyVal {
    
    inline def setNetworkVersion(value: Boolean): Self = StObject.set(x, "networkVersion", value.asInstanceOf[js.Any])
    
    inline def setNetworkVersionUndefined: Self = StObject.set(x, "networkVersion", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
