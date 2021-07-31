package typings.cannon.global.CANNON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("CANNON.Vec3")
@js.native
class Vec3 ()
  extends StObject
     with typings.cannon.CANNON.Vec3 {
  def this(x: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: Unit, y: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
  def this(x: Double, y: Unit, z: Double) = this()
  def this(x: Unit, y: Double, z: Double) = this()
  def this(x: Unit, y: Unit, z: Double) = this()
}
/* static members */
object Vec3 {
  
  @JSGlobal("CANNON.Vec3")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("CANNON.Vec3.ZERO")
  @js.native
  def ZERO: typings.cannon.CANNON.Vec3 = js.native
  @scala.inline
  def ZERO_=(x: typings.cannon.CANNON.Vec3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
}
