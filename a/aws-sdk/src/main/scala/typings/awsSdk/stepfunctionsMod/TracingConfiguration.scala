package typings.awsSdk.stepfunctionsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TracingConfiguration extends StObject {
  
  /**
    * When set to true, AWS X-Ray tracing is enabled.
    */
  var enabled: js.UndefOr[Enabled] = js.undefined
}
object TracingConfiguration {
  
  @scala.inline
  def apply(): TracingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TracingConfiguration]
  }
  
  @scala.inline
  implicit class TracingConfigurationMutableBuilder[Self <: TracingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Enabled): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
