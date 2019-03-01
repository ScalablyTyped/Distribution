package typings
package casperjsLib.casperjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends js.Object {
  var contentType: java.lang.String
  var data: js.Any
  var headers: js.Array[Header]
  var id: scala.Double
  var redirectURL: java.lang.String | scala.Null
  var stage: java.lang.String
  var status: scala.Double
  var statusText: java.lang.String
  var time: java.lang.String
  var url: java.lang.String
}

object HttpResponse {
  @scala.inline
  def apply(
    contentType: java.lang.String,
    data: js.Any,
    headers: js.Array[Header],
    id: scala.Double,
    stage: java.lang.String,
    status: scala.Double,
    statusText: java.lang.String,
    time: java.lang.String,
    url: java.lang.String,
    redirectURL: java.lang.String = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentType")(contentType)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("stage")(stage)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("statusText")(statusText)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("url")(url)
    if (redirectURL != null) __obj.updateDynamic("redirectURL")(redirectURL)
    __obj.asInstanceOf[HttpResponse]
  }
}

