package typings.canvg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("canvg", "Font")
@js.native
open class Font protected ()
  extends typings.canvg.distFontMod.Font {
  def this(fontStyle: String, fontVariant: String, fontWeight: String, fontSize: String, fontFamily: String) = this()
  def this(
    fontStyle: String,
    fontVariant: String,
    fontWeight: String,
    fontSize: String,
    fontFamily: String,
    inherit: String
  ) = this()
  def this(
    fontStyle: String,
    fontVariant: String,
    fontWeight: String,
    fontSize: String,
    fontFamily: String,
    inherit: typings.canvg.distFontMod.Font
  ) = this()
}
/* static members */
object Font {
  
  @JSImport("canvg", "Font")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parse(): typings.canvg.distFontMod.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[typings.canvg.distFontMod.Font]
  inline def parse(font: String): typings.canvg.distFontMod.Font = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(font.asInstanceOf[js.Any]).asInstanceOf[typings.canvg.distFontMod.Font]
  inline def parse(font: String, inherit: String): typings.canvg.distFontMod.Font = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(font.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[typings.canvg.distFontMod.Font]
  inline def parse(font: String, inherit: typings.canvg.distFontMod.Font): typings.canvg.distFontMod.Font = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(font.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[typings.canvg.distFontMod.Font]
  inline def parse(font: Unit, inherit: String): typings.canvg.distFontMod.Font = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(font.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[typings.canvg.distFontMod.Font]
  inline def parse(font: Unit, inherit: typings.canvg.distFontMod.Font): typings.canvg.distFontMod.Font = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(font.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[typings.canvg.distFontMod.Font]
  
  @JSImport("canvg", "Font.styles")
  @js.native
  val styles: /* "normal|italic|oblique|inherit" */ String = js.native
  
  @JSImport("canvg", "Font.variants")
  @js.native
  val variants: /* "normal|small-caps|inherit" */ String = js.native
  
  @JSImport("canvg", "Font.weights")
  @js.native
  val weights: /* "normal|bold|bolder|lighter|100|200|300|400|500|600|700|800|900|inherit" */ String = js.native
}
