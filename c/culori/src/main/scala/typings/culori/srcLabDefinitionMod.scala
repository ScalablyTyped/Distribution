package typings.culori

import typings.culori.anon.AB
import typings.culori.anon.B
import typings.culori.anon.OmitLabmode
import typings.culori.anon.RgbXyz50
import typings.culori.anon.Xyz50
import typings.culori.culoriStrings.a
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.lab
import typings.culori.srcLabTypesMod.Lab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLabDefinitionMod {
  
  object default {
    
    @JSImport("culori/src/lab/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/lab/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[l, a, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[l, a, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab/definition", "default.fromMode")
    @js.native
    def fromMode: RgbXyz50 = js.native
    inline def fromMode_=(x: RgbXyz50): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab/definition", "default.interpolate")
    @js.native
    def interpolate: B = js.native
    inline def interpolate_=(x: B): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab/definition", "default.mode")
    @js.native
    def mode: lab = js.native
    inline def mode_=(x: lab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab/definition", "default.parse")
    @js.native
    def parse: js.Array[js.Function1[/* color */ String, Lab]] = js.native
    inline def parse_=(x: js.Array[js.Function1[/* color */ String, Lab]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab/definition", "default.ranges")
    @js.native
    def ranges: AB = js.native
    inline def ranges_=(x: AB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    inline def serialize(c: OmitLabmode): String = ^.asInstanceOf[js.Dynamic].applyDynamic("serialize")(c.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("culori/src/lab/definition", "default.toMode")
    @js.native
    def toMode: Xyz50 = js.native
    inline def toMode_=(x: Xyz50): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
}
