package typings.culori.anon

import typings.culori.culoriStrings.a
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.b
import typings.culori.culoriStrings.l
import typings.culori.culoriStrings.lab
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToMode
  extends StObject
     with _Definition {
  
  var channels: js.Tuple4[l, a, b, alpha]
  
  var fromMode: `63`
  
  var interpolate: AlphaB
  
  var mode: lab
  
  var parse: js.Array[
    /* import warning: importer.ImportType#apply Failed type conversion: typeof parseLab */ js.Any
  ]
  
  var ranges: AB
  
  def serialize(c: OmitLabmode): String
  
  var toMode: `62`
}
object ToMode {
  
  inline def apply(
    channels: js.Tuple4[l, a, b, alpha],
    fromMode: `63`,
    interpolate: AlphaB,
    parse: js.Array[
      /* import warning: importer.ImportType#apply Failed type conversion: typeof parseLab */ js.Any
    ],
    ranges: AB,
    serialize: OmitLabmode => String,
    toMode: `62`
  ): ToMode = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "lab", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = js.Any.fromFunction1(serialize), toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ToMode] (val x: Self) extends AnyVal {
    
    inline def setChannels(value: js.Tuple4[l, a, b, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `63`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: AlphaB): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: lab): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(
      value: js.Array[
          /* import warning: importer.ImportType#apply Failed type conversion: typeof parseLab */ js.Any
        ]
    ): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(
      value: (/* import warning: importer.ImportType#apply Failed type conversion: typeof parseLab */ js.Any)*
    ): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: AB): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: OmitLabmode => String): Self = StObject.set(x, "serialize", js.Any.fromFunction1(value))
    
    inline def setToMode(value: `62`): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
