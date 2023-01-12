package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubdivisionsX extends StObject {
  
  var height: js.UndefOr[Double] = js.undefined
  
  var subdivisions: js.UndefOr[Double] = js.undefined
  
  var subdivisionsX: js.UndefOr[Double] = js.undefined
  
  var subdivisionsY: js.UndefOr[Double] = js.undefined
  
  var updatable: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object SubdivisionsX {
  
  inline def apply(): SubdivisionsX = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubdivisionsX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubdivisionsX] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setSubdivisions(value: Double): Self = StObject.set(x, "subdivisions", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsUndefined: Self = StObject.set(x, "subdivisions", js.undefined)
    
    inline def setSubdivisionsX(value: Double): Self = StObject.set(x, "subdivisionsX", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsXUndefined: Self = StObject.set(x, "subdivisionsX", js.undefined)
    
    inline def setSubdivisionsY(value: Double): Self = StObject.set(x, "subdivisionsY", value.asInstanceOf[js.Any])
    
    inline def setSubdivisionsYUndefined: Self = StObject.set(x, "subdivisionsY", js.undefined)
    
    inline def setUpdatable(value: Boolean): Self = StObject.set(x, "updatable", value.asInstanceOf[js.Any])
    
    inline def setUpdatableUndefined: Self = StObject.set(x, "updatable", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
