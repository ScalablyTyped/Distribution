package typings.culori.anon

import typings.culori.culoriStrings.`--jzczhz`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.c
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.j
import typings.culori.culoriStrings.jch
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Serialize
  extends StObject
     with _Definition {
  
  var average: `19`
  
  var channels: js.Tuple4[j, c, h, alpha]
  
  var difference: `20`
  
  var fromMode: `61`
  
  var interpolate: CHJ
  
  var mode: jch
  
  var parse: js.Array[`--jzczhz`]
  
  var ranges: HJ
  
  var serialize: `--jzczhz`
  
  var toMode: `60`
}
object Serialize {
  
  inline def apply(
    average: `19`,
    channels: js.Tuple4[j, c, h, alpha],
    difference: `20`,
    fromMode: `61`,
    interpolate: CHJ,
    parse: js.Array[`--jzczhz`],
    ranges: HJ,
    toMode: `60`
  ): Serialize = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "jch", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--jzczhz", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Serialize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Serialize] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: `19`): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Tuple4[j, c, h, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setDifference(value: `20`): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `61`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: CHJ): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: jch): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Array[`--jzczhz`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(value: `--jzczhz`*): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: HJ): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `--jzczhz`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: `60`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
