package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUQuerySet
  extends StObject
     with GPUObjectBase {
  
  val count: GPUSize32
  
  def destroy(): Unit
  
  val `type`: GPUQueryType
}
object GPUQuerySet {
  
  inline def apply(count: GPUSize32, destroy: () => Unit, `type`: GPUQueryType): GPUQuerySet = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUQuerySet]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUQuerySet] (val x: Self) extends AnyVal {
    
    inline def setCount(value: GPUSize32): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setType(value: GPUQueryType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
