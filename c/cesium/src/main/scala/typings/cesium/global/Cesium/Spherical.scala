package typings.cesium.global.Cesium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.Spherical")
@js.native
class Spherical ()
  extends typings.cesium.mod.Spherical {
  def this(clock: Double) = this()
  def this(clock: Double, cone: Double) = this()
  def this(clock: Unit, cone: Double) = this()
  def this(clock: Double, cone: Double, magnitude: Double) = this()
  def this(clock: Double, cone: Unit, magnitude: Double) = this()
  def this(clock: Unit, cone: Double, magnitude: Double) = this()
  def this(clock: Unit, cone: Unit, magnitude: Double) = this()
}
object Spherical {
  
  @JSGlobal("Cesium.Spherical")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def clone_(spherical: typings.cesium.mod.Spherical): typings.cesium.mod.Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(spherical.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Spherical]
  inline def clone_(spherical: typings.cesium.mod.Spherical, result: typings.cesium.mod.Spherical): typings.cesium.mod.Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(spherical.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Spherical]
  
  /* static member */
  inline def equalsEpsilon(left: typings.cesium.mod.Spherical, right: typings.cesium.mod.Spherical): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: typings.cesium.mod.Spherical, right: typings.cesium.mod.Spherical, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(left: typings.cesium.mod.Spherical, right: typings.cesium.mod.Spherical): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromCartesian3(cartesian3: typings.cesium.mod.Cartesian3): typings.cesium.mod.Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian3.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Spherical]
  inline def fromCartesian3(cartesian3: typings.cesium.mod.Cartesian3, spherical: typings.cesium.mod.Spherical): typings.cesium.mod.Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCartesian3")(cartesian3.asInstanceOf[js.Any], spherical.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Spherical]
  
  /* static member */
  inline def normalize(spherical: typings.cesium.mod.Spherical): typings.cesium.mod.Spherical = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spherical.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.Spherical]
  inline def normalize(spherical: typings.cesium.mod.Spherical, result: typings.cesium.mod.Spherical): typings.cesium.mod.Spherical = (^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(spherical.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.Spherical]
}
