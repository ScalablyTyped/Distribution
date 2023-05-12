package typings.culori

import typings.culori.anon.L
import typings.culori.anon.OmitHslmode
import typings.culori.anon.`2`
import typings.culori.anon.`3`
import typings.culori.anon.`7`
import typings.culori.anon.`8`
import typings.culori.anon.`9`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.hsl
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.s
import typings.culori.srcHslTypesMod.Hsl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHslDefinitionMod {
  
  object default {
    
    @JSImport("culori/src/hsl/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/hsl/definition", "default.average")
    @js.native
    def average: `3` = js.native
    inline def average_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("average")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hsl/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[h, s, l, alpha] = js.native
    inline def channels_=(x: js.Tuple4[h, s, l, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hsl/definition", "default.difference")
    @js.native
    def difference: `2` = js.native
    inline def difference_=(x: `2`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("difference")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hsl/definition", "default.fromMode")
    @js.native
    def fromMode: `9` = js.native
    inline def fromMode_=(x: `9`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hsl/definition", "default.interpolate")
    @js.native
    def interpolate: L = js.native
    inline def interpolate_=(x: L): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hsl/definition", "default.mode")
    @js.native
    def mode: hsl = js.native
    inline def mode_=(x: hsl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hsl/definition", "default.parse")
    @js.native
    def parse: js.Array[js.Function1[/* color */ String, Hsl]] = js.native
    inline def parse_=(x: js.Array[js.Function1[/* color */ String, Hsl]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hsl/definition", "default.ranges")
    @js.native
    def ranges: `7` = js.native
    inline def ranges_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    inline def serialize(c: OmitHslmode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(c.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("culori/src/hsl/definition", "default.toMode")
    @js.native
    def toMode: `8` = js.native
    inline def toMode_=(x: `8`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
}
