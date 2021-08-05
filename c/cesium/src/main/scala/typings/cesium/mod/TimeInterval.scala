package typings.cesium.mod

import typings.cesium.anon.Data
import typings.cesium.anon.IsStartIncluded
import typings.cesium.mod.TimeInterval.DataComparer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TimeInterval")
@js.native
class TimeInterval () extends StObject {
  def this(options: Data) = this()
  
  def clone(result: TimeInterval): TimeInterval = js.native
  
  var data: js.Any = js.native
  
  def equals(): Boolean = js.native
  def equals(right: Unit, dataComparer: DataComparer): Boolean = js.native
  def equals(right: TimeInterval): Boolean = js.native
  def equals(right: TimeInterval, dataComparer: DataComparer): Boolean = js.native
  
  def equalsEpsilon(right: TimeInterval, epsilon: Double): Boolean = js.native
  def equalsEpsilon(right: TimeInterval, epsilon: Double, dataComparer: DataComparer): Boolean = js.native
  
  var isEmpty: Boolean = js.native
  
  var isStartIncluded: Boolean = js.native
  
  var isStopIncluded: Boolean = js.native
  
  var start: JulianDate = js.native
  
  var stop: JulianDate = js.native
}
object TimeInterval {
  
  @JSImport("cesium", "TimeInterval")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("cesium", "TimeInterval.EMPTY")
  @js.native
  def EMPTY: TimeInterval = js.native
  inline def EMPTY_=(x: TimeInterval): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def clone_(): TimeInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")().asInstanceOf[TimeInterval]
  inline def clone_(timeInterval: Unit, result: TimeInterval): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(timeInterval.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  inline def clone_(timeInterval: TimeInterval): TimeInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(timeInterval.asInstanceOf[js.Any]).asInstanceOf[TimeInterval]
  inline def clone_(timeInterval: TimeInterval, result: TimeInterval): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(timeInterval.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  
  /* static member */
  inline def contains(timeInterval: TimeInterval, julianDate: JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(timeInterval.asInstanceOf[js.Any], julianDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equalsEpsilon(left: TimeInterval, right: TimeInterval, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(left: TimeInterval, right: TimeInterval, epsilon: Double, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: Unit, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: TimeInterval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: TimeInterval, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: TimeInterval): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: TimeInterval, right: Unit, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: TimeInterval, right: TimeInterval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: TimeInterval, right: TimeInterval, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromIso8601(options: IsStartIncluded): TimeInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(options.asInstanceOf[js.Any]).asInstanceOf[TimeInterval]
  inline def fromIso8601(options: IsStartIncluded, result: TimeInterval): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  
  /* static member */
  inline def intersect(left: TimeInterval, right: TimeInterval, result: TimeInterval): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  inline def intersect(left: TimeInterval, right: TimeInterval, result: TimeInterval, mergeCallback: MergeCallback): TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any], mergeCallback.asInstanceOf[js.Any])).asInstanceOf[TimeInterval]
  
  /* static member */
  inline def toIso8601(timeInterval: TimeInterval): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(timeInterval.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toIso8601(timeInterval: TimeInterval, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(timeInterval.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  
  type DataComparer = js.Function2[/* leftData */ js.Any, /* rightData */ js.Any, Boolean]
  
  type MergeCallback = js.Function2[/* leftData */ js.Any, /* rightData */ js.Any, js.Any]
}
