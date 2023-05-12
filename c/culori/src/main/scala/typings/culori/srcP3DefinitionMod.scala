package typings.culori

import typings.culori.anon.Alpha
import typings.culori.anon.`34`
import typings.culori.anon.`35`
import typings.culori.culoriStrings.`display-p3`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.g
import typings.culori.culoriStrings.p3
import typings.culori.culoriStrings.r
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcP3DefinitionMod {
  
  /* Inlined std.Omit<{  mode :'rgb',   channels :['r', 'g', 'b', 'alpha'],   parse :[typeof parseHex, typeof parseRgb, typeof parseNamed, typeof parseTransparent, 'srgb'],   serialize :'srgb',   interpolate :{  r :typeof interpolatorLinear,   g :typeof interpolatorLinear,   b :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}}}, keyof culori.culori/src/p3/definition.P3DefinitionMixin> & culori.culori/src/p3/definition.P3DefinitionMixin */
  object default {
    
    @JSImport("culori/src/p3/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/p3/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[r, g, b, alpha] = js.native
    inline def channels_=(x: js.Tuple4[r, g, b, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/p3/definition", "default.fromMode")
    @js.native
    def fromMode: `34` = js.native
    inline def fromMode_=(x: `34`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/p3/definition", "default.interpolate")
    @js.native
    def interpolate: Alpha = js.native
    inline def interpolate_=(x: Alpha): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/p3/definition", "default.mode")
    @js.native
    def mode: p3 = js.native
    inline def mode_=(x: p3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/p3/definition", "default.parse")
    @js.native
    def parse: js.Array[`display-p3`] = js.native
    inline def parse_=(x: js.Array[`display-p3`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/p3/definition", "default.serialize")
    @js.native
    def serialize: `display-p3` = js.native
    inline def serialize_=(x: `display-p3`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/p3/definition", "default.toMode")
    @js.native
    def toMode: `35` = js.native
    inline def toMode_=(x: `35`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait P3DefinitionMixin extends StObject {
    
    var fromMode: `34`
    
    var mode: p3
    
    var parse: js.Array[`display-p3`]
    
    var serialize: `display-p3`
    
    var toMode: `35`
  }
  object P3DefinitionMixin {
    
    inline def apply(fromMode: `34`, parse: js.Array[`display-p3`], toMode: `35`): P3DefinitionMixin = {
      val __obj = js.Dynamic.literal(fromMode = fromMode.asInstanceOf[js.Any], mode = "p3", parse = parse.asInstanceOf[js.Any], serialize = "display-p3", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[P3DefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: P3DefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setFromMode(value: `34`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: p3): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[`display-p3`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: `display-p3`*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setSerialize(value: `display-p3`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: `35`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
