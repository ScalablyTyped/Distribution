package typings.bingmaps.Microsoft.Maps

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.ClusterPlacementType.FirstLocation
import typings.bingmaps.Microsoft.Maps.ClusterPlacementType.MeanAverage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClusterPlacementType extends js.Object

@JSGlobal("Microsoft.Maps.ClusterPlacementType")
@js.native
object ClusterPlacementType extends js.Object {
  /**
    * This method is the simplest way to represent a cluster. It places the cluster at the first location in the cluster. This method may not accurately
    * represent the data but requires little processing power.
    */
  @js.native
  sealed trait FirstLocation extends ClusterPlacementType
  
  /**
    * Mean Average placement calculates the average position of a group of coordinates. This method creates a more realistic representation of the data,
    * however requires more processing power and increases the chances of pushpins overlapping.
    */
  @js.native
  sealed trait MeanAverage extends ClusterPlacementType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClusterPlacementType with Double] = js.native
  /* 1 */ @js.native
  object FirstLocation extends TopLevel[FirstLocation with Double]
  
  /* 0 */ @js.native
  object MeanAverage extends TopLevel[MeanAverage with Double]
  
}

