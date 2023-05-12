package typings.culori.anon

import typings.culori.culoriStrings.`--luv`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.luv
import typings.culori.culoriStrings.u
import typings.culori.culoriStrings.v
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsFromMode
  extends StObject
     with _Definition {
  
  var channels: js.Tuple4[l, u, v, alpha]
  
  var fromMode: `69`
  
  var interpolate: LU
  
  var mode: luv
  
  var parse: js.Array[`--luv`]
  
  var ranges: U
  
  var serialize: `--luv`
  
  var toMode: `68`
}
object ChannelsFromMode {
  
  inline def apply(
    channels: js.Tuple4[l, u, v, alpha],
    fromMode: `69`,
    interpolate: LU,
    parse: js.Array[`--luv`],
    ranges: U,
    toMode: `68`
  ): ChannelsFromMode = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "luv", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--luv", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelsFromMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelsFromMode] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Tuple4[l, u, v, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `69`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: LU): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: luv): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Array[`--luv`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(value: `--luv`*): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: U): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `--luv`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: `68`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
