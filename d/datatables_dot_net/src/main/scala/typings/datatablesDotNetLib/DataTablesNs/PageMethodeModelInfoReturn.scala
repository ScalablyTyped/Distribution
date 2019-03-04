package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageMethodeModelInfoReturn extends js.Object {
  var end: scala.Double
  var length: scala.Double
  var page: scala.Double
  var pages: scala.Double
  var recordsDisplay: scala.Double
  var recordsTotal: scala.Double
  var serverSide: scala.Boolean
  var start: scala.Double
}

object PageMethodeModelInfoReturn {
  @scala.inline
  def apply(
    end: scala.Double,
    length: scala.Double,
    page: scala.Double,
    pages: scala.Double,
    recordsDisplay: scala.Double,
    recordsTotal: scala.Double,
    serverSide: scala.Boolean,
    start: scala.Double
  ): PageMethodeModelInfoReturn = {
    val __obj = js.Dynamic.literal(end = end, length = length, page = page, pages = pages, recordsDisplay = recordsDisplay, recordsTotal = recordsTotal, serverSide = serverSide, start = start)
  
    __obj.asInstanceOf[PageMethodeModelInfoReturn]
  }
}

