package typings.culori.anon

import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.g
import typings.culori.culoriStrings.r
import typings.culori.culoriStrings.rgb
import typings.culori.culoriStrings.srgb
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelsInterpolate
  extends StObject
     with _Definition {
  
  var channels: js.Tuple4[r, g, b, alpha]
  
  var interpolate: Alpha
  
  var mode: rgb
  
  var parse: js.Tuple5[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof parseHex */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof parseRgb */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof parseNamed */ js.Any, 
    /* import warning: importer.ImportType#apply Failed type conversion: typeof parseTransparent */ js.Any, 
    srgb
  ]
  
  var serialize: srgb
}
object ChannelsInterpolate {
  
  inline def apply(
    channels: js.Tuple4[r, g, b, alpha],
    interpolate: Alpha,
    parse: js.Tuple5[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof parseHex */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof parseRgb */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof parseNamed */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: typeof parseTransparent */ js.Any, 
      srgb
    ]
  ): ChannelsInterpolate = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "rgb", parse = parse.asInstanceOf[js.Any], serialize = "srgb")
    __obj.asInstanceOf[ChannelsInterpolate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelsInterpolate] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Tuple4[r, g, b, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: Alpha): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: rgb): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(
      value: js.Tuple5[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parseHex */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parseRgb */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parseNamed */ js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parseTransparent */ js.Any, 
          srgb
        ]
    ): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: srgb): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
  }
}
