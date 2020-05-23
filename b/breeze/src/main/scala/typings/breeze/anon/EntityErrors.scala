package typings.breeze.anon

import typings.breeze.breeze.EntityError
import typings.breeze.breeze.HttpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityErrors extends js.Object {
  var entityErrors: js.Array[EntityError]
  var httpResponse: HttpResponse
  var message: String
  var stack: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object EntityErrors {
  @scala.inline
  def apply(
    entityErrors: js.Array[EntityError],
    httpResponse: HttpResponse,
    message: String,
    stack: String = null,
    status: js.UndefOr[Double] = js.undefined
  ): EntityErrors = {
    val __obj = js.Dynamic.literal(entityErrors = entityErrors.asInstanceOf[js.Any], httpResponse = httpResponse.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    if (!js.isUndefined(status)) __obj.updateDynamic("status")(status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EntityErrors]
  }
}

