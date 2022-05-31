package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Particle extends StObject {
  
  /** @hidden */
  var _attachedSubEmitters: Nullable[js.Array[SubEmitter]]
  
  /** @hidden */
  var _currentAngularSpeed1: Double
  
  /** @hidden */
  var _currentAngularSpeed2: Double
  
  /** @hidden */
  var _currentAngularSpeedGradient: Nullable[FactorGradient]
  
  /** @hidden */
  var _currentColor1: Color4
  
  /** @hidden */
  var _currentColor2: Color4
  
  /** @hidden */
  var _currentColorGradient: Nullable[ColorGradient]
  
  /** @hidden */
  var _currentDrag1: Double
  
  /** @hidden */
  var _currentDrag2: Double
  
  /** @hidden */
  var _currentDragGradient: Nullable[FactorGradient]
  
  /** @hidden */
  var _currentLimitVelocity1: Double
  
  /** @hidden */
  var _currentLimitVelocity2: Double
  
  /** @hidden */
  var _currentLimitVelocityGradient: Nullable[FactorGradient]
  
  /** @hidden */
  var _currentSize1: Double
  
  /** @hidden */
  var _currentSize2: Double
  
  /** @hidden */
  var _currentSizeGradient: Nullable[FactorGradient]
  
  /** @hidden */
  var _currentVelocity1: Double
  
  /** @hidden */
  var _currentVelocity2: Double
  
  /** @hidden */
  var _currentVelocityGradient: Nullable[FactorGradient]
  
  /** @hidden */
  def _inheritParticleInfoToSubEmitter(subEmitter: SubEmitter): Unit
  
  /** @hidden */
  def _inheritParticleInfoToSubEmitters(): Unit
  
  /** @hidden */
  var _initialDirection: Nullable[Vector3]
  
  /** @hidden */
  var _initialEndSpriteCellID: Double
  
  /** @hidden */
  var _initialStartSpriteCellID: Double
  
  /** @hidden */
  var _localPosition: js.UndefOr[Vector3] = js.undefined
  
  /** @hidden */
  var _randomCellOffset: js.UndefOr[Double] = js.undefined
  
  /** @hidden */
  var _randomNoiseCoordinates1: Vector3
  
  /** @hidden */
  var _randomNoiseCoordinates2: Vector3
  
  /** @hidden */
  def _reset(): Unit
  
  /**
    * The current age of the particle.
    */
  var age: Double
  
  /**
    * The current angle of the particle.
    */
  var angle: Double
  
  /**
    * Defines how fast is the angle changing.
    */
  var angularSpeed: Double
  
  /**
    * Defines the cell index used by the particle to be rendered from a sprite.
    */
  var cellIndex: Double
  
  /**
    * The color of the particle.
    */
  var color: Color4
  
  /**
    * The color change of the particle per step.
    */
  var colorStep: Color4
  
  /**
    * Copy the properties of particle to another one.
    * @param other the particle to copy the information to.
    */
  def copyTo(other: Particle): Unit
  
  /**
    * The world direction of the particle in the scene.
    */
  var direction: Vector3
  
  /**
    * Unique ID of the particle
    */
  var id: Double
  
  /**
    * Defines how long will the life of the particle be.
    */
  var lifeTime: Double
  
  /**
    * The particle system the particle belongs to.
    */
  var particleSystem: ParticleSystem
  
  /**
    * The world position of the particle in the scene.
    */
  var position: Vector3
  
  /**
    * The information required to support color remapping
    */
  var remapData: Vector4
  
  /**
    * The current scale of the particle.
    */
  var scale: Vector2
  
  /**
    * The current size of the particle.
    */
  var size: Double
  
  /**
    * Defines how the sprite cell index is updated for the particle
    */
  def updateCellIndex(): Unit
  
  /* private */ var updateCellInfoFromSystem: js.Any
}
object Particle {
  
  inline def apply(
    _currentAngularSpeed1: Double,
    _currentAngularSpeed2: Double,
    _currentColor1: Color4,
    _currentColor2: Color4,
    _currentDrag1: Double,
    _currentDrag2: Double,
    _currentLimitVelocity1: Double,
    _currentLimitVelocity2: Double,
    _currentSize1: Double,
    _currentSize2: Double,
    _currentVelocity1: Double,
    _currentVelocity2: Double,
    _inheritParticleInfoToSubEmitter: SubEmitter => Unit,
    _inheritParticleInfoToSubEmitters: () => Unit,
    _initialEndSpriteCellID: Double,
    _initialStartSpriteCellID: Double,
    _randomNoiseCoordinates1: Vector3,
    _randomNoiseCoordinates2: Vector3,
    _reset: () => Unit,
    age: Double,
    angle: Double,
    angularSpeed: Double,
    cellIndex: Double,
    color: Color4,
    colorStep: Color4,
    copyTo: Particle => Unit,
    direction: Vector3,
    id: Double,
    lifeTime: Double,
    particleSystem: ParticleSystem,
    position: Vector3,
    remapData: Vector4,
    scale: Vector2,
    size: Double,
    updateCellIndex: () => Unit,
    updateCellInfoFromSystem: js.Any
  ): Particle = {
    val __obj = js.Dynamic.literal(_currentAngularSpeed1 = _currentAngularSpeed1.asInstanceOf[js.Any], _currentAngularSpeed2 = _currentAngularSpeed2.asInstanceOf[js.Any], _currentColor1 = _currentColor1.asInstanceOf[js.Any], _currentColor2 = _currentColor2.asInstanceOf[js.Any], _currentDrag1 = _currentDrag1.asInstanceOf[js.Any], _currentDrag2 = _currentDrag2.asInstanceOf[js.Any], _currentLimitVelocity1 = _currentLimitVelocity1.asInstanceOf[js.Any], _currentLimitVelocity2 = _currentLimitVelocity2.asInstanceOf[js.Any], _currentSize1 = _currentSize1.asInstanceOf[js.Any], _currentSize2 = _currentSize2.asInstanceOf[js.Any], _currentVelocity1 = _currentVelocity1.asInstanceOf[js.Any], _currentVelocity2 = _currentVelocity2.asInstanceOf[js.Any], _inheritParticleInfoToSubEmitter = js.Any.fromFunction1(_inheritParticleInfoToSubEmitter), _inheritParticleInfoToSubEmitters = js.Any.fromFunction0(_inheritParticleInfoToSubEmitters), _initialEndSpriteCellID = _initialEndSpriteCellID.asInstanceOf[js.Any], _initialStartSpriteCellID = _initialStartSpriteCellID.asInstanceOf[js.Any], _randomNoiseCoordinates1 = _randomNoiseCoordinates1.asInstanceOf[js.Any], _randomNoiseCoordinates2 = _randomNoiseCoordinates2.asInstanceOf[js.Any], _reset = js.Any.fromFunction0(_reset), age = age.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], angularSpeed = angularSpeed.asInstanceOf[js.Any], cellIndex = cellIndex.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorStep = colorStep.asInstanceOf[js.Any], copyTo = js.Any.fromFunction1(copyTo), direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lifeTime = lifeTime.asInstanceOf[js.Any], particleSystem = particleSystem.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], remapData = remapData.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updateCellIndex = js.Any.fromFunction0(updateCellIndex), updateCellInfoFromSystem = updateCellInfoFromSystem.asInstanceOf[js.Any], _attachedSubEmitters = null, _currentAngularSpeedGradient = null, _currentColorGradient = null, _currentDragGradient = null, _currentLimitVelocityGradient = null, _currentSizeGradient = null, _currentVelocityGradient = null, _initialDirection = null)
    __obj.asInstanceOf[Particle]
  }
  
  extension [Self <: Particle](x: Self) {
    
    inline def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
    
    inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
    
    inline def setAngularSpeed(value: Double): Self = StObject.set(x, "angularSpeed", value.asInstanceOf[js.Any])
    
    inline def setCellIndex(value: Double): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
    
    inline def setColor(value: Color4): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorStep(value: Color4): Self = StObject.set(x, "colorStep", value.asInstanceOf[js.Any])
    
    inline def setCopyTo(value: Particle => Unit): Self = StObject.set(x, "copyTo", js.Any.fromFunction1(value))
    
    inline def setDirection(value: Vector3): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLifeTime(value: Double): Self = StObject.set(x, "lifeTime", value.asInstanceOf[js.Any])
    
    inline def setParticleSystem(value: ParticleSystem): Self = StObject.set(x, "particleSystem", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: Vector3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setRemapData(value: Vector4): Self = StObject.set(x, "remapData", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Vector2): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setUpdateCellIndex(value: () => Unit): Self = StObject.set(x, "updateCellIndex", js.Any.fromFunction0(value))
    
    inline def setUpdateCellInfoFromSystem(value: js.Any): Self = StObject.set(x, "updateCellInfoFromSystem", value.asInstanceOf[js.Any])
    
    inline def set_attachedSubEmitters(value: Nullable[js.Array[SubEmitter]]): Self = StObject.set(x, "_attachedSubEmitters", value.asInstanceOf[js.Any])
    
    inline def set_attachedSubEmittersNull: Self = StObject.set(x, "_attachedSubEmitters", null)
    
    inline def set_attachedSubEmittersVarargs(value: SubEmitter*): Self = StObject.set(x, "_attachedSubEmitters", js.Array(value :_*))
    
    inline def set_currentAngularSpeed1(value: Double): Self = StObject.set(x, "_currentAngularSpeed1", value.asInstanceOf[js.Any])
    
    inline def set_currentAngularSpeed2(value: Double): Self = StObject.set(x, "_currentAngularSpeed2", value.asInstanceOf[js.Any])
    
    inline def set_currentAngularSpeedGradient(value: Nullable[FactorGradient]): Self = StObject.set(x, "_currentAngularSpeedGradient", value.asInstanceOf[js.Any])
    
    inline def set_currentAngularSpeedGradientNull: Self = StObject.set(x, "_currentAngularSpeedGradient", null)
    
    inline def set_currentColor1(value: Color4): Self = StObject.set(x, "_currentColor1", value.asInstanceOf[js.Any])
    
    inline def set_currentColor2(value: Color4): Self = StObject.set(x, "_currentColor2", value.asInstanceOf[js.Any])
    
    inline def set_currentColorGradient(value: Nullable[ColorGradient]): Self = StObject.set(x, "_currentColorGradient", value.asInstanceOf[js.Any])
    
    inline def set_currentColorGradientNull: Self = StObject.set(x, "_currentColorGradient", null)
    
    inline def set_currentDrag1(value: Double): Self = StObject.set(x, "_currentDrag1", value.asInstanceOf[js.Any])
    
    inline def set_currentDrag2(value: Double): Self = StObject.set(x, "_currentDrag2", value.asInstanceOf[js.Any])
    
    inline def set_currentDragGradient(value: Nullable[FactorGradient]): Self = StObject.set(x, "_currentDragGradient", value.asInstanceOf[js.Any])
    
    inline def set_currentDragGradientNull: Self = StObject.set(x, "_currentDragGradient", null)
    
    inline def set_currentLimitVelocity1(value: Double): Self = StObject.set(x, "_currentLimitVelocity1", value.asInstanceOf[js.Any])
    
    inline def set_currentLimitVelocity2(value: Double): Self = StObject.set(x, "_currentLimitVelocity2", value.asInstanceOf[js.Any])
    
    inline def set_currentLimitVelocityGradient(value: Nullable[FactorGradient]): Self = StObject.set(x, "_currentLimitVelocityGradient", value.asInstanceOf[js.Any])
    
    inline def set_currentLimitVelocityGradientNull: Self = StObject.set(x, "_currentLimitVelocityGradient", null)
    
    inline def set_currentSize1(value: Double): Self = StObject.set(x, "_currentSize1", value.asInstanceOf[js.Any])
    
    inline def set_currentSize2(value: Double): Self = StObject.set(x, "_currentSize2", value.asInstanceOf[js.Any])
    
    inline def set_currentSizeGradient(value: Nullable[FactorGradient]): Self = StObject.set(x, "_currentSizeGradient", value.asInstanceOf[js.Any])
    
    inline def set_currentSizeGradientNull: Self = StObject.set(x, "_currentSizeGradient", null)
    
    inline def set_currentVelocity1(value: Double): Self = StObject.set(x, "_currentVelocity1", value.asInstanceOf[js.Any])
    
    inline def set_currentVelocity2(value: Double): Self = StObject.set(x, "_currentVelocity2", value.asInstanceOf[js.Any])
    
    inline def set_currentVelocityGradient(value: Nullable[FactorGradient]): Self = StObject.set(x, "_currentVelocityGradient", value.asInstanceOf[js.Any])
    
    inline def set_currentVelocityGradientNull: Self = StObject.set(x, "_currentVelocityGradient", null)
    
    inline def set_inheritParticleInfoToSubEmitter(value: SubEmitter => Unit): Self = StObject.set(x, "_inheritParticleInfoToSubEmitter", js.Any.fromFunction1(value))
    
    inline def set_inheritParticleInfoToSubEmitters(value: () => Unit): Self = StObject.set(x, "_inheritParticleInfoToSubEmitters", js.Any.fromFunction0(value))
    
    inline def set_initialDirection(value: Nullable[Vector3]): Self = StObject.set(x, "_initialDirection", value.asInstanceOf[js.Any])
    
    inline def set_initialDirectionNull: Self = StObject.set(x, "_initialDirection", null)
    
    inline def set_initialEndSpriteCellID(value: Double): Self = StObject.set(x, "_initialEndSpriteCellID", value.asInstanceOf[js.Any])
    
    inline def set_initialStartSpriteCellID(value: Double): Self = StObject.set(x, "_initialStartSpriteCellID", value.asInstanceOf[js.Any])
    
    inline def set_localPosition(value: Vector3): Self = StObject.set(x, "_localPosition", value.asInstanceOf[js.Any])
    
    inline def set_localPositionUndefined: Self = StObject.set(x, "_localPosition", js.undefined)
    
    inline def set_randomCellOffset(value: Double): Self = StObject.set(x, "_randomCellOffset", value.asInstanceOf[js.Any])
    
    inline def set_randomCellOffsetUndefined: Self = StObject.set(x, "_randomCellOffset", js.undefined)
    
    inline def set_randomNoiseCoordinates1(value: Vector3): Self = StObject.set(x, "_randomNoiseCoordinates1", value.asInstanceOf[js.Any])
    
    inline def set_randomNoiseCoordinates2(value: Vector3): Self = StObject.set(x, "_randomNoiseCoordinates2", value.asInstanceOf[js.Any])
    
    inline def set_reset(value: () => Unit): Self = StObject.set(x, "_reset", js.Any.fromFunction0(value))
  }
}
