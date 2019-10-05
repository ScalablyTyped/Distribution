package typings.couchbase.couchbaseMod.SearchQuery

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
  
  /* 0 */ val NOT_BOUNDED: typings.couchbase.couchbaseMod.SearchQuery.Consistency.NOT_BOUNDED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Consistency with Double] = js.native
}

