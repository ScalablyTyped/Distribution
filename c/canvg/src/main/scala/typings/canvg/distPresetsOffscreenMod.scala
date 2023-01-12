package typings.canvg

import typings.canvg.anon.CreateCanvas
import typings.canvg.distPresetsTypesMod.DOMParser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPresetsOffscreenMod {
  
  @JSImport("canvg/dist/presets/offscreen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def offscreen(): CreateCanvas = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")().asInstanceOf[CreateCanvas]
  inline def offscreen(param0: IConfig): CreateCanvas = ^.asInstanceOf[js.Dynamic].applyDynamic("offscreen")(param0.asInstanceOf[js.Any]).asInstanceOf[CreateCanvas]
  
  trait IConfig extends StObject {
    
    /**
      * XML/HTML parser from string into DOM Document.
      */
    var DOMParser: js.UndefOr[typings.canvg.distPresetsTypesMod.DOMParser] = js.undefined
  }
  object IConfig {
    
    inline def apply(): IConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IConfig] (val x: Self) extends AnyVal {
      
      inline def setDOMParser(value: DOMParser): Self = StObject.set(x, "DOMParser", value.asInstanceOf[js.Any])
      
      inline def setDOMParserUndefined: Self = StObject.set(x, "DOMParser", js.undefined)
    }
  }
}
