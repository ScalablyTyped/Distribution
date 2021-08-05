package typings.classValidator

import typings.classValidator.anon.Target
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object validatorOptionsMod {
  
  trait ValidatorOptions extends StObject {
    
    /**
      * If set to true, the validation will not use default messages.
      * Error message always will be undefined if its not explicitly set.
      */
    var dismissDefaultMessages: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true, instead of stripping non-whitelisted properties validator will throw an error
      */
    var forbidNonWhitelisted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Settings true will cause fail validation of unknown objects.
      */
    var forbidUnknownValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Groups to be used during validation of the object.
      */
    var groups: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * If set to true then validator will skip validation of all properties that are null or undefined in the validating object.
      */
    var skipMissingProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true then validator will skip validation of all properties that are null in the validating object.
      */
    var skipNullProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If set to true then validator will skip validation of all properties that are undefined in the validating object.
      */
    var skipUndefinedProperties: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ValidationError special options.
      */
    var validationError: js.UndefOr[Target] = js.undefined
    
    /**
      * If set to true validator will strip validated object of any properties that do not have any decorators.
      *
      * Tip: if no other decorator is suitable for your property use @Allow decorator.
      */
    var whitelist: js.UndefOr[Boolean] = js.undefined
  }
  object ValidatorOptions {
    
    inline def apply(): ValidatorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ValidatorOptions]
    }
    
    extension [Self <: ValidatorOptions](x: Self) {
      
      inline def setDismissDefaultMessages(value: Boolean): Self = StObject.set(x, "dismissDefaultMessages", value.asInstanceOf[js.Any])
      
      inline def setDismissDefaultMessagesUndefined: Self = StObject.set(x, "dismissDefaultMessages", js.undefined)
      
      inline def setForbidNonWhitelisted(value: Boolean): Self = StObject.set(x, "forbidNonWhitelisted", value.asInstanceOf[js.Any])
      
      inline def setForbidNonWhitelistedUndefined: Self = StObject.set(x, "forbidNonWhitelisted", js.undefined)
      
      inline def setForbidUnknownValues(value: Boolean): Self = StObject.set(x, "forbidUnknownValues", value.asInstanceOf[js.Any])
      
      inline def setForbidUnknownValuesUndefined: Self = StObject.set(x, "forbidUnknownValues", js.undefined)
      
      inline def setGroups(value: js.Array[String]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
      
      inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
      
      inline def setGroupsVarargs(value: String*): Self = StObject.set(x, "groups", js.Array(value :_*))
      
      inline def setSkipMissingProperties(value: Boolean): Self = StObject.set(x, "skipMissingProperties", value.asInstanceOf[js.Any])
      
      inline def setSkipMissingPropertiesUndefined: Self = StObject.set(x, "skipMissingProperties", js.undefined)
      
      inline def setSkipNullProperties(value: Boolean): Self = StObject.set(x, "skipNullProperties", value.asInstanceOf[js.Any])
      
      inline def setSkipNullPropertiesUndefined: Self = StObject.set(x, "skipNullProperties", js.undefined)
      
      inline def setSkipUndefinedProperties(value: Boolean): Self = StObject.set(x, "skipUndefinedProperties", value.asInstanceOf[js.Any])
      
      inline def setSkipUndefinedPropertiesUndefined: Self = StObject.set(x, "skipUndefinedProperties", js.undefined)
      
      inline def setValidationError(value: Target): Self = StObject.set(x, "validationError", value.asInstanceOf[js.Any])
      
      inline def setValidationErrorUndefined: Self = StObject.set(x, "validationError", js.undefined)
      
      inline def setWhitelist(value: Boolean): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
    }
  }
}
