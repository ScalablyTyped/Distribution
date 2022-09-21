package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.GPURenderPassEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPURenderItemBlendColor")
@js.native
open class WebGPURenderItemBlendColor protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPURenderItemBlendColor {
  def this(color: js.Array[Nullable[Double]]) = this()
  
  /* CompleteClass */
  var color: js.Array[Nullable[Double]] = js.native
  
  /* CompleteClass */
  override def run(renderPass: GPURenderPassEncoder): Unit = js.native
}
