package typings.couchbase.couchbaseMod.Bucket.N1qlQueryResponse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The meta-information available from a view query response.
  */
trait Meta extends js.Object {
  /**
    * The identifier for this query request.
    */
  var requestID: Double
}

object Meta {
  @scala.inline
  def apply(requestID: Double): Meta = {
    val __obj = js.Dynamic.literal(requestID = requestID)
  
    __obj.asInstanceOf[Meta]
  }
}

