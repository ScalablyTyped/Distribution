package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Box")
@js.native
class Box protected ()
  extends typings.cannon.CANNON.Box {
  def this(halfExtents: typings.cannon.CANNON.Vec3) = this()
}
/* static members */
object Box {
  
  @JSImport("cannon", "Box.calculateInertia")
  @js.native
  def calculateInertia(halfExtents: typings.cannon.CANNON.Vec3, mass: Double, target: typings.cannon.CANNON.Vec3): Unit = js.native
}
