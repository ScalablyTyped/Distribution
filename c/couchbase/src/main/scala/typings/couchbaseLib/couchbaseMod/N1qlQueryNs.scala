package typings
package couchbaseLib.couchbaseMod

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
    sealed trait NOT_BOUND
      extends couchbaseLib.couchbaseMod.N1qlQueryNs.Consistency
    
    /**
      * This implements strong consistency per request.
      */
    @js.native
    sealed trait REQUEST_PLUS
      extends couchbaseLib.couchbaseMod.N1qlQueryNs.Consistency
    
    /**
      * This implements strong consistency per statement.
      */
    @js.native
    sealed trait STATEMENT_PLUS
      extends couchbaseLib.couchbaseMod.N1qlQueryNs.Consistency
    
    /* 0 */ val NOT_BOUND: NOT_BOUND with scala.Double = js.native
    /* 1 */ val REQUEST_PLUS: REQUEST_PLUS with scala.Double = js.native
    /* 2 */ val STATEMENT_PLUS: STATEMENT_PLUS with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[couchbaseLib.couchbaseMod.N1qlQueryNs.Consistency with scala.Double] = js.native
  }
  
}

