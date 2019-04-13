package typings
package cesiumLib.cesiumMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cesium", "RequestErrorEvent")
@js.native
class RequestErrorEvent () extends js.Object {
  def this(statusCode: scala.Double) = this()
  def this(statusCode: scala.Double, response: js.Any) = this()
  def this(statusCode: scala.Double, response: js.Any, responseHeaders: java.lang.String) = this()
  def this(statusCode: scala.Double, response: js.Any, responseHeaders: js.Object) = this()
  var response: js.Any = js.native
  var responseHeaders: js.Any = js.native
  var statusCode: scala.Double = js.native
}

