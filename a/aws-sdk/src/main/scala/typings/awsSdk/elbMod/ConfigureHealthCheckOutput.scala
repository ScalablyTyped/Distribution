package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigureHealthCheckOutput extends StObject {
  
  /**
    * The updated health check.
    */
  var HealthCheck: js.UndefOr[typings.awsSdk.elbMod.HealthCheck] = js.native
}
object ConfigureHealthCheckOutput {
  
  @scala.inline
  def apply(): ConfigureHealthCheckOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureHealthCheckOutput]
  }
  
  @scala.inline
  implicit class ConfigureHealthCheckOutputMutableBuilder[Self <: ConfigureHealthCheckOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthCheckUndefined: Self = StObject.set(x, "HealthCheck", js.undefined)
  }
}
