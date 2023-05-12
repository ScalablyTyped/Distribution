package typings.culori

import typings.culori.anon.Alpha
import typings.culori.anon.`36`
import typings.culori.anon.`37`
import typings.culori.culoriStrings.`prophoto-rgb`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.g
import typings.culori.culoriStrings.prophoto
import typings.culori.culoriStrings.r
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcProphotoDefinitionMod {
  
  /* Inlined std.Omit<{  mode :'rgb',   channels :['r', 'g', 'b', 'alpha'],   parse :[typeof parseHex, typeof parseRgb, typeof parseNamed, typeof parseTransparent, 'srgb'],   serialize :'srgb',   interpolate :{  r :typeof interpolatorLinear,   g :typeof interpolatorLinear,   b :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}}}, keyof culori.culori/src/prophoto/definition.ProphotoDefinitionMixin> & culori.culori/src/prophoto/definition.ProphotoDefinitionMixin */
  object default {
    
    @JSImport("culori/src/prophoto/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/prophoto/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[r, g, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[r, g, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/prophoto/definition", "default.fromMode")
    @js.native
    def fromMode: `36` = js.native
    inline def fromMode_=(x: `36`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/prophoto/definition", "default.interpolate")
    @js.native
    def interpolate: Alpha = js.native
    inline def interpolate_=(x: Alpha): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/prophoto/definition", "default.mode")
    @js.native
    def mode: prophoto = js.native
    inline def mode_=(x: prophoto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/prophoto/definition", "default.parse")
    @js.native
    def parse: js.Array[`prophoto-rgb`] = js.native
    inline def parse_=(x: js.Array[`prophoto-rgb`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/prophoto/definition", "default.serialize")
    @js.native
    def serialize: `prophoto-rgb` = js.native
    inline def serialize_=(x: `prophoto-rgb`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/prophoto/definition", "default.toMode")
    @js.native
    def toMode: `37` = js.native
    inline def toMode_=(x: `37`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait ProphotoDefinitionMixin extends StObject {
    
    var fromMode: `36`
    
    var mode: prophoto
    
    var parse: js.Array[`prophoto-rgb`]
    
    var serialize: `prophoto-rgb`
    
    var toMode: `37`
  }
  object ProphotoDefinitionMixin {
    
    inline def apply(fromMode: `36`, parse: js.Array[`prophoto-rgb`], toMode: `37`): ProphotoDefinitionMixin = {
      val __obj = js.Dynamic.literal(fromMode = fromMode.asInstanceOf[js.Any], mode = "prophoto", parse = parse.asInstanceOf[js.Any], serialize = "prophoto-rgb", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProphotoDefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProphotoDefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setFromMode(value: `36`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: prophoto): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[`prophoto-rgb`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: `prophoto-rgb`*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setSerialize(value: `prophoto-rgb`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: `37`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
