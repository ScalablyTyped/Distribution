package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseMod.N1qlQuery.Consistency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for dynamically construction of N1QL queries. This class should never be constructed directly, instead you should use the N1qlQuery.fromString static method to instantiate a N1qlStringQuery.
  */
@JSImport("couchbase", "N1qlQuery")
@js.native
class N1qlQuery () extends js.Object {
  // Private declaration to avoid other queries being misstaken for N1qlQuery
  var __nominal: Unit = js.native
}

/* static members */
@JSImport("couchbase", "N1qlQuery")
@js.native
object N1qlQuery extends js.Object {
  @js.native
  sealed trait Consistency extends js.Object
  
  /**
    * Creates a query object directly from the passed query string.
    * @param str
    */
  def fromString(str: String): N1qlStringQuery = js.native
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
    
    /* 0 */ val NOT_BOUND: typings.couchbase.couchbaseMod.N1qlQuery.Consistency.NOT_BOUND with Double = js.native
    /* 1 */ val REQUEST_PLUS: typings.couchbase.couchbaseMod.N1qlQuery.Consistency.REQUEST_PLUS with Double = js.native
    /* 2 */ val STATEMENT_PLUS: typings.couchbase.couchbaseMod.N1qlQuery.Consistency.STATEMENT_PLUS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Consistency with Double] = js.native
  }
  
}

