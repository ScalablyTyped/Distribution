package typings.catalog.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeSpecimenProps extends StObject {
  
  var color: js.UndefOr[String] = js.undefined
  
  var font: String
  
  var headings: js.Array[Double | String]
  
  var style: js.UndefOr[String] = js.undefined
  
  var weight: String
}
object TypeSpecimenProps {
  
  inline def apply(font: String, headings: js.Array[Double | String], weight: String): TypeSpecimenProps = {
    val __obj = js.Dynamic.literal(font = font.asInstanceOf[js.Any], headings = headings.asInstanceOf[js.Any], weight = weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeSpecimenProps]
  }
  
  extension [Self <: TypeSpecimenProps](x: Self) {
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setHeadings(value: js.Array[Double | String]): Self = StObject.set(x, "headings", value.asInstanceOf[js.Any])
    
    inline def setHeadingsVarargs(value: (Double | String)*): Self = StObject.set(x, "headings", js.Array(value*))
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setWeight(value: String): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
  }
}
