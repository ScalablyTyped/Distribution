package typings.cannon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cannon", "Vec3")
@js.native
class Vec3 ()
  extends typings.cannon.CANNON.Vec3 {
  def this(x: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double) = this()
  def this(x: Double, y: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: js.UndefOr[scala.Nothing], y: Double, z: Double) = this()
  def this(x: Double, y: js.UndefOr[scala.Nothing], z: Double) = this()
  def this(x: Double, y: Double, z: Double) = this()
}
/* static members */
object Vec3 {
  
  @JSImport("cannon", "Vec3")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("cannon", "Vec3.ZERO")
  @js.native
  def ZERO: typings.cannon.CANNON.Vec3 = js.native
  @scala.inline
  def ZERO_=(x: typings.cannon.CANNON.Vec3): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ZERO")(x.asInstanceOf[js.Any])
}
