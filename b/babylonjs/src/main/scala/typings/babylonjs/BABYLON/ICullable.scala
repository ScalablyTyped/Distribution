package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICullable extends StObject {
  
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
  
  inline def apply(isCompletelyInFrustum: js.Array[Plane] => Boolean, isInFrustum: js.Array[Plane] => Boolean): ICullable = {
    val __obj = js.Dynamic.literal(isCompletelyInFrustum = js.Any.fromFunction1(isCompletelyInFrustum), isInFrustum = js.Any.fromFunction1(isInFrustum))
    __obj.asInstanceOf[ICullable]
  }
  
  extension [Self <: ICullable](x: Self) {
    
    inline def setIsCompletelyInFrustum(value: js.Array[Plane] => Boolean): Self = StObject.set(x, "isCompletelyInFrustum", js.Any.fromFunction1(value))
    
    inline def setIsInFrustum(value: js.Array[Plane] => Boolean): Self = StObject.set(x, "isInFrustum", js.Any.fromFunction1(value))
  }
}
