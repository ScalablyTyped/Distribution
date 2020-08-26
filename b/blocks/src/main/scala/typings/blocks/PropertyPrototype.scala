package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/////////////////////////////////////////
// App.Property
/////////////////////////////////////////
@js.native
trait PropertyPrototype extends js.Object {
  var creditcard: js.UndefOr[Validator] = js.native
  var date: js.UndefOr[Validator] = js.native
  var defaultValue: js.UndefOr[js.Any] = js.native
  var digits: js.UndefOr[Validator] = js.native
  var email: js.UndefOr[Validator] = js.native
  @JSName("equals")
  var equals_FPropertyPrototype: js.UndefOr[Validator] = js.native
  var field: js.UndefOr[String] = js.native
  var isObservable: js.UndefOr[Boolean] = js.native
  var letters: js.UndefOr[Validator] = js.native
  var max: js.UndefOr[Validator] = js.native
  var maxErrors: js.UndefOr[Double] = js.native
  var maxlength: js.UndefOr[Validator] = js.native
  var min: js.UndefOr[Validator] = js.native
  var minlength: js.UndefOr[Validator] = js.native
  var number: js.UndefOr[Validator] = js.native
  var regexp: js.UndefOr[Validator] = js.native
  // Validators
  var required: js.UndefOr[Validator] = js.native
  var url: js.UndefOr[Validator] = js.native
  var validateInitially: js.UndefOr[Boolean] = js.native
  var validateOnChange: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object PropertyPrototype {
  @scala.inline
  def apply(): PropertyPrototype = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PropertyPrototype]
  }
  @scala.inline
  implicit class PropertyPrototypeOps[Self <: PropertyPrototype] (val x: Self) extends AnyVal {
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
    def setCreditcard(value: Validator): Self = this.set("creditcard", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreditcard: Self = this.set("creditcard", js.undefined)
    @scala.inline
    def setDate(value: Validator): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    @scala.inline
    def setDefaultValue(value: js.Any): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDigits(value: Validator): Self = this.set("digits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDigits: Self = this.set("digits", js.undefined)
    @scala.inline
    def setEmail(value: Validator): Self = this.set("email", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    @scala.inline
    def setEquals(value: Validator): Self = this.set("equals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    @scala.inline
    def setField(value: String): Self = this.set("field", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteField: Self = this.set("field", js.undefined)
    @scala.inline
    def setIsObservable(value: Boolean): Self = this.set("isObservable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsObservable: Self = this.set("isObservable", js.undefined)
    @scala.inline
    def setLetters(value: Validator): Self = this.set("letters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLetters: Self = this.set("letters", js.undefined)
    @scala.inline
    def setMax(value: Validator): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMaxErrors(value: Double): Self = this.set("maxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxErrors: Self = this.set("maxErrors", js.undefined)
    @scala.inline
    def setMaxlength(value: Validator): Self = this.set("maxlength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxlength: Self = this.set("maxlength", js.undefined)
    @scala.inline
    def setMin(value: Validator): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMinlength(value: Validator): Self = this.set("minlength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinlength: Self = this.set("minlength", js.undefined)
    @scala.inline
    def setNumber(value: Validator): Self = this.set("number", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
    @scala.inline
    def setRegexp(value: Validator): Self = this.set("regexp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegexp: Self = this.set("regexp", js.undefined)
    @scala.inline
    def setRequired(value: Validator): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setUrl(value: Validator): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setValidateInitially(value: Boolean): Self = this.set("validateInitially", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateInitially: Self = this.set("validateInitially", js.undefined)
    @scala.inline
    def setValidateOnChange(value: Boolean): Self = this.set("validateOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnChange: Self = this.set("validateOnChange", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

