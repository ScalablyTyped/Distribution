package typings.culori

import typings.culori.anon.OmitHwbmode
import typings.culori.anon.W
import typings.culori.anon.`12`
import typings.culori.anon.`13`
import typings.culori.anon.`14`
import typings.culori.anon.`3`
import typings.culori.anon.`7`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.hwb
import typings.culori.culoriStrings.w
import typings.culori.srcHwbTypesMod.Hwb
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcHwbDefinitionMod {
  
  object default {
    
    @JSImport("culori/src/hwb/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/hwb/definition", "default.average")
    @js.native
    def average: `3` = js.native
    inline def average_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("average")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hwb/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[h, w, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[h, w, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hwb/definition", "default.difference")
    @js.native
    def difference: `14` = js.native
    inline def difference_=(x: `14`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("difference")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hwb/definition", "default.fromMode")
    @js.native
    def fromMode: `13` = js.native
    inline def fromMode_=(x: `13`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hwb/definition", "default.interpolate")
    @js.native
    def interpolate: W = js.native
    inline def interpolate_=(x: W): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hwb/definition", "default.mode")
    @js.native
    def mode: hwb = js.native
    inline def mode_=(x: hwb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hwb/definition", "default.parse")
    @js.native
    def parse: js.Array[js.Function1[/* color */ String, js.UndefOr[Hwb]]] = js.native
    inline def parse_=(x: js.Array[js.Function1[/* color */ String, js.UndefOr[Hwb]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/hwb/definition", "default.ranges")
    @js.native
    def ranges: `7` = js.native
    inline def ranges_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    inline def serialize(c: OmitHwbmode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(c.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("culori/src/hwb/definition", "default.toMode")
    @js.native
    def toMode: `12` = js.native
    inline def toMode_=(x: `12`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
}
