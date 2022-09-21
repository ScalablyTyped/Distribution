package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomPlugin extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the custom plugin.
    */
  var customPluginArn: string
  
  /**
    * The revision of the custom plugin.
    */
  var revision: longMin1
}
object CustomPlugin {
  
  inline def apply(customPluginArn: string, revision: longMin1): CustomPlugin = {
    val __obj = js.Dynamic.literal(customPluginArn = customPluginArn.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomPlugin]
  }
  
  extension [Self <: CustomPlugin](x: Self) {
    
    inline def setCustomPluginArn(value: string): Self = StObject.set(x, "customPluginArn", value.asInstanceOf[js.Any])
    
    inline def setRevision(value: longMin1): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
  }
}
