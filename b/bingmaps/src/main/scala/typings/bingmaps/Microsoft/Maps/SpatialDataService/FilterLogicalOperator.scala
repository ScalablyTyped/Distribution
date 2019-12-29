package typings.bingmaps.Microsoft.Maps.SpatialDataService

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FilterLogicalOperator with Double] = js.native
  /* 0 */ @js.native
  object and extends TopLevel[and with Double]
  
  /* 1 */ @js.native
  object or extends TopLevel[or with Double]
  
}

