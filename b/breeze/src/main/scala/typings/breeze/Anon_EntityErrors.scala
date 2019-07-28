package typings.breeze

import typings.breeze.breezeNs.EntityError
import typings.breeze.breezeNs.HttpResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntityErrors extends js.Object {
  var entityErrors: js.Array[EntityError]
  var httpResponse: HttpResponse
  var message: String
  var stack: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
}

object Anon_EntityErrors {
  @scala.inline
  def apply(
    entityErrors: js.Array[EntityError],
    httpResponse: HttpResponse,
    message: String,
    stack: String = null,
    status: Int | Double = null
  ): Anon_EntityErrors = {
    val __obj = js.Dynamic.literal(entityErrors = entityErrors, httpResponse = httpResponse, message = message)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EntityErrors]
  }
}

