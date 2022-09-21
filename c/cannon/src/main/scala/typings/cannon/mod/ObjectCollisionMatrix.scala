package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "ObjectCollisionMatrix")
@js.native
open class ObjectCollisionMatrix ()
  extends StObject
     with typings.cannon.CANNON.ObjectCollisionMatrix {
  
  /* CompleteClass */
  override def get(i: Double, j: Double): Double = js.native
  
  /* CompleteClass */
  var matrix: js.Array[Double] = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def set(i: Double, j: Double, value: Double): Unit = js.native
  
  /* CompleteClass */
  override def setNumObjects(n: Double): Unit = js.native
}
