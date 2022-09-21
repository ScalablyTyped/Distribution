package typings.babylonjs.global.BABYLON

import typings.babylonjs.GPUDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.WebGPUQuerySet")
@js.native
open class WebGPUQuerySet protected ()
  extends StObject
     with typings.babylonjs.BABYLON.WebGPUQuerySet {
  def this(
    count: Double,
    `type`: typings.babylonjs.BABYLON.QueryType,
    device: GPUDevice,
    bufferManager: typings.babylonjs.BABYLON.WebGPUBufferManager
  ) = this()
  def this(
    count: Double,
    `type`: typings.babylonjs.BABYLON.QueryType,
    device: GPUDevice,
    bufferManager: typings.babylonjs.BABYLON.WebGPUBufferManager,
    canUseMultipleBuffers: Boolean
  ) = this()
}
