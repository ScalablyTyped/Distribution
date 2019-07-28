package typings.bingmaps.MicrosoftNs.MapsNs.SpatialDataServiceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterLogicalOperator extends js.Object

@JSGlobal("Microsoft.Maps.SpatialDataService.FilterLogicalOperator")
@js.native
object FilterLogicalOperator extends js.Object {
  /** Connects two or more filters that both must be true. */
  @js.native
  sealed trait and extends FilterLogicalOperator
  
  /** Connects two or more filters where one of them must be true. */
  @js.native
  sealed trait or extends FilterLogicalOperator
  
  /* 0 */ val and: typings.bingmaps.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterLogicalOperator.and with Double = js.native
  /* 1 */ val or: typings.bingmaps.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterLogicalOperator.or with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterLogicalOperator with Double] = js.native
}

