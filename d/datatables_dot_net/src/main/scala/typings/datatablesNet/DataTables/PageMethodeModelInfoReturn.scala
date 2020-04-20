package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageMethodeModelInfoReturn extends js.Object {
  var end: Double
  var length: Double
  var page: Double
  var pages: Double
  var recordsDisplay: Double
  var recordsTotal: Double
  var serverSide: Boolean
  var start: Double
}

object PageMethodeModelInfoReturn {
  @scala.inline
  def apply(
    end: Double,
    length: Double,
    page: Double,
    pages: Double,
    recordsDisplay: Double,
    recordsTotal: Double,
    serverSide: Boolean,
    start: Double
  ): PageMethodeModelInfoReturn = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], page = page.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any], recordsDisplay = recordsDisplay.asInstanceOf[js.Any], recordsTotal = recordsTotal.asInstanceOf[js.Any], serverSide = serverSide.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageMethodeModelInfoReturn]
  }
}

