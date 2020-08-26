package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelInteractable extends js.Object {
  var LabelInteractable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = js.native
}

object LabelInteractable {
  @scala.inline
  def apply(
    LabelInteractable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ): LabelInteractable = {
    val __obj = js.Dynamic.literal(LabelInteractable = LabelInteractable.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelInteractable]
  }
  @scala.inline
  implicit class LabelInteractableOps[Self <: LabelInteractable] (val x: Self) extends AnyVal {
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
    def setLabelInteractable(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("LabelInteractable", value.asInstanceOf[js.Any])
  }
  
}

