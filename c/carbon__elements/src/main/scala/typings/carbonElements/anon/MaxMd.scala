package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxMd extends StObject {
  
  var lg: FontSizeFontWeightLetterSpacing
  
  var max: `13`
  
  var md: FontWeightLetterSpacing
  
  var xlg: FontWeightLetterSpacingLineHeight
}
object MaxMd {
  
  inline def apply(
    lg: FontSizeFontWeightLetterSpacing,
    max: `13`,
    md: FontWeightLetterSpacing,
    xlg: FontWeightLetterSpacingLineHeight
  ): MaxMd = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], xlg = xlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxMd]
  }
  
  extension [Self <: MaxMd](x: Self) {
    
    inline def setLg(value: FontSizeFontWeightLetterSpacing): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: `13`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMd(value: FontWeightLetterSpacing): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setXlg(value: FontWeightLetterSpacingLineHeight): Self = StObject.set(x, "xlg", value.asInstanceOf[js.Any])
  }
}
