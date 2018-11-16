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
  
  val ambiguous: ambiguous with java.lang.String = js.native
  val good: good with java.lang.String = js.native
  val modified: modified with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val upHierarchy: upHierarchy with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[bingmapsLib.MicrosoftNs.MapsNs.SearchNs.MatchCode with java.lang.String] = js.native
}

