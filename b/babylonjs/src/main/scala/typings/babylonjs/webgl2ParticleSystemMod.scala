package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.bufferMod.Buffer
import typings.babylonjs.bufferMod.VertexBuffer
import typings.babylonjs.dataBufferMod.DataBuffer
import typings.babylonjs.effectMod.Effect
import typings.babylonjs.gpuParticleSystemMod.GPUParticleSystem
import typings.babylonjs.igpuparticlesystemplatformMod.IGPUParticleSystemPlatform
import typings.babylonjs.thinEngineMod.ThinEngine
import typings.babylonjs.typesMod.DataArray
import typings.babylonjs.uniformBufferEffectCommonAccessorMod.UniformBufferEffectCommonAccessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webgl2ParticleSystemMod {
  
  @JSImport("babylonjs/Particles/webgl2ParticleSystem", "WebGL2ParticleSystem")
  @js.native
  open class WebGL2ParticleSystem protected ()
    extends StObject
       with IGPUParticleSystemPlatform {
    def this(parent: GPUParticleSystem, engine: ThinEngine) = this()
    
    /* private */ var _createUpdateVAO: Any = js.native
    
    /* private */ var _engine: Any = js.native
    
    /* private */ var _parent: Any = js.native
    
    /* private */ var _renderVAO: Any = js.native
    
    /* private */ var _updateEffect: Any = js.native
    
    /* private */ var _updateEffectOptions: Any = js.native
    
    /* private */ var _updateVAO: Any = js.native
    
    /* CompleteClass */
    var alignDataInBuffer: Boolean = js.native
    
    def bindDrawBuffers(index: Double): Unit = js.native
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
