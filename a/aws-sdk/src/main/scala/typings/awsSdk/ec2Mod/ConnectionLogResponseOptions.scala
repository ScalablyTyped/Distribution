package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionLogResponseOptions extends StObject {
  
  /**
    * The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.native
  
  /**
    * The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether client connection logging is enabled for the Client VPN endpoint.
    */
  var Enabled: js.UndefOr[Boolean] = js.native
}
object ConnectionLogResponseOptions {
  
  @scala.inline
  def apply(): ConnectionLogResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionLogResponseOptions]
  }
  
  @scala.inline
  implicit class ConnectionLogResponseOptionsMutableBuilder[Self <: ConnectionLogResponseOptions] (val x: Self) extends AnyVal {
    
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
