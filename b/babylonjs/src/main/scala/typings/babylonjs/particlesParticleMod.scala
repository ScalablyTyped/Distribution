package typings.babylonjs

import typings.babylonjs.mathsMathDotcolorMod.Color4
import typings.babylonjs.mathsMathDotvectorMod.Vector2
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.mathsMathDotvectorMod.Vector4
import typings.babylonjs.miscGradientsMod.ColorGradient
import typings.babylonjs.miscGradientsMod.FactorGradient
import typings.babylonjs.particlesParticleSystemMod.ParticleSystem
import typings.babylonjs.particlesSubEmitterMod.SubEmitter
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesParticleMod {
  
  @JSImport("babylonjs/Particles/particle", "Particle")
  @js.native
  open class Particle protected () extends StObject {
    /**
      * Creates a new instance Particle
      * @param particleSystem the particle system the particle belongs to
      */
    def this(/**
      * The particle system the particle belongs to.
      */
    particleSystem: ParticleSystem) = this()
    
    /** @internal */
    var _attachedSubEmitters: Nullable[js.Array[SubEmitter]] = js.native
    
    /** @internal */
    var _currentAngularSpeed1: Double = js.native
    
    /** @internal */
    var _currentAngularSpeed2: Double = js.native
    
    /** @internal */
    var _currentAngularSpeedGradient: Nullable[FactorGradient] = js.native
    
    /** @internal */
    var _currentColor1: Color4 = js.native
    
    /** @internal */
    var _currentColor2: Color4 = js.native
    
    /** @internal */
    var _currentColorGradient: Nullable[ColorGradient] = js.native
    
    /** @internal */
    var _currentDrag1: Double = js.native
    
    /** @internal */
    var _currentDrag2: Double = js.native
    
    /** @internal */
    var _currentDragGradient: Nullable[FactorGradient] = js.native
    
    /** @internal */
    var _currentLimitVelocity1: Double = js.native
    
    /** @internal */
    var _currentLimitVelocity2: Double = js.native
    
    /** @internal */
    var _currentLimitVelocityGradient: Nullable[FactorGradient] = js.native
    
    /** @internal */
    var _currentSize1: Double = js.native
    
    /** @internal */
    var _currentSize2: Double = js.native
    
    /** @internal */
    var _currentSizeGradient: Nullable[FactorGradient] = js.native
    
    /** @internal */
    var _currentVelocity1: Double = js.native
    
    /** @internal */
    var _currentVelocity2: Double = js.native
    
    /** @internal */
    var _currentVelocityGradient: Nullable[FactorGradient] = js.native
    
    /**
      * @internal
      */
    def _inheritParticleInfoToSubEmitter(subEmitter: SubEmitter): Unit = js.native
    
    /** @internal */
    def _inheritParticleInfoToSubEmitters(): Unit = js.native
    
    /** @internal */
    var _initialDirection: Nullable[Vector3] = js.native
    
    /** @internal */
    var _initialEndSpriteCellID: Double = js.native
    
    /** @internal */
    var _initialSpriteCellLoop: Boolean = js.native
    
    /** @internal */
    var _initialStartSpriteCellID: Double = js.native
    
    /** @internal */
    var _localPosition: js.UndefOr[Vector3] = js.native
    
    /** @internal */
    var _randomCellOffset: js.UndefOr[Double] = js.native
    
    /** @internal */
    var _randomNoiseCoordinates1: Vector3 = js.native
    
    /** @internal */
    var _randomNoiseCoordinates2: Vector3 = js.native
    
    /** @internal */
    def _reset(): Unit = js.native
    
    /* private */ var _updateCellInfoFromSystem: Any = js.native
    
    /**
      * The current age of the particle.
      */
    var age: Double = js.native
    
    /**
      * The current angle of the particle.
      */
    var angle: Double = js.native
    
    /**
      * Defines how fast is the angle changing.
      */
    var angularSpeed: Double = js.native
    
    /**
      * Defines the cell index used by the particle to be rendered from a sprite.
      */
    var cellIndex: Double = js.native
    
    /**
      * The color of the particle.
      */
    var color: Color4 = js.native
    
    /**
      * The color change of the particle per step.
      */
    var colorStep: Color4 = js.native
    
    /**
      * Copy the properties of particle to another one.
      * @param other the particle to copy the information to.
      */
    def copyTo(other: Particle): Unit = js.native
    
    /**
      * The world direction of the particle in the scene.
      */
    var direction: Vector3 = js.native
    
    /**
      * Unique ID of the particle
      */
    var id: Double = js.native
    
    /**
      * Defines how long will the life of the particle be.
      */
    var lifeTime: Double = js.native
    
    /**
      * The particle system the particle belongs to.
      */
    var particleSystem: ParticleSystem = js.native
    
    /**
      * The world position of the particle in the scene.
      */
    var position: Vector3 = js.native
    
    /**
      * The information required to support color remapping
      */
    var remapData: Vector4 = js.native
    
    /**
      * The current scale of the particle.
      */
    var scale: Vector2 = js.native
    
    /**
      * The current size of the particle.
      */
    var size: Double = js.native
    
    /**
      * Defines how the sprite cell index is updated for the particle
      */
    def updateCellIndex(): Unit = js.native
  }
  /* static members */
  object Particle {
    
    @JSImport("babylonjs/Particles/particle", "Particle")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("babylonjs/Particles/particle", "Particle._Count")
    @js.native
    def _Count: Any = js.native
    inline def _Count_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_Count")(x.asInstanceOf[js.Any])
  }
}
