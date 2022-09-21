package typings.blueimpLoadImage.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BasicOptions extends StObject {
  
  var contain: js.UndefOr[Boolean] = js.undefined
  
  var cover: js.UndefOr[Boolean] = js.undefined
  
  var crossOrigin: js.UndefOr[String] = js.undefined
  
  var maxHeight: js.UndefOr[Double] = js.undefined
  
  var maxWidth: js.UndefOr[Double] = js.undefined
  
  var minHeight: js.UndefOr[Double] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var noRevoke: js.UndefOr[Boolean] = js.undefined
}
object BasicOptions {
  
  inline def apply(): BasicOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicOptions]
  }
  
  extension [Self <: BasicOptions](x: Self) {
    
    inline def setContain(value: Boolean): Self = StObject.set(x, "contain", value.asInstanceOf[js.Any])
    
    inline def setContainUndefined: Self = StObject.set(x, "contain", js.undefined)
    
    inline def setCover(value: Boolean): Self = StObject.set(x, "cover", value.asInstanceOf[js.Any])
    
    inline def setCoverUndefined: Self = StObject.set(x, "cover", js.undefined)
    
    inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
    
    inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
    
    inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
    
    inline def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
    
    inline def setMinHeight(value: Double): Self = StObject.set(x, "minHeight", value.asInstanceOf[js.Any])
    
    inline def setMinHeightUndefined: Self = StObject.set(x, "minHeight", js.undefined)
    
    inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    inline def setNoRevoke(value: Boolean): Self = StObject.set(x, "noRevoke", value.asInstanceOf[js.Any])
    
    inline def setNoRevokeUndefined: Self = StObject.set(x, "noRevoke", js.undefined)
  }
}
