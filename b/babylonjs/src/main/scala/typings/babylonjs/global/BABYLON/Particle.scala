package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.Particle")
@js.native
class Particle protected ()
  extends StObject
     with typings.babylonjs.BABYLON.Particle {
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
  var _attachedSubEmitters: Nullable[js.Array[typings.babylonjs.BABYLON.SubEmitter]] = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentAngularSpeed1: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentAngularSpeed2: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentAngularSpeedGradient: Nullable[typings.babylonjs.BABYLON.FactorGradient] = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentColor1: typings.babylonjs.BABYLON.Color4 = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentColor2: typings.babylonjs.BABYLON.Color4 = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentColorGradient: Nullable[typings.babylonjs.BABYLON.ColorGradient] = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentDrag1: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentDrag2: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentDragGradient: Nullable[typings.babylonjs.BABYLON.FactorGradient] = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentLimitVelocity1: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentLimitVelocity2: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentLimitVelocityGradient: Nullable[typings.babylonjs.BABYLON.FactorGradient] = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentSize1: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentSize2: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentSizeGradient: Nullable[typings.babylonjs.BABYLON.FactorGradient] = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentVelocity1: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentVelocity2: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _currentVelocityGradient: Nullable[typings.babylonjs.BABYLON.FactorGradient] = js.native
  
  /** @hidden */
  /* CompleteClass */
  override def _inheritParticleInfoToSubEmitter(subEmitter: typings.babylonjs.BABYLON.SubEmitter): Unit = js.native
  
  /** @hidden */
  /* CompleteClass */
  override def _inheritParticleInfoToSubEmitters(): Unit = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _initialDirection: Nullable[typings.babylonjs.BABYLON.Vector3] = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _initialEndSpriteCellID: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _initialStartSpriteCellID: Double = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _randomNoiseCoordinates1: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /** @hidden */
  /* CompleteClass */
  var _randomNoiseCoordinates2: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /** @hidden */
  /* CompleteClass */
  override def _reset(): Unit = js.native
  
  /**
    * The current age of the particle.
    */
  /* CompleteClass */
  var age: Double = js.native
  
  /**
    * The current angle of the particle.
    */
  /* CompleteClass */
  var angle: Double = js.native
  
  /**
    * Defines how fast is the angle changing.
    */
  /* CompleteClass */
  var angularSpeed: Double = js.native
  
  /**
    * Defines the cell index used by the particle to be rendered from a sprite.
    */
  /* CompleteClass */
  var cellIndex: Double = js.native
  
  /**
    * The color of the particle.
    */
  /* CompleteClass */
  var color: typings.babylonjs.BABYLON.Color4 = js.native
  
  /**
    * The color change of the particle per step.
    */
  /* CompleteClass */
  var colorStep: typings.babylonjs.BABYLON.Color4 = js.native
  
  /**
    * Copy the properties of particle to another one.
    * @param other the particle to copy the information to.
    */
  /* CompleteClass */
  override def copyTo(other: typings.babylonjs.BABYLON.Particle): Unit = js.native
  
  /**
    * The world direction of the particle in the scene.
    */
  /* CompleteClass */
  var direction: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * Unique ID of the particle
    */
  /* CompleteClass */
  var id: Double = js.native
  
  /**
    * Defines how long will the life of the particle be.
    */
  /* CompleteClass */
  var lifeTime: Double = js.native
  
  /**
    * The particle system the particle belongs to.
    */
  /* CompleteClass */
  var particleSystem: typings.babylonjs.BABYLON.ParticleSystem = js.native
  
  /**
    * The world position of the particle in the scene.
    */
  /* CompleteClass */
  var position: typings.babylonjs.BABYLON.Vector3 = js.native
  
  /**
    * The information required to support color remapping
    */
  /* CompleteClass */
  var remapData: typings.babylonjs.BABYLON.Vector4 = js.native
  
  /**
    * The current scale of the particle.
    */
  /* CompleteClass */
  var scale: typings.babylonjs.BABYLON.Vector2 = js.native
  
  /**
    * The current size of the particle.
    */
  /* CompleteClass */
  var size: Double = js.native
  
  /**
    * Defines how the sprite cell index is updated for the particle
    */
  /* CompleteClass */
  override def updateCellIndex(): Unit = js.native
  
  /* private */ /* CompleteClass */
  var updateCellInfoFromSystem: js.Any = js.native
}
/* static members */
object Particle {
  
  @JSGlobal("BABYLON.Particle")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("BABYLON.Particle._Count")
  @js.native
  def _Count: js.Any = js.native
  inline def _Count_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Count")(x.asInstanceOf[js.Any])
}
