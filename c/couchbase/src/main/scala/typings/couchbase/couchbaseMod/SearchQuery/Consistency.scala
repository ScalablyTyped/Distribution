package typings.couchbase.couchbaseMod.SearchQuery

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Consistency extends js.Object

/**
  * Enumeration for specifying FTS consistency semantics.
  */
@JSImport("couchbase", "SearchQuery.Consistency")
@js.native
object Consistency extends js.Object {
  /**
    * This is the default (for single-statement requests).
    */
  @js.native
  sealed trait NOT_BOUNDED extends Consistency
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Consistency with Double] = js.native
  /* 0 */ @js.native
  object NOT_BOUNDED extends TopLevel[NOT_BOUNDED with Double]
  
}

