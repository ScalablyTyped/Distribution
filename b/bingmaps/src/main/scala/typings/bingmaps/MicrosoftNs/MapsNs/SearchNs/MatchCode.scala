package typings.bingmaps.MicrosoftNs.MapsNs.SearchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MatchCode extends js.Object

@JSGlobal("Microsoft.Maps.Search.MatchCode")
@js.native
object MatchCode extends js.Object {
  /** The match was ambiguous. Multiple results were returned. */
  @js.native
  sealed trait ambiguous extends MatchCode
  
  /** The match was good. */
  @js.native
  sealed trait good extends MatchCode
  
  /** The match was found, but possibly using a modified query. */
  @js.native
  sealed trait modified extends MatchCode
  
  /** No match was found. */
  @js.native
  sealed trait none extends MatchCode
  
  /** The match was found by a broader search. */
  @js.native
  sealed trait upHierarchy extends MatchCode
  
  /* 2 */ val ambiguous: typings.bingmaps.MicrosoftNs.MapsNs.SearchNs.MatchCode.ambiguous with Double = js.native
  /* 1 */ val good: typings.bingmaps.MicrosoftNs.MapsNs.SearchNs.MatchCode.good with Double = js.native
  /* 4 */ val modified: typings.bingmaps.MicrosoftNs.MapsNs.SearchNs.MatchCode.modified with Double = js.native
  /* 0 */ val none: typings.bingmaps.MicrosoftNs.MapsNs.SearchNs.MatchCode.none with Double = js.native
  /* 3 */ val upHierarchy: typings.bingmaps.MicrosoftNs.MapsNs.SearchNs.MatchCode.upHierarchy with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatchCode with Double] = js.native
}

