package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramDeleteShapeArgs extends StObject {
  
  /**
    * The processed shape.
    */
  var shape: js.UndefOr[dxDiagramShape] = js.undefined
}
object dxDiagramDeleteShapeArgs {
  
  inline def apply(): dxDiagramDeleteShapeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramDeleteShapeArgs]
  }
  
  extension [Self <: dxDiagramDeleteShapeArgs](x: Self) {
    
    inline def setShape(value: dxDiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
