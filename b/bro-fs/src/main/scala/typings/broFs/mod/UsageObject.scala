package typings.broFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UsageObject extends js.Object {
  var grantedBytes: Double = js.native
  var usedBytes: Double = js.native
}

object UsageObject {
  @scala.inline
  def apply(grantedBytes: Double, usedBytes: Double): UsageObject = {
    val __obj = js.Dynamic.literal(grantedBytes = grantedBytes.asInstanceOf[js.Any], usedBytes = usedBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageObject]
  }
  @scala.inline
  implicit class UsageObjectOps[Self <: UsageObject] (val x: Self) extends AnyVal {
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
    def setGrantedBytes(value: Double): Self = this.set("grantedBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsedBytes(value: Double): Self = this.set("usedBytes", value.asInstanceOf[js.Any])
  }
  
}

