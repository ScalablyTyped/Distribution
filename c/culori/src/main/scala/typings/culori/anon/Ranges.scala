package typings.culori.anon

import typings.culori.culoriStrings.`--jzazbz`
import typings.culori.culoriStrings.a
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.j
import typings.culori.culoriStrings.jab
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ranges
  extends StObject
     with _Definition {
  
  var channels: js.Tuple4[j, a, b, alpha]
  
  var fromMode: `58`
  
  var interpolate: BJ
  
  var mode: jab
  
  var parse: js.Array[`--jzazbz`]
  
  var ranges: J
  
  var serialize: `--jzazbz`
  
  var toMode: `59`
}
object Ranges {
  
  inline def apply(
    channels: js.Tuple4[j, a, b, alpha],
    fromMode: `58`,
    interpolate: BJ,
    parse: js.Array[`--jzazbz`],
    ranges: J,
    toMode: `59`
  ): Ranges = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "jab", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--jzazbz", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ranges]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Ranges] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Tuple4[j, a, b, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `58`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: BJ): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: jab): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Array[`--jzazbz`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(value: `--jzazbz`*): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: J): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `--jzazbz`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: `59`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
