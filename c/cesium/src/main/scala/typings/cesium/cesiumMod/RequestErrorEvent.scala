package typings.cesium.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RequestErrorEvent")
@js.native
class RequestErrorEvent () extends js.Object {
  def this(statusCode: Double) = this()
  def this(statusCode: Double, response: js.Any) = this()
  def this(statusCode: Double, response: js.Any, responseHeaders: String) = this()
  def this(statusCode: Double, response: js.Any, responseHeaders: js.Object) = this()
  var response: js.Any = js.native
  var responseHeaders: js.Any = js.native
  var statusCode: Double = js.native
}

