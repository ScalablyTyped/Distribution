package typings.culori

import typings.culori.anon.FnCallStr
import typings.culori.anon.R
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.g
import typings.culori.culoriStrings.r
import typings.culori.culoriStrings.rgb
import typings.culori.culoriStrings.srgb
import typings.culori.srcCommonMod.Color
import typings.culori.srcRgbTypesMod.Rgb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRgbDefinitionMod {
  
  object default {
    
    @JSImport("culori/src/rgb/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/rgb/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[r, g, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[r, g, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/rgb/definition", "default.interpolate")
    @js.native
    def interpolate: R = js.native
    inline def interpolate_=(x: R): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/rgb/definition", "default.mode")
    @js.native
    def mode: rgb = js.native
    inline def mode_=(x: rgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/rgb/definition", "default.parse")
    @js.native
    def parse: js.Tuple5[
        js.Function1[/* color */ String, Color], 
        js.Function1[/* color */ String, Rgb], 
        js.Function1[/* keyof typeof named */ /* color */ String, Color], 
        FnCallStr, 
        srgb
      ] = js.native
    inline def parse_=(
      x: js.Tuple5[
          js.Function1[/* color */ String, Color], 
          js.Function1[/* color */ String, Rgb], 
          js.Function1[/* keyof typeof named */ /* color */ String, Color], 
          FnCallStr, 
          srgb
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/rgb/definition", "default.serialize")
    @js.native
    def serialize: srgb = js.native
    inline def serialize_=(x: srgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
  }
}
