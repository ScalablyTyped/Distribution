package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lg extends StObject {
  
  var lg: `15`
  
  var max: `17`
  
  var md: FontSizeLetterSpacingLineHeight
  
  var xlg: `16`
}
object Lg {
  
  inline def apply(lg: `15`, max: `17`, md: FontSizeLetterSpacingLineHeight, xlg: `16`): Lg = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], xlg = xlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lg]
  }
  
  extension [Self <: Lg](x: Self) {
    
    inline def setLg(value: `15`): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: `17`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMd(value: FontSizeLetterSpacingLineHeight): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setXlg(value: `16`): Self = StObject.set(x, "xlg", value.asInstanceOf[js.Any])
  }
}
