package typings.culori

import typings.culori.anon.Alpha
import typings.culori.anon.RgbFn0
import typings.culori.anon.RgbFn1
import typings.culori.anon.`25`
import typings.culori.culoriStrings.`--srgb-linear`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.g
import typings.culori.culoriStrings.lrgb
import typings.culori.culoriStrings.r
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLrgbDefinitionMod {
  
  /* Inlined std.Omit<{  mode :'rgb',   channels :['r', 'g', 'b', 'alpha'],   parse :[typeof parseHex, typeof parseRgb, typeof parseNamed, typeof parseTransparent, 'srgb'],   serialize :'srgb',   interpolate :{  r :typeof interpolatorLinear,   g :typeof interpolatorLinear,   b :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}}}, keyof culori.culori/src/lrgb/definition.LrgbDefinitionMixin> & culori.culori/src/lrgb/definition.LrgbDefinitionMixin */
  object default {
    
    @JSImport("culori/src/lrgb/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/lrgb/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[r, g, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[r, g, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lrgb/definition", "default.fromMode")
    @js.native
    def fromMode: `25` = js.native
    inline def fromMode_=(x: `25`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lrgb/definition", "default.interpolate")
    @js.native
    def interpolate: Alpha = js.native
    inline def interpolate_=(x: Alpha): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lrgb/definition", "default.mode")
    @js.native
    def mode: lrgb = js.native
    inline def mode_=(x: lrgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lrgb/definition", "default.parse")
    @js.native
    def parse: js.Array[`--srgb-linear`] = js.native
    inline def parse_=(x: js.Array[`--srgb-linear`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lrgb/definition", "default.serialize")
    @js.native
    def serialize: `--srgb-linear` = js.native
    inline def serialize_=(x: `--srgb-linear`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lrgb/definition", "default.toMode")
    @js.native
    def toMode: RgbFn0 = js.native
    inline def toMode_=(x: RgbFn0): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait LrgbDefinitionMixin extends StObject {
    
    var fromMode: `25`
    
    var mode: lrgb
    
    var parse: js.Array[`--srgb-linear`]
    
    var serialize: `--srgb-linear`
    
    var toMode: RgbFn1
  }
  object LrgbDefinitionMixin {
    
    inline def apply(fromMode: `25`, parse: js.Array[`--srgb-linear`], toMode: RgbFn1): LrgbDefinitionMixin = {
      val __obj = js.Dynamic.literal(fromMode = fromMode.asInstanceOf[js.Any], mode = "lrgb", parse = parse.asInstanceOf[js.Any], serialize = "--srgb-linear", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[LrgbDefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LrgbDefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setFromMode(value: `25`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: lrgb): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[`--srgb-linear`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: `--srgb-linear`*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setSerialize(value: `--srgb-linear`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: RgbFn1): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
