package typings.cesium

import typings.cesium.anon.BackgroundColor
import typings.std.HTMLCanvasElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object writeTextToCanvasMod {
  
  @JSImport("cesium/Source/Core/writeTextToCanvas", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(text: String): js.UndefOr[HTMLCanvasElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[HTMLCanvasElement]]
  inline def default(text: String, options: BackgroundColor): js.UndefOr[HTMLCanvasElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(text.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[HTMLCanvasElement]]
}
