package typings.culori.anon

import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.hwb
import typings.culori.culoriStrings.w
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse
  extends StObject
     with _Definition {
  
  var average: `19`
  
  var channels: js.Tuple4[h, w, b, alpha]
  
  var difference: `57`
  
  var fromMode: `56`
  
  var interpolate: BH
  
  var mode: hwb
  
  var parse: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof parseHwb */ js.Any
  ]
  
  var ranges: `7`
  
  def serialize(c: OmitHwbmode): String
  
  var toMode: `55`
}
object Parse {
  
  inline def apply(
    average: `19`,
    channels: js.Tuple4[h, w, b, alpha],
    difference: `57`,
    fromMode: `56`,
    interpolate: BH,
    parse: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof parseHwb */ js.Any
    ],
    ranges: `7`,
    serialize: OmitHwbmode => String,
    toMode: `55`
  ): Parse = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "hwb", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize), toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Parse] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: `19`): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Tuple4[h, w, b, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setDifference(value: `57`): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `56`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: BH): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: hwb): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parseHwb */ js.Any
        ]
    ): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typeof parseHwb */ js.Any)*
    ): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: `7`): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: OmitHwbmode => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    inline def setToMode(value: `55`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
