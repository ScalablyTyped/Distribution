package typings.culori

import typings.culori.anon.A
import typings.culori.anon.B
import typings.culori.anon.Lab65
import typings.culori.anon.Lab65Rgb
import typings.culori.culoriStrings.`--din99o-lab`
import typings.culori.culoriStrings.a
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.dlab
import typings.culori.culoriStrings.l
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDlabDefinitionMod {
  
  object default {
    
    @JSImport("culori/src/dlab/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/dlab/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[l, a, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[l, a, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlab/definition", "default.fromMode")
    @js.native
    def fromMode: Lab65Rgb = js.native
    inline def fromMode_=(x: Lab65Rgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlab/definition", "default.interpolate")
    @js.native
    def interpolate: B = js.native
    inline def interpolate_=(x: B): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlab/definition", "default.mode")
    @js.native
    def mode: dlab = js.native
    inline def mode_=(x: dlab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlab/definition", "default.parse")
    @js.native
    def parse: js.Array[`--din99o-lab`] = js.native
    inline def parse_=(x: js.Array[`--din99o-lab`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlab/definition", "default.ranges")
    @js.native
    def ranges: A = js.native
    inline def ranges_=(x: A): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlab/definition", "default.serialize")
    @js.native
    def serialize: `--din99o-lab` = js.native
    inline def serialize_=(x: `--din99o-lab`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlab/definition", "default.toMode")
    @js.native
    def toMode: Lab65 = js.native
    inline def toMode_=(x: Lab65): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
}
