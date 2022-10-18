package typings.cypress.Cypress

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterScreenshotReturnObject extends StObject {
  
  var dimensions: js.UndefOr[Dimensions] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
  
  var size: js.UndefOr[Double] = js.undefined
}
object AfterScreenshotReturnObject {
  
  inline def apply(): AfterScreenshotReturnObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AfterScreenshotReturnObject]
  }
  
  extension [Self <: AfterScreenshotReturnObject](x: Self) {
    
    inline def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
    
    inline def setDimensionsUndefined: Self = StObject.set(x, "dimensions", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
