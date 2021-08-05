package typings.codemirror.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollInfo extends StObject {
  
  var clientHeight: js.Any
  
  var clientWidth: js.Any
  
  var height: js.Any
  
  var left: js.Any
  
  var top: js.Any
  
  var width: js.Any
}
object ScrollInfo {
  
  inline def apply(
    clientHeight: js.Any,
    clientWidth: js.Any,
    height: js.Any,
    left: js.Any,
    top: js.Any,
    width: js.Any
  ): ScrollInfo = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollInfo]
  }
  
  extension [Self <: ScrollInfo](x: Self) {
    
    inline def setClientHeight(value: js.Any): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    inline def setClientWidth(value: js.Any): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: js.Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: js.Any): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setTop(value: js.Any): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: js.Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
