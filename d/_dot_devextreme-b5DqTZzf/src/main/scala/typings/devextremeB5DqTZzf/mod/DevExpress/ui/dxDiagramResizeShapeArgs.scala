package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import typings.devextremeB5DqTZzf.anon.HeightWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDiagramResizeShapeArgs extends StObject {
  
  /**
    * The new shape size.
    */
  var newSize: js.UndefOr[HeightWidth] = js.undefined
  
  /**
    * The previous shape size.
    */
  var oldSize: js.UndefOr[HeightWidth] = js.undefined
  
  /**
    * The processed shape.
    */
  var shape: js.UndefOr[dxDiagramShape] = js.undefined
}
object dxDiagramResizeShapeArgs {
  
  inline def apply(): dxDiagramResizeShapeArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDiagramResizeShapeArgs]
  }
  
  extension [Self <: dxDiagramResizeShapeArgs](x: Self) {
    
    inline def setNewSize(value: HeightWidth): Self = StObject.set(x, "newSize", value.asInstanceOf[js.Any])
    
    inline def setNewSizeUndefined: Self = StObject.set(x, "newSize", js.undefined)
    
    inline def setOldSize(value: HeightWidth): Self = StObject.set(x, "oldSize", value.asInstanceOf[js.Any])
    
    inline def setOldSizeUndefined: Self = StObject.set(x, "oldSize", js.undefined)
    
    inline def setShape(value: dxDiagramShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
  }
}
