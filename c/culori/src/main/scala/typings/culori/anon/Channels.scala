package typings.culori.anon

import typings.culori.culoriStrings.`--din99o-lab`
import typings.culori.culoriStrings.a
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.dlab
import typings.culori.culoriStrings.l
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channels
  extends StObject
     with _Definition {
  
  var channels: js.Tuple4[l, a, b, alpha]
  
  var fromMode: Lab65Rgb
  
  var interpolate: AlphaB
  
  var mode: dlab
  
  var parse: js.Array[`--din99o-lab`]
  
  var ranges: A
  
  var serialize: `--din99o-lab`
  
  var toMode: Lab65
}
object Channels {
  
  inline def apply(
    channels: js.Tuple4[l, a, b, alpha],
    fromMode: Lab65Rgb,
    interpolate: AlphaB,
    parse: js.Array[`--din99o-lab`],
    ranges: A,
    toMode: Lab65
  ): Channels = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "dlab", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--din99o-lab", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channels]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Channels] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Tuple4[l, a, b, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: Lab65Rgb): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: AlphaB): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: dlab): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Array[`--din99o-lab`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(value: `--din99o-lab`*): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: A): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `--din99o-lab`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: Lab65): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
