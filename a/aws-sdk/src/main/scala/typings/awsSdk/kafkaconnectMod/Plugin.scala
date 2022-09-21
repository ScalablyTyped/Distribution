package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Plugin extends StObject {
  
  /**
    * Details about a custom plugin.
    */
  var customPlugin: CustomPlugin
}
object Plugin {
  
  inline def apply(customPlugin: CustomPlugin): Plugin = {
    val __obj = js.Dynamic.literal(customPlugin = customPlugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  extension [Self <: Plugin](x: Self) {
    
    inline def setCustomPlugin(value: CustomPlugin): Self = StObject.set(x, "customPlugin", value.asInstanceOf[js.Any])
  }
}
