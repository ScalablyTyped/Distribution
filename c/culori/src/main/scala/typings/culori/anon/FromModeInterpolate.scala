package typings.culori.anon

import typings.culori.culoriStrings.`--xyz-d50`
import typings.culori.culoriStrings.`xyz-d50`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.x
import typings.culori.culoriStrings.xyz50
import typings.culori.culoriStrings.y
import typings.culori.culoriStrings.z
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FromModeInterpolate
  extends StObject
     with _Definition {
  
  var channels: js.Tuple4[x, y, z, alpha]
  
  var fromMode: `71`
  
  var interpolate: AlphaX
  
  var mode: xyz50
  
  var parse: js.Tuple2[`xyz-d50`, `--xyz-d50`]
  
  var ranges: X
  
  var serialize: `xyz-d50`
  
  var toMode: `70`
}
object FromModeInterpolate {
  
  inline def apply(
    channels: js.Tuple4[x, y, z, alpha],
    fromMode: `71`,
    interpolate: AlphaX,
    parse: js.Tuple2[`xyz-d50`, `--xyz-d50`],
    ranges: X,
    toMode: `70`
  ): FromModeInterpolate = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "xyz50", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "xyz-d50", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FromModeInterpolate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FromModeInterpolate] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Tuple4[typings.culori.culoriStrings.x, y, z, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `71`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: AlphaX): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: xyz50): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Tuple2[`xyz-d50`, `--xyz-d50`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: X): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `xyz-d50`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: `70`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
