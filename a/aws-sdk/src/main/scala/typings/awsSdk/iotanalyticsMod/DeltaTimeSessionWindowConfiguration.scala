package typings.awsSdk.iotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeltaTimeSessionWindowConfiguration extends StObject {
  
  /**
    * A time interval. You can use timeoutInMinutes so that AWS IoT Analytics can batch up late data notifications that have been generated since the last execution. AWS IoT Analytics sends one batch of notifications to Amazon CloudWatch Events at one time. For more information about how to write a timestamp expression, see Date and Time Functions and Operators, in the Presto 0.172 Documentation.
    */
  var timeoutInMinutes: SessionTimeoutInMinutes = js.native
}
object DeltaTimeSessionWindowConfiguration {
  
  @scala.inline
  def apply(timeoutInMinutes: SessionTimeoutInMinutes): DeltaTimeSessionWindowConfiguration = {
    val __obj = js.Dynamic.literal(timeoutInMinutes = timeoutInMinutes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaTimeSessionWindowConfiguration]
  }
  
  @scala.inline
  implicit class DeltaTimeSessionWindowConfigurationMutableBuilder[Self <: DeltaTimeSessionWindowConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTimeoutInMinutes(value: SessionTimeoutInMinutes): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
  }
}
