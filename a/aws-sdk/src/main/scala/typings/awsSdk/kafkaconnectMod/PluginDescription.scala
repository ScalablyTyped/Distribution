package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluginDescription extends StObject {
  
  /**
    * Details about a custom plugin.
    */
  var customPlugin: js.UndefOr[CustomPluginDescription] = js.undefined
}
object PluginDescription {
  
  inline def apply(): PluginDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PluginDescription]
  }
  
  extension [Self <: PluginDescription](x: Self) {
    
    inline def setCustomPlugin(value: CustomPluginDescription): Self = StObject.set(x, "customPlugin", value.asInstanceOf[js.Any])
    
    inline def setCustomPluginUndefined: Self = StObject.set(x, "customPlugin", js.undefined)
  }
}
