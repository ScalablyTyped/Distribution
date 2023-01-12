package typings.babylonjs

import org.scalablytyped.runtime.StringDictionary
import typings.babylonjs.buffersBufferMod.Buffer
import typings.babylonjs.buffersBufferMod.VertexBuffer
import typings.babylonjs.buffersDataBufferMod.DataBuffer
import typings.babylonjs.materialsEffectMod.Effect
import typings.babylonjs.materialsUniformBufferEffectCommonAccessorMod.UniformBufferEffectCommonAccessor
import typings.babylonjs.typesMod.DataArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesIgpuparticlesystemplatformMod {
  
  trait IGPUParticleSystemPlatform extends StObject {
    
    var alignDataInBuffer: Boolean
    
    def bindDrawBuffers(index: Double, effect: Effect): Unit
    
    def createParticleBuffer(data: js.Array[Double]): DataArray | DataBuffer
    
    def createUpdateBuffer(defines: String): UniformBufferEffectCommonAccessor
    
    def createVertexBuffers(updateBuffer: Buffer, renderVertexBuffers: StringDictionary[VertexBuffer]): Unit
    
    def isUpdateBufferCreated(): Boolean
    
    def isUpdateBufferReady(): Boolean
    
    def preUpdateParticleBuffer(): Unit
    
    def releaseBuffers(): Unit
    
    def releaseVertexBuffers(): Unit
    
    def updateParticleBuffer(index: Double, targetBuffer: Buffer, currentActiveCount: Double): Unit
  }
  object IGPUParticleSystemPlatform {
    
    inline def apply(
      alignDataInBuffer: Boolean,
      bindDrawBuffers: (Double, Effect) => Unit,
      createParticleBuffer: js.Array[Double] => DataArray | DataBuffer,
      createUpdateBuffer: String => UniformBufferEffectCommonAccessor,
      createVertexBuffers: (Buffer, StringDictionary[VertexBuffer]) => Unit,
      isUpdateBufferCreated: () => Boolean,
      isUpdateBufferReady: () => Boolean,
      preUpdateParticleBuffer: () => Unit,
      releaseBuffers: () => Unit,
      releaseVertexBuffers: () => Unit,
      updateParticleBuffer: (Double, Buffer, Double) => Unit
    ): IGPUParticleSystemPlatform = {
      val __obj = js.Dynamic.literal(alignDataInBuffer = alignDataInBuffer.asInstanceOf[js.Any], bindDrawBuffers = js.Any.fromFunction2(bindDrawBuffers), createParticleBuffer = js.Any.fromFunction1(createParticleBuffer), createUpdateBuffer = js.Any.fromFunction1(createUpdateBuffer), createVertexBuffers = js.Any.fromFunction2(createVertexBuffers), isUpdateBufferCreated = js.Any.fromFunction0(isUpdateBufferCreated), isUpdateBufferReady = js.Any.fromFunction0(isUpdateBufferReady), preUpdateParticleBuffer = js.Any.fromFunction0(preUpdateParticleBuffer), releaseBuffers = js.Any.fromFunction0(releaseBuffers), releaseVertexBuffers = js.Any.fromFunction0(releaseVertexBuffers), updateParticleBuffer = js.Any.fromFunction3(updateParticleBuffer))
      __obj.asInstanceOf[IGPUParticleSystemPlatform]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGPUParticleSystemPlatform] (val x: Self) extends AnyVal {
      
      inline def setAlignDataInBuffer(value: Boolean): Self = StObject.set(x, "alignDataInBuffer", value.asInstanceOf[js.Any])
      
      inline def setBindDrawBuffers(value: (Double, Effect) => Unit): Self = StObject.set(x, "bindDrawBuffers", js.Any.fromFunction2(value))
      
      inline def setCreateParticleBuffer(value: js.Array[Double] => DataArray | DataBuffer): Self = StObject.set(x, "createParticleBuffer", js.Any.fromFunction1(value))
      
      inline def setCreateUpdateBuffer(value: String => UniformBufferEffectCommonAccessor): Self = StObject.set(x, "createUpdateBuffer", js.Any.fromFunction1(value))
      
      inline def setCreateVertexBuffers(value: (Buffer, StringDictionary[VertexBuffer]) => Unit): Self = StObject.set(x, "createVertexBuffers", js.Any.fromFunction2(value))
      
      inline def setIsUpdateBufferCreated(value: () => Boolean): Self = StObject.set(x, "isUpdateBufferCreated", js.Any.fromFunction0(value))
      
      inline def setIsUpdateBufferReady(value: () => Boolean): Self = StObject.set(x, "isUpdateBufferReady", js.Any.fromFunction0(value))
      
      inline def setPreUpdateParticleBuffer(value: () => Unit): Self = StObject.set(x, "preUpdateParticleBuffer", js.Any.fromFunction0(value))
      
      inline def setReleaseBuffers(value: () => Unit): Self = StObject.set(x, "releaseBuffers", js.Any.fromFunction0(value))
      
      inline def setReleaseVertexBuffers(value: () => Unit): Self = StObject.set(x, "releaseVertexBuffers", js.Any.fromFunction0(value))
      
      inline def setUpdateParticleBuffer(value: (Double, Buffer, Double) => Unit): Self = StObject.set(x, "updateParticleBuffer", js.Any.fromFunction3(value))
    }
  }
}
