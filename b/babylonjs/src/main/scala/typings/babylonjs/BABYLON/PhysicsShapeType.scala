package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhysicsShapeType extends StObject
@JSGlobal("BABYLON.PhysicsShapeType")
@js.native
object PhysicsShapeType extends StObject {
  
  @js.native
  sealed trait BOX
    extends StObject
       with PhysicsShapeType
  
  @js.native
  sealed trait CAPSULE
    extends StObject
       with PhysicsShapeType
  
  @js.native
  sealed trait CONTAINER
    extends StObject
       with PhysicsShapeType
  
  @js.native
  sealed trait CONVEX_HULL
    extends StObject
       with PhysicsShapeType
  
  @js.native
  sealed trait CYLINDER
    extends StObject
       with PhysicsShapeType
  
  @js.native
  sealed trait HEIGHTFIELD
    extends StObject
       with PhysicsShapeType
  
  @js.native
  sealed trait MESH
    extends StObject
       with PhysicsShapeType
  
  @js.native
  sealed trait SPHERE
    extends StObject
       with PhysicsShapeType
}
