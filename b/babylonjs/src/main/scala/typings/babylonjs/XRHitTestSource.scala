package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XRHitTestSource extends StObject {
  
  def cancel(): Unit
}
object XRHitTestSource {
  
  inline def apply(cancel: () => Unit): XRHitTestSource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[XRHitTestSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XRHitTestSource] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
