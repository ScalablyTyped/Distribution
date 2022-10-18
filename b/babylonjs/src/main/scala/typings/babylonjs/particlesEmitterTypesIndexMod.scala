package typings.babylonjs

import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object particlesEmitterTypesIndexMod {
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "BoxParticleEmitter")
  @js.native
  /**
    * Creates a new instance BoxParticleEmitter
    */
  open class BoxParticleEmitter ()
    extends typings.babylonjs.particlesEmitterTypesBoxParticleEmitterMod.BoxParticleEmitter
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "ConeParticleEmitter")
  @js.native
  /**
    * Creates a new instance ConeParticleEmitter
    * @param radius the radius of the emission cone (1 by default)
    * @param angle the cone base angle (PI by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
    */
  open class ConeParticleEmitter ()
    extends typings.babylonjs.particlesEmitterTypesConeParticleEmitterMod.ConeParticleEmitter {
    def this(radius: Double) = this()
    def this(radius: Double, angle: Double) = this()
    def this(radius: Unit, angle: Double) = this()
    def this(
      radius: Double,
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Double,
      angle: Unit,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Unit,
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Unit,
      angle: Unit,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "CustomParticleEmitter")
  @js.native
  /**
    * Creates a new instance CustomParticleEmitter
    */
  open class CustomParticleEmitter ()
    extends typings.babylonjs.particlesEmitterTypesCustomParticleEmitterMod.CustomParticleEmitter
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "CylinderDirectedParticleEmitter")
  @js.native
  /**
    * Creates a new instance CylinderDirectedParticleEmitter
    * @param radius the radius of the emission cylinder (1 by default)
    * @param height the height of the emission cylinder (1 by default)
    * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param direction1 the min limit of the emission direction (up vector by default)
    * @param direction2 the max limit of the emission direction (up vector by default)
    */
  open class CylinderDirectedParticleEmitter ()
    extends typings.babylonjs.particlesEmitterTypesCylinderParticleEmitterMod.CylinderDirectedParticleEmitter {
    def this(radius: Double) = this()
    def this(radius: Double, height: Double) = this()
    def this(radius: Unit, height: Double) = this()
    def this(radius: Double, height: Double, radiusRange: Double) = this()
    def this(radius: Double, height: Unit, radiusRange: Double) = this()
    def this(radius: Unit, height: Double, radiusRange: Double) = this()
    def this(radius: Unit, height: Unit, radiusRange: Double) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Unit,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Unit,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Double,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Unit,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Unit,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Unit,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Unit,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Unit,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Unit,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Unit,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Unit,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Unit,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Unit,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Unit,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Double,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Unit,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Double,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Unit,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Unit,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Unit,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Unit,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Unit,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Unit,
      height: Unit,
      radiusRange: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "CylinderParticleEmitter")
  @js.native
  /**
    * Creates a new instance CylinderParticleEmitter
    * @param radius the radius of the emission cylinder (1 by default)
    * @param height the height of the emission cylinder (1 by default)
    * @param radiusRange the range of the emission cylinder [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  open class CylinderParticleEmitter ()
    extends typings.babylonjs.particlesEmitterTypesCylinderParticleEmitterMod.CylinderParticleEmitter {
    def this(/**
      * The radius of the emission cylinder.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Unit,
      /**
      * The height of the emission cylinder.
      */
    height: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Unit,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Unit,
      /**
      * The height of the emission cylinder.
      */
    height: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Unit,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Double,
      /**
      * The height of the emission cylinder.
      */
    height: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Unit,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Unit,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Unit,
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Unit,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Unit,
      /**
      * The height of the emission cylinder.
      */
    height: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: Unit,
      /**
      * The height of the emission cylinder.
      */
    height: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Unit,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "HemisphericParticleEmitter")
  @js.native
  /**
    * Creates a new instance HemisphericParticleEmitter
    * @param radius the radius of the emission hemisphere (1 by default)
    * @param radiusRange the range of the emission hemisphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  open class HemisphericParticleEmitter ()
    extends typings.babylonjs.particlesEmitterTypesHemisphericParticleEmitterMod.HemisphericParticleEmitter {
    def this(/**
      * The radius of the emission hemisphere.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Unit,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Unit,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "MeshParticleEmitter")
  @js.native
  /**
    * Creates a new instance MeshParticleEmitter
    * @param mesh defines the mesh to use as source
    */
  open class MeshParticleEmitter ()
    extends typings.babylonjs.particlesEmitterTypesMeshParticleEmitterMod.MeshParticleEmitter {
    def this(mesh: Nullable[AbstractMesh]) = this()
  }
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "PointParticleEmitter")
  @js.native
  /**
    * Creates a new instance PointParticleEmitter
    */
  open class PointParticleEmitter ()
    extends typings.babylonjs.particlesEmitterTypesPointParticleEmitterMod.PointParticleEmitter
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "SphereDirectedParticleEmitter")
  @js.native
  /**
    * Creates a new instance SphereDirectedParticleEmitter
    * @param radius the radius of the emission sphere (1 by default)
    * @param direction1 the min limit of the emission direction (up vector by default)
    * @param direction2 the max limit of the emission direction (up vector by default)
    */
  open class SphereDirectedParticleEmitter ()
    extends typings.babylonjs.particlesEmitterTypesSphereParticleEmitterMod.SphereDirectedParticleEmitter {
    def this(radius: Double) = this()
    def this(radius: Double, /**
      * The min limit of the emission direction.
      */
    direction1: Vector3) = this()
    def this(radius: Unit, /**
      * The min limit of the emission direction.
      */
    direction1: Vector3) = this()
    def this(
      radius: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Unit,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Unit,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Unit,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3,
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "SphereParticleEmitter")
  @js.native
  /**
    * Creates a new instance SphereParticleEmitter
    * @param radius the radius of the emission sphere (1 by default)
    * @param radiusRange the range of the emission sphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  open class SphereParticleEmitter ()
    extends typings.babylonjs.particlesEmitterTypesSphereParticleEmitterMod.SphereParticleEmitter {
    def this(/**
      * The radius of the emission sphere.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Unit,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: Unit,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Unit,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
  }
}
