package typings.culori.anon

import typings.culori.culoriStrings.`--hsi`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.hsi
import typings.culori.culoriStrings.i
import typings.culori.culoriStrings.s
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromMode
  extends StObject
     with _Definition {
  
  var average: `19`
  
  var channels: js.Tuple4[h, s, i, alpha]
  
  var difference: `28`
  
  var fromMode: `50`
  
  var interpolate: HI
  
  var mode: hsi
  
  var parse: js.Array[`--hsi`]
  
  var ranges: `7`
  
  var serialize: `--hsi`
  
  var toMode: `49`
}
object FromMode {
  
  inline def apply(
    average: `19`,
    channels: js.Tuple4[h, s, i, alpha],
    difference: `28`,
    fromMode: `50`,
    interpolate: HI,
    parse: js.Array[`--hsi`],
    ranges: `7`,
    toMode: `49`
  ): FromMode = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "hsi", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--hsi", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromMode] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: `19`): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Tuple4[h, s, i, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setDifference(value: `28`): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `50`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: HI): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: hsi): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Array[`--hsi`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(value: `--hsi`*): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: `7`): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `--hsi`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: `49`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
