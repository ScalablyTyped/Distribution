package typings
package chaiDashHttpLib.chaiDashHttpMod.Global.ChaiHttpNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var body: js.Any
  var status: scala.Double
  var text: java.lang.String
  var `type`: java.lang.String
  def on(event: java.lang.String, fn: js.Function1[/* repeated */ js.Any, scala.Unit]): scala.Unit
  def setEncoding(encoding: java.lang.String): scala.Unit
}

object Response {
  @scala.inline
  def apply(
    body: js.Any,
    on: js.Function2[java.lang.String, js.Function1[/* repeated */ js.Any, scala.Unit], scala.Unit],
    setEncoding: js.Function1[java.lang.String, scala.Unit],
    status: scala.Double,
    text: java.lang.String,
    `type`: java.lang.String
  ): Response = {
    val __obj = js.Dynamic.literal(body = body, on = on, setEncoding = setEncoding, status = status, text = text)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Response]
  }
}

