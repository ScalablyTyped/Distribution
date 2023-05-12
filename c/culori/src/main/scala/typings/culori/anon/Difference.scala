package typings.culori.anon

import typings.culori.culoriStrings.`--din99o-lch`
import typings.culori.culoriStrings.alpha
import typings.culori.culoriStrings.c
import typings.culori.culoriStrings.dlch
import typings.culori.culoriStrings.h
import typings.culori.culoriStrings.l
import typings.culori.srcModesMod._Definition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Difference
  extends StObject
     with _Definition {
  
  var average: `19`
  
  var channels: js.Tuple4[l, c, h, alpha]
  
  var difference: `20`
  
  var fromMode: `48`
  
  var interpolate: AlphaFixup
  
  var mode: dlch
  
  var parse: js.Array[`--din99o-lch`]
  
  var ranges: C
  
  var serialize: `--din99o-lch`
  
  var toMode: DlabLab65Rgb
}
object Difference {
  
  inline def apply(
    average: `19`,
    channels: js.Tuple4[l, c, h, alpha],
    difference: `20`,
    fromMode: `48`,
    interpolate: AlphaFixup,
    parse: js.Array[`--din99o-lch`],
    ranges: C,
    toMode: DlabLab65Rgb
  ): Difference = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], channels = channels.asInstanceOf[js.Any], difference = difference.asInstanceOf[js.Any], fromMode = fromMode.asInstanceOf[js.Any], interpolate = interpolate.asInstanceOf[js.Any], mode = "dlch", parse = parse.asInstanceOf[js.Any], ranges = ranges.asInstanceOf[js.Any], serialize = "--din99o-lch", toMode = toMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Difference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Difference] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: `19`): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setChannels(value: js.Tuple4[l, c, h, alpha]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setDifference(value: `20`): Self = StObject.set(x, "difference", value.asInstanceOf[js.Any])
    
    inline def setFromMode(value: `48`): Self = StObject.set(x, "fromMode", value.asInstanceOf[js.Any])
    
    inline def setInterpolate(value: AlphaFixup): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
    
    inline def setMode(value: dlch): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setParse(value: js.Array[`--din99o-lch`]): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
    
    inline def setParseVarargs(value: `--din99o-lch`*): Self = StObject.set(x, "parse", js.Array(value*))
    
    inline def setRanges(value: C): Self = StObject.set(x, "ranges", value.asInstanceOf[js.Any])
    
    inline def setSerialize(value: `--din99o-lch`): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
    
    inline def setToMode(value: DlabLab65Rgb): Self = StObject.set(x, "toMode", value.asInstanceOf[js.Any])
  }
}
