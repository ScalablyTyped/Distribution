package typings
package calqLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calq extends js.Object {
  var action: calqLib.CalqNs.Action = js.native
  var user: calqLib.CalqNs.User = js.native
  def init(writeKey: java.lang.String): scala.Unit = js.native
  def init(writeKey: java.lang.String, options: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
}

