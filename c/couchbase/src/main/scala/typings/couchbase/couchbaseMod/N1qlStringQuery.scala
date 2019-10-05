package typings.couchbase.couchbaseMod

import typings.couchbase.couchbaseMod.N1qlQuery.Consistency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Class for holding a explicitly defined N1QL query string.
  */
@JSImport("couchbase", "N1qlStringQuery")
@js.native
class N1qlStringQuery () extends N1qlQuery {
  /**
    * Specifies whether this query is adhoc or should be prepared.
    * @param adhoc
    */
  def adhoc(adhoc: Boolean): N1qlStringQuery = js.native
  /**
    * Specify the consistency level for this query.
    * @param val
    */
  def consistency(`val`: Consistency): N1qlStringQuery = js.native
  /**
    * Returns the fully prepared object representation of this query.
    */
  def toObject(): js.Any = js.native
}

