package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISelectionData extends js.Object {
  var endColumn: Double
  var endLine: Double
  var startColumn: Double
  var startLine: Double
}

object ISelectionData {
  @scala.inline
  def apply(endColumn: Double, endLine: Double, startColumn: Double, startLine: Double): ISelectionData = {
    val __obj = js.Dynamic.literal(endColumn = endColumn.asInstanceOf[js.Any], endLine = endLine.asInstanceOf[js.Any], startColumn = startColumn.asInstanceOf[js.Any], startLine = startLine.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISelectionData]
  }
}

