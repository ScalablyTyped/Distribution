package typings.culori

import typings.culori.anon.AlphaB
import typings.culori.anon.BL
import typings.culori.anon.`16`
import typings.culori.anon.`17`
import typings.culori.culoriStrings.`--lab-d65`
import typings.culori.culoriStrings.a
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.lab65
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLab65DefinitionMod {
  
  /* Inlined std.Omit<{  mode :'lab',   toMode :{  xyz50 :typeof convertLabToXyz50,   rgb :typeof convertLabToRgb},   fromMode :{  xyz50 :typeof convertXyz50ToLab,   rgb :typeof convertRgbToLab},   channels :['l', 'a', 'b', 'alpha'],   ranges :{  l :[0, 100],   a :[-79.287, 93.55],   b :[-112.029, 93.388]},   parse :[typeof parseLab], serialize (c : std.Omit<culori.culori/src/lab/types.Lab, 'mode'>): string,   interpolate :{  l :typeof interpolatorLinear,   a :typeof interpolatorLinear,   b :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}}}, keyof culori.culori/src/lab65/definition.Lab65DefinitionMixin> & culori.culori/src/lab65/definition.Lab65DefinitionMixin */
  object default {
    
    @JSImport("culori/src/lab65/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/lab65/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[l, a, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[l, a, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab65/definition", "default.fromMode")
    @js.native
    def fromMode: `17` = js.native
    inline def fromMode_=(x: `17`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab65/definition", "default.interpolate")
    @js.native
    def interpolate: AlphaB = js.native
    inline def interpolate_=(x: AlphaB): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab65/definition", "default.mode")
    @js.native
    def mode: lab65 = js.native
    inline def mode_=(x: lab65): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab65/definition", "default.parse")
    @js.native
    def parse: js.Array[`--lab-d65`] = js.native
    inline def parse_=(x: js.Array[`--lab-d65`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab65/definition", "default.ranges")
    @js.native
    def ranges: BL = js.native
    inline def ranges_=(x: BL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab65/definition", "default.serialize")
    @js.native
    def serialize: `--lab-d65` = js.native
    inline def serialize_=(x: `--lab-d65`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lab65/definition", "default.toMode")
    @js.native
    def toMode: `16` = js.native
    inline def toMode_=(x: `16`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait Lab65DefinitionMixin extends StObject {
    
    var fromMode: `17`
    
    var mode: lab65
    
    var parse: js.Array[`--lab-d65`]
    
    var ranges: BL
    
    var serialize: `--lab-d65`
    
    var toMode: `16`
  }
  object Lab65DefinitionMixin {
    
    inline def apply(fromMode: `17`, parse: js.Array[`--lab-d65`], ranges: BL, toMode: `16`): Lab65DefinitionMixin = {
      val __obj = js.Dynamic.literal(fromMode = fromMode.asInstanceOf[js.Any], mode = "lab65", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--lab-d65", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lab65DefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lab65DefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setFromMode(value: `17`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: lab65): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[`--lab-d65`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: `--lab-d65`*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setRanges(value: BL): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: `--lab-d65`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: `16`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
