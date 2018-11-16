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
  
  val high: high with java.lang.String = js.native
  val low: low with java.lang.String = js.native
  val medium: medium with java.lang.String = js.native
  val unknown: unknown with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchConfidence with java.lang.String] = js.native
}

