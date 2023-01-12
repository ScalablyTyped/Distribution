package typings.babylonjs.BABYLON

import typings.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGPURenderItemBlendColor
  extends StObject
     with IWebGPURenderItem {
  
  var color: js.Array[Nullable[Double]]
}
object WebGPURenderItemBlendColor {
  
  inline def apply(color: js.Array[Nullable[Double]], run: GPURenderPassEncoder => Unit): WebGPURenderItemBlendColor = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[WebGPURenderItemBlendColor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebGPURenderItemBlendColor] (val x: Self) extends AnyVal {
    
    inline def setColor(value: js.Array[Nullable[Double]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorVarargs(value: Nullable[Double]*): Self = StObject.set(x, "color", js.Array(value*))
  }
}
