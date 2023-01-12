package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: scala.Unit
  
  var left: scala.Unit
  
  var right: scala.Unit
  
  var top: scala.Unit
}
object Bottom {
  
  inline def apply(bottom: scala.Unit, left: scala.Unit, right: scala.Unit, top: scala.Unit): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
    
    inline def setBottom(value: scala.Unit): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: scala.Unit): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: scala.Unit): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: scala.Unit): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
