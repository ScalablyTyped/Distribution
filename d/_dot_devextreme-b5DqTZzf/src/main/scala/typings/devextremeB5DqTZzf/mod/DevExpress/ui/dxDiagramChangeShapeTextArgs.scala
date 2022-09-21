package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramChangeShapeTextArgs extends StObject {
  
  /**
    * The processed shape.
    */
  var shape: js.UndefOr[dxDiagramShape] = js.undefined
  
  /**
    * The new shape text.
    */
  var text: js.UndefOr[String] = js.undefined
}
object dxDiagramChangeShapeTextArgs {
  
  inline def apply(): dxDiagramChangeShapeTextArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramChangeShapeTextArgs]
  }
  
  extension [Self <: dxDiagramChangeShapeTextArgs](x: Self) {
    
    inline def setShape(value: dxDiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
