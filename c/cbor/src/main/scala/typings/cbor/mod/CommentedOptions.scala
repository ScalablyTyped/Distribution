package typings.cbor.mod

import typings.node.streamMod.TransformOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommentedOptions extends TransformOptions {
  var max_depth: js.UndefOr[Double] = js.native
}

object CommentedOptions {
  @scala.inline
  def apply(): CommentedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentedOptions]
  }
  @scala.inline
  implicit class CommentedOptionsOps[Self <: CommentedOptions] (val x: Self) extends AnyVal {
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
    def setMax_depth(value: Double): Self = this.set("max_depth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax_depth: Self = this.set("max_depth", js.undefined)
  }
  
}

