package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends js.Object {
  var config: js.Any
  var data: js.Array[Entity]
  var error: js.UndefOr[js.Any] = js.undefined
  var saveContext: js.UndefOr[js.Any] = js.undefined
  var status: Double
  def getHeaders(headerName: String): String
}

object HttpResponse {
  @scala.inline
  def apply(
    config: js.Any,
    data: js.Array[Entity],
    getHeaders: String => String,
    status: Double,
    error: js.Any = null,
    saveContext: js.Any = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], getHeaders = js.Any.fromFunction1(getHeaders), status = status.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (saveContext != null) __obj.updateDynamic("saveContext")(saveContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
}

