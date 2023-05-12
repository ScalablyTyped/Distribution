package typings.culori

import typings.culori.anon.AlphaCHL
import typings.culori.anon.`19`
import typings.culori.anon.`20`
import typings.culori.anon.`31`
import typings.culori.anon.`32`
import typings.culori.anon.`33`
import typings.culori.culoriStrings.`--oklch`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.c
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.oklch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOklchDefinitionMod {
  
  /* Inlined std.Omit<{  mode :'lch',   toMode :{  lab :typeof convertLchToLab, rgb (c : std.Omit<culori.culori/src/lch/types.Lch, 'mode'>): culori.culori/src/rgb/types.Rgb},   fromMode :{rgb (c : std.Omit<culori.culori/src/rgb/types.Rgb, 'mode'>): culori.culori/src/lch/types.Lch,   lab :typeof convertLabToLch},   channels :['l', 'c', 'h', 'alpha'],   ranges :{  l :[0, 100],   c :[0, 131.207],   h :[0, 360]},   parse :[typeof parseLch], serialize (c : std.Omit<culori.culori/src/lch/types.Lch, 'mode'>): string,   interpolate :{  h :{  use :typeof interpolatorLinear,   fixup :typeof fixupHueShorter},   c :typeof interpolatorLinear,   l :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}},   difference :{  h :typeof differenceHueChroma},   average :{  h :typeof averageAngle}}, keyof culori.culori/src/oklch/definition.OklchDefinitionMixin> & culori.culori/src/oklch/definition.OklchDefinitionMixin */
  object default {
    
    @JSImport("culori/src/oklch/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/oklch/definition", "default.average")
    @js.native
    def average: `19` = js.native
    inline def average_=(x: `19`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("average")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklch/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[l, c, h, alpha] = js.native
    inline def channels_=(x: js.Tuple4[l, c, h, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklch/definition", "default.difference")
    @js.native
    def difference: `20` = js.native
    inline def difference_=(x: `20`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("difference")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklch/definition", "default.fromMode")
    @js.native
    def fromMode: `32` = js.native
    inline def fromMode_=(x: `32`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklch/definition", "default.interpolate")
    @js.native
    def interpolate: AlphaCHL = js.native
    inline def interpolate_=(x: AlphaCHL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklch/definition", "default.mode")
    @js.native
    def mode: oklch = js.native
    inline def mode_=(x: oklch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklch/definition", "default.parse")
    @js.native
    def parse: js.Array[`--oklch`] = js.native
    inline def parse_=(x: js.Array[`--oklch`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklch/definition", "default.ranges")
    @js.native
    def ranges: `33` = js.native
    inline def ranges_=(x: `33`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklch/definition", "default.serialize")
    @js.native
    def serialize: `--oklch` = js.native
    inline def serialize_=(x: `--oklch`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/oklch/definition", "default.toMode")
    @js.native
    def toMode: `31` = js.native
    inline def toMode_=(x: `31`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait OklchDefinitionMixin extends StObject {
    
    var fromMode: `32`
    
    var mode: oklch
    
    var parse: js.Array[`--oklch`]
    
    var ranges: `33`
    
    var serialize: `--oklch`
    
    var toMode: `31`
  }
  object OklchDefinitionMixin {
    
    inline def apply(fromMode: `32`, parse: js.Array[`--oklch`], ranges: `33`, toMode: `31`): OklchDefinitionMixin = {
      val __obj = js.Dynamic.literal(fromMode = fromMode.asInstanceOf[js.Any], mode = "oklch", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--oklch", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[OklchDefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OklchDefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setFromMode(value: `32`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: oklch): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[`--oklch`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: `--oklch`*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setRanges(value: `33`): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: `--oklch`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: `31`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
