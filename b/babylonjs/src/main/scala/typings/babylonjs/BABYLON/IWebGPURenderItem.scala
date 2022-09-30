package typings.babylonjs.BABYLON

import typings.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** @internal */
trait IWebGPURenderItem extends StObject {
  
  def run(renderPass: GPURenderPassEncoder): Unit
}
object IWebGPURenderItem {
  
  inline def apply(run: GPURenderPassEncoder => Unit): IWebGPURenderItem = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run))
    __obj.asInstanceOf[IWebGPURenderItem]
  }
  
  extension [Self <: IWebGPURenderItem](x: Self) {
    
    inline def setRun(value: GPURenderPassEncoder => Unit): Self = StObject.set(x, "run", js.Any.fromFunction1(value))
  }
}
