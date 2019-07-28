package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseMod.N1qlQueryNs.Consistency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("couchbase", "N1qlQuery")
@js.native
object N1qlQueryNs extends js.Object {
  @js.native
  sealed trait Consistency extends js.Object
  
  /**
    * Enumeration for specifying N1QL consistency semantics.
    */
  @js.native
  object Consistency extends js.Object {
    /**
      * 	This is the default (for single-statement requests).
      */
    @js.native
    sealed trait NOT_BOUND extends Consistency
    
    /**
      * This implements strong consistency per request.
      */
    @js.native
    sealed trait REQUEST_PLUS extends Consistency
    
    /**
      * This implements strong consistency per statement.
      */
    @js.native
    sealed trait STATEMENT_PLUS extends Consistency
    
    /* 0 */ val NOT_BOUND: typings.couchbase.couchbaseMod.N1qlQueryNs.Consistency.NOT_BOUND with Double = js.native
    /* 1 */ val REQUEST_PLUS: typings.couchbase.couchbaseMod.N1qlQueryNs.Consistency.REQUEST_PLUS with Double = js.native
    /* 2 */ val STATEMENT_PLUS: typings.couchbase.couchbaseMod.N1qlQueryNs.Consistency.STATEMENT_PLUS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Consistency with Double] = js.native
  }
  
}

