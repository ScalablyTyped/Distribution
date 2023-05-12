package typings.cesiumEngine.anon

import typings.cesiumEngine.mod.Cartesian2
import typings.cesiumEngine.mod.Matrix4
import typings.cesiumEngine.mod.Particle
import typings.cesiumEngine.mod.ParticleBurst
import typings.cesiumEngine.mod.ParticleEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bursts extends StObject {
  
  var bursts: js.UndefOr[js.Array[ParticleBurst]] = js.undefined
  
  var color: js.UndefOr[typings.cesiumEngine.mod.Color] = js.undefined
  
  var emissionRate: js.UndefOr[Double] = js.undefined
  
  var emitter: js.UndefOr[ParticleEmitter] = js.undefined
  
  var emitterModelMatrix: js.UndefOr[Matrix4] = js.undefined
  
  var endColor: js.UndefOr[typings.cesiumEngine.mod.Color] = js.undefined
  
  var endScale: js.UndefOr[Double] = js.undefined
  
  var image: js.UndefOr[Any] = js.undefined
  
  var imageSize: js.UndefOr[Cartesian2] = js.undefined
  
  var lifetime: js.UndefOr[Double] = js.undefined
  
  var loop: js.UndefOr[Boolean] = js.undefined
  
  var mass: js.UndefOr[Double] = js.undefined
  
  var maximumImageSize: js.UndefOr[Cartesian2] = js.undefined
  
  var maximumMass: js.UndefOr[Double] = js.undefined
  
  var maximumParticleLife: js.UndefOr[Double] = js.undefined
  
  var maximumSpeed: js.UndefOr[Double] = js.undefined
  
  var minimumImageSize: js.UndefOr[Cartesian2] = js.undefined
  
  var minimumMass: js.UndefOr[Double] = js.undefined
  
  var minimumParticleLife: js.UndefOr[Double] = js.undefined
  
  var minimumSpeed: js.UndefOr[Double] = js.undefined
  
  var modelMatrix: js.UndefOr[Matrix4] = js.undefined
  
  var particleLife: js.UndefOr[Double] = js.undefined
  
  var scale: js.UndefOr[Double] = js.undefined
  
  var show: js.UndefOr[Boolean] = js.undefined
  
  var sizeInMeters: js.UndefOr[Boolean] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
  
  var startColor: js.UndefOr[typings.cesiumEngine.mod.Color] = js.undefined
  
  var startScale: js.UndefOr[Double] = js.undefined
  
  var updateCallback: js.UndefOr[typings.cesiumEngine.mod.ParticleSystem.updateCallback] = js.undefined
}
object Bursts {
  
  inline def apply(): Bursts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bursts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Bursts] (val x: Self) extends AnyVal {
    
    inline def setBursts(value: js.Array[ParticleBurst]): Self = StObject.set(x, "bursts", value.asInstanceOf[js.Any])
    
    inline def setBurstsUndefined: Self = StObject.set(x, "bursts", js.undefined)
    
    inline def setBurstsVarargs(value: ParticleBurst*): Self = StObject.set(x, "bursts", js.Array(value*))
    
    inline def setColor(value: typings.cesiumEngine.mod.Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setEmissionRate(value: Double): Self = StObject.set(x, "emissionRate", value.asInstanceOf[js.Any])
    
    inline def setEmissionRateUndefined: Self = StObject.set(x, "emissionRate", js.undefined)
    
    inline def setEmitter(value: ParticleEmitter): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
    
    inline def setEmitterModelMatrix(value: Matrix4): Self = StObject.set(x, "emitterModelMatrix", value.asInstanceOf[js.Any])
    
    inline def setEmitterModelMatrixUndefined: Self = StObject.set(x, "emitterModelMatrix", js.undefined)
    
    inline def setEmitterUndefined: Self = StObject.set(x, "emitter", js.undefined)
    
    inline def setEndColor(value: typings.cesiumEngine.mod.Color): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
    
    inline def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
    
    inline def setEndScale(value: Double): Self = StObject.set(x, "endScale", value.asInstanceOf[js.Any])
    
    inline def setEndScaleUndefined: Self = StObject.set(x, "endScale", js.undefined)
    
    inline def setImage(value: Any): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageSize(value: Cartesian2): Self = StObject.set(x, "imageSize", value.asInstanceOf[js.Any])
    
    inline def setImageSizeUndefined: Self = StObject.set(x, "imageSize", js.undefined)
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
    
    inline def setLifetimeUndefined: Self = StObject.set(x, "lifetime", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setMass(value: Double): Self = StObject.set(x, "mass", value.asInstanceOf[js.Any])
    
    inline def setMassUndefined: Self = StObject.set(x, "mass", js.undefined)
    
    inline def setMaximumImageSize(value: Cartesian2): Self = StObject.set(x, "maximumImageSize", value.asInstanceOf[js.Any])
    
    inline def setMaximumImageSizeUndefined: Self = StObject.set(x, "maximumImageSize", js.undefined)
    
    inline def setMaximumMass(value: Double): Self = StObject.set(x, "maximumMass", value.asInstanceOf[js.Any])
    
    inline def setMaximumMassUndefined: Self = StObject.set(x, "maximumMass", js.undefined)
    
    inline def setMaximumParticleLife(value: Double): Self = StObject.set(x, "maximumParticleLife", value.asInstanceOf[js.Any])
    
    inline def setMaximumParticleLifeUndefined: Self = StObject.set(x, "maximumParticleLife", js.undefined)
    
    inline def setMaximumSpeed(value: Double): Self = StObject.set(x, "maximumSpeed", value.asInstanceOf[js.Any])
    
    inline def setMaximumSpeedUndefined: Self = StObject.set(x, "maximumSpeed", js.undefined)
    
    inline def setMinimumImageSize(value: Cartesian2): Self = StObject.set(x, "minimumImageSize", value.asInstanceOf[js.Any])
    
    inline def setMinimumImageSizeUndefined: Self = StObject.set(x, "minimumImageSize", js.undefined)
    
    inline def setMinimumMass(value: Double): Self = StObject.set(x, "minimumMass", value.asInstanceOf[js.Any])
    
    inline def setMinimumMassUndefined: Self = StObject.set(x, "minimumMass", js.undefined)
    
    inline def setMinimumParticleLife(value: Double): Self = StObject.set(x, "minimumParticleLife", value.asInstanceOf[js.Any])
    
    inline def setMinimumParticleLifeUndefined: Self = StObject.set(x, "minimumParticleLife", js.undefined)
    
    inline def setMinimumSpeed(value: Double): Self = StObject.set(x, "minimumSpeed", value.asInstanceOf[js.Any])
    
    inline def setMinimumSpeedUndefined: Self = StObject.set(x, "minimumSpeed", js.undefined)
    
    inline def setModelMatrix(value: Matrix4): Self = StObject.set(x, "modelMatrix", value.asInstanceOf[js.Any])
    
    inline def setModelMatrixUndefined: Self = StObject.set(x, "modelMatrix", js.undefined)
    
    inline def setParticleLife(value: Double): Self = StObject.set(x, "particleLife", value.asInstanceOf[js.Any])
    
    inline def setParticleLifeUndefined: Self = StObject.set(x, "particleLife", js.undefined)
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
    
    inline def setShow(value: Boolean): Self = StObject.set(x, "show", value.asInstanceOf[js.Any])
    
    inline def setShowUndefined: Self = StObject.set(x, "show", js.undefined)
    
    inline def setSizeInMeters(value: Boolean): Self = StObject.set(x, "sizeInMeters", value.asInstanceOf[js.Any])
    
    inline def setSizeInMetersUndefined: Self = StObject.set(x, "sizeInMeters", js.undefined)
    
    inline def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    inline def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    
    inline def setStartColor(value: typings.cesiumEngine.mod.Color): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
    
    inline def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
    
    inline def setStartScale(value: Double): Self = StObject.set(x, "startScale", value.asInstanceOf[js.Any])
    
    inline def setStartScaleUndefined: Self = StObject.set(x, "startScale", js.undefined)
    
    inline def setUpdateCallback(value: (/* particle */ Particle, /* dt */ Double) => Unit): Self = StObject.set(x, "updateCallback", js.Any.fromFunction2(value))
    
    inline def setUpdateCallbackUndefined: Self = StObject.set(x, "updateCallback", js.undefined)
  }
}
