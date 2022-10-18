package typings.blackEngine

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayTextFontMetricsMod {
  
  @JSImport("black-engine/display/text/FontMetrics", "FontMetrics")
  @js.native
  /* private */ open class FontMetrics () extends StObject {
    
    /* private */ var __getBottom: Any = js.native
    
    /* private */ var __getTop: Any = js.native
    
    var ascent: Double = js.native
    
    def ascentNormalized: Double = js.native
    
    var baseline: Double = js.native
    
    def baselineNormalized: Double = js.native
    
    var bottom: Double = js.native
    
    def bottomNormalized: Double = js.native
    
    var capHeight: Double = js.native
    
    def capHeightNormalized: Double = js.native
    
    var descent: Double = js.native
    
    def descentNormalized: Double = js.native
    
    /* private */ var mCanvas: Any = js.native
    
    /* private */ var mCtx: Any = js.native
    
    /* private */ var mStyle: Any = js.native
    
    var xHeight: Double = js.native
    
    def xHeightNormalized: Double = js.native
  }
  /* static members */
  object FontMetrics {
    
    @JSImport("black-engine/display/text/FontMetrics", "FontMetrics")
    @js.native
    val ^ : js.Any = js.native
    
    inline def get(fontName: String): FontMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(fontName.asInstanceOf[js.Any]).asInstanceOf[FontMetrics]
  }
}
