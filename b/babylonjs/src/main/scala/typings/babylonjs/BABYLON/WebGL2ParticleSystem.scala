package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebGL2ParticleSystem
  extends StObject
     with IGPUParticleSystemPlatform {
  
  /* private */ var _createUpdateVAO: Any
  
  /* private */ var _engine: Any
  
  /* private */ var _parent: Any
  
  /* private */ var _renderVAO: Any
  
  /* private */ var _updateEffect: Any
  
  /* private */ var _updateEffectOptions: Any
  
  /* private */ var _updateVAO: Any
  
  def bindDrawBuffers(index: Double): Unit
}
object WebGL2ParticleSystem {
  
  inline def apply(
    _createUpdateVAO: Any,
    _engine: Any,
    _parent: Any,
    _renderVAO: Any,
    _updateEffect: Any,
    _updateEffectOptions: Any,
    _updateVAO: Any,
    alignDataInBuffer: Boolean,
    bindDrawBuffers: Double => Unit,
    createParticleBuffer: js.Array[Double] => DataArray | DataBuffer,
    createUpdateBuffer: String => UniformBufferEffectCommonAccessor,
    createVertexBuffers: (Buffer, org.scalablytyped.runtime.StringDictionary[VertexBuffer]) => Unit,
    isUpdateBufferCreated: () => Boolean,
    isUpdateBufferReady: () => Boolean,
    preUpdateParticleBuffer: () => Unit,
    releaseBuffers: () => Unit,
    releaseVertexBuffers: () => Unit,
    updateParticleBuffer: (Double, Buffer, Double) => Unit
  ): WebGL2ParticleSystem = {
    val __obj = js.Dynamic.literal(_createUpdateVAO = _createUpdateVAO.asInstanceOf[js.Any], _engine = _engine.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any], _renderVAO = _renderVAO.asInstanceOf[js.Any], _updateEffect = _updateEffect.asInstanceOf[js.Any], _updateEffectOptions = _updateEffectOptions.asInstanceOf[js.Any], _updateVAO = _updateVAO.asInstanceOf[js.Any], alignDataInBuffer = alignDataInBuffer.asInstanceOf[js.Any], bindDrawBuffers = js.Any.fromFunction1(bindDrawBuffers), createParticleBuffer = js.Any.fromFunction1(createParticleBuffer), createUpdateBuffer = js.Any.fromFunction1(createUpdateBuffer), createVertexBuffers = js.Any.fromFunction2(createVertexBuffers), isUpdateBufferCreated = js.Any.fromFunction0(isUpdateBufferCreated), isUpdateBufferReady = js.Any.fromFunction0(isUpdateBufferReady), preUpdateParticleBuffer = js.Any.fromFunction0(preUpdateParticleBuffer), releaseBuffers = js.Any.fromFunction0(releaseBuffers), releaseVertexBuffers = js.Any.fromFunction0(releaseVertexBuffers), updateParticleBuffer = js.Any.fromFunction3(updateParticleBuffer))
    __obj.asInstanceOf[WebGL2ParticleSystem]
  }
  
  extension [Self <: WebGL2ParticleSystem](x: Self) {
    
    inline def setBindDrawBuffers(value: Double => Unit): Self = StObject.set(x, "bindDrawBuffers", js.Any.fromFunction1(value))
    
    inline def set_createUpdateVAO(value: Any): Self = StObject.set(x, "_createUpdateVAO", value.asInstanceOf[js.Any])
    
    inline def set_engine(value: Any): Self = StObject.set(x, "_engine", value.asInstanceOf[js.Any])
    
    inline def set_parent(value: Any): Self = StObject.set(x, "_parent", value.asInstanceOf[js.Any])
    
    inline def set_renderVAO(value: Any): Self = StObject.set(x, "_renderVAO", value.asInstanceOf[js.Any])
    
    inline def set_updateEffect(value: Any): Self = StObject.set(x, "_updateEffect", value.asInstanceOf[js.Any])
    
    inline def set_updateEffectOptions(value: Any): Self = StObject.set(x, "_updateEffectOptions", value.asInstanceOf[js.Any])
    
    inline def set_updateVAO(value: Any): Self = StObject.set(x, "_updateVAO", value.asInstanceOf[js.Any])
  }
}
