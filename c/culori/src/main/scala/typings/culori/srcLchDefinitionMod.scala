package typings.culori

import typings.culori.anon.CHL
import typings.culori.anon.HL
import typings.culori.anon.Lab
import typings.culori.anon.LabRgb
import typings.culori.anon.OmitLchmode
import typings.culori.anon.`3`
import typings.culori.anon.`4`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.c
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.lch
import typings.culori.srcLchTypesMod.Lch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLchDefinitionMod {
  
  object default {
    
    @JSImport("culori/src/lch/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/lch/definition", "default.average")
    @js.native
    def average: `3` = js.native
    inline def average_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("average")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[l, c, h, alpha] = js.native
    inline def channels_=(x: js.Tuple4[l, c, h, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch/definition", "default.difference")
    @js.native
    def difference: `4` = js.native
    inline def difference_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("difference")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch/definition", "default.fromMode")
    @js.native
    def fromMode: LabRgb = js.native
    inline def fromMode_=(x: LabRgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch/definition", "default.interpolate")
    @js.native
    def interpolate: CHL = js.native
    inline def interpolate_=(x: CHL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch/definition", "default.mode")
    @js.native
    def mode: lch = js.native
    inline def mode_=(x: lch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch/definition", "default.parse")
    @js.native
    def parse: js.Array[js.Function1[/* color */ String, Lch]] = js.native
    inline def parse_=(x: js.Array[js.Function1[/* color */ String, Lch]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch/definition", "default.ranges")
    @js.native
    def ranges: HL = js.native
    inline def ranges_=(x: HL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    inline def serialize(c: OmitLchmode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(c.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("culori/src/lch/definition", "default.toMode")
    @js.native
    def toMode: Lab = js.native
    inline def toMode_=(x: Lab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
}
