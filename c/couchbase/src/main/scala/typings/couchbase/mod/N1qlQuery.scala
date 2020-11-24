package typings.couchbase.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  /**
    * Creates a query object directly from the passed query string.
    * @param str
    */
  def fromString(str: String): N1qlStringQuery = js.native
  
  @js.native
  sealed trait Consistency extends js.Object
  /**
    * Enumeration for specifying N1QL consistency semantics.
    */
  @js.native
  object Consistency extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Consistency with Double] = js.native
    
    /**
      *     This is the default (for single-statement requests).
      */
    @js.native
    sealed trait NOT_BOUND extends Consistency
    /* 0 */ @js.native
    object NOT_BOUND extends TopLevel[NOT_BOUND with Double]
    
    /**
      * This implements strong consistency per request.
      */
    @js.native
    sealed trait REQUEST_PLUS extends Consistency
    /* 1 */ @js.native
    object REQUEST_PLUS extends TopLevel[REQUEST_PLUS with Double]
    
    /**
      * This implements strong consistency per statement.
      */
    @js.native
    sealed trait STATEMENT_PLUS extends Consistency
    /* 2 */ @js.native
    object STATEMENT_PLUS extends TopLevel[STATEMENT_PLUS with Double]
  }
}
