package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HttpResponse extends js.Object {
  var config: js.Any
  var data: js.Array[Entity]
  var error: js.UndefOr[js.Any] = js.undefined
  var saveContext: js.UndefOr[js.Any] = js.undefined
  var status: scala.Double
  def getHeaders(headerName: java.lang.String): java.lang.String
}

