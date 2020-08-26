package typings.bson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SerializeOptions extends CommonSerializeOptions {
  /** {default:1024*1024*17}, minimum size of the internal temporary serialization buffer. */
  var minInternalBufferSize: js.UndefOr[scala.Double] = js.native
}

object SerializeOptions {
  @scala.inline
  def apply(): SerializeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SerializeOptions]
  }
  @scala.inline
  implicit class SerializeOptionsOps[Self <: SerializeOptions] (val x: Self) extends AnyVal {
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
    def setMinInternalBufferSize(value: scala.Double): Self = this.set("minInternalBufferSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinInternalBufferSize: Self = this.set("minInternalBufferSize", js.undefined)
  }
  
}

