package typings.babylonjs

import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collisionsIndexMod {
  
  @JSImport("babylonjs/Collisions/index", "Collider")
  @js.native
  class Collider ()
    extends typings.babylonjs.colliderMod.Collider
  
  @JSImport("babylonjs/Collisions/index", "DefaultCollisionCoordinator")
  @js.native
  class DefaultCollisionCoordinator ()
    extends typings.babylonjs.collisionCoordinatorMod.DefaultCollisionCoordinator
  
  @JSImport("babylonjs/Collisions/index", "IntersectionInfo")
  @js.native
  class IntersectionInfo protected ()
    extends typings.babylonjs.intersectionInfoMod.IntersectionInfo {
    def this(bu: Nullable[Double], bv: Nullable[Double], distance: Double) = this()
  }
  
  @JSImport("babylonjs/Collisions/index", "_MeshCollisionData")
  @js.native
  class MeshCollisionData ()
    extends typings.babylonjs.meshCollisionDataMod.MeshCollisionData
  
  @JSImport("babylonjs/Collisions/index", "PickingInfo")
  @js.native
  class PickingInfo ()
    extends typings.babylonjs.pickingInfoMod.PickingInfo
}
