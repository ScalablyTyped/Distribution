package typings.calq

import org.scalablytyped.runtime.StringDictionary
import typings.calq.CalqNs.Action
import typings.calq.CalqNs.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Calq extends js.Object {
  var action: Action = js.native
  var user: User = js.native
  def init(writeKey: String): Unit = js.native
  def init(writeKey: String, options: StringDictionary[js.Any]): Unit = js.native
}

