package typings.babylonjs.global.BABYLON

import typings.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPURenderItemScissor")
@js.native
open class WebGPURenderItemScissor protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPURenderItemScissor {
  def this(x: Double, y: Double, w: Double, h: Double) = this()
  
  /* CompleteClass */
  var h: Double = js.native
  
  /* CompleteClass */
  override def run(renderPass: GPURenderPassEncoder): Unit = js.native
  
  /* CompleteClass */
  var w: Double = js.native
  
  /* CompleteClass */
  var x: Double = js.native
  
  /* CompleteClass */
  var y: Double = js.native
}
