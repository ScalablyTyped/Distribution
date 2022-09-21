package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Class for dynamically construction of N1QL queries. This class should never be constructed directly, instead you should use the N1qlQuery.fromString static method to instantiate a N1qlStringQuery.
  */
@JSImport("couchbase", "N1qlQuery")
@js.native
open class N1qlQuery () extends StObject {
  
  // Private declaration to avoid other queries being misstaken for N1qlQuery
  /* private */ var __nominal: Unit = js.native
}
object N1qlQuery {
  
  @JSImport("couchbase", "N1qlQuery")
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Consistency extends StObject
  /**
    * Enumeration for specifying N1QL consistency semantics.
    */
  @JSImport("couchbase", "N1qlQuery.Consistency")
  @js.native
  object Consistency extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Consistency & Double] = js.native
    
    /**
      *     This is the default (for single-statement requests).
      */
    @js.native
    sealed trait NOT_BOUNDED
      extends StObject
         with Consistency
    /* 0 */ val NOT_BOUNDED: typings.couchbase.mod.N1qlQuery.Consistency.NOT_BOUNDED & Double = js.native
    
    /**
      * This implements strong consistency per request.
      */
    @js.native
    sealed trait REQUEST_PLUS
      extends StObject
         with Consistency
    /* 1 */ val REQUEST_PLUS: typings.couchbase.mod.N1qlQuery.Consistency.REQUEST_PLUS & Double = js.native
    
    /**
      * This implements strong consistency per statement.
      */
    @js.native
    sealed trait STATEMENT_PLUS
      extends StObject
         with Consistency
    /* 2 */ val STATEMENT_PLUS: typings.couchbase.mod.N1qlQuery.Consistency.STATEMENT_PLUS & Double = js.native
  }
  
  /**
    * Creates a query object directly from the passed query string.
    * @param str
    */
  /* static member */
  inline def fromString(str: String): N1qlStringQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[N1qlStringQuery]
}
