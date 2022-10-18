package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.buffersBufferMod.Buffer
import typings.babylonjs.buffersBufferMod.VertexBuffer
import typings.babylonjs.buffersDataBufferMod.DataBuffer
import typings.babylonjs.enginesThinEngineMod.ThinEngine
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsUniformBufferEffectCommonAccessorMod.UniformBufferEffectCommonAccessor
import typings.babylonjs.particlesGpuParticleSystemMod.GPUParticleSystem
import typings.babylonjs.particlesIgpuparticlesystemplatformMod.IGPUParticleSystemPlatform
import typings.babylonjs.typesMod.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesComputeShaderParticleSystemMod {
  
  @JSImport("babylonjs/Particles/computeShaderParticleSystem", "ComputeShaderParticleSystem")
  @js.native
  open class ComputeShaderParticleSystem protected ()
    extends StObject
       with IGPUParticleSystemPlatform {
    def this(parent: GPUParticleSystem, engine: ThinEngine) = this()
    
    /* private */ var _bufferComputeShader: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    /* private */ var _renderVertexBuffers: Any = js.native
    
    /* private */ var _simParamsComputeShader: Any = js.native
    
    /* private */ var _updateComputeShader: Any = js.native
    
    /* CompleteClass */
    var alignDataInBuffer: Boolean = js.native
    
    /* CompleteClass */
    override def bindDrawBuffers(index: Double, effect: Effect): Unit = js.native
    
    /* CompleteClass */
    override def createParticleBuffer(data: js.Array[Double]): DataArray | DataBuffer = js.native
    
    /* CompleteClass */
    override def createUpdateBuffer(defines: String): UniformBufferEffectCommonAccessor = js.native
    
    /* CompleteClass */
    override def createVertexBuffers(updateBuffer: Buffer, renderVertexBuffers: StringDictionary[VertexBuffer]): Unit = js.native
    
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
    override def updateParticleBuffer(index: Double, targetBuffer: Buffer, currentActiveCount: Double): Unit = js.native
  }
}
