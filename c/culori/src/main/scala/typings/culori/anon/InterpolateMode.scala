package typings.culori.anon

import typings.culori.culoriStrings.`--xyz-d65`
import typings.culori.culoriStrings.`xyz-d65`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.x
import typings.culori.culoriStrings.xyz
import typings.culori.culoriStrings.xyz65
import typings.culori.culoriStrings.y
import typings.culori.culoriStrings.z
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InterpolateMode
  extends StObject
     with _Definition {
  
  var channels: js.Tuple4[x, y, z, alpha]
  
  var fromMode: `73`
  
  var interpolate: AlphaX
  
  var mode: xyz65
  
  var parse: js.Tuple3[xyz, `xyz-d65`, `--xyz-d65`]
  
  var ranges: Z
  
  var serialize: `xyz-d65`
  
  var toMode: `72`
}
object InterpolateMode {
  
  inline def apply(
    channels: js.Tuple4[x, y, z, alpha],
    fromMode: `73`,
    interpolate: AlphaX,
    parse: js.Tuple3[xyz, `xyz-d65`, `--xyz-d65`],
    ranges: Z,
    toMode: `72`
  ): InterpolateMode = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "xyz65", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "xyz-d65", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[InterpolateMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InterpolateMode] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Tuple4[typings.culori.culoriStrings.x, y, z, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `73`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: AlphaX): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: xyz65): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Tuple3[xyz, `xyz-d65`, `--xyz-d65`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setRanges(value: Z): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `xyz-d65`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: `72`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
