package typings.culori

import typings.culori.anon.AlphaL
import typings.culori.anon.U
import typings.culori.anon.`26`
import typings.culori.anon.`27`
import typings.culori.culoriStrings.`--luv`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.luv
import typings.culori.culoriStrings.u
import typings.culori.culoriStrings.v
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLuvDefinitionMod {
  
  object default {
    
    @JSImport("culori/src/luv/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/luv/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[l, u, v, alpha] = js.native
    inline def channels_=(x: js.Tuple4[l, u, v, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/luv/definition", "default.fromMode")
    @js.native
    def fromMode: `27` = js.native
    inline def fromMode_=(x: `27`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/luv/definition", "default.interpolate")
    @js.native
    def interpolate: AlphaL = js.native
    inline def interpolate_=(x: AlphaL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/luv/definition", "default.mode")
    @js.native
    def mode: luv = js.native
    inline def mode_=(x: luv): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/luv/definition", "default.parse")
    @js.native
    def parse: js.Array[`--luv`] = js.native
    inline def parse_=(x: js.Array[`--luv`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/luv/definition", "default.ranges")
    @js.native
    def ranges: U = js.native
    inline def ranges_=(x: U): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/luv/definition", "default.serialize")
    @js.native
    def serialize: `--luv` = js.native
    inline def serialize_=(x: `--luv`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/luv/definition", "default.toMode")
    @js.native
    def toMode: `26` = js.native
    inline def toMode_=(x: `26`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
}
