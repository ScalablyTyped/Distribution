package typings.carbonElements.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Xlg extends StObject {
  
  var lg: LetterSpacingLineHeight
  
  var max: `5`
  
  var md: `4`
  
  var xlg: FontSizeLetterSpacingLineHeight
}
object Xlg {
  
  inline def apply(lg: LetterSpacingLineHeight, max: `5`, md: `4`, xlg: FontSizeLetterSpacingLineHeight): Xlg = {
    val __obj = js.Dynamic.literal(lg = lg.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], md = md.asInstanceOf[js.Any], xlg = xlg.asInstanceOf[js.Any])
    __obj.asInstanceOf[Xlg]
  }
  
  extension [Self <: Xlg](x: Self) {
    
    inline def setLg(value: LetterSpacingLineHeight): Self = StObject.set(x, "lg", value.asInstanceOf[js.Any])
    
    inline def setMax(value: `5`): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMd(value: `4`): Self = StObject.set(x, "md", value.asInstanceOf[js.Any])
    
    inline def setXlg(value: FontSizeLetterSpacingLineHeight): Self = StObject.set(x, "xlg", value.asInstanceOf[js.Any])
  }
}
