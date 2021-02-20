package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollisionCoordinator extends StObject {
  
  def createCollider(): Collider = js.native
  
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
  ): Unit = js.native
  
  def init(scene: Scene): Unit = js.native
}
object ICollisionCoordinator {
  
  @scala.inline
  def apply(
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
  implicit class ICollisionCoordinatorMutableBuilder[Self <: ICollisionCoordinator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateCollider(value: () => Collider): Self = StObject.set(x, "createCollider", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetNewPosition(
      value: (Vector3, Vector3, Collider, Double, Nullable[AbstractMesh], js.Function3[
          /* collisionIndex */ Double, 
          /* newPosition */ Vector3, 
          /* collidedMesh */ Nullable[AbstractMesh], 
          Unit
        ], Double) => Unit
    ): Self = StObject.set(x, "getNewPosition", js.Any.fromFunction7(value))
    
    @scala.inline
    def setInit(value: Scene => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
  }
}
