package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecuteSubsetResult extends js.Object {
  var message: String
  var resultSubset: ResultSetSubset
}

object QueryExecuteSubsetResult {
  @scala.inline
  def apply(message: String, resultSubset: ResultSetSubset): QueryExecuteSubsetResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], resultSubset = resultSubset.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryExecuteSubsetResult]
  }
}

