package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Md extends StObject {
  
  var lg: LetterSpacing
  
  var max: FontSizeLetterSpacing
  
  var md: `3`
  
  var xlg: FontSizeLineHeight
}
object Md {
  
  inline def apply(lg: LetterSpacing, max: FontSizeLetterSpacing, md: `3`, xlg: FontSizeLineHeight): Md = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], xlg = xlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Md]
  }
  
  extension [Self <: Md](x: Self) {
    
    inline def setLg(value: LetterSpacing): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: FontSizeLetterSpacing): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMd(value: `3`): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setXlg(value: FontSizeLineHeight): Self = StObject.set(x, "xlg", value.asInstanceOf[js.Any])
  }
}
