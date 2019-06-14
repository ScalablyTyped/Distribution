package typings
package bingmapsLib.MicrosoftNs.MapsNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatchConfidence extends js.Object

@JSGlobal("Microsoft.Maps.Search.MatchConfidence")
@js.native
object MatchConfidence extends js.Object {
  /** The confidence of the match is high. */
  @js.native
  sealed trait high
    extends bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchConfidence
  
  /** The confidence of the match is low. */
  @js.native
  sealed trait low
    extends bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchConfidence
  
  /** The confidence of the match is medium. */
  @js.native
  sealed trait medium
    extends bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchConfidence
  
  /** The confidence of the match is unknown. */
  @js.native
  sealed trait unknown
    extends bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchConfidence
  
  /* 0 */ val high: high with scala.Double = js.native
  /* 2 */ val low: low with scala.Double = js.native
  /* 1 */ val medium: medium with scala.Double = js.native
  /* 3 */ val unknown: unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchConfidence with scala.Double] = js.native
}

