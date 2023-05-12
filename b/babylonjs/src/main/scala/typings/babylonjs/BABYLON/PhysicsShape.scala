package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsShape extends StObject {
  
  /* private */ var _material: Any = js.native
  
  /**
    * The V2 plugin used to create and manage this Physics Body
    */
  /* private */ var _physicsPlugin: Any = js.native
  
  /**
    * V2 Physics plugin private data for single shape
    */
  var _pluginData: Any = js.native
  
  /* private */ var _type: Any = js.native
  
  /**
    * Adds a child shape to a container with an optional transform
    * @param newChild The new PhysicsShape to add
    * @param translation Optional position of the child shape relative to this shape
    * @param rotation Optional rotation of the child shape relative to this shape
    * @param scale Optional scale of the child shape relative to this shape
    */
  def addChild(newChild: PhysicsShape): Unit = js.native
  def addChild(newChild: PhysicsShape, translation: Unit, rotation: Unit, scale: Vector3): Unit = js.native
  def addChild(newChild: PhysicsShape, translation: Unit, rotation: Quaternion): Unit = js.native
  def addChild(newChild: PhysicsShape, translation: Unit, rotation: Quaternion, scale: Vector3): Unit = js.native
  def addChild(newChild: PhysicsShape, translation: Vector3): Unit = js.native
  def addChild(newChild: PhysicsShape, translation: Vector3, rotation: Unit, scale: Vector3): Unit = js.native
  def addChild(newChild: PhysicsShape, translation: Vector3, rotation: Quaternion): Unit = js.native
  def addChild(newChild: PhysicsShape, translation: Vector3, rotation: Quaternion, scale: Vector3): Unit = js.native
  
  /**
    * Utility to add a child shape to this container,
    * automatically computing the relative transform between
    * the container shape and the child instance.
    *
    * @param parentTransform The transform node associated with this shape
    * @param newChild The new PhysicsShape to add
    * @param childTransform The transform node associated with the child shape
    */
  def addChildFromParent(parentTransform: TransformNode, newChild: PhysicsShape, childTransform: TransformNode): Unit = js.native
  
  /**
    *
    */
  def density: Double = js.native
  /**
    *
    * @param density
    */
  def density_=(density: Double): Unit = js.native
  
  /**
    *
    */
  def dispose(): Unit = js.native
  
  /**
    *
    * @returns Bitmask of categories that this shape should collide with
    */
  def filterCollideMask: Double = js.native
  /**
    * Sets the collide mask of a shape. This is a bitfield of arbitrary
    * "categories" to which this shape collides with. Given two shapes,
    * the engine will check if the collide mask and membership overlap:
    * shapeA.filterMembershipMask & shapeB.filterCollideMask
    *
    * If this value is zero (i.e. shapeB only collides with categories
    * which shapeA is _not_ a member of) then the shapes will not collide.
    *
    * Note, the engine will also perform the same test with shapeA and
    * shapeB swapped; the shapes will not collide if either shape has
    * a collideMask which prevents collision with the other shape.
    *
    * @param collideMask Bitmask of categories this shape should collide with
    */
  def filterCollideMask_=(collideMask: Double): Unit = js.native
  
  /**
    * Get the membership mask of a shape.
    * @returns Bitmask of categories which this shape is a member of.
    */
  def filterMembershipMask: Double = js.native
  /**
    * Set the membership mask of a shape. This is a bitfield of arbitrary
    * "categories" to which the shape is a member. This is used in combination
    * with the collide mask to determine if this shape should collide with
    * another.
    *
    * @param membershipMask Bitfield of categories of this shape.
    */
  def filterMembershipMask_=(membershipMask: Double): Unit = js.native
  
  /**
    *
    */
  def getBoundingBox(): BoundingBox = js.native
  
  /**
    * Returns the string "PhysicsShape".
    * @returns "PhysicsShape"
    */
  def getClassName(): String = js.native
  
  /**
    *
    * @returns
    */
  def getNumChildren(): Double = js.native
  
  /**
    *
    * @returns
    */
  def material: PhysicsMaterial = js.native
  /**
    *
    * @param material
    */
  def material_=(material: PhysicsMaterial): Unit = js.native
  
  /**
    *
    * @param childIndex
    */
  def removeChild(childIndex: Double): Unit = js.native
  
  /**
    *
    */
  def `type`: PhysicsShapeType = js.native
}
