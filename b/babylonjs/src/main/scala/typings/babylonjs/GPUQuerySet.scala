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
  
  extension [Self <: GPUQuerySet](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
