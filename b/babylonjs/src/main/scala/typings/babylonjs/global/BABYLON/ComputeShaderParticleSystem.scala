package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.ComputeShaderParticleSystem")
@js.native
open class ComputeShaderParticleSystem protected ()
  extends StObject
     with typings.babylonjs.BABYLON.ComputeShaderParticleSystem {
  def this(parent: typings.babylonjs.BABYLON.GPUParticleSystem, engine: typings.babylonjs.BABYLON.ThinEngine) = this()
  
  /* private */ /* CompleteClass */
  var _bufferComputeShader: Any = js.native
  
  /* private */ /* CompleteClass */
  var _engine: Any = js.native
  
  /* private */ /* CompleteClass */
  var _parent: Any = js.native
  
  /* private */ /* CompleteClass */
  var _renderVertexBuffers: Any = js.native
  
  /* private */ /* CompleteClass */
  var _simParamsComputeShader: Any = js.native
  
  /* private */ /* CompleteClass */
  var _updateComputeShader: Any = js.native
  
  /* CompleteClass */
  var alignDataInBuffer: Boolean = js.native
  
  /* CompleteClass */
  override def bindDrawBuffers(index: Double, effect: typings.babylonjs.BABYLON.Effect): Unit = js.native
  
  /* CompleteClass */
  override def createParticleBuffer(data: js.Array[Double]): DataArray | typings.babylonjs.BABYLON.DataBuffer = js.native
  
  /* CompleteClass */
  override def createUpdateBuffer(defines: String): typings.babylonjs.BABYLON.UniformBufferEffectCommonAccessor = js.native
  
  /* CompleteClass */
  override def createVertexBuffers(
    updateBuffer: typings.babylonjs.BABYLON.Buffer,
    renderVertexBuffers: org.scalablytyped.runtime.StringDictionary[typings.babylonjs.BABYLON.VertexBuffer]
  ): Unit = js.native
  
  /* CompleteClass */
  override def isUpdateBufferCreated(): Boolean = js.native
  
  /* CompleteClass */
  override def isUpdateBufferReady(): Boolean = js.native
  
  /* CompleteClass */
  override def preUpdateParticleBuffer(): Unit = js.native
  
  /* CompleteClass */
  override def releaseBuffers(): Unit = js.native
  
  /* CompleteClass */
  override def releaseVertexBuffers(): Unit = js.native
  
  /* CompleteClass */
  override def updateParticleBuffer(index: Double, targetBuffer: typings.babylonjs.BABYLON.Buffer, currentActiveCount: Double): Unit = js.native
}
