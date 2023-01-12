package typings.blockies

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[HTMLCanvasElement]
  inline def apply(config: BlockiesConfig): HTMLCanvasElement = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[HTMLCanvasElement]
  
  @JSImport("blockies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait BlockiesConfig extends StObject {
    
    var bgcolor: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var scale: js.UndefOr[Double] = js.undefined
    
    var seed: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var spotcolor: js.UndefOr[String] = js.undefined
  }
  object BlockiesConfig {
    
    inline def apply(): BlockiesConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockiesConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BlockiesConfig] (val x: Self) extends AnyVal {
      
      inline def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      inline def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      inline def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      inline def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSpotcolor(value: String): Self = StObject.set(x, "spotcolor", value.asInstanceOf[js.Any])
      
      inline def setSpotcolorUndefined: Self = StObject.set(x, "spotcolor", js.undefined)
    }
  }
}
