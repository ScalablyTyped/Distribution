package typings.awsSdk.pinpointsmsvoiceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateConfigurationSetRequest extends StObject {
  
  /**
    * The name that you want to give the configuration set.
    */
  var ConfigurationSetName: js.UndefOr[WordCharactersWithDelimiters] = js.native
}
object CreateConfigurationSetRequest {
  
  @scala.inline
  def apply(): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
  
  @scala.inline
  implicit class CreateConfigurationSetRequestMutableBuilder[Self <: CreateConfigurationSetRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurationSetName(value: WordCharactersWithDelimiters): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
  }
}
