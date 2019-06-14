package typings
package bingmapsLib.MicrosoftNs.MapsNs.SearchNs

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
  sealed trait ambiguous
    extends bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchCode
  
  /** The match was good. */
  @js.native
  sealed trait good
    extends bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchCode
  
  /** The match was found, but possibly using a modified query. */
  @js.native
  sealed trait modified
    extends bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchCode
  
  /** No match was found. */
  @js.native
  sealed trait none
    extends bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchCode
  
  /** The match was found by a broader search. */
  @js.native
  sealed trait upHierarchy
    extends bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchCode
  
  /* 2 */ val ambiguous: ambiguous with scala.Double = js.native
  /* 1 */ val good: good with scala.Double = js.native
  /* 4 */ val modified: modified with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 3 */ val upHierarchy: upHierarchy with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchCode with scala.Double] = js.native
}

