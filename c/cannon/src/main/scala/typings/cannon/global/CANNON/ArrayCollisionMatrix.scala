package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.ArrayCollisionMatrix")
@js.native
class ArrayCollisionMatrix ()
  extends StObject
     with typings.cannon.CANNON.ArrayCollisionMatrix {
  
  /* CompleteClass */
  override def get(i: Double, j: Double): Double = js.native
  
  /* CompleteClass */
  var matrix: js.Array[typings.cannon.CANNON.Mat3] = js.native
  
  /* CompleteClass */
  override def reset(): Unit = js.native
  
  /* CompleteClass */
  override def set(i: Double, j: Double, value: Double): Unit = js.native
  
  /* CompleteClass */
  override def setNumObjects(n: Double): Unit = js.native
}
