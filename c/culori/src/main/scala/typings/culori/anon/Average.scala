package typings.culori.anon

import typings.culori.culoriStrings.`--cubehelix`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.cubehelix
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.s
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Average
  extends StObject
     with _Definition {
  
  var average: `19`
  
  var channels: js.Tuple4[h, s, l, alpha]
  
  var difference: `28`
  
  var fromMode: `46`
  
  var interpolate: AlphaH
  
  var mode: cubehelix
  
  var parse: js.Array[`--cubehelix`]
  
  var ranges: H
  
  var serialize: `--cubehelix`
  
  var toMode: `47`
}
object Average {
  
  inline def apply(
    average: `19`,
    channels: js.Tuple4[h, s, l, alpha],
    difference: `28`,
    fromMode: `46`,
    interpolate: AlphaH,
    parse: js.Array[`--cubehelix`],
    ranges: H,
    toMode: `47`
  ): Average = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "cubehelix", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--cubehelix", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Average]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Average] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: `19`): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Tuple4[h, s, l, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setDifference(value: `28`): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `46`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: AlphaH): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: cubehelix): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Array[`--cubehelix`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(value: `--cubehelix`*): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: H): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `--cubehelix`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: `47`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
