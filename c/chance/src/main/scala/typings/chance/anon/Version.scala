package typings.chance.anon

import typings.chance.chanceNumbers.`4`
import typings.chance.chanceNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Version extends js.Object {
  var version: `4` | `5`
}

object Version {
  @scala.inline
  def apply(version: `4` | `5`): Version = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
}

