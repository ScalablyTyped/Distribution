package typings.culori.anon

import typings.culori.culoriStrings.`--hsv`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.hsv
import typings.culori.culoriStrings.s
import typings.culori.culoriStrings.v
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mode
  extends StObject
     with _Definition {
  
  var average: `19`
  
  var channels: js.Tuple4[h, s, v, alpha]
  
  var difference: `28`
  
  var fromMode: `54`
  
  var interpolate: HS
  
  var mode: hsv
  
  var parse: js.Array[`--hsv`]
  
  var ranges: `7`
  
  var serialize: `--hsv`
  
  var toMode: `53`
}
object Mode {
  
  inline def apply(
    average: `19`,
    channels: js.Tuple4[h, s, v, alpha],
    difference: `28`,
    fromMode: `54`,
    interpolate: HS,
    parse: js.Array[`--hsv`],
    ranges: `7`,
    toMode: `53`
  ): Mode = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "hsv", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--hsv", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Mode] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: `19`): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Tuple4[h, s, v, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setDifference(value: `28`): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `54`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: HS): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: hsv): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Array[`--hsv`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(value: `--hsv`*): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: `7`): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `--hsv`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: `53`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
