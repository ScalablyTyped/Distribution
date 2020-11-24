package typings.cesium.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Spherical")
@js.native
class Spherical () extends js.Object {
  def this(clock: Double) = this()
  def this(clock: js.UndefOr[scala.Nothing], cone: Double) = this()
  def this(clock: Double, cone: Double) = this()
  def this(clock: js.UndefOr[scala.Nothing], cone: js.UndefOr[scala.Nothing], magnitude: Double) = this()
  def this(clock: js.UndefOr[scala.Nothing], cone: Double, magnitude: Double) = this()
  def this(clock: Double, cone: js.UndefOr[scala.Nothing], magnitude: Double) = this()
  def this(clock: Double, cone: Double, magnitude: Double) = this()
  
  var clock: Double = js.native
  
  def clone(result: Spherical): Spherical = js.native
  
  var cone: Double = js.native
  
  def equals(other: Spherical): Boolean = js.native
  
  def equalsEpsilon(other: Spherical, epsilon: Double): Boolean = js.native
  
  var magnitude: Double = js.native
}
/* static members */
@JSImport("cesium", "Spherical")
@js.native
object Spherical extends js.Object {
  
  def clone(spherical: Spherical): Spherical = js.native
  def clone(spherical: Spherical, result: Spherical): Spherical = js.native
  
  def equals(left: Spherical, right: Spherical): Boolean = js.native
  
  def equalsEpsilon(left: Spherical, right: Spherical): Boolean = js.native
  def equalsEpsilon(left: Spherical, right: Spherical, epsilon: Double): Boolean = js.native
  
  def fromCartesian3(cartesian3: Cartesian3): Spherical = js.native
  def fromCartesian3(cartesian3: Cartesian3, spherical: Spherical): Spherical = js.native
  
  def normalize(spherical: Spherical): Spherical = js.native
  def normalize(spherical: Spherical, result: Spherical): Spherical = js.native
}
