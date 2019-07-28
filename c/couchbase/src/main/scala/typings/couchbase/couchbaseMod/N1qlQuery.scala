package typings.couchbase.couchbaseMod

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
  /**
    * Creates a query object directly from the passed query string.
    * @param str
    */
  def fromString(str: String): N1qlStringQuery = js.native
}

