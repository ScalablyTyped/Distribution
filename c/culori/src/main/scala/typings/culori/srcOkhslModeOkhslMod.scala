package typings.culori

import typings.culori.anon.AlphaH
import typings.culori.anon.Oklab
import typings.culori.anon.OklabRgb
import typings.culori.anon.`19`
import typings.culori.anon.`28`
import typings.culori.anon.`7`
import typings.culori.culoriStrings.`--okhsl`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.okhsl
import typings.culori.culoriStrings.s
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOkhslModeOkhslMod {
  
  /* Inlined std.Omit<{  mode :'hsl',   toMode :{  rgb :typeof convertHslToRgb},   fromMode :{  rgb :typeof convertRgbToHsl},   channels :['h', 's', 'l', 'alpha'],   ranges :{  h :[0, 360]},   parse :[typeof parseHsl], serialize (c : std.Omit<culori.culori/src/hsl/types.Hsl, 'mode'>): string,   interpolate :{  h :{  use :typeof interpolatorLinear,   fixup :typeof fixupHueShorter},   s :typeof interpolatorLinear,   l :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}},   difference :{  h :typeof differenceHueSaturation},   average :{  h :typeof averageAngle}}, keyof culori.culori/src/okhsl/modeOkhsl.OkhslDefinitionMixin> & culori.culori/src/okhsl/modeOkhsl.OkhslDefinitionMixin */
  object default {
    
    @JSImport("culori/src/okhsl/modeOkhsl", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/okhsl/modeOkhsl", "default.average")
    @js.native
    def average: `19` = js.native
    inline def average_=(x: `19`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("average")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsl/modeOkhsl", "default.channels")
    @js.native
    def channels: js.Tuple4[h, s, l, alpha] = js.native
    inline def channels_=(x: js.Tuple4[h, s, l, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsl/modeOkhsl", "default.difference")
    @js.native
    def difference: `28` = js.native
    inline def difference_=(x: `28`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("difference")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsl/modeOkhsl", "default.fromMode")
    @js.native
    def fromMode: Oklab = js.native
    inline def fromMode_=(x: Oklab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsl/modeOkhsl", "default.interpolate")
    @js.native
    def interpolate: AlphaH = js.native
    inline def interpolate_=(x: AlphaH): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsl/modeOkhsl", "default.mode")
    @js.native
    def mode: okhsl = js.native
    inline def mode_=(x: okhsl): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsl/modeOkhsl", "default.parse")
    @js.native
    def parse: js.Array[`--okhsl`] = js.native
    inline def parse_=(x: js.Array[`--okhsl`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsl/modeOkhsl", "default.ranges")
    @js.native
    def ranges: `7` = js.native
    inline def ranges_=(x: `7`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsl/modeOkhsl", "default.serialize")
    @js.native
    def serialize: `--okhsl` = js.native
    inline def serialize_=(x: `--okhsl`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/okhsl/modeOkhsl", "default.toMode")
    @js.native
    def toMode: OklabRgb = js.native
    inline def toMode_=(x: OklabRgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait OkhslDefinitionMixin extends StObject {
    
    var channels: js.Tuple4[h, s, l, alpha]
    
    var fromMode: Oklab
    
    var mode: okhsl
    
    var parse: js.Array[`--okhsl`]
    
    var serialize: `--okhsl`
    
    var toMode: OklabRgb
  }
  object OkhslDefinitionMixin {
    
    inline def apply(channels: js.Tuple4[h, s, l, alpha], fromMode: Oklab, parse: js.Array[`--okhsl`], toMode: OklabRgb): OkhslDefinitionMixin = {
      val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], mode = "okhsl", parse = parse.asInstanceOf[js.Any], serialize = "--okhsl", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[OkhslDefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OkhslDefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setChannels(value: js.Tuple4[h, s, l, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
      
      inline def setFromMode(value: Oklab): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: okhsl): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[`--okhsl`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: `--okhsl`*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setSerialize(value: `--okhsl`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: OklabRgb): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
