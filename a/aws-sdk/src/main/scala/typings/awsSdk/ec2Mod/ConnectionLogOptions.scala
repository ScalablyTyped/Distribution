package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionLogOptions extends StObject {
  
  /**
    * The name of the CloudWatch Logs log group. Required if connection logging is enabled.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.native
  
  /**
    * The name of the CloudWatch Logs log stream to which the connection data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether connection logging is enabled.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object ConnectionLogOptions {
  
  @scala.inline
  def apply(): ConnectionLogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionLogOptions]
  }
  
  @scala.inline
  implicit class ConnectionLogOptionsMutableBuilder[Self <: ConnectionLogOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchLogGroup(value: String): Self = StObject.set(x, "CloudwatchLogGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLogGroupUndefined: Self = StObject.set(x, "CloudwatchLogGroup", js.undefined)
    
    @scala.inline
    def setCloudwatchLogStream(value: String): Self = StObject.set(x, "CloudwatchLogStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLogStreamUndefined: Self = StObject.set(x, "CloudwatchLogStream", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
