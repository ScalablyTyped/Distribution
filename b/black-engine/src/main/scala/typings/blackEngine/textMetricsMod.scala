package typings.blackEngine

import typings.blackEngine.bitmapFontAssetMod.BitmapFontData
import typings.blackEngine.rectangleMod.Rectangle
import typings.blackEngine.textStyleMod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMetricsMod {
  
  @JSImport("black-engine/display/text/TextMetrics", "TextMetricsData")
  @js.native
  open class TextMetricsData () extends StObject {
    
    var bounds: Rectangle = js.native
    
    var lineWidth: js.Array[Double] = js.native
    
    var segments: js.Array[TextSegmentMetricsData] = js.native
    
    var shadowBounds: Rectangle = js.native
    
    var strokeBounds: Rectangle = js.native
  }
  
  @JSImport("black-engine/display/text/TextMetrics", "TextMetricsEx")
  @js.native
  open class TextMetricsEx () extends StObject
  /* static members */
  object TextMetricsEx {
    
    @JSImport("black-engine/display/text/TextMetrics", "TextMetricsEx")
    @js.native
    val ^ : js.Any = js.native
    
    inline def __measure(text: String, style: TextStyle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("__measure")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    inline def __measure(text: String, style: TextStyle, outBounds: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("__measure")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], outBounds.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
    
    inline def measure(text: String, lineHeight: Double, styles: TextStyle*): TextMetricsData = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")((List(text.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any])).`++`(styles.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[TextMetricsData]
    
    inline def measureBitmap(text: String, data: BitmapFontData, lineHeight: Double, outBounds: Rectangle): Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("measureBitmap")(text.asInstanceOf[js.Any], data.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any], outBounds.asInstanceOf[js.Any])).asInstanceOf[Rectangle]
  }
  
  @JSImport("black-engine/display/text/TextMetrics", "TextSegmentMetricsData")
  @js.native
  open class TextSegmentMetricsData protected () extends StObject {
    def this(text: Any, style: Any, lineIndex: Any, bounds: Any) = this()
    
    var bounds: Rectangle = js.native
    
    var lineIndex: Double = js.native
    
    var style: TextStyle = js.native
    
    var text: String = js.native
  }
}
