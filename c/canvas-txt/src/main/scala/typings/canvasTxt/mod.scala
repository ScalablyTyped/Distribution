package typings.canvasTxt

import typings.canvasTxt.canvasTxtStrings.bottom
import typings.canvasTxt.canvasTxtStrings.center
import typings.canvasTxt.canvasTxtStrings.left
import typings.canvasTxt.canvasTxtStrings.middle
import typings.canvasTxt.canvasTxtStrings.right
import typings.canvasTxt.canvasTxtStrings.top
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("canvas-txt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("canvas-txt", "align")
  @js.native
  def align: center | left | right = js.native
  inline def align_=(x: center | left | right): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
  
  @JSImport("canvas-txt", "debug")
  @js.native
  def debug: Boolean = js.native
  inline def debug_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
  
  inline def drawText(ctx: CanvasRenderingContext2D, text: String, x: Double, y: Double, width: Double, height: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("drawText")(ctx.asInstanceOf[js.Any], text.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("canvas-txt", "font")
  @js.native
  def font: String = js.native
  
  @JSImport("canvas-txt", "fontSize")
  @js.native
  def fontSize: Double = js.native
  inline def fontSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontSize")(x.asInstanceOf[js.Any])
  
  @JSImport("canvas-txt", "fontStyle")
  @js.native
  def fontStyle: String = js.native
  inline def fontStyle_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontStyle")(x.asInstanceOf[js.Any])
  
  @JSImport("canvas-txt", "fontVariant")
  @js.native
  def fontVariant: String = js.native
  inline def fontVariant_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontVariant")(x.asInstanceOf[js.Any])
  
  @JSImport("canvas-txt", "fontWeight")
  @js.native
  def fontWeight: String | Double = js.native
  inline def fontWeight_=(x: String | Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fontWeight")(x.asInstanceOf[js.Any])
  
  inline def font_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("font")(x.asInstanceOf[js.Any])
  
  @JSImport("canvas-txt", "justify")
  @js.native
  def justify: Boolean = js.native
  inline def justify_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("justify")(x.asInstanceOf[js.Any])
  
  @JSImport("canvas-txt", "lineHeight")
  @js.native
  def lineHeight: Double | Null = js.native
  inline def lineHeight_=(x: Double | Null): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("lineHeight")(x.asInstanceOf[js.Any])
  
  @JSImport("canvas-txt", "vAlign")
  @js.native
  def vAlign: middle | top | bottom = js.native
  inline def vAlign_=(x: middle | top | bottom): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vAlign")(x.asInstanceOf[js.Any])
}
