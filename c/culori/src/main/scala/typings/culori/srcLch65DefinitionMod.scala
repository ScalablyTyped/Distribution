package typings.culori

import typings.culori.anon.AlphaCHL
import typings.culori.anon.`19`
import typings.culori.anon.`20`
import typings.culori.anon.`21`
import typings.culori.anon.`22`
import typings.culori.anon.`23`
import typings.culori.culoriStrings.`--lch-d65`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.c
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.lch65
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcLch65DefinitionMod {
  
  /* Inlined std.Omit<{  mode :'lch',   toMode :{  lab :typeof convertLchToLab, rgb (c : std.Omit<culori.culori/src/lch/types.Lch, 'mode'>): culori.culori/src/rgb/types.Rgb},   fromMode :{rgb (c : std.Omit<culori.culori/src/rgb/types.Rgb, 'mode'>): culori.culori/src/lch/types.Lch,   lab :typeof convertLabToLch},   channels :['l', 'c', 'h', 'alpha'],   ranges :{  l :[0, 100],   c :[0, 131.207],   h :[0, 360]},   parse :[typeof parseLch], serialize (c : std.Omit<culori.culori/src/lch/types.Lch, 'mode'>): string,   interpolate :{  h :{  use :typeof interpolatorLinear,   fixup :typeof fixupHueShorter},   c :typeof interpolatorLinear,   l :typeof interpolatorLinear,   alpha :{  use :typeof interpolatorLinear,   fixup :typeof fixupAlpha}},   difference :{  h :typeof differenceHueChroma},   average :{  h :typeof averageAngle}}, keyof culori.culori/src/lch65/definition.Lch65DefinitionMixin> & culori.culori/src/lch65/definition.Lch65DefinitionMixin */
  object default {
    
    @JSImport("culori/src/lch65/definition", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("culori/src/lch65/definition", "default.average")
    @js.native
    def average: `19` = js.native
    inline def average_=(x: `19`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("average")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch65/definition", "default.channels")
    @js.native
    def channels: js.Tuple4[l, c, h, alpha] = js.native
    inline def channels_=(x: js.Tuple4[l, c, h, alpha]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("channels")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch65/definition", "default.difference")
    @js.native
    def difference: `20` = js.native
    inline def difference_=(x: `20`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("difference")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch65/definition", "default.fromMode")
    @js.native
    def fromMode: `22` = js.native
    inline def fromMode_=(x: `22`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fromMode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch65/definition", "default.interpolate")
    @js.native
    def interpolate: AlphaCHL = js.native
    inline def interpolate_=(x: AlphaCHL): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolate")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch65/definition", "default.mode")
    @js.native
    def mode: lch65 = js.native
    inline def mode_=(x: lch65): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch65/definition", "default.parse")
    @js.native
    def parse: js.Array[`--lch-d65`] = js.native
    inline def parse_=(x: js.Array[`--lch-d65`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parse")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch65/definition", "default.ranges")
    @js.native
    def ranges: `23` = js.native
    inline def ranges_=(x: `23`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ranges")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch65/definition", "default.serialize")
    @js.native
    def serialize: `--lch-d65` = js.native
    inline def serialize_=(x: `--lch-d65`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serialize")(x.asInstanceOf[js.Any])
    
    @JSImport("culori/src/lch65/definition", "default.toMode")
    @js.native
    def toMode: `21` = js.native
    inline def toMode_=(x: `21`): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toMode")(x.asInstanceOf[js.Any])
  }
  
  trait Lch65DefinitionMixin extends StObject {
    
    var fromMode: `22`
    
    var mode: lch65
    
    var parse: js.Array[`--lch-d65`]
    
    var ranges: `23`
    
    var serialize: `--lch-d65`
    
    var toMode: `21`
  }
  object Lch65DefinitionMixin {
    
    inline def apply(fromMode: `22`, parse: js.Array[`--lch-d65`], ranges: `23`, toMode: `21`): Lch65DefinitionMixin = {
      val __obj = js.Dynamic.literal(fromMode = fromMode.asInstanceOf[js.Any], mode = "lch65", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--lch-d65", toMode = toMode.asInstanceOf[js.Any])
      __obj.asInstanceOf[Lch65DefinitionMixin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Lch65DefinitionMixin] (val x: Self) extends AnyVal {
      
      inline def setFromMode(value: `22`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
      
      inline def setMode(value: lch65): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setParse(value: js.Array[`--lch-d65`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseVarargs(value: `--lch-d65`*): Self = StObject.set(x, "parse", js.Array(value*))
      
      inline def setRanges(value: `23`): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
      
      inline def setSerialize(value: `--lch-d65`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setToMode(value: `21`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
    }
  }
}
