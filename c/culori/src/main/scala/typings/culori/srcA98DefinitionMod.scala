package typings.culori

import typings.culori.anon.Alpha
import typings.culori.anon.Rgb
import typings.culori.anon.Xyz65
import typings.culori.culoriStrings.`a98-rgb`
import typings.culori.culoriStrings.a98
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.g
import typings.culori.culoriStrings.r
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcA98DefinitionMod {
  
  /* Inlined std.Omit<{  mode :'rgb',   channels :['r', 'g', 'b', 'alpha'],   parse :[typeof parseHex, typeof parseRgb, typeof parseNamed, typeof parseTransparent, 'srgb'],   serialize :'srgb',   interpolate :{  r :typeof interpolatorLinear,   g :typeof interpolatorLinear,   b :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}}}, keyof culori.culori/src/a98/definition.A98DefinitionMixin> & culori.culori/src/a98/definition.A98DefinitionMixin */
  object default {
    
    @JSImport("culori/src/a98/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/a98/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[r, g, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[r, g, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/a98/definition", "default.fromMode")
    @js.native
    def fromMode: Rgb = js.native
    inline def fromMode_=(x: Rgb): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/a98/definition", "default.interpolate")
    @js.native
    def interpolate: Alpha = js.native
    inline def interpolate_=(x: Alpha): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/a98/definition", "default.mode")
    @js.native
    def mode: a98 = js.native
    inline def mode_=(x: a98): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/a98/definition", "default.parse")
    @js.native
    def parse: js.Array[`a98-rgb`] = js.native
    inline def parse_=(x: js.Array[`a98-rgb`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/a98/definition", "default.serialize")
    @js.native
    def serialize: `a98-rgb` = js.native
    inline def serialize_=(x: `a98-rgb`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/a98/definition", "default.toMode")
    @js.native
    def toMode: Xyz65 = js.native
    inline def toMode_=(x: Xyz65): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait A98DefinitionMixin extends StObject {
    
    var fromMode: Rgb
    
    var mode: a98
    
    var parse: js.Array[`a98-rgb`]
    
    var serialize: `a98-rgb`
    
    var toMode: Xyz65
  }
  object A98DefinitionMixin {
    
    inline def apply(fromMode: Rgb, parse: js.Array[`a98-rgb`], toMode: Xyz65): A98DefinitionMixin = {
      val __obj = js.Dynamic.literal(fromMode = fromMode.asInstanceOf[js.Any], mode = "a98", parse = parse.asInstanceOf[js.Any], serialize = "a98-rgb", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[A98DefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: A98DefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setFromMode(value: Rgb): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: a98): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[`a98-rgb`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: `a98-rgb`*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setSerialize(value: `a98-rgb`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: Xyz65): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
