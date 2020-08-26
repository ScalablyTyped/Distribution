package typings.chunkedDc.chunkedDc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** common.ts **/
@js.native
trait CommonStatic extends js.Object {
  var HEADER_LENGTH: Double = js.native
}

object CommonStatic {
  @scala.inline
  def apply(HEADER_LENGTH: Double): CommonStatic = {
    val __obj = js.Dynamic.literal(HEADER_LENGTH = HEADER_LENGTH.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonStatic]
  }
  @scala.inline
  implicit class CommonStaticOps[Self <: CommonStatic] (val x: Self) extends AnyVal {
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
    def setHEADER_LENGTH(value: Double): Self = this.set("HEADER_LENGTH", value.asInstanceOf[js.Any])
  }
  
}

