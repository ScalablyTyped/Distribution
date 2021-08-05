package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionLogResponseOptions extends StObject {
  
  /**
    * The name of the Amazon CloudWatch Logs log group to which connection logging data is published.
    */
  var CloudwatchLogGroup: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the Amazon CloudWatch Logs log stream to which connection logging data is published.
    */
  var CloudwatchLogStream: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates whether client connection logging is enabled for the Client VPN endpoint.
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
}
object ConnectionLogResponseOptions {
  
  inline def apply(): ConnectionLogResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionLogResponseOptions]
  }
  
  extension [Self <: ConnectionLogResponseOptions](x: Self) {
    
    inline def setCloudwatchLogGroup(value: String): Self = StObject.set(x, "CloudwatchLogGroup", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLogGroupUndefined: Self = StObject.set(x, "CloudwatchLogGroup", js.undefined)
    
    inline def setCloudwatchLogStream(value: String): Self = StObject.set(x, "CloudwatchLogStream", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLogStreamUndefined: Self = StObject.set(x, "CloudwatchLogStream", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
  }
}
