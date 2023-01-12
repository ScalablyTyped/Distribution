package typings.babylonjs

import typings.babylonjs.collisionsColliderMod.Collider
import typings.babylonjs.mathsMathDotvectorMod.Vector3
import typings.babylonjs.meshesAbstractMeshMod.AbstractMesh
import typings.babylonjs.sceneMod.Scene
import typings.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collisionsCollisionCoordinatorMod {
  
  @JSImport("babylonjs/Collisions/collisionCoordinator", "DefaultCollisionCoordinator")
  @js.native
  open class DefaultCollisionCoordinator ()
    extends StObject
       with ICollisionCoordinator {
    
    /* private */ var _collideWithWorld: Any = js.native
    
    /* private */ var _finalPosition: Any = js.native
    
    /* private */ var _scaledPosition: Any = js.native
    
    /* private */ var _scaledVelocity: Any = js.native
    
    /* private */ var _scene: Any = js.native
    
    /* CompleteClass */
    override def createCollider(): Collider = js.native
    
    /* CompleteClass */
    override def getNewPosition(
      position: Vector3,
      displacement: Vector3,
      collider: Collider,
      maximumRetry: Double,
      excludedMesh: Nullable[AbstractMesh],
      onNewPosition: js.Function3[
          /* collisionIndex */ Double, 
          /* newPosition */ Vector3, 
          /* collidedMesh */ Nullable[AbstractMesh], 
          Unit
        ],
      collisionIndex: Double
    ): Unit = js.native
    
    /* CompleteClass */
    override def init(scene: Scene): Unit = js.native
  }
  
  trait ICollisionCoordinator extends StObject {
    
    def createCollider(): Collider
    
    def getNewPosition(
      position: Vector3,
      displacement: Vector3,
      collider: Collider,
      maximumRetry: Double,
      excludedMesh: Nullable[AbstractMesh],
      onNewPosition: js.Function3[
          /* collisionIndex */ Double, 
          /* newPosition */ Vector3, 
          /* collidedMesh */ Nullable[AbstractMesh], 
          Unit
        ],
      collisionIndex: Double
    ): Unit
    
    def init(scene: Scene): Unit
  }
  object ICollisionCoordinator {
    
    inline def apply(
      createCollider: () => Collider,
      getNewPosition: (Vector3, Vector3, Collider, Double, Nullable[AbstractMesh], js.Function3[
          /* collisionIndex */ Double, 
          /* newPosition */ Vector3, 
          /* collidedMesh */ Nullable[AbstractMesh], 
          Unit
        ], Double) => Unit,
      init: Scene => Unit
    ): ICollisionCoordinator = {
      val __obj = js.Dynamic.literal(createCollider = js.Any.fromFunction0(createCollider), getNewPosition = js.Any.fromFunction7(getNewPosition), init = js.Any.fromFunction1(init))
      __obj.asInstanceOf[ICollisionCoordinator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ICollisionCoordinator] (val x: Self) extends AnyVal {
      
      inline def setCreateCollider(value: () => Collider): Self = StObject.set(x, "createCollider", js.Any.fromFunction0(value))
      
      inline def setGetNewPosition(
        value: (Vector3, Vector3, Collider, Double, Nullable[AbstractMesh], js.Function3[
              /* collisionIndex */ Double, 
              /* newPosition */ Vector3, 
              /* collidedMesh */ Nullable[AbstractMesh], 
              Unit
            ], Double) => Unit
      ): Self = StObject.set(x, "getNewPosition", js.Any.fromFunction7(value))
      
      inline def setInit(value: Scene => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
    }
  }
}
