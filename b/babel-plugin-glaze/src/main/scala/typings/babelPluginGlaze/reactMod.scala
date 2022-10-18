package typings.babelPluginGlaze

import typings.glaze.distTypesUseStylingMod.ThemedStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object reactMod {
  
  trait Attributes extends StObject {
    
    var sx: js.UndefOr[ThemedStyle] = js.undefined
  }
  object Attributes {
    
    inline def apply(): Attributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Attributes]
    }
    
    extension [Self <: Attributes](x: Self) {
      
      inline def setSx(value: ThemedStyle): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
      
      inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
    }
  }
}
