package typings.awsSdk.codepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionConfiguration extends StObject {
  
  /**
    * The configuration data for the action.
    */
  var configuration: js.UndefOr[ActionConfigurationMap] = js.undefined
}
object ActionConfiguration {
  
  @scala.inline
  def apply(): ActionConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActionConfiguration]
  }
  
  @scala.inline
  implicit class ActionConfigurationMutableBuilder[Self <: ActionConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: ActionConfigurationMap): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigurationUndefined: Self = StObject.set(x, "configuration", js.undefined)
  }
}
