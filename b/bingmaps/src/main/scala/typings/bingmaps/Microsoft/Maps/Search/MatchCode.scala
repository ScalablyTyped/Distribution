package typings.bingmaps.Microsoft.Maps.Search

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.Search.MatchCode.ambiguous
import typings.bingmaps.Microsoft.Maps.Search.MatchCode.good
import typings.bingmaps.Microsoft.Maps.Search.MatchCode.modified
import typings.bingmaps.Microsoft.Maps.Search.MatchCode.none
import typings.bingmaps.Microsoft.Maps.Search.MatchCode.upHierarchy
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatchCode with Double] = js.native
  /* 2 */ @js.native
  object ambiguous extends TopLevel[ambiguous with Double]
  
  /* 1 */ @js.native
  object good extends TopLevel[good with Double]
  
  /* 4 */ @js.native
  object modified extends TopLevel[modified with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 3 */ @js.native
  object upHierarchy extends TopLevel[upHierarchy with Double]
  
}

