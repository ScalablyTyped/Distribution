package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUQuerySet
  extends StObject
     with GPUObjectBase {
  
  def destroy(): Unit
}
object GPUQuerySet {
  
  inline def apply(destroy: () => Unit): GPUQuerySet = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[GPUQuerySet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUQuerySet] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
