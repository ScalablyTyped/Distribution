package typings.devextremeB5DqTZzf.mod.DevExpress.ui

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTileViewItem
  extends StObject
     with CollectionWidgetItem {
  
  /**
    * Specifies a multiplier for the baseItemHeight property value (for the purpose of obtaining the actual item height).
    */
  var heightRatio: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a multiplier for the baseItemWidth property value (for the purpose of obtaining the actual item width).
    */
  var widthRatio: js.UndefOr[Double] = js.undefined
}
object dxTileViewItem {
  
  inline def apply(): dxTileViewItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTileViewItem]
  }
  
  extension [Self <: dxTileViewItem](x: Self) {
    
    inline def setHeightRatio(value: Double): Self = StObject.set(x, "heightRatio", value.asInstanceOf[js.Any])
    
    inline def setHeightRatioUndefined: Self = StObject.set(x, "heightRatio", js.undefined)
    
    inline def setWidthRatio(value: Double): Self = StObject.set(x, "widthRatio", value.asInstanceOf[js.Any])
    
    inline def setWidthRatioUndefined: Self = StObject.set(x, "widthRatio", js.undefined)
  }
}
