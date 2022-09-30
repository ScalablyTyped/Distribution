package typings.carbonElements.anon

import typings.carbonElements.carbonElementsInts.`400`
import typings.carbonElements.carbonElementsStrings.antialiased
import typings.carbonElements.carbonElementsStrings.grayscale
import typings.carbonElements.carbonElementsStrings.optimizeLegibility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mozosxfontsmoothing extends StObject {
  
  var `-moz-osx-font-smoothing`: grayscale
  
  var `-webkit-font-smoothing`: antialiased
  
  var fontFamily: String
  
  var fontWeight: `400`
  
  var textRendering: optimizeLegibility
}
object Mozosxfontsmoothing {
  
  inline def apply(): Mozosxfontsmoothing = {
    val __obj = js.Dynamic.literal(fontFamily = "'IBM Plex Sans', 'Helvetica Neue', Arial, sans-serif", fontWeight = 400, textRendering = "optimizeLegibility")
    __obj.updateDynamic("-moz-osx-font-smoothing")("grayscale")
    __obj.updateDynamic("-webkit-font-smoothing")("antialiased")
    __obj.asInstanceOf[Mozosxfontsmoothing]
  }
  
  extension [Self <: Mozosxfontsmoothing](x: Self) {
    
    inline def `set-moz-osx-font-smoothing`(value: grayscale): Self = StObject.set(x, "-moz-osx-font-smoothing", value.asInstanceOf[js.Any])
    
    inline def `set-webkit-font-smoothing`(value: antialiased): Self = StObject.set(x, "-webkit-font-smoothing", value.asInstanceOf[js.Any])
    
    inline def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
    
    inline def setFontWeight(value: `400`): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
    
    inline def setTextRendering(value: optimizeLegibility): Self = StObject.set(x, "textRendering", value.asInstanceOf[js.Any])
  }
}
