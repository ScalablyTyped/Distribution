package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "TextMetricsEx")
@js.native
open class TextMetricsEx ()
  extends typings.blackEngine.textMetricsMod.TextMetricsEx
/* static members */
object TextMetricsEx {
  
  @JSImport("black-engine", "TextMetricsEx")
  @js.native
  val ^ : js.Any = js.native
  
  inline def __measure(text: String, style: typings.blackEngine.textStyleMod.TextStyle): typings.blackEngine.rectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("__measure")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.rectangleMod.Rectangle]
  inline def __measure(
    text: String,
    style: typings.blackEngine.textStyleMod.TextStyle,
    outBounds: typings.blackEngine.rectangleMod.Rectangle
  ): typings.blackEngine.rectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("__measure")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], outBounds.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.rectangleMod.Rectangle]
  
  inline def measure(text: String, lineHeight: Double, styles: typings.blackEngine.textStyleMod.TextStyle*): typings.blackEngine.textMetricsMod.TextMetricsData = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")((List(text.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any])).`++`(styles.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.blackEngine.textMetricsMod.TextMetricsData]
  
  inline def measureBitmap(
    text: String,
    data: typings.blackEngine.bitmapFontAssetMod.BitmapFontData,
    lineHeight: Double,
    outBounds: typings.blackEngine.rectangleMod.Rectangle
  ): typings.blackEngine.rectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("measureBitmap")(text.asInstanceOf[js.Any], data.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any], outBounds.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.rectangleMod.Rectangle]
}
