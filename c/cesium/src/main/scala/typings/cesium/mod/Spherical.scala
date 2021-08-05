package typings.cesium.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "Spherical")
@js.native
class Spherical () extends StObject {
  def this(clock: Double) = this()
  def this(clock: Double, cone: Double) = this()
  def this(clock: Unit, cone: Double) = this()
  def this(clock: Double, cone: Double, magnitude: Double) = this()
  def this(clock: Double, cone: Unit, magnitude: Double) = this()
  def this(clock: Unit, cone: Double, magnitude: Double) = this()
  def this(clock: Unit, cone: Unit, magnitude: Double) = this()
  
  var clock: Double = js.native
  
  def clone(result: Spherical): Spherical = js.native
  
  var cone: Double = js.native
  
  def equals(other: Spherical): Boolean = js.native
  
  def equalsEpsilon(other: Spherical, epsilon: Double): Boolean = js.native
  
  var magnitude: Double = js.native
}
object Spherical {
  
  @JSImport("cesium", "Spherical")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(spherical: Spherical): Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(spherical.asInstanceOf[js.Any]).asInstanceOf[Spherical]
  inline def clone_(spherical: Spherical, result: Spherical): Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(spherical.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Spherical]
  
  /* static member */
  inline def equalsEpsilon(left: Spherical, right: Spherical): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: Spherical, right: Spherical, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(left: Spherical, right: Spherical): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromCartesian3(cartesian3: Cartesian3): Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian3.asInstanceOf[js.Any]).asInstanceOf[Spherical]
  inline def fromCartesian3(cartesian3: Cartesian3, spherical: Spherical): Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian3.asInstanceOf[js.Any], spherical.asInstanceOf[js.Any])).asInstanceOf[Spherical]
  
  /* static member */
  inline def normalize(spherical: Spherical): Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spherical.asInstanceOf[js.Any]).asInstanceOf[Spherical]
  inline def normalize(spherical: Spherical, result: Spherical): Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spherical.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Spherical]
}
