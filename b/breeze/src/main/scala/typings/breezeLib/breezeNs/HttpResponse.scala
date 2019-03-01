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

object HttpResponse {
  @scala.inline
  def apply(
    config: js.Any,
    data: js.Array[Entity],
    getHeaders: js.Function1[java.lang.String, java.lang.String],
    status: scala.Double,
    error: js.Any = null,
    saveContext: js.Any = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("getHeaders")(getHeaders)
    __obj.updateDynamic("status")(status)
    if (error != null) __obj.updateDynamic("error")(error)
    if (saveContext != null) __obj.updateDynamic("saveContext")(saveContext)
    __obj.asInstanceOf[HttpResponse]
  }
}

