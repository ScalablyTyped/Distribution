package typings.culori

import typings.culori.anon.CHL
import typings.culori.anon.Luv
import typings.culori.anon.LuvRgb
import typings.culori.anon.`24`
import typings.culori.anon.`3`
import typings.culori.anon.`4`
import typings.culori.culoriStrings.`--lchuv`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.c
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.lchuv
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLchuvDefinitionMod {
  
  object default {
    
    @JSImport("culori/src/lchuv/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/lchuv/definition", "default.average")
    @js.native
    def average: `3` = js.native
    inline def average_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("average")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lchuv/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[l, c, h, alpha] = js.native
    inline def channels_=(x: js.Tuple4[l, c, h, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lchuv/definition", "default.difference")
    @js.native
    def difference: `4` = js.native
    inline def difference_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("difference")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lchuv/definition", "default.fromMode")
    @js.native
    def fromMode: LuvRgb = js.native
    inline def fromMode_=(x: LuvRgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lchuv/definition", "default.interpolate")
    @js.native
    def interpolate: CHL = js.native
    inline def interpolate_=(x: CHL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lchuv/definition", "default.mode")
    @js.native
    def mode: lchuv = js.native
    inline def mode_=(x: lchuv): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lchuv/definition", "default.parse")
    @js.native
    def parse: js.Array[`--lchuv`] = js.native
    inline def parse_=(x: js.Array[`--lchuv`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lchuv/definition", "default.ranges")
    @js.native
    def ranges: `24` = js.native
    inline def ranges_=(x: `24`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lchuv/definition", "default.serialize")
    @js.native
    def serialize: `--lchuv` = js.native
    inline def serialize_=(x: `--lchuv`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lchuv/definition", "default.toMode")
    @js.native
    def toMode: Luv = js.native
    inline def toMode_=(x: Luv): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
}
