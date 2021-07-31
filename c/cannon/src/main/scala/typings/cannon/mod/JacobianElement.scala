package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "JacobianElement")
@js.native
class JacobianElement ()
  extends StObject
     with typings.cannon.CANNON.JacobianElement {
  
  /* CompleteClass */
  override def multiplyElement(element: typings.cannon.CANNON.JacobianElement): Double = js.native
  
  /* CompleteClass */
  override def multiplyVectors(spacial: typings.cannon.CANNON.Vec3, rotational: typings.cannon.CANNON.Vec3): Double = js.native
  
  /* CompleteClass */
  var rotational: typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var spatial: typings.cannon.CANNON.Vec3 = js.native
}
