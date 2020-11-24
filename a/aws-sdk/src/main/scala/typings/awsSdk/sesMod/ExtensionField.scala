package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtensionField extends js.Object {
  
  /**
    * The name of the header to add. Must be between 1 and 50 characters, inclusive, and consist of alphanumeric (a-z, A-Z, 0-9) characters and dashes only.
    */
  var Name: ExtensionFieldName = js.native
  
  /**
    * The value of the header to add. Must be less than 2048 characters, and must not contain newline characters ("\r" or "\n").
    */
  var Value: ExtensionFieldValue = js.native
}
object ExtensionField {
  
  @scala.inline
  def apply(Name: ExtensionFieldName, Value: ExtensionFieldValue): ExtensionField = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionField]
  }
  
  @scala.inline
  implicit class ExtensionFieldOps[Self <: ExtensionField] (val x: Self) extends AnyVal {
    
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
    def setName(value: ExtensionFieldName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: ExtensionFieldValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
