package typings.baseui.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined baseui.baseui/input.BaseInputOverrides<baseui.baseui/input.SharedProps> & {  Root :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> * / any | undefined,   StartEnhancer :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> * / any | undefined,   EndEnhancer :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> * / any | undefined,   ClearIcon :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> * / any | undefined,   ClearIconContainer :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> * / any | undefined,   MaskToggleButton :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> * / any | undefined,   MaskToggleHideIcon :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> * / any | undefined,   MaskToggleShowIcon :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> * / any | undefined} */
@js.native
trait InputOverrides extends js.Object {
  var After: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var Before: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var ClearIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  var ClearIconContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  var EndEnhancer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  var Input: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var InputContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<T> */ js.Any
  ] = js.native
  var MaskToggleButton: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  var MaskToggleHideIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  var MaskToggleShowIcon: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
  var StartEnhancer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
  ] = js.native
}

object InputOverrides {
  @scala.inline
  def apply(): InputOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputOverrides]
  }
  @scala.inline
  implicit class InputOverridesOps[Self <: InputOverrides] (val x: Self) extends AnyVal {
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
    def setClearIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("ClearIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIcon: Self = this.set("ClearIcon", js.undefined)
    @scala.inline
    def setClearIconContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("ClearIconContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearIconContainer: Self = this.set("ClearIconContainer", js.undefined)
    @scala.inline
    def setEndEnhancer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("EndEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndEnhancer: Self = this.set("EndEnhancer", js.undefined)
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
    @scala.inline
    def setMaskToggleButton(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("MaskToggleButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskToggleButton: Self = this.set("MaskToggleButton", js.undefined)
    @scala.inline
    def setMaskToggleHideIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("MaskToggleHideIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskToggleHideIcon: Self = this.set("MaskToggleHideIcon", js.undefined)
    @scala.inline
    def setMaskToggleShowIcon(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("MaskToggleShowIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskToggleShowIcon: Self = this.set("MaskToggleShowIcon", js.undefined)
    @scala.inline
    def setRoot(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("Root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("Root", js.undefined)
    @scala.inline
    def setStartEnhancer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<SharedProps> */ js.Any
    ): Self = this.set("StartEnhancer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartEnhancer: Self = this.set("StartEnhancer", js.undefined)
  }
  
}

