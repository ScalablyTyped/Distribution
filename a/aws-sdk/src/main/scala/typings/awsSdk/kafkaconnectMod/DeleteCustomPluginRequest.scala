package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCustomPluginRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom plugin that you want to delete.
    */
  var customPluginArn: string
}
object DeleteCustomPluginRequest {
  
  inline def apply(customPluginArn: string): DeleteCustomPluginRequest = {
    val __obj = js.Dynamic.literal(customPluginArn = customPluginArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCustomPluginRequest]
  }
  
  extension [Self <: DeleteCustomPluginRequest](x: Self) {
    
    inline def setCustomPluginArn(value: string): Self = StObject.set(x, "customPluginArn", value.asInstanceOf[js.Any])
  }
}
