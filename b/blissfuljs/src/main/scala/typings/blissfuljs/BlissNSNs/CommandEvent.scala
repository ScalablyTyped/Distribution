package typings.blissfuljs.BlissNSNs

import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandEvent extends Event {
  val commandName: String = js.native
  val detail: String | Null = js.native
}

