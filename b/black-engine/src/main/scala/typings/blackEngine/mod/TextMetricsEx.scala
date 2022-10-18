package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "TextMetricsEx")
@js.native
open class TextMetricsEx ()
  extends typings.blackEngine.displayTextTextMetricsMod.TextMetricsEx
/* static members */
object TextMetricsEx {
  
  @JSImport("black-engine", "TextMetricsEx")
  @js.native
  val ^ : js.Any = js.native
  
  inline def __measure(text: String, style: typings.blackEngine.displayTextTextStyleMod.TextStyle): typings.blackEngine.geomRectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("__measure")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.geomRectangleMod.Rectangle]
  inline def __measure(
    text: String,
    style: typings.blackEngine.displayTextTextStyleMod.TextStyle,
    outBounds: typings.blackEngine.geomRectangleMod.Rectangle
  ): typings.blackEngine.geomRectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("__measure")(text.asInstanceOf[js.Any], style.asInstanceOf[js.Any], outBounds.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.geomRectangleMod.Rectangle]
  
  inline def measure(text: String, lineHeight: Double, styles: typings.blackEngine.displayTextTextStyleMod.TextStyle*): typings.blackEngine.displayTextTextMetricsMod.TextMetricsData = (^.asInstanceOf[js.Dynamic].applyDynamic("measure")((scala.List(text.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any])).`++`(styles.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[typings.blackEngine.displayTextTextMetricsMod.TextMetricsData]
  
  inline def measureBitmap(
    text: String,
    data: typings.blackEngine.assetsBitmapFontAssetMod.BitmapFontData,
    lineHeight: Double,
    outBounds: typings.blackEngine.geomRectangleMod.Rectangle
  ): typings.blackEngine.geomRectangleMod.Rectangle = (^.asInstanceOf[js.Dynamic].applyDynamic("measureBitmap")(text.asInstanceOf[js.Any], data.asInstanceOf[js.Any], lineHeight.asInstanceOf[js.Any], outBounds.asInstanceOf[js.Any])).asInstanceOf[typings.blackEngine.geomRectangleMod.Rectangle]
}
