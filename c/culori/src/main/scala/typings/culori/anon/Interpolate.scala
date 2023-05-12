package typings.culori.anon

import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.hsl
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.s
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interpolate
  extends StObject
     with _Definition {
  
  var average: `19`
  
  var channels: js.Tuple4[h, s, l, alpha]
  
  var difference: `28`
  
  var fromMode: `52`
  
  var interpolate: AlphaH
  
  var mode: hsl
  
  var parse: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof parseHsl */ js.Any
  ]
  
  var ranges: `7`
  
  def serialize(c: OmitHslmode): String
  
  var toMode: `51`
}
object Interpolate {
  
  inline def apply(
    average: `19`,
    channels: js.Tuple4[h, s, l, alpha],
    difference: `28`,
    fromMode: `52`,
    interpolate: AlphaH,
    parse: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof parseHsl */ js.Any
    ],
    ranges: `7`,
    serialize: OmitHslmode => String,
    toMode: `51`
  ): Interpolate = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "hsl", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize), toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Interpolate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Interpolate] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: `19`): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Tuple4[h, s, l, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setDifference(value: `28`): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `52`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: AlphaH): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: hsl): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parseHsl */ js.Any
        ]
    ): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typeof parseHsl */ js.Any)*
    ): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: `7`): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: OmitHslmode => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    inline def setToMode(value: `51`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
