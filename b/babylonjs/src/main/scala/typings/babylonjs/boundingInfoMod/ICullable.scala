package typings.babylonjs.boundingInfoMod

import typings.babylonjs.mathPlaneMod.Plane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICullable extends js.Object {
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this cheks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean
}

object ICullable {
  @scala.inline
  def apply(isCompletelyInFrustum: js.Array[Plane] => Boolean, isInFrustum: js.Array[Plane] => Boolean): ICullable = {
    val __obj = js.Dynamic.literal(isCompletelyInFrustum = js.Any.fromFunction1(isCompletelyInFrustum), isInFrustum = js.Any.fromFunction1(isInFrustum))
  
    __obj.asInstanceOf[ICullable]
  }
}

