package typings.chance.anon

import typings.chance.chanceNumbers.`4`
import typings.chance.chanceNumbers.`5`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Version extends js.Object {
  var version: `4` | `5` = js.native
}

object Version {
  @scala.inline
  def apply(version: `4` | `5`): Version = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Version]
  }
  @scala.inline
  implicit class VersionOps[Self <: Version] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setVersion(value: `4` | `5`): Self = this.set("version", value.asInstanceOf[js.Any])
  }
  
}

