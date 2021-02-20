package typings.babylonjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XRTransientInputHitTestSource extends StObject {
  
  def cancel(): Unit = js.native
}
object XRTransientInputHitTestSource {
  
  @scala.inline
  def apply(cancel: () => Unit): XRTransientInputHitTestSource = {
    val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
    __obj.asInstanceOf[XRTransientInputHitTestSource]
  }
  
  @scala.inline
  implicit class XRTransientInputHitTestSourceMutableBuilder[Self <: XRTransientInputHitTestSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
  }
}
