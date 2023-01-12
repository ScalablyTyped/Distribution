package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUDebugCommandsMixin extends StObject {
  
  def insertDebugMarker(markerLabel: String): Unit
  
  def popDebugGroup(): Unit
  
  def pushDebugGroup(groupLabel: String): Unit
}
object GPUDebugCommandsMixin {
  
  inline def apply(insertDebugMarker: String => Unit, popDebugGroup: () => Unit, pushDebugGroup: String => Unit): GPUDebugCommandsMixin = {
    val __obj = js.Dynamic.literal(insertDebugMarker = js.Any.fromFunction1(insertDebugMarker), popDebugGroup = js.Any.fromFunction0(popDebugGroup), pushDebugGroup = js.Any.fromFunction1(pushDebugGroup))
    __obj.asInstanceOf[GPUDebugCommandsMixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GPUDebugCommandsMixin] (val x: Self) extends AnyVal {
    
    inline def setInsertDebugMarker(value: String => Unit): Self = StObject.set(x, "insertDebugMarker", js.Any.fromFunction1(value))
    
    inline def setPopDebugGroup(value: () => Unit): Self = StObject.set(x, "popDebugGroup", js.Any.fromFunction0(value))
    
    inline def setPushDebugGroup(value: String => Unit): Self = StObject.set(x, "pushDebugGroup", js.Any.fromFunction1(value))
  }
}
