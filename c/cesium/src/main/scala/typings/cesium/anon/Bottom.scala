package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bottom extends StObject {
  
  var bottom: Double
  
  var far: Double
  
  var left: Double
  
  var near: Double
  
  var right: Double
  
  var top: Double
}
object Bottom {
  
  @scala.inline
  def apply(bottom: Double, far: Double, left: Double, near: Double, right: Double, top: Double): Bottom = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], far = far.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], near = near.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bottom]
  }
  
  @scala.inline
  implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFar(value: Double): Self = StObject.set(x, "far", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNear(value: Double): Self = StObject.set(x, "near", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
  }
}
