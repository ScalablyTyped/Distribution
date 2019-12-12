package typings.bingmaps.Microsoft.Maps.Search

import org.scalablytyped.runtime.TopLevel
import typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.high
import typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.low
import typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.medium
import typings.bingmaps.Microsoft.Maps.Search.MatchConfidence.unknown
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
  sealed trait high extends MatchConfidence
  
  /** The confidence of the match is low. */
  @js.native
  sealed trait low extends MatchConfidence
  
  /** The confidence of the match is medium. */
  @js.native
  sealed trait medium extends MatchConfidence
  
  /** The confidence of the match is unknown. */
  @js.native
  sealed trait unknown extends MatchConfidence
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MatchConfidence with Double] = js.native
  /* 0 */ @js.native
  object high extends TopLevel[high with Double]
  
  /* 2 */ @js.native
  object low extends TopLevel[low with Double]
  
  /* 1 */ @js.native
  object medium extends TopLevel[medium with Double]
  
  /* 3 */ @js.native
  object unknown extends TopLevel[unknown with Double]
  
}

