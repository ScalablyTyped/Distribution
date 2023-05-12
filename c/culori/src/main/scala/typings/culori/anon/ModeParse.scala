package typings.culori.anon

import typings.culori.culoriStrings.`--yiq`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.i
import typings.culori.culoriStrings.q
import typings.culori.culoriStrings.y
import typings.culori.culoriStrings.yiq
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModeParse
  extends StObject
     with _Definition {
  
  var channels: js.Tuple4[y, i, q, alpha]
  
  var fromMode: `75`
  
  var interpolate: IQ
  
  var mode: yiq
  
  var parse: js.Array[`--yiq`]
  
  var ranges: Q
  
  var serialize: `--yiq`
  
  var toMode: `74`
}
object ModeParse {
  
  inline def apply(
    channels: js.Tuple4[y, i, q, alpha],
    fromMode: `75`,
    interpolate: IQ,
    parse: js.Array[`--yiq`],
    ranges: Q,
    toMode: `74`
  ): ModeParse = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "yiq", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--yiq", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModeParse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModeParse] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Tuple4[y, i, q, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `75`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: IQ): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: yiq): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Array[`--yiq`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(value: `--yiq`*): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: Q): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `--yiq`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: `74`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
