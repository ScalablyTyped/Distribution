package typings.classValidator.validatorOptionsMod

import typings.classValidator.anon.Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidatorOptions extends js.Object {
  
  /**
    * If set to true, the validation will not use default messages.
    * Error message always will be undefined if its not explicitly set.
    */
  var dismissDefaultMessages: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, instead of stripping non-whitelisted properties validator will throw an error
    */
  var forbidNonWhitelisted: js.UndefOr[Boolean] = js.native
  
  /**
    * Settings true will cause fail validation of unknown objects.
    */
  var forbidUnknownValues: js.UndefOr[Boolean] = js.native
  
  /**
    * Groups to be used during validation of the object.
    */
  var groups: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * If set to true then validator will skip validation of all properties that are null or undefined in the validating object.
    */
  var skipMissingProperties: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true then validator will skip validation of all properties that are null in the validating object.
    */
  var skipNullProperties: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true then validator will skip validation of all properties that are undefined in the validating object.
    */
  var skipUndefinedProperties: js.UndefOr[Boolean] = js.native
  
  /**
    * ValidationError special options.
    */
  var validationError: js.UndefOr[Target] = js.native
  
  /**
    * If set to true validator will strip validated object of any properties that do not have any decorators.
    *
    * Tip: if no other decorator is suitable for your property use @Allow decorator.
    */
  var whitelist: js.UndefOr[Boolean] = js.native
}
object ValidatorOptions {
  
  @scala.inline
  def apply(): ValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidatorOptions]
  }
  
  @scala.inline
  implicit class ValidatorOptionsOps[Self <: ValidatorOptions] (val x: Self) extends AnyVal {
    
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
    def setDismissDefaultMessages(value: Boolean): Self = this.set("dismissDefaultMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDismissDefaultMessages: Self = this.set("dismissDefaultMessages", js.undefined)
    
    @scala.inline
    def setForbidNonWhitelisted(value: Boolean): Self = this.set("forbidNonWhitelisted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForbidNonWhitelisted: Self = this.set("forbidNonWhitelisted", js.undefined)
    
    @scala.inline
    def setForbidUnknownValues(value: Boolean): Self = this.set("forbidUnknownValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForbidUnknownValues: Self = this.set("forbidUnknownValues", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: String*): Self = this.set("groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: js.Array[String]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("groups", js.undefined)
    
    @scala.inline
    def setSkipMissingProperties(value: Boolean): Self = this.set("skipMissingProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipMissingProperties: Self = this.set("skipMissingProperties", js.undefined)
    
    @scala.inline
    def setSkipNullProperties(value: Boolean): Self = this.set("skipNullProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipNullProperties: Self = this.set("skipNullProperties", js.undefined)
    
    @scala.inline
    def setSkipUndefinedProperties(value: Boolean): Self = this.set("skipUndefinedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipUndefinedProperties: Self = this.set("skipUndefinedProperties", js.undefined)
    
    @scala.inline
    def setValidationError(value: Target): Self = this.set("validationError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationError: Self = this.set("validationError", js.undefined)
    
    @scala.inline
    def setWhitelist(value: Boolean): Self = this.set("whitelist", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhitelist: Self = this.set("whitelist", js.undefined)
  }
}
