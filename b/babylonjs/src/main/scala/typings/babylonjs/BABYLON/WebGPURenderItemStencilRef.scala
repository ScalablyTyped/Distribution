package typings.babylonjs.BABYLON

import typings.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPURenderItemStencilRef
  extends StObject
     with IWebGPURenderItem {
  
  var ref: Double
}
object WebGPURenderItemStencilRef {
  
  inline def apply(ref: Double, run: GPURenderPassEncoder => Unit): WebGPURenderItemStencilRef = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[WebGPURenderItemStencilRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGPURenderItemStencilRef] (val x: Self) extends AnyVal {
    
    inline def setRef(value: Double): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
  }
}
