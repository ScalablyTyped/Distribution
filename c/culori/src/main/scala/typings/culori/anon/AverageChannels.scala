package typings.culori.anon

import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.c
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.lch
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AverageChannels
  extends StObject
     with _Definition {
  
  var average: `19`
  
  var channels: js.Tuple4[l, c, h, alpha]
  
  var difference: `20`
  
  var fromMode: `65`
  
  var interpolate: AlphaCHL
  
  var mode: lch
  
  var parse: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof parseLch */ js.Any
  ]
  
  var ranges: HL
  
  def serialize(c: OmitLchmode): String
  
  var toMode: `64`
}
object AverageChannels {
  
  inline def apply(
    average: `19`,
    channels: js.Tuple4[l, c, h, alpha],
    difference: `20`,
    fromMode: `65`,
    interpolate: AlphaCHL,
    parse: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof parseLch */ js.Any
    ],
    ranges: HL,
    serialize: OmitLchmode => String,
    toMode: `64`
  ): AverageChannels = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "lch", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize), toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[AverageChannels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AverageChannels] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: `19`): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Tuple4[l, c, h, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setDifference(value: `20`): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `65`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: AlphaCHL): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: lch): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parseLch */ js.Any
        ]
    ): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typeof parseLch */ js.Any)*
    ): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: HL): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: OmitLchmode => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    inline def setToMode(value: `64`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
