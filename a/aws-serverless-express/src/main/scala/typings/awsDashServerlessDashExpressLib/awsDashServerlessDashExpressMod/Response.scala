package typings
package awsDashServerlessDashExpressLib.awsDashServerlessDashExpressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: java.lang.String
  var statusCode: scala.Double
}

object Response {
  @scala.inline
  def apply(body: java.lang.String, statusCode: scala.Double): Response = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("statusCode")(statusCode)
    __obj.asInstanceOf[Response]
  }
}

