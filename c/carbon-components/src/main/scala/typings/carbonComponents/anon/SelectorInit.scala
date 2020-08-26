package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectorInit extends js.Object {
  var selectorInit: String = js.native
  var selectorInput: String = js.native
}

object SelectorInit {
  @scala.inline
  def apply(selectorInit: String, selectorInput: String): SelectorInit = {
    val __obj = js.Dynamic.literal(selectorInit = selectorInit.asInstanceOf[js.Any], selectorInput = selectorInput.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectorInit]
  }
  @scala.inline
  implicit class SelectorInitOps[Self <: SelectorInit] (val x: Self) extends AnyVal {
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
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorInput(value: String): Self = this.set("selectorInput", value.asInstanceOf[js.Any])
  }
  
}

