package typings.babylonjs.global.BABYLON

import typings.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUOcclusionQuery")
@js.native
open class WebGPUOcclusionQuery protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUOcclusionQuery {
  def this(
    engine: typings.babylonjs.BABYLON.WebGPUEngine,
    device: GPUDevice,
    bufferManager: typings.babylonjs.BABYLON.WebGPUBufferManager
  ) = this()
  def this(
    engine: typings.babylonjs.BABYLON.WebGPUEngine,
    device: GPUDevice,
    bufferManager: typings.babylonjs.BABYLON.WebGPUBufferManager,
    startCount: Double
  ) = this()
  def this(
    engine: typings.babylonjs.BABYLON.WebGPUEngine,
    device: GPUDevice,
    bufferManager: typings.babylonjs.BABYLON.WebGPUBufferManager,
    startCount: Double,
    incrementCount: Double
  ) = this()
  def this(
    engine: typings.babylonjs.BABYLON.WebGPUEngine,
    device: GPUDevice,
    bufferManager: typings.babylonjs.BABYLON.WebGPUBufferManager,
    startCount: Unit,
    incrementCount: Double
  ) = this()
}
