package typings.awsSdk.managedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LogConfigurations extends StObject {
  
  /**
    * Parameters for publishing logs to Amazon CloudWatch Logs.
    */
  var Cloudwatch: js.UndefOr[LogConfiguration] = js.native
}
object LogConfigurations {
  
  @scala.inline
  def apply(): LogConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigurations]
  }
  
  @scala.inline
  implicit class LogConfigurationsMutableBuilder[Self <: LogConfigurations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatch(value: LogConfiguration): Self = StObject.set(x, "Cloudwatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchUndefined: Self = StObject.set(x, "Cloudwatch", js.undefined)
  }
}
