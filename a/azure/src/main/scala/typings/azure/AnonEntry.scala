package typings.azure

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEntry extends js.Object {
  var entry: AnonAuthor
}

object AnonEntry {
  @scala.inline
  def apply(entry: AnonAuthor): AnonEntry = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonEntry]
  }
}

