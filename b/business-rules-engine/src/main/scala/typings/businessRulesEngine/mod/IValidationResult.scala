package typings.businessRulesEngine.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IValidationResult extends js.Object {
  var Children: js.Array[IValidationResult] = js.native
  var ErrorCount: Double = js.native
  var ErrorMessage: String = js.native
  var HasErrors: Boolean = js.native
  var HasErrorsDirty: Boolean = js.native
  var Name: String = js.native
  var Optional: js.UndefOr[IOptional] = js.native
  var TranslateArgs: js.UndefOr[js.Array[IErrorTranslateArgs]] = js.native
  def Add(validationResult: IValidationResult): Unit = js.native
  def Remove(index: Double): Unit = js.native
}

object IValidationResult {
  @scala.inline
  def apply(
    Add: IValidationResult => Unit,
    Children: js.Array[IValidationResult],
    ErrorCount: Double,
    ErrorMessage: String,
    HasErrors: Boolean,
    HasErrorsDirty: Boolean,
    Name: String,
    Remove: Double => Unit
  ): IValidationResult = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Children = Children.asInstanceOf[js.Any], ErrorCount = ErrorCount.asInstanceOf[js.Any], ErrorMessage = ErrorMessage.asInstanceOf[js.Any], HasErrors = HasErrors.asInstanceOf[js.Any], HasErrorsDirty = HasErrorsDirty.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Remove = js.Any.fromFunction1(Remove))
    __obj.asInstanceOf[IValidationResult]
  }
  @scala.inline
  implicit class IValidationResultOps[Self <: IValidationResult] (val x: Self) extends AnyVal {
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
    def setAdd(value: IValidationResult => Unit): Self = this.set("Add", js.Any.fromFunction1(value))
    @scala.inline
    def setChildrenVarargs(value: IValidationResult*): Self = this.set("Children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[IValidationResult]): Self = this.set("Children", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCount(value: Double): Self = this.set("ErrorCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasErrors(value: Boolean): Self = this.set("HasErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasErrorsDirty(value: Boolean): Self = this.set("HasErrorsDirty", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemove(value: Double => Unit): Self = this.set("Remove", js.Any.fromFunction1(value))
    @scala.inline
    def setOptional(value: () => Boolean): Self = this.set("Optional", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOptional: Self = this.set("Optional", js.undefined)
    @scala.inline
    def setTranslateArgsVarargs(value: IErrorTranslateArgs*): Self = this.set("TranslateArgs", js.Array(value :_*))
    @scala.inline
    def setTranslateArgs(value: js.Array[IErrorTranslateArgs]): Self = this.set("TranslateArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslateArgs: Self = this.set("TranslateArgs", js.undefined)
  }
  
}

