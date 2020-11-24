package typings.cathoQuantum.inputMod

import typings.cathoQuantum.anon.BaseFontSizeColors
import typings.cathoQuantum.anon.MaxLength
import typings.cathoQuantum.anon.MinLength
import typings.cathoQuantum.anon.Value
import typings.cathoQuantum.anon.ValueString
import typings.cathoQuantum.cathoQuantumStrings.email
import typings.cathoQuantum.cathoQuantumStrings.number
import typings.cathoQuantum.cathoQuantumStrings.password
import typings.cathoQuantum.cathoQuantumStrings.search
import typings.cathoQuantum.cathoQuantumStrings.tel
import typings.cathoQuantum.cathoQuantumStrings.text
import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InputProps extends js.Object {
  
  var descriptionLabel: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[String] = js.native
  
  var helperText: js.UndefOr[String] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var mask: js.UndefOr[Mask | js.Array[Mask]] = js.native
  
  var maxLength: js.UndefOr[Double | String] = js.native
  
  var minLength: js.UndefOr[Double | String] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.native
  
  var onClean: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.native
  
  var placeholder: js.UndefOr[String] = js.native
  
  var required: js.UndefOr[Boolean] = js.native
  
  var theme: js.UndefOr[BaseFontSizeColors] = js.native
  
  var `type`: js.UndefOr[email | text | tel | number | password | search] = js.native
  
  var validate: js.UndefOr[Validate | CustomValidate | (js.Array[Validate | CustomValidate])] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object InputProps {
  
  @scala.inline
  def apply(): InputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputProps]
  }
  
  @scala.inline
  implicit class InputPropsOps[Self <: InputProps] (val x: Self) extends AnyVal {
    
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
    def setDescriptionLabel(value: String): Self = this.set("descriptionLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionLabel: Self = this.set("descriptionLabel", js.undefined)
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setHelperText(value: String): Self = this.set("helperText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHelperText: Self = this.set("helperText", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMaskVarargs(value: Mask*): Self = this.set("mask", js.Array(value :_*))
    
    @scala.inline
    def setMaskFunction1(value: /* rawValue */ String => js.Array[String]): Self = this.set("mask", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMask(value: Mask | js.Array[Mask]): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setMaxLength(value: Double | String): Self = this.set("maxLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLength: Self = this.set("maxLength", js.undefined)
    
    @scala.inline
    def setMinLength(value: Double | String): Self = this.set("minLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnClean(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = this.set("onClean", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClean: Self = this.set("onClean", js.undefined)
    
    @scala.inline
    def setPlaceholder(value: String): Self = this.set("placeholder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlaceholder: Self = this.set("placeholder", js.undefined)
    
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    
    @scala.inline
    def setTheme(value: BaseFontSizeColors): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    
    @scala.inline
    def setType(value: email | text | tel | number | password | search): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    
    @scala.inline
    def setValidateVarargs(value: (Validate | CustomValidate)*): Self = this.set("validate", js.Array(value :_*))
    
    @scala.inline
    def setValidateFunction2(value: (/* params */ Value, /* cpf */ js.UndefOr[String]) => String): Self = this.set("validate", js.Any.fromFunction2(value))
    
    @scala.inline
    def setValidateFunction1(
      value: js.UndefOr[
          (/* params */ MaxLength) | (/* params */ MinLength) | (/* params */ Value) | ValueString
        ] => String
    ): Self = this.set("validate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(value: Validate | CustomValidate | (js.Array[Validate | CustomValidate])): Self = this.set("validate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidate: Self = this.set("validate", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
