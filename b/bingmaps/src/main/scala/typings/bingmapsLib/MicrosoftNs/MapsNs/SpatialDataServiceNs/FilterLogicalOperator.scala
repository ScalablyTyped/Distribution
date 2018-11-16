package typings
package bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs

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
  sealed trait and
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterLogicalOperator
  
  /** Connects two or more filters where one of them must be true. */
  @js.native
  sealed trait or
    extends bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterLogicalOperator
  
  val and: and with java.lang.String = js.native
  val or: or with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    bingmapsLib.MicrosoftNs.MapsNs.SpatialDataServiceNs.FilterLogicalOperator with java.lang.String
  ] = js.native
}

