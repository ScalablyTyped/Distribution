package typings.cesium.mod

import typings.cesium.anon.Data
import typings.cesium.anon.IsStartIncluded
import typings.cesium.mod.TimeInterval.DataComparer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cesium", "TimeInterval")
@js.native
class TimeInterval () extends StObject {
  def this(options: Data) = this()
  
  def clone(result: TimeInterval): TimeInterval = js.native
  
  var data: js.Any = js.native
  
  def equals(): Boolean = js.native
  def equals(right: js.UndefOr[scala.Nothing], dataComparer: DataComparer): Boolean = js.native
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
  @scala.inline
  def EMPTY_=(x: TimeInterval): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMPTY")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("cesium", "TimeInterval.clone")
  @js.native
  def clone_(): TimeInterval = js.native
  @JSImport("cesium", "TimeInterval.clone")
  @js.native
  def clone_(timeInterval: js.UndefOr[scala.Nothing], result: TimeInterval): TimeInterval = js.native
  @JSImport("cesium", "TimeInterval.clone")
  @js.native
  def clone_(timeInterval: TimeInterval): TimeInterval = js.native
  @JSImport("cesium", "TimeInterval.clone")
  @js.native
  def clone_(timeInterval: TimeInterval, result: TimeInterval): TimeInterval = js.native
  
  /* static member */
  @JSImport("cesium", "TimeInterval.contains")
  @js.native
  def contains(timeInterval: TimeInterval, julianDate: JulianDate): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "TimeInterval.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: TimeInterval, right: TimeInterval, epsilon: Double): Boolean = js.native
  @JSImport("cesium", "TimeInterval.equalsEpsilon")
  @js.native
  def equalsEpsilon(left: TimeInterval, right: TimeInterval, epsilon: Double, dataComparer: DataComparer): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "TimeInterval.equals")
  @js.native
  def equals_(): Boolean = js.native
  @JSImport("cesium", "TimeInterval.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: js.UndefOr[scala.Nothing], dataComparer: DataComparer): Boolean = js.native
  @JSImport("cesium", "TimeInterval.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: TimeInterval): Boolean = js.native
  @JSImport("cesium", "TimeInterval.equals")
  @js.native
  def equals_(left: js.UndefOr[scala.Nothing], right: TimeInterval, dataComparer: DataComparer): Boolean = js.native
  @JSImport("cesium", "TimeInterval.equals")
  @js.native
  def equals_(left: TimeInterval): Boolean = js.native
  @JSImport("cesium", "TimeInterval.equals")
  @js.native
  def equals_(left: TimeInterval, right: js.UndefOr[scala.Nothing], dataComparer: DataComparer): Boolean = js.native
  @JSImport("cesium", "TimeInterval.equals")
  @js.native
  def equals_(left: TimeInterval, right: TimeInterval): Boolean = js.native
  @JSImport("cesium", "TimeInterval.equals")
  @js.native
  def equals_(left: TimeInterval, right: TimeInterval, dataComparer: DataComparer): Boolean = js.native
  
  /* static member */
  @JSImport("cesium", "TimeInterval.fromIso8601")
  @js.native
  def fromIso8601(options: IsStartIncluded): TimeInterval = js.native
  @JSImport("cesium", "TimeInterval.fromIso8601")
  @js.native
  def fromIso8601(options: IsStartIncluded, result: TimeInterval): TimeInterval = js.native
  
  /* static member */
  @JSImport("cesium", "TimeInterval.intersect")
  @js.native
  def intersect(left: TimeInterval, right: TimeInterval, result: TimeInterval): TimeInterval = js.native
  @JSImport("cesium", "TimeInterval.intersect")
  @js.native
  def intersect(left: TimeInterval, right: TimeInterval, result: TimeInterval, mergeCallback: MergeCallback): TimeInterval = js.native
  
  /* static member */
  @JSImport("cesium", "TimeInterval.toIso8601")
  @js.native
  def toIso8601(timeInterval: TimeInterval): String = js.native
  @JSImport("cesium", "TimeInterval.toIso8601")
  @js.native
  def toIso8601(timeInterval: TimeInterval, precision: Double): String = js.native
  
  type DataComparer = js.Function2[/* leftData */ js.Any, /* rightData */ js.Any, Boolean]
  
  type MergeCallback = js.Function2[/* leftData */ js.Any, /* rightData */ js.Any, js.Any]
}
