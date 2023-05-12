package typings.culori

import typings.culori.anon.Alpha
import typings.culori.anon.`38`
import typings.culori.anon.`39`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.g
import typings.culori.culoriStrings.r
import typings.culori.culoriStrings.rec2020
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcRec2020DefinitionMod {
  
  /* Inlined std.Omit<{  mode :'rgb',   channels :['r', 'g', 'b', 'alpha'],   parse :[typeof parseHex, typeof parseRgb, typeof parseNamed, typeof parseTransparent, 'srgb'],   serialize :'srgb',   interpolate :{  r :typeof interpolatorLinear,   g :typeof interpolatorLinear,   b :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}}}, keyof culori.culori/src/rec2020/definition.Rec2020DefinitionMixin> & culori.culori/src/rec2020/definition.Rec2020DefinitionMixin */
  object default {
    
    @JSImport("culori/src/rec2020/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/rec2020/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[r, g, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[r, g, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/rec2020/definition", "default.fromMode")
    @js.native
    def fromMode: `38` = js.native
    inline def fromMode_=(x: `38`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/rec2020/definition", "default.interpolate")
    @js.native
    def interpolate: Alpha = js.native
    inline def interpolate_=(x: Alpha): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/rec2020/definition", "default.mode")
    @js.native
    def mode: rec2020 = js.native
    inline def mode_=(x: rec2020): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/rec2020/definition", "default.parse")
    @js.native
    def parse: js.Array[rec2020] = js.native
    inline def parse_=(x: js.Array[rec2020]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/rec2020/definition", "default.serialize")
    @js.native
    def serialize: rec2020 = js.native
    inline def serialize_=(x: rec2020): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/rec2020/definition", "default.toMode")
    @js.native
    def toMode: `39` = js.native
    inline def toMode_=(x: `39`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait Rec2020DefinitionMixin extends StObject {
    
    var fromMode: `38`
    
    var mode: rec2020
    
    var parse: js.Array[rec2020]
    
    var serialize: rec2020
    
    var toMode: `39`
  }
  object Rec2020DefinitionMixin {
    
    inline def apply(fromMode: `38`, parse: js.Array[rec2020], toMode: `39`): Rec2020DefinitionMixin = {
      val __obj = js.Dynamic.literal(fromMode = fromMode.asInstanceOf[js.Any], mode = "rec2020", parse = parse.asInstanceOf[js.Any], serialize = "rec2020", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rec2020DefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Rec2020DefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setFromMode(value: `38`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: rec2020): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[rec2020]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: rec2020*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setSerialize(value: rec2020): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: `39`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
