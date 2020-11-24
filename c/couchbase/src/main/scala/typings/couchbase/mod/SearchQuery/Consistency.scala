package typings.couchbase.mod.SearchQuery

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait Consistency extends js.Object
/**
  * Enumeration for specifying FTS consistency semantics.
  */
@JSImport("couchbase", "SearchQuery.Consistency")
@js.native
object Consistency extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Consistency with Double] = js.native
  
  /**
    * This is the default (for single-statement requests).
    */
  @js.native
  sealed trait NOT_BOUNDED extends Consistency
  /* 0 */ @js.native
  object NOT_BOUNDED extends TopLevel[NOT_BOUNDED with Double]
}
