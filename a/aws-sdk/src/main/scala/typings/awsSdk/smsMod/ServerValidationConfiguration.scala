package typings.awsSdk.smsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerValidationConfiguration extends StObject {
  
  /**
    * The name of the configuration.
    */
  var name: js.UndefOr[NonEmptyStringWithMaxLen255] = js.native
  
  var server: js.UndefOr[Server] = js.native
  
  /**
    * The validation strategy.
    */
  var serverValidationStrategy: js.UndefOr[ServerValidationStrategy] = js.native
  
  /**
    * The validation parameters.
    */
  var userDataValidationParameters: js.UndefOr[UserDataValidationParameters] = js.native
  
  /**
    * The ID of the validation.
    */
  var validationId: js.UndefOr[ValidationId] = js.native
}
object ServerValidationConfiguration {
  
  @scala.inline
  def apply(): ServerValidationConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServerValidationConfiguration]
  }
  
  @scala.inline
  implicit class ServerValidationConfigurationMutableBuilder[Self <: ServerValidationConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NonEmptyStringWithMaxLen255): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
    
    @scala.inline
    def setServerValidationStrategy(value: ServerValidationStrategy): Self = StObject.set(x, "serverValidationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerValidationStrategyUndefined: Self = StObject.set(x, "serverValidationStrategy", js.undefined)
    
    @scala.inline
    def setUserDataValidationParameters(value: UserDataValidationParameters): Self = StObject.set(x, "userDataValidationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataValidationParametersUndefined: Self = StObject.set(x, "userDataValidationParameters", js.undefined)
    
    @scala.inline
    def setValidationId(value: ValidationId): Self = StObject.set(x, "validationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationIdUndefined: Self = StObject.set(x, "validationId", js.undefined)
  }
}
