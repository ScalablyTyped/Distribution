package typings.babylonjs.global.BABYLON

import typings.babylonjs.BABYLON.PhysicsAggregateParameters
import typings.babylonjs.BABYLON.PhysicsMaterial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.PhysicsAggregate")
@js.native
open class PhysicsAggregate protected ()
  extends StObject
     with typings.babylonjs.BABYLON.PhysicsAggregate {
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: typings.babylonjs.BABYLON.TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.BABYLON.PhysicsShape
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: typings.babylonjs.BABYLON.TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.BABYLON.PhysicsShapeType
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: typings.babylonjs.BABYLON.TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.BABYLON.PhysicsShapeType,
    _options: PhysicsAggregateParameters
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: typings.babylonjs.BABYLON.TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.BABYLON.PhysicsShape,
    _options: PhysicsAggregateParameters
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: typings.babylonjs.BABYLON.TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.BABYLON.PhysicsShapeType,
    _options: Unit,
    _scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: typings.babylonjs.BABYLON.TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.BABYLON.PhysicsShapeType,
    _options: PhysicsAggregateParameters,
    _scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: typings.babylonjs.BABYLON.TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.BABYLON.PhysicsShape,
    _options: Unit,
    _scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: typings.babylonjs.BABYLON.TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.BABYLON.PhysicsShape,
    _options: PhysicsAggregateParameters,
    _scene: typings.babylonjs.BABYLON.Scene
  ) = this()
  
  /* private */ /* CompleteClass */
  var _addSizeOptions: Any = js.native
  
  /* private */ /* CompleteClass */
  var _disposeShapeWhenDisposed: Any = js.native
  
  /* private */ /* CompleteClass */
  var _getObjectBoundingBox: Any = js.native
  
  /* private */ /* CompleteClass */
  var _nodeDisposeObserver: Any = js.native
  
  /* private */ /* CompleteClass */
  var _options: Any = js.native
  
  /* private */ /* CompleteClass */
  var _scene: Any = js.native
  
  /**
    * The body that is associated with this aggregate
    */
  /* CompleteClass */
  var body: typings.babylonjs.BABYLON.PhysicsBody = js.native
  
  /**
    * Releases the body, shape and material
    */
  /* CompleteClass */
  override def dispose(): Unit = js.native
  
  /**
    * The material that is associated with this aggregate
    */
  /* CompleteClass */
  var material: PhysicsMaterial = js.native
  
  /**
    * The shape that is associated with this aggregate
    */
  /* CompleteClass */
  var shape: typings.babylonjs.BABYLON.PhysicsShape = js.native
  
  /**
    * The physics-enabled object used as the physics aggregate
    */
  /* CompleteClass */
  var transformNode: typings.babylonjs.BABYLON.TransformNode = js.native
  
  /**
    * The type of the physics aggregate
    */
  /* CompleteClass */
  var `type`: typings.babylonjs.BABYLON.PhysicsShapeType | typings.babylonjs.BABYLON.PhysicsShape = js.native
}
