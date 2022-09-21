package typings.cannon.global.CANNON

import typings.cannon.anon.BOX
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Shape")
@js.native
open class Shape ()
  extends StObject
     with typings.cannon.CANNON.Shape {
  
  /* CompleteClass */
  var boundingSphereRadius: Double = js.native
  
  /* CompleteClass */
  override def calculateLocalInertia(mass: Double, target: typings.cannon.CANNON.Vec3): typings.cannon.CANNON.Vec3 = js.native
  
  /* CompleteClass */
  var collisionResponse: Boolean = js.native
  
  /* CompleteClass */
  var id: Double = js.native
  
  /* CompleteClass */
  var `type`: Double = js.native
  
  /* CompleteClass */
  override def updateBoundingSphereRadius(): Double = js.native
  
  /* CompleteClass */
  override def volume(): Double = js.native
}
/* static members */
object Shape {
  
  @JSGlobal("CANNON.Shape")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("CANNON.Shape.types")
  @js.native
  def types: BOX = js.native
  inline def types_=(x: BOX): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("types")(x.asInstanceOf[js.Any])
}
