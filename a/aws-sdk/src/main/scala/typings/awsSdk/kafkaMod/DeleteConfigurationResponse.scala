package typings.awsSdk.kafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConfigurationResponse extends StObject {
  
  /**
    * 
    The Amazon Resource Name (ARN) that uniquely identifies an MSK configuration.
    
    */
  var Arn: js.UndefOr[string] = js.undefined
  
  /**
    * 
    The state of the configuration. The possible states are ACTIVE, DELETING, and DELETE_FAILED. 
    
    */
  var State: js.UndefOr[ConfigurationState] = js.undefined
}
object DeleteConfigurationResponse {
  
  @scala.inline
  def apply(): DeleteConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteConfigurationResponse]
  }
  
  @scala.inline
  implicit class DeleteConfigurationResponseMutableBuilder[Self <: DeleteConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArn(value: string): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    @scala.inline
    def setState(value: ConfigurationState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
