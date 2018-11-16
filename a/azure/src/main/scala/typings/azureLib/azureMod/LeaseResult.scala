package typings
package azureLib.azureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("azure", "LeaseResult")
@js.native
class LeaseResult () extends js.Object {
  def this(container: java.lang.String) = this()
  def this(container: java.lang.String, blob: java.lang.String) = this()
  def this(container: java.lang.String, blob: java.lang.String, id: java.lang.String) = this()
  def this(container: java.lang.String, blob: java.lang.String, id: java.lang.String, time: java.lang.String) = this()
  var blob: java.lang.String = js.native
  var container: java.lang.String = js.native
  var etag: java.lang.String = js.native
  var id: java.lang.String = js.native
  var lastModified: java.lang.String = js.native
  var time: java.lang.String = js.native
  def getPropertiesFromHeaders(header: js.Any): scala.Unit = js.native
}

