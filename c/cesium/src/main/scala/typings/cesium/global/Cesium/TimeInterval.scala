package typings.cesium.global.Cesium

import typings.cesium.anon.Data
import typings.cesium.anon.IsStartIncluded
import typings.cesium.mod.TimeInterval.DataComparer
import typings.cesium.mod.TimeInterval.MergeCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Cesium.TimeInterval")
@js.native
class TimeInterval ()
  extends typings.cesium.mod.TimeInterval {
  def this(options: Data) = this()
}
object TimeInterval {
  
  @JSGlobal("Cesium.TimeInterval")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("Cesium.TimeInterval.EMPTY")
  @js.native
  def EMPTY: typings.cesium.mod.TimeInterval = js.native
  inline def EMPTY_=(x: typings.cesium.mod.TimeInterval): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def clone_(): typings.cesium.mod.TimeInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")().asInstanceOf[typings.cesium.mod.TimeInterval]
  inline def clone_(timeInterval: Unit, result: typings.cesium.mod.TimeInterval): typings.cesium.mod.TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(timeInterval.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.TimeInterval]
  inline def clone_(timeInterval: typings.cesium.mod.TimeInterval): typings.cesium.mod.TimeInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(timeInterval.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.TimeInterval]
  inline def clone_(timeInterval: typings.cesium.mod.TimeInterval, result: typings.cesium.mod.TimeInterval): typings.cesium.mod.TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("clone")(timeInterval.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.TimeInterval]
  
  /* static member */
  inline def contains(timeInterval: typings.cesium.mod.TimeInterval, julianDate: typings.cesium.mod.JulianDate): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("contains")(timeInterval.asInstanceOf[js.Any], julianDate.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equalsEpsilon(left: typings.cesium.mod.TimeInterval, right: typings.cesium.mod.TimeInterval, epsilon: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equalsEpsilon(
    left: typings.cesium.mod.TimeInterval,
    right: typings.cesium.mod.TimeInterval,
    epsilon: Double,
    dataComparer: DataComparer
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equalsEpsilon")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], epsilon.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def equals_(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")().asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: Unit, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.TimeInterval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: Unit, right: typings.cesium.mod.TimeInterval, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.TimeInterval): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.TimeInterval, right: Unit, dataComparer: DataComparer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(left: typings.cesium.mod.TimeInterval, right: typings.cesium.mod.TimeInterval): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(
    left: typings.cesium.mod.TimeInterval,
    right: typings.cesium.mod.TimeInterval,
    dataComparer: DataComparer
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], dataComparer.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /* static member */
  inline def fromIso8601(options: IsStartIncluded): typings.cesium.mod.TimeInterval = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(options.asInstanceOf[js.Any]).asInstanceOf[typings.cesium.mod.TimeInterval]
  inline def fromIso8601(options: IsStartIncluded, result: typings.cesium.mod.TimeInterval): typings.cesium.mod.TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("fromIso8601")(options.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.TimeInterval]
  
  /* static member */
  inline def intersect(
    left: typings.cesium.mod.TimeInterval,
    right: typings.cesium.mod.TimeInterval,
    result: typings.cesium.mod.TimeInterval
  ): typings.cesium.mod.TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.TimeInterval]
  inline def intersect(
    left: typings.cesium.mod.TimeInterval,
    right: typings.cesium.mod.TimeInterval,
    result: typings.cesium.mod.TimeInterval,
    mergeCallback: MergeCallback
  ): typings.cesium.mod.TimeInterval = (^.asInstanceOf[js.Dynamic].applyDynamic("intersect")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any], result.asInstanceOf[js.Any], mergeCallback.asInstanceOf[js.Any])).asInstanceOf[typings.cesium.mod.TimeInterval]
  
  /* static member */
  inline def toIso8601(timeInterval: typings.cesium.mod.TimeInterval): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(timeInterval.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def toIso8601(timeInterval: typings.cesium.mod.TimeInterval, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toIso8601")(timeInterval.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
}
