package typings.bingmaps.Microsoft.Maps.Search

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
  
}

