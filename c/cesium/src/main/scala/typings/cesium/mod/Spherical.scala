package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Spherical")
@js.native
class Spherical () extends StObject {
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
object Spherical {
  
  /* static member */
  @JSImport("cesium", "Spherical.clone")
  @js.native
  def clone_(spherical: Spherical): Spherical = js.native
  @JSImport("cesium", "Spherical.clone")
  @js.native
  def clone_(spherical: Spherical, result: Spherical): Spherical = js.native
  
  /* static member */
  @JSImport("cesium", "Spherical.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Spherical, right: Spherical): Boolean = js.native
  @JSImport("cesium", "Spherical.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: Spherical, right: Spherical, epsilon: Double): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Spherical.equals")
  @js.native
  def equals_(left: Spherical, right: Spherical): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "Spherical.fromCartesian3")
  @js.native
  def fromCartesian3(cartesian3: Cartesian3): Spherical = js.native
  @JSImport("cesium", "Spherical.fromCartesian3")
  @js.native
  def fromCartesian3(cartesian3: Cartesian3, spherical: Spherical): Spherical = js.native
  
  /* static member */
  @JSImport("cesium", "Spherical.normalize")
  @js.native
  def normalize(spherical: Spherical): Spherical = js.native
  @JSImport("cesium", "Spherical.normalize")
  @js.native
  def normalize(spherical: Spherical, result: Spherical): Spherical = js.native
}
