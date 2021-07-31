package typings.cesium.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DestroyPrimitives extends StObject {
  
  var destroyPrimitives: js.UndefOr[Boolean] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
}
object DestroyPrimitives {
  
  @scala.inline
  def apply(): DestroyPrimitives = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DestroyPrimitives]
  }
  
  @scala.inline
  implicit class DestroyPrimitivesMutableBuilder[Self <: DestroyPrimitives] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroyPrimitives(value: Boolean): Self = StObject.set(x, "destroyPrimitives", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroyPrimitivesUndefined: Self = StObject.set(x, "destroyPrimitives", js.undefined)
    
    @scala.inline
    def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
  }
}
