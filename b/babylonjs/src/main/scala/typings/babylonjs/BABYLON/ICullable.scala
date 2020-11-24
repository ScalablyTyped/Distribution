package typings.babylonjs.BABYLON

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICullable extends js.Object {
  
  /**
    * Checks if a cullable object (mesh...) is in the camera frustum
    * Unlike isInFrustum this cheks the full bounding box
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  def isCompletelyInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
  
  /**
    * Checks if the object or part of the object is in the frustum
    * @param frustumPlanes Camera near/planes
    * @returns true if the object is in frustum otherwise false
    */
  def isInFrustum(frustumPlanes: js.Array[Plane]): Boolean = js.native
}
object ICullable {
  
  @scala.inline
  def apply(isCompletelyInFrustum: js.Array[Plane] => Boolean, isInFrustum: js.Array[Plane] => Boolean): ICullable = {
    val __obj = js.Dynamic.literal(isCompletelyInFrustum = js.Any.fromFunction1(isCompletelyInFrustum), isInFrustum = js.Any.fromFunction1(isInFrustum))
    __obj.asInstanceOf[ICullable]
  }
  
  @scala.inline
  implicit class ICullableOps[Self <: ICullable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsCompletelyInFrustum(value: js.Array[Plane] => Boolean): Self = this.set("isCompletelyInFrustum", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsInFrustum(value: js.Array[Plane] => Boolean): Self = this.set("isInFrustum", js.Any.fromFunction1(value))
  }
}
