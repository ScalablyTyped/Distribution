package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * The HemisphericLight simulates the ambient environment light,
     * so the passed direction is the light reflection direction, not the incoming direction.
     */
@JSGlobal("BABYLON.HemisphericLight")
@js.native
class HemisphericLight protected () extends Light {
  /**
           * Creates a HemisphericLight object in the scene according to the passed direction (Vector3).
           * The HemisphericLight simulates the ambient environment light, so the passed direction is the light reflection direction, not the incoming direction.
           * The HemisphericLight can't cast shadows.
           * Documentation : http://doc.babylonjs.com/tutorials/lights
           * @param name The friendly name of the light
           * @param direction The direction of the light reflection
           * @param scene The scene the light belongs to
           */
  def this(name: java.lang.String, direction: Vector3, scene: Scene) = this()
  /**
           * The light reflection direction, not the incoming direction.
           */
  var direction: Vector3 = js.native
  /**
           * The groundColor is the light in the opposite direction to the one specified during creation.
           * You can think of the diffuse and specular light as coming from the centre of the object in the given direction and the groundColor light in the opposite direction.
           */
  var groundColor: Color3 = js.native
  /**
           * Computes the world matrix of the node
           * @param force defines if the cache version should be invalidated forcing the world matrix to be created from scratch
           * @param useWasUpdatedFlag defines a reserved property
           * @returns the world matrix
           */
  def computeWorldMatrix(force: scala.Boolean, useWasUpdatedFlag: scala.Boolean): Matrix = js.native
  /**
           * Sets the HemisphericLight direction towards the passed target (Vector3).
           * Returns the updated direction.
           * @param target The target the direction should point to
           * @return The computed direction
           */
  def setDirectionToTarget(target: Vector3): Vector3 = js.native
}

