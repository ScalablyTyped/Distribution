package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppValidationConfiguration extends StObject {
  
  /**
    * The validation strategy.
    */
  var appValidationStrategy: js.UndefOr[AppValidationStrategy] = js.native
  
  /**
    * The name of the configuration.
    */
  var name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.native
  
  /**
    * The validation parameters.
    */
  var ssmValidationParameters: js.UndefOr[SSMValidationParameters] = js.native
  
  /**
    * The ID of the validation.
    */
  var validationId: js.UndefOr[ValidationId] = js.native
}
object AppValidationConfiguration {
  
  @scala.inline
  def apply(): AppValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppValidationConfiguration]
  }
  
  @scala.inline
  implicit class AppValidationConfigurationMutableBuilder[Self <: AppValidationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppValidationStrategy(value: AppValidationStrategy): Self = StObject.set(x, "appValidationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppValidationStrategyUndefined: Self = StObject.set(x, "appValidationStrategy", js.undefined)
    
    @scala.inline
    def setName(value: NonEmptyStringWithMaxLen255): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSsmValidationParameters(value: SSMValidationParameters): Self = StObject.set(x, "ssmValidationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsmValidationParametersUndefined: Self = StObject.set(x, "ssmValidationParameters", js.undefined)
    
    @scala.inline
    def setValidationId(value: ValidationId): Self = StObject.set(x, "validationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationIdUndefined: Self = StObject.set(x, "validationId", js.undefined)
  }
}
