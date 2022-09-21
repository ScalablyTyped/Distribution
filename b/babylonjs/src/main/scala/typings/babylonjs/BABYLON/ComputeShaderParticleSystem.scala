package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeShaderParticleSystem
  extends StObject
     with IGPUParticleSystemPlatform {
  
  /* private */ var _bufferComputeShader: Any
  
  /* private */ var _engine: Any
  
  /* private */ var _parent: Any
  
  /* private */ var _renderVertexBuffers: Any
  
  /* private */ var _simParamsComputeShader: Any
  
  /* private */ var _updateComputeShader: Any
}
object ComputeShaderParticleSystem {
  
  inline def apply(
    _bufferComputeShader: Any,
    _engine: Any,
    _parent: Any,
    _renderVertexBuffers: Any,
    _simParamsComputeShader: Any,
    _updateComputeShader: Any,
    alignDataInBuffer: Boolean,
    bindDrawBuffers: (Double, Effect) => Unit,
    createParticleBuffer: js.Array[Double] => DataArray | DataBuffer,
    createUpdateBuffer: String => UniformBufferEffectCommonAccessor,
    createVertexBuffers: (Buffer, org.scalablytyped.runtime.StringDictionary[VertexBuffer]) => Unit,
    isUpdateBufferCreated: () => Boolean,
    isUpdateBufferReady: () => Boolean,
    preUpdateParticleBuffer: () => Unit,
    releaseBuffers: () => Unit,
    releaseVertexBuffers: () => Unit,
    updateParticleBuffer: (Double, Buffer, Double) => Unit
  ): ComputeShaderParticleSystem = {
    val __obj = js.Dynamic.literal(_bufferComputeShader = _bufferComputeShader.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], _renderVertexBuffers = _renderVertexBuffers.asInstanceOf[js.Any], _simParamsComputeShader = _simParamsComputeShader.asInstanceOf[js.Any], _updateComputeShader = _updateComputeShader.asInstanceOf[js.Any], alignDataInBuffer = alignDataInBuffer.asInstanceOf[js.Any], bindDrawBuffers = js.Any.fromFunction2(bindDrawBuffers), createParticleBuffer = js.Any.fromFunction1(createParticleBuffer), createUpdateBuffer = js.Any.fromFunction1(createUpdateBuffer), createVertexBuffers = js.Any.fromFunction2(createVertexBuffers), isUpdateBufferCreated = js.Any.fromFunction0(isUpdateBufferCreated), isUpdateBufferReady = js.Any.fromFunction0(isUpdateBufferReady), preUpdateParticleBuffer = js.Any.fromFunction0(preUpdateParticleBuffer), releaseBuffers = js.Any.fromFunction0(releaseBuffers), releaseVertexBuffers = js.Any.fromFunction0(releaseVertexBuffers), updateParticleBuffer = js.Any.fromFunction3(updateParticleBuffer))
    __obj.asInstanceOf[ComputeShaderParticleSystem]
  }
  
  extension [Self <: ComputeShaderParticleSystem](x: Self) {
    
    inline def set_bufferComputeShader(value: Any): Self = StObject.set(x, "_bufferComputeShader", value.asInstanceOf[js.Any])
    
    inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
    
    inline def set_parent(value: Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    inline def set_renderVertexBuffers(value: Any): Self = StObject.set(x, "_renderVertexBuffers", value.asInstanceOf[js.Any])
    
    inline def set_simParamsComputeShader(value: Any): Self = StObject.set(x, "_simParamsComputeShader", value.asInstanceOf[js.Any])
    
    inline def set_updateComputeShader(value: Any): Self = StObject.set(x, "_updateComputeShader", value.asInstanceOf[js.Any])
  }
}
