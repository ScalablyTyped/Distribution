package typings.culori

import typings.culori.anon.AlphaC
import typings.culori.anon.C
import typings.culori.anon.Dlab
import typings.culori.anon.DlabLab65
import typings.culori.anon.`3`
import typings.culori.anon.`4`
import typings.culori.culoriStrings.`--din99o-lch`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.c
import typings.culori.culoriStrings.dlch
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.l
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcDlchDefinitionMod {
  
  object default {
    
    @JSImport("culori/src/dlch/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/dlch/definition", "default.average")
    @js.native
    def average: `3` = js.native
    inline def average_=(x: `3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("average")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlch/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[l, c, h, alpha] = js.native
    inline def channels_=(x: js.Tuple4[l, c, h, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlch/definition", "default.difference")
    @js.native
    def difference: `4` = js.native
    inline def difference_=(x: `4`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("difference")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlch/definition", "default.fromMode")
    @js.native
    def fromMode: DlabLab65 = js.native
    inline def fromMode_=(x: DlabLab65): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlch/definition", "default.interpolate")
    @js.native
    def interpolate: AlphaC = js.native
    inline def interpolate_=(x: AlphaC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlch/definition", "default.mode")
    @js.native
    def mode: dlch = js.native
    inline def mode_=(x: dlch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlch/definition", "default.parse")
    @js.native
    def parse: js.Array[`--din99o-lch`] = js.native
    inline def parse_=(x: js.Array[`--din99o-lch`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlch/definition", "default.ranges")
    @js.native
    def ranges: C = js.native
    inline def ranges_=(x: C): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlch/definition", "default.serialize")
    @js.native
    def serialize: `--din99o-lch` = js.native
    inline def serialize_=(x: `--din99o-lch`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/dlch/definition", "default.toMode")
    @js.native
    def toMode: Dlab = js.native
    inline def toMode_=(x: Dlab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
}
