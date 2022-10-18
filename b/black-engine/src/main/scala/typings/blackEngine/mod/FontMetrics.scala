package typings.blackEngine.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("black-engine", "FontMetrics")
@js.native
/* private */ open class FontMetrics ()
  extends typings.blackEngine.displayTextFontMetricsMod.FontMetrics
/* static members */
object FontMetrics {
  
  @JSImport("black-engine", "FontMetrics")
  @js.native
  val ^ : js.Any = js.native
  
  inline def get(fontName: String): typings.blackEngine.displayTextFontMetricsMod.FontMetrics = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(fontName.asInstanceOf[js.Any]).asInstanceOf[typings.blackEngine.displayTextFontMetricsMod.FontMetrics]
}
