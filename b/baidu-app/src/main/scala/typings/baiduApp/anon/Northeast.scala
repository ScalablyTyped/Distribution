package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Northeast extends js.Object {
  var northeast: Longitude = js.native
  var southwest: Longitude = js.native
}

object Northeast {
  @scala.inline
  def apply(northeast: Longitude, southwest: Longitude): Northeast = {
    val __obj = js.Dynamic.literal(northeast = northeast.asInstanceOf[js.Any], southwest = southwest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Northeast]
  }
  @scala.inline
  implicit class NortheastOps[Self <: Northeast] (val x: Self) extends AnyVal {
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
    def setNortheast(value: Longitude): Self = this.set("northeast", value.asInstanceOf[js.Any])
    @scala.inline
    def setSouthwest(value: Longitude): Self = this.set("southwest", value.asInstanceOf[js.Any])
  }
  
}

