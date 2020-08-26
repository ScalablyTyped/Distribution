package typings.chance.anon

import typings.chance.chanceBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Region extends js.Object {
  var region: `true` = js.native
}

object Region {
  @scala.inline
  def apply(region: `true`): Region = {
    val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Region]
  }
  @scala.inline
  implicit class RegionOps[Self <: Region] (val x: Self) extends AnyVal {
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
    def setRegion(value: `true`): Self = this.set("region", value.asInstanceOf[js.Any])
  }
  
}

