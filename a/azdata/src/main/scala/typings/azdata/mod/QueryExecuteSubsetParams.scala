package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecuteSubsetParams extends js.Object {
  var batchIndex: Double
  var ownerUri: String
  var resultSetIndex: Double
  var rowsCount: Double
  var rowsStartIndex: Double
}

object QueryExecuteSubsetParams {
  @scala.inline
  def apply(
    batchIndex: Double,
    ownerUri: String,
    resultSetIndex: Double,
    rowsCount: Double,
    rowsStartIndex: Double
  ): QueryExecuteSubsetParams = {
    val __obj = js.Dynamic.literal(batchIndex = batchIndex.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], resultSetIndex = resultSetIndex.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any], rowsStartIndex = rowsStartIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[QueryExecuteSubsetParams]
  }
}

