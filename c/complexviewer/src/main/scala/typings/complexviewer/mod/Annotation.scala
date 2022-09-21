package typings.complexviewer.mod

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotation extends StObject {
  
  var certain: js.UndefOr[SVGElement] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var fuzzyEnd: js.UndefOr[SVGElement] = js.undefined
  
  var fuzzyStart: js.UndefOr[SVGElement] = js.undefined
}
object Annotation {
  
  inline def apply(): Annotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Annotation]
  }
  
  extension [Self <: Annotation](x: Self) {
    
    inline def setCertain(value: SVGElement): Self = StObject.set(x, "certain", value.asInstanceOf[js.Any])
    
    inline def setCertainUndefined: Self = StObject.set(x, "certain", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFuzzyEnd(value: SVGElement): Self = StObject.set(x, "fuzzyEnd", value.asInstanceOf[js.Any])
    
    inline def setFuzzyEndUndefined: Self = StObject.set(x, "fuzzyEnd", js.undefined)
    
    inline def setFuzzyStart(value: SVGElement): Self = StObject.set(x, "fuzzyStart", value.asInstanceOf[js.Any])
    
    inline def setFuzzyStartUndefined: Self = StObject.set(x, "fuzzyStart", js.undefined)
  }
}
