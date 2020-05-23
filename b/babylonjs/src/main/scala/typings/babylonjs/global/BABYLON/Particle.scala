package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("BABYLON.Particle")
@js.native
class Particle protected ()
  extends typings.babylonjs.BABYLON.Particle {
  /**
    * Creates a new instance Particle
    * @param particleSystem the particle system the particle belongs to
    */
  def this(/**
    * The particle system the particle belongs to.
    */
  particleSystem: typings.babylonjs.BABYLON.ParticleSystem) = this()
  /** @hidden */
  /* CompleteClass */
  override var _attachedSubEmitters: Nullable[js.Array[typings.babylonjs.BABYLON.SubEmitter]] = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentAngularSpeed1: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentAngularSpeed2: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentAngularSpeedGradient: Nullable[typings.babylonjs.BABYLON.FactorGradient] = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentColor1: typings.babylonjs.BABYLON.Color4 = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentColor2: typings.babylonjs.BABYLON.Color4 = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentColorGradient: Nullable[typings.babylonjs.BABYLON.ColorGradient] = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentDrag1: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentDrag2: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentDragGradient: Nullable[typings.babylonjs.BABYLON.FactorGradient] = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentLimitVelocity1: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentLimitVelocity2: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentLimitVelocityGradient: Nullable[typings.babylonjs.BABYLON.FactorGradient] = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentSize1: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentSize2: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentSizeGradient: Nullable[typings.babylonjs.BABYLON.FactorGradient] = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentVelocity1: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentVelocity2: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _currentVelocityGradient: Nullable[typings.babylonjs.BABYLON.FactorGradient] = js.native
  /** @hidden */
  /* CompleteClass */
  override var _initialDirection: Nullable[typings.babylonjs.BABYLON.Vector3] = js.native
  /** @hidden */
  /* CompleteClass */
  override var _initialEndSpriteCellID: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _initialStartSpriteCellID: Double = js.native
  /** @hidden */
  /* CompleteClass */
  override var _randomNoiseCoordinates1: typings.babylonjs.BABYLON.Vector3 = js.native
  /** @hidden */
  /* CompleteClass */
  override var _randomNoiseCoordinates2: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The current age of the particle.
    */
  /* CompleteClass */
  override var age: Double = js.native
  /**
    * The current angle of the particle.
    */
  /* CompleteClass */
  override var angle: Double = js.native
  /**
    * Defines how fast is the angle changing.
    */
  /* CompleteClass */
  override var angularSpeed: Double = js.native
  /**
    * Defines the cell index used by the particle to be rendered from a sprite.
    */
  /* CompleteClass */
  override var cellIndex: Double = js.native
  /**
    * The color of the particle.
    */
  /* CompleteClass */
  override var color: typings.babylonjs.BABYLON.Color4 = js.native
  /**
    * The color change of the particle per step.
    */
  /* CompleteClass */
  override var colorStep: typings.babylonjs.BABYLON.Color4 = js.native
  /**
    * The world direction of the particle in the scene.
    */
  /* CompleteClass */
  override var direction: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * Unique ID of the particle
    */
  /* CompleteClass */
  override var id: Double = js.native
  /**
    * Defines how long will the life of the particle be.
    */
  /* CompleteClass */
  override var lifeTime: Double = js.native
  /**
    * The particle system the particle belongs to.
    */
  /* CompleteClass */
  override var particleSystem: typings.babylonjs.BABYLON.ParticleSystem = js.native
  /**
    * The world position of the particle in the scene.
    */
  /* CompleteClass */
  override var position: typings.babylonjs.BABYLON.Vector3 = js.native
  /**
    * The information required to support color remapping
    */
  /* CompleteClass */
  override var remapData: typings.babylonjs.BABYLON.Vector4 = js.native
  /**
    * The current scale of the particle.
    */
  /* CompleteClass */
  override var scale: typings.babylonjs.BABYLON.Vector2 = js.native
  /**
    * The current size of the particle.
    */
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override var updateCellInfoFromSystem: js.Any = js.native
  /** @hidden */
  /* CompleteClass */
  override def _inheritParticleInfoToSubEmitter(subEmitter: typings.babylonjs.BABYLON.SubEmitter): Unit = js.native
  /** @hidden */
  /* CompleteClass */
  override def _inheritParticleInfoToSubEmitters(): Unit = js.native
  /** @hidden */
  /* CompleteClass */
  override def _reset(): Unit = js.native
  /**
    * Copy the properties of particle to another one.
    * @param other the particle to copy the information to.
    */
  /* CompleteClass */
  override def copyTo(other: typings.babylonjs.BABYLON.Particle): Unit = js.native
  /**
    * Defines how the sprite cell index is updated for the particle
    */
  /* CompleteClass */
  override def updateCellIndex(): Unit = js.native
}

/* static members */
@JSGlobal("BABYLON.Particle")
@js.native
object Particle extends js.Object {
  var _Count: js.Any = js.native
}

