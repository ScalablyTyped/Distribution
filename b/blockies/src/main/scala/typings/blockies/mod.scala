package typings.blockies

import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("blockies", JSImport.Namespace)
  @js.native
  def apply(): HTMLCanvasElement = js.native
  @JSImport("blockies", JSImport.Namespace)
  @js.native
  def apply(config: BlockiesConfig): HTMLCanvasElement = js.native
  
  @js.native
  trait BlockiesConfig extends StObject {
    
    var bgcolor: js.UndefOr[String] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var scale: js.UndefOr[Double] = js.native
    
    var seed: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var spotcolor: js.UndefOr[String] = js.native
  }
  object BlockiesConfig {
    
    @scala.inline
    def apply(): BlockiesConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BlockiesConfig]
    }
    
    @scala.inline
    implicit class BlockiesConfigMutableBuilder[Self <: BlockiesConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBgcolor(value: String): Self = StObject.set(x, "bgcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgcolorUndefined: Self = StObject.set(x, "bgcolor", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSeed(value: String): Self = StObject.set(x, "seed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeedUndefined: Self = StObject.set(x, "seed", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSpotcolor(value: String): Self = StObject.set(x, "spotcolor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpotcolorUndefined: Self = StObject.set(x, "spotcolor", js.undefined)
    }
  }
}
