package typings.baseui.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseInputOverrides[T] extends js.Object {
  var After: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var Before: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var Input: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var InputContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
}

object BaseInputOverrides {
  @scala.inline
  def apply[T](): BaseInputOverrides[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseInputOverrides[T]]
  }
  @scala.inline
  implicit class BaseInputOverridesOps[Self <: BaseInputOverrides[_], T] (val x: Self with BaseInputOverrides[T]) extends AnyVal {
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
    def setAfter(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("After", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAfter: Self = this.set("After", js.undefined)
    @scala.inline
    def setBefore(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Before", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBefore: Self = this.set("Before", js.undefined)
    @scala.inline
    def setInput(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("Input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
    @scala.inline
    def setInputContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
    ): Self = this.set("InputContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInputContainer: Self = this.set("InputContainer", js.undefined)
  }
  
}

