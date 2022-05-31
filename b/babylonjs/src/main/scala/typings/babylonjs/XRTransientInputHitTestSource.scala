package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRTransientInputHitTestSource extends StObject {
  
  def cancel(): Unit
}
object XRTransientInputHitTestSource {
  
  inline def apply(cancel: () => Unit): XRTransientInputHitTestSource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[XRTransientInputHitTestSource]
  }
  
  extension [Self <: XRTransientInputHitTestSource](x: Self) {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
