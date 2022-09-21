package typings.babylonjs.global.BABYLON

import typings.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPURenderItemStencilRef")
@js.native
open class WebGPURenderItemStencilRef protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPURenderItemStencilRef {
  def this(ref: Double) = this()
  
  /* CompleteClass */
  var ref: Double = js.native
  
  /* CompleteClass */
  override def run(renderPass: GPURenderPassEncoder): Unit = js.native
}
