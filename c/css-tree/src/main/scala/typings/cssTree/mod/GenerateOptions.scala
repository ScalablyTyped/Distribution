package typings.cssTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateOptions extends js.Object {
  var decorator: js.UndefOr[js.Function1[/* handlers */ GenerateHandlers, GenerateHandlers]] = js.native
  var sourceMap: js.UndefOr[Boolean] = js.native
}

object GenerateOptions {
  @scala.inline
  def apply(): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenerateOptions]
  }
  @scala.inline
  implicit class GenerateOptionsOps[Self <: GenerateOptions] (val x: Self) extends AnyVal {
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
    def setDecorator(value: /* handlers */ GenerateHandlers => GenerateHandlers): Self = this.set("decorator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDecorator: Self = this.set("decorator", js.undefined)
    @scala.inline
    def setSourceMap(value: Boolean): Self = this.set("sourceMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceMap: Self = this.set("sourceMap", js.undefined)
  }
  
}

