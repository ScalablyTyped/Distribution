package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCustomPluginRequest extends StObject {
  
  /**
    * Returns information about a custom plugin.
    */
  var customPluginArn: string
}
object DescribeCustomPluginRequest {
  
  inline def apply(customPluginArn: string): DescribeCustomPluginRequest = {
    val __obj = js.Dynamic.literal(customPluginArn = customPluginArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCustomPluginRequest]
  }
  
  extension [Self <: DescribeCustomPluginRequest](x: Self) {
    
    inline def setCustomPluginArn(value: string): Self = StObject.set(x, "customPluginArn", value.asInstanceOf[js.Any])
  }
}
