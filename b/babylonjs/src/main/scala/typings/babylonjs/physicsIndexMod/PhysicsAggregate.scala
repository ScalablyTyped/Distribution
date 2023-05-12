package typings.babylonjs.physicsIndexMod

import typings.babylonjs.meshesTransformNodeMod.TransformNode
import typings.babylonjs.physicsV2PhysicsAggregateMod.PhysicsAggregateParameters
import typings.babylonjs.sceneMod.Scene
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("babylonjs/Physics/index", "PhysicsAggregate")
@js.native
open class PhysicsAggregate protected ()
  extends typings.babylonjs.physicsV2IndexMod.PhysicsAggregate {
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType,
    _options: PhysicsAggregateParameters
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape,
    _options: PhysicsAggregateParameters
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType,
    _options: Unit,
    _scene: Scene
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.physicsV2IphysicsenginepluginMod.PhysicsShapeType,
    _options: PhysicsAggregateParameters,
    _scene: Scene
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape,
    _options: Unit,
    _scene: Scene
  ) = this()
  def this(
    /**
    * The physics-enabled object used as the physics aggregate
    */
  transformNode: TransformNode,
    /**
    * The type of the physics aggregate
    */
  `type`: typings.babylonjs.physicsV2PhysicsShapeMod.PhysicsShape,
    _options: PhysicsAggregateParameters,
    _scene: Scene
  ) = this()
}
