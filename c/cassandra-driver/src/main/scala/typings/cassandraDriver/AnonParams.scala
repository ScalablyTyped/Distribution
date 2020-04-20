package typings.cassandraDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParams extends js.Object {
  var params: js.Array[_]
  var query: String
}

object AnonParams {
  @scala.inline
  def apply(params: js.Array[_], query: String): AnonParams = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParams]
  }
}

