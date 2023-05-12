package typings.culori

import typings.culori.anon.HS
import typings.culori.anon.`19`
import typings.culori.anon.`28`
import typings.culori.anon.`29`
import typings.culori.anon.`30`
import typings.culori.anon.`7`
import typings.culori.culoriStrings.`--okhsv`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.okhsv
import typings.culori.culoriStrings.s
import typings.culori.culoriStrings.v
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOkhsvModeOkhsvMod {
  
  /* Inlined std.Omit<{  mode :'hsv',   toMode :{  rgb :typeof convertHsvToRgb},   parse :['--hsv'],   serialize :'--hsv',   fromMode :{  rgb :typeof convertRgbToHsv},   channels :['h', 's', 'v', 'alpha'],   ranges :{  h :[0, 360]},   interpolate :{  h :{  use :typeof interpolatorLinear,   fixup :typeof fixupHueShorter},   s :typeof interpolatorLinear,   v :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}},   difference :{  h :typeof differenceHueSaturation},   average :{  h :typeof averageAngle}}, keyof culori.culori/src/okhsv/modeOkhsv.OkhsvDefinitionMixin> & culori.culori/src/okhsv/modeOkhsv.OkhsvDefinitionMixin */
  object default {
    
    @JSImport("culori/src/okhsv/modeOkhsv", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/okhsv/modeOkhsv", "default.average")
    @js.native
    def average: `19` = js.native
    inline def average_=(x: `19`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("average")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsv/modeOkhsv", "default.channels")
    @js.native
    def channels: js.Tuple4[h, s, v, alpha] = js.native
    inline def channels_=(x: js.Tuple4[h, s, v, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsv/modeOkhsv", "default.difference")
    @js.native
    def difference: `28` = js.native
    inline def difference_=(x: `28`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("difference")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsv/modeOkhsv", "default.fromMode")
    @js.native
    def fromMode: `29` = js.native
    inline def fromMode_=(x: `29`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsv/modeOkhsv", "default.interpolate")
    @js.native
    def interpolate: HS = js.native
    inline def interpolate_=(x: HS): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsv/modeOkhsv", "default.mode")
    @js.native
    def mode: okhsv = js.native
    inline def mode_=(x: okhsv): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsv/modeOkhsv", "default.parse")
    @js.native
    def parse: js.Array[`--okhsv`] = js.native
    inline def parse_=(x: js.Array[`--okhsv`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsv/modeOkhsv", "default.ranges")
    @js.native
    def ranges: `7` = js.native
    inline def ranges_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsv/modeOkhsv", "default.serialize")
    @js.native
    def serialize: `--okhsv` = js.native
    inline def serialize_=(x: `--okhsv`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsv/modeOkhsv", "default.toMode")
    @js.native
    def toMode: `30` = js.native
    inline def toMode_=(x: `30`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait OkhsvDefinitionMixin extends StObject {
    
    var channels: js.Tuple4[h, s, v, alpha]
    
    var fromMode: `29`
    
    var mode: okhsv
    
    var parse: js.Array[`--okhsv`]
    
    var serialize: `--okhsv`
    
    var toMode: `30`
  }
  object OkhsvDefinitionMixin {
    
    inline def apply(channels: js.Tuple4[h, s, v, alpha], fromMode: `29`, parse: js.Array[`--okhsv`], toMode: `30`): OkhsvDefinitionMixin = {
      val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], mode = "okhsv", parse = parse.asInstanceOf[js.Any], serialize = "--okhsv", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[OkhsvDefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OkhsvDefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setChannels(value: js.Tuple4[h, s, v, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setFromMode(value: `29`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: okhsv): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[`--okhsv`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: `--okhsv`*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setSerialize(value: `--okhsv`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: `30`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
