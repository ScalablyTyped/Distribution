package typings.cassandraDriver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Params extends js.Object {
  var params: js.Array[_]
  var query: String
}

object Params {
  @scala.inline
  def apply(params: js.Array[_], query: String): Params = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
}

