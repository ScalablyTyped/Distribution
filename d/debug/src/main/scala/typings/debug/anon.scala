package typings.debug

import typings.ms.anon.Long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Colors extends StObject {
    
    var colors: js.UndefOr[Boolean | Double | Null] = js.undefined
    
    var depth: js.UndefOr[Boolean | Double | Null] = js.undefined
    
    var hideDate: js.UndefOr[Boolean | Double | Null] = js.undefined
    
    var showHidden: js.UndefOr[Boolean | Double | Null] = js.undefined
  }
  object Colors {
    
    inline def apply(): Colors = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Colors]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
      
      inline def setColors(value: Boolean | Double): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsNull: Self = StObject.set(x, "colors", null)
      
      inline def setColorsUndefined: Self = StObject.set(x, "colors", js.undefined)
      
      inline def setDepth(value: Boolean | Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setDepthNull: Self = StObject.set(x, "depth", null)
      
      inline def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
      
      inline def setHideDate(value: Boolean | Double): Self = StObject.set(x, "hideDate", value.asInstanceOf[js.Any])
      
      inline def setHideDateNull: Self = StObject.set(x, "hideDate", null)
      
      inline def setHideDateUndefined: Self = StObject.set(x, "hideDate", js.undefined)
      
      inline def setShowHidden(value: Boolean | Double): Self = StObject.set(x, "showHidden", value.asInstanceOf[js.Any])
      
      inline def setShowHiddenNull: Self = StObject.set(x, "showHidden", null)
      
      inline def setShowHiddenUndefined: Self = StObject.set(x, "showHidden", js.undefined)
    }
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(value: String): Double = js.native
    def apply(value: Double): String = js.native
    def apply(value: Double, options: Long): String = js.native
  }
}
