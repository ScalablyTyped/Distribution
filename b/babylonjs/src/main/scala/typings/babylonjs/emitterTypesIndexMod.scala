package typings.babylonjs

import typings.babylonjs.abstractMeshMod.AbstractMesh
import typings.babylonjs.mathVectorMod.Vector3
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object emitterTypesIndexMod {
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "BoxParticleEmitter")
  @js.native
  /**
    * Creates a new instance BoxParticleEmitter
    */
  class BoxParticleEmitter ()
    extends typings.babylonjs.boxParticleEmitterMod.BoxParticleEmitter
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "ConeParticleEmitter")
  @js.native
  /**
    * Creates a new instance ConeParticleEmitter
    * @param radius the radius of the emission cone (1 by default)
    * @param angle the cone base angle (PI by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1] (default is 0)
    */
  class ConeParticleEmitter ()
    extends typings.babylonjs.coneParticleEmitterMod.ConeParticleEmitter {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], angle: Double) = this()
    def this(radius: Double, angle: Double) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      angle: js.UndefOr[scala.Nothing],
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Double,
      angle: js.UndefOr[scala.Nothing],
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
    def this(
      radius: Double,
      angle: Double,
      /** defines how much to randomize the particle direction [0-1] (default is 0) */
    directionRandomizer: Double
    ) = this()
  }
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "CustomParticleEmitter")
  @js.native
  /**
    * Creates a new instance CustomParticleEmitter
    */
  class CustomParticleEmitter ()
    extends typings.babylonjs.customParticleEmitterMod.CustomParticleEmitter
  
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
  class CylinderDirectedParticleEmitter ()
    extends typings.babylonjs.cylinderParticleEmitterMod.CylinderDirectedParticleEmitter {
    def this(radius: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], height: Double) = this()
    def this(radius: Double, height: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], radiusRange: Double) = this()
    def this(radius: js.UndefOr[scala.Nothing], height: Double, radiusRange: Double) = this()
    def this(radius: Double, height: js.UndefOr[scala.Nothing], radiusRange: Double) = this()
    def this(radius: Double, height: Double, radiusRange: Double) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
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
    direction1: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
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
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: js.UndefOr[scala.Nothing],
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
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
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
      radius: js.UndefOr[scala.Nothing],
      height: Double,
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
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
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
      radiusRange: js.UndefOr[scala.Nothing],
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
      height: js.UndefOr[scala.Nothing],
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: js.UndefOr[scala.Nothing],
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
      radiusRange: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: Double,
      height: Double,
      radiusRange: js.UndefOr[scala.Nothing],
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
      radiusRange: Double,
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
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
  class CylinderParticleEmitter ()
    extends typings.babylonjs.cylinderParticleEmitterMod.CylinderParticleEmitter {
    def this(/**
      * The radius of the emission cylinder.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
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
    height: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
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
    height: js.UndefOr[scala.Nothing],
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
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: js.UndefOr[scala.Nothing],
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
    radius: js.UndefOr[scala.Nothing],
      /**
      * The height of the emission cylinder.
      */
    height: Double,
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission cylinder.
      */
    radius: js.UndefOr[scala.Nothing],
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
    height: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
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
    height: js.UndefOr[scala.Nothing],
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
    radiusRange: js.UndefOr[scala.Nothing],
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
    radiusRange: Double,
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
  class HemisphericParticleEmitter ()
    extends typings.babylonjs.hemisphericParticleEmitterMod.HemisphericParticleEmitter {
    def this(/**
      * The radius of the emission hemisphere.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: js.UndefOr[scala.Nothing],
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
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission hemisphere.
      */
    radius: js.UndefOr[scala.Nothing],
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
    radiusRange: js.UndefOr[scala.Nothing],
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
    radiusRange: Double,
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
  class MeshParticleEmitter ()
    extends typings.babylonjs.meshParticleEmitterMod.MeshParticleEmitter {
    def this(mesh: Nullable[AbstractMesh]) = this()
  }
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "PointParticleEmitter")
  @js.native
  /**
    * Creates a new instance PointParticleEmitter
    */
  class PointParticleEmitter ()
    extends typings.babylonjs.pointParticleEmitterMod.PointParticleEmitter
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "SphereDirectedParticleEmitter")
  @js.native
  /**
    * Creates a new instance SphereDirectedParticleEmitter
    * @param radius the radius of the emission sphere (1 by default)
    * @param direction1 the min limit of the emission direction (up vector by default)
    * @param direction2 the max limit of the emission direction (up vector by default)
    */
  class SphereDirectedParticleEmitter ()
    extends typings.babylonjs.sphereParticleEmitterMod.SphereDirectedParticleEmitter {
    def this(radius: Double) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: Vector3
    ) = this()
    def this(radius: Double, /**
      * The min limit of the emission direction.
      */
    direction1: Vector3) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
      /**
      * The max limit of the emission direction.
      */
    direction2: Vector3
    ) = this()
    def this(
      radius: js.UndefOr[scala.Nothing],
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
      /**
      * The min limit of the emission direction.
      */
    direction1: js.UndefOr[scala.Nothing],
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
  }
  
  @JSImport("babylonjs/Particles/EmitterTypes/index", "SphereParticleEmitter")
  @js.native
  /**
    * Creates a new instance SphereParticleEmitter
    * @param radius the radius of the emission sphere (1 by default)
    * @param radiusRange the range of the emission sphere [0-1] 0 Surface only, 1 Entire Radius (1 by default)
    * @param directionRandomizer defines how much to randomize the particle direction [0-1]
    */
  class SphereParticleEmitter ()
    extends typings.babylonjs.sphereParticleEmitterMod.SphereParticleEmitter {
    def this(/**
      * The radius of the emission sphere.
      */
    radius: Double) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
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
    radiusRange: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
      /**
      * The range of emission [0-1] 0 Surface only, 1 Entire Radius.
      */
    radiusRange: js.UndefOr[scala.Nothing],
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
    def this(
      /**
      * The radius of the emission sphere.
      */
    radius: js.UndefOr[scala.Nothing],
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
    radiusRange: js.UndefOr[scala.Nothing],
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
    radiusRange: Double,
      /**
      * How much to randomize the particle direction [0-1].
      */
    directionRandomizer: Double
    ) = this()
  }
}
