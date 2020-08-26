package typings.deepEqual.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeepEqualOptions extends js.Object {
  var strict: Boolean = js.native
}

object DeepEqualOptions {
  @scala.inline
  def apply(strict: Boolean): DeepEqualOptions = {
    val __obj = js.Dynamic.literal(strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepEqualOptions]
  }
  @scala.inline
  implicit class DeepEqualOptionsOps[Self <: DeepEqualOptions] (val x: Self) extends AnyVal {
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
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
  }
  
}

