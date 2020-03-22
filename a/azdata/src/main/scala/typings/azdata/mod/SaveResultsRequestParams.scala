package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveResultsRequestParams extends js.Object {
  var batchIndex: Double
  var columnEndIndex: Double
  var columnStartIndex: Double
  var delimiter: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var filePath: String
  var formatted: js.UndefOr[Boolean] = js.undefined
  var includeHeaders: js.UndefOr[Boolean] = js.undefined
  var lineSeperator: js.UndefOr[String] = js.undefined
  var ownerUri: String
  /**
  		 * 'csv', 'json', 'excel', 'xml'
  		 */
  var resultFormat: String
  var resultSetIndex: Double
  var rowEndIndex: Double
  var rowStartIndex: Double
  var textIdentifier: js.UndefOr[String] = js.undefined
}

object SaveResultsRequestParams {
  @scala.inline
  def apply(
    batchIndex: Double,
    columnEndIndex: Double,
    columnStartIndex: Double,
    filePath: String,
    ownerUri: String,
    resultFormat: String,
    resultSetIndex: Double,
    rowEndIndex: Double,
    rowStartIndex: Double,
    delimiter: String = null,
    encoding: String = null,
    formatted: js.UndefOr[Boolean] = js.undefined,
    includeHeaders: js.UndefOr[Boolean] = js.undefined,
    lineSeperator: String = null,
    textIdentifier: String = null
  ): SaveResultsRequestParams = {
    val __obj = js.Dynamic.literal(batchIndex = batchIndex.asInstanceOf[js.Any], columnEndIndex = columnEndIndex.asInstanceOf[js.Any], columnStartIndex = columnStartIndex.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any], ownerUri = ownerUri.asInstanceOf[js.Any], resultFormat = resultFormat.asInstanceOf[js.Any], resultSetIndex = resultSetIndex.asInstanceOf[js.Any], rowEndIndex = rowEndIndex.asInstanceOf[js.Any], rowStartIndex = rowStartIndex.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(formatted)) __obj.updateDynamic("formatted")(formatted.asInstanceOf[js.Any])
    if (!js.isUndefined(includeHeaders)) __obj.updateDynamic("includeHeaders")(includeHeaders.asInstanceOf[js.Any])
    if (lineSeperator != null) __obj.updateDynamic("lineSeperator")(lineSeperator.asInstanceOf[js.Any])
    if (textIdentifier != null) __obj.updateDynamic("textIdentifier")(textIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveResultsRequestParams]
  }
}

