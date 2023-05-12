package typings.culori.anon

import typings.culori.culoriStrings.`--lchuv`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.c
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.lchuv
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsDifference
  extends StObject
     with _Definition {
  
  var average: `19`
  
  var channels: js.Tuple4[l, c, h, alpha]
  
  var difference: `20`
  
  var fromMode: `67`
  
  var interpolate: AlphaCHL
  
  var mode: lchuv
  
  var parse: js.Array[`--lchuv`]
  
  var ranges: `24`
  
  var serialize: `--lchuv`
  
  var toMode: `66`
}
object ChannelsDifference {
  
  inline def apply(
    average: `19`,
    channels: js.Tuple4[l, c, h, alpha],
    difference: `20`,
    fromMode: `67`,
    interpolate: AlphaCHL,
    parse: js.Array[`--lchuv`],
    ranges: `24`,
    toMode: `66`
  ): ChannelsDifference = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "lchuv", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--lchuv", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelsDifference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelsDifference] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: `19`): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Tuple4[l, c, h, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setDifference(value: `20`): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `67`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: AlphaCHL): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: lchuv): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Array[`--lchuv`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(value: `--lchuv`*): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: `24`): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `--lchuv`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: `66`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
