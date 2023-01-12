package typings.azureMsalBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distRequestPopupWindowAttributesMod {
  
  trait PopupPosition extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object PopupPosition {
    
    inline def apply(left: Double, top: Double): PopupPosition = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupPosition]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupPosition] (val x: Self) extends AnyVal {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopupSize extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object PopupSize {
    
    inline def apply(height: Double, width: Double): PopupSize = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopupSize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupSize] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait PopupWindowAttributes extends StObject {
    
    var popupPosition: js.UndefOr[PopupPosition] = js.undefined
    
    var popupSize: js.UndefOr[PopupSize] = js.undefined
  }
  object PopupWindowAttributes {
    
    inline def apply(): PopupWindowAttributes = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopupWindowAttributes]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopupWindowAttributes] (val x: Self) extends AnyVal {
      
      inline def setPopupPosition(value: PopupPosition): Self = StObject.set(x, "popupPosition", value.asInstanceOf[js.Any])
      
      inline def setPopupPositionUndefined: Self = StObject.set(x, "popupPosition", js.undefined)
      
      inline def setPopupSize(value: PopupSize): Self = StObject.set(x, "popupSize", value.asInstanceOf[js.Any])
      
      inline def setPopupSizeUndefined: Self = StObject.set(x, "popupSize", js.undefined)
    }
  }
}
