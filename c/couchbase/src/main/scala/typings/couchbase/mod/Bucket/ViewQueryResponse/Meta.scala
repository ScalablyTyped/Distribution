package typings.couchbase.mod.Bucket.ViewQueryResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The meta-information available from a view query response.
  */
trait Meta extends js.Object {
  /**
    * The total number of rows available in the index of the view that was queried.
    */
  var total_rows: Double
}

object Meta {
  @scala.inline
  def apply(total_rows: Double): Meta = {
    val __obj = js.Dynamic.literal(total_rows = total_rows.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Meta]
  }
}

