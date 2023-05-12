package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhysicsConstraint extends StObject {
  
  /* protected */ var _options: PhysicsConstraintParameters = js.native
  
  /**
    * The V2 plugin used to create and manage this Physics Body
    */
  /* protected */ var _physicsPlugin: IPhysicsEnginePluginV2 = js.native
  
  /**
    * V2 Physics plugin private data for a physics material
    */
  var _pluginData: Any = js.native
  
  /* protected */ var _type: PhysicsConstraintType = js.native
  
  /**
    * Disposes the constraint from the physics engine.
    *
    * This method is useful for cleaning up the physics engine when a body is no longer needed. Disposing the body will free up resources and prevent memory leaks.
    */
  def dispose(): Unit = js.native
  
  /**
    * Gets whether collisions are enabled for this physics object.
    *
    * @returns `true` if collisions are enabled, `false` otherwise.
    *
    */
  def isCollisionsEnabled: Boolean = js.native
  /**
    * Enables or disables collisions for the physics engine.
    *
    * @param isEnabled - A boolean value indicating whether collisions should be enabled or disabled.
    *
    */
  def isCollisionsEnabled_=(isEnabled: Boolean): Unit = js.native
  
  /**
    *
    * @returns true if constraint is enabled
    */
  def isEnabled: Boolean = js.native
  /**
    * Enable/disable the constraint
    * @param isEnabled value for the constraint
    */
  def isEnabled_=(isEnabled: Boolean): Unit = js.native
  
  /**
    * Retrieves the options of the physics constraint.
    *
    * @returns The physics constraint parameters.
    *
    */
  def options: PhysicsConstraintParameters = js.native
  
  /**
    * Gets the type of the constraint.
    *
    * @returns The type of the constraint.
    *
    */
  def `type`: PhysicsConstraintType = js.native
}
