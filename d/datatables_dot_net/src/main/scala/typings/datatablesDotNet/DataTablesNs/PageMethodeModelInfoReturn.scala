package typings.datatablesDotNet.DataTablesNs

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
    val __obj = js.Dynamic.literal(end = end, length = length, page = page, pages = pages, recordsDisplay = recordsDisplay, recordsTotal = recordsTotal, serverSide = serverSide, start = start)
  
    __obj.asInstanceOf[PageMethodeModelInfoReturn]
  }
}

