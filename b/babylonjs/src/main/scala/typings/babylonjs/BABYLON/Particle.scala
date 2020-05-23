package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Particle extends js.Object {
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
  var updateCellInfoFromSystem: js.Any
  /** @hidden */
  def _inheritParticleInfoToSubEmitter(subEmitter: SubEmitter): Unit
  /** @hidden */
  def _inheritParticleInfoToSubEmitters(): Unit
  /** @hidden */
  def _reset(): Unit
  /**
    * Copy the properties of particle to another one.
    * @param other the particle to copy the information to.
    */
  def copyTo(other: Particle): Unit
  /**
    * Defines how the sprite cell index is updated for the particle
    */
  def updateCellIndex(): Unit
}

object Particle {
  @scala.inline
  def apply(
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
    updateCellInfoFromSystem: js.Any,
    _attachedSubEmitters: Nullable[js.Array[SubEmitter]] = null,
    _currentAngularSpeedGradient: Nullable[FactorGradient] = null,
    _currentColorGradient: Nullable[ColorGradient] = null,
    _currentDragGradient: Nullable[FactorGradient] = null,
    _currentLimitVelocityGradient: Nullable[FactorGradient] = null,
    _currentSizeGradient: Nullable[FactorGradient] = null,
    _currentVelocityGradient: Nullable[FactorGradient] = null,
    _initialDirection: Nullable[Vector3] = null,
    _localPosition: Vector3 = null,
    _randomCellOffset: js.UndefOr[Double] = js.undefined
  ): Particle = {
    val __obj = js.Dynamic.literal(_currentAngularSpeed1 = _currentAngularSpeed1.asInstanceOf[js.Any], _currentAngularSpeed2 = _currentAngularSpeed2.asInstanceOf[js.Any], _currentColor1 = _currentColor1.asInstanceOf[js.Any], _currentColor2 = _currentColor2.asInstanceOf[js.Any], _currentDrag1 = _currentDrag1.asInstanceOf[js.Any], _currentDrag2 = _currentDrag2.asInstanceOf[js.Any], _currentLimitVelocity1 = _currentLimitVelocity1.asInstanceOf[js.Any], _currentLimitVelocity2 = _currentLimitVelocity2.asInstanceOf[js.Any], _currentSize1 = _currentSize1.asInstanceOf[js.Any], _currentSize2 = _currentSize2.asInstanceOf[js.Any], _currentVelocity1 = _currentVelocity1.asInstanceOf[js.Any], _currentVelocity2 = _currentVelocity2.asInstanceOf[js.Any], _inheritParticleInfoToSubEmitter = js.Any.fromFunction1(_inheritParticleInfoToSubEmitter), _inheritParticleInfoToSubEmitters = js.Any.fromFunction0(_inheritParticleInfoToSubEmitters), _initialEndSpriteCellID = _initialEndSpriteCellID.asInstanceOf[js.Any], _initialStartSpriteCellID = _initialStartSpriteCellID.asInstanceOf[js.Any], _randomNoiseCoordinates1 = _randomNoiseCoordinates1.asInstanceOf[js.Any], _randomNoiseCoordinates2 = _randomNoiseCoordinates2.asInstanceOf[js.Any], _reset = js.Any.fromFunction0(_reset), age = age.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], angularSpeed = angularSpeed.asInstanceOf[js.Any], cellIndex = cellIndex.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorStep = colorStep.asInstanceOf[js.Any], copyTo = js.Any.fromFunction1(copyTo), direction = direction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], lifeTime = lifeTime.asInstanceOf[js.Any], particleSystem = particleSystem.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], remapData = remapData.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], updateCellIndex = js.Any.fromFunction0(updateCellIndex), updateCellInfoFromSystem = updateCellInfoFromSystem.asInstanceOf[js.Any], _attachedSubEmitters = _attachedSubEmitters.asInstanceOf[js.Any], _currentAngularSpeedGradient = _currentAngularSpeedGradient.asInstanceOf[js.Any], _currentColorGradient = _currentColorGradient.asInstanceOf[js.Any], _currentDragGradient = _currentDragGradient.asInstanceOf[js.Any], _currentLimitVelocityGradient = _currentLimitVelocityGradient.asInstanceOf[js.Any], _currentSizeGradient = _currentSizeGradient.asInstanceOf[js.Any], _currentVelocityGradient = _currentVelocityGradient.asInstanceOf[js.Any], _initialDirection = _initialDirection.asInstanceOf[js.Any])
    if (_localPosition != null) __obj.updateDynamic("_localPosition")(_localPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(_randomCellOffset)) __obj.updateDynamic("_randomCellOffset")(_randomCellOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Particle]
  }
}

