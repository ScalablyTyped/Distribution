package typings.bingmaps.Microsoft.Maps.Search

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
  
}

