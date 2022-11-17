package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColorsPluginOptions extends StObject {
  
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object ColorsPluginOptions {
  
  inline def apply(): ColorsPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColorsPluginOptions]
  }
  
  extension [Self <: ColorsPluginOptions](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
