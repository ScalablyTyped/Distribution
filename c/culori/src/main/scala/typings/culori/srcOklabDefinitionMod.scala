package typings.culori

import typings.culori.anon.ABL
import typings.culori.anon.AlphaB
import typings.culori.anon.Lrgb
import typings.culori.anon.LrgbRgb
import typings.culori.culoriStrings.`--oklab`
import typings.culori.culoriStrings.a
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.oklab
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOklabDefinitionMod {
  
  /* Inlined std.Omit<{  mode :'lab',   toMode :{  xyz50 :typeof convertLabToXyz50,   rgb :typeof convertLabToRgb},   fromMode :{  xyz50 :typeof convertXyz50ToLab,   rgb :typeof convertRgbToLab},   channels :['l', 'a', 'b', 'alpha'],   ranges :{  l :[0, 100],   a :[-79.287, 93.55],   b :[-112.029, 93.388]},   parse :[typeof parseLab], serialize (c : std.Omit<culori.culori/src/lab/types.Lab, 'mode'>): string,   interpolate :{  l :typeof interpolatorLinear,   a :typeof interpolatorLinear,   b :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}}}, keyof culori.culori/src/oklab/definition.OklabDefinitionMixin> & culori.culori/src/oklab/definition.OklabDefinitionMixin */
  object default {
    
    @JSImport("culori/src/oklab/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/oklab/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[l, a, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[l, a, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklab/definition", "default.fromMode")
    @js.native
    def fromMode: LrgbRgb = js.native
    inline def fromMode_=(x: LrgbRgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklab/definition", "default.interpolate")
    @js.native
    def interpolate: AlphaB = js.native
    inline def interpolate_=(x: AlphaB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklab/definition", "default.mode")
    @js.native
    def mode: oklab = js.native
    inline def mode_=(x: oklab): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklab/definition", "default.parse")
    @js.native
    def parse: js.Array[`--oklab`] = js.native
    inline def parse_=(x: js.Array[`--oklab`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklab/definition", "default.ranges")
    @js.native
    def ranges: ABL = js.native
    inline def ranges_=(x: ABL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklab/definition", "default.serialize")
    @js.native
    def serialize: `--oklab` = js.native
    inline def serialize_=(x: `--oklab`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklab/definition", "default.toMode")
    @js.native
    def toMode: Lrgb = js.native
    inline def toMode_=(x: Lrgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait OklabDefinitionMixin extends StObject {
    
    var fromMode: LrgbRgb
    
    var mode: oklab
    
    var parse: js.Array[`--oklab`]
    
    var ranges: ABL
    
    var serialize: `--oklab`
    
    var toMode: Lrgb
  }
  object OklabDefinitionMixin {
    
    inline def apply(fromMode: LrgbRgb, parse: js.Array[`--oklab`], ranges: ABL, toMode: Lrgb): OklabDefinitionMixin = {
      val __obj = js.Dynamic.literal(fromMode = fromMode.asInstanceOf[js.Any], mode = "oklab", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--oklab", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[OklabDefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OklabDefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setFromMode(value: LrgbRgb): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: oklab): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[`--oklab`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: `--oklab`*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setRanges(value: ABL): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: `--oklab`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: Lrgb): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
