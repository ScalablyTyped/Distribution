package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * Interface for cullable objects
     * @see https://doc.babylonjs.com/babylon101/materials#back-face-culling
     */

trait ICullable extends js.Object {
  /**
           * Checks if a cullable object (mesh...) is in the camera frustum
           * Unlike isInFrustum this cheks the full bounding box
           * @param frustumPlanes Camera near/planes
           * @returns true if the object is in frustum otherwise false
           */
  def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): scala.Boolean
  /**
           * Checks if the object or part of the object is in the frustum
           * @param frustumPlanes Camera near/planes
           * @returns true if the object is in frustum otherwise false
           */
  def isInFrustum(frustumPlanes: js.Array[Plane]): scala.Boolean
}

