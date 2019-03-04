package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EntityErrors extends js.Object {
  var entityErrors: js.Array[breezeLib.breezeNs.EntityError]
  var httpResponse: breezeLib.breezeNs.HttpResponse
  var message: java.lang.String
  var stack: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[scala.Double] = js.undefined
}

object Anon_EntityErrors {
  @scala.inline
  def apply(
    entityErrors: js.Array[breezeLib.breezeNs.EntityError],
    httpResponse: breezeLib.breezeNs.HttpResponse,
    message: java.lang.String,
    stack: java.lang.String = null,
    status: scala.Int | scala.Double = null
  ): Anon_EntityErrors = {
    val __obj = js.Dynamic.literal(entityErrors = entityErrors, httpResponse = httpResponse, message = message)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EntityErrors]
  }
}

