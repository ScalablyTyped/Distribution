package typings.canvg

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fontMod {
  
  @JSImport("canvg/dist/Font", "Font")
  @js.native
  open class Font protected () extends StObject {
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
      inherit: Font
    ) = this()
    
    val fontFamily: String = js.native
    
    val fontSize: String = js.native
    
    val fontStyle: String = js.native
    
    val fontVariant: String = js.native
    
    val fontWeight: String = js.native
  }
  /* static members */
  object Font {
    
    @JSImport("canvg/dist/Font", "Font")
    @js.native
    val ^ : js.Any = js.native
    
    inline def parse(): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")().asInstanceOf[Font]
    inline def parse(font: String): Font = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(font.asInstanceOf[js.Any]).asInstanceOf[Font]
    inline def parse(font: String, inherit: String): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(font.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[Font]
    inline def parse(font: String, inherit: Font): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(font.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[Font]
    inline def parse(font: Unit, inherit: String): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(font.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[Font]
    inline def parse(font: Unit, inherit: Font): Font = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(font.asInstanceOf[js.Any], inherit.asInstanceOf[js.Any])).asInstanceOf[Font]
    
    @JSImport("canvg/dist/Font", "Font.styles")
    @js.native
    val styles: /* "normal|italic|oblique|inherit" */ String = js.native
    
    @JSImport("canvg/dist/Font", "Font.variants")
    @js.native
    val variants: /* "normal|small-caps|inherit" */ String = js.native
    
    @JSImport("canvg/dist/Font", "Font.weights")
    @js.native
    val weights: /* "normal|bold|bolder|lighter|100|200|300|400|500|600|700|800|900|inherit" */ String = js.native
  }
}
