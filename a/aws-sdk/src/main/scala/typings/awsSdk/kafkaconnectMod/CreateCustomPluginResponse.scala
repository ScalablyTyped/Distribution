package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCustomPluginResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) that Amazon assigned to the custom plugin.
    */
  var customPluginArn: js.UndefOr[string] = js.undefined
  
  /**
    * The state of the custom plugin.
    */
  var customPluginState: js.UndefOr[CustomPluginState] = js.undefined
  
  /**
    * The name of the custom plugin.
    */
  var name: js.UndefOr[string] = js.undefined
  
  /**
    * The revision of the custom plugin.
    */
  var revision: js.UndefOr[long] = js.undefined
}
object CreateCustomPluginResponse {
  
  inline def apply(): CreateCustomPluginResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCustomPluginResponse]
  }
  
  extension [Self <: CreateCustomPluginResponse](x: Self) {
    
    inline def setCustomPluginArn(value: string): Self = StObject.set(x, "customPluginArn", value.asInstanceOf[js.Any])
    
    inline def setCustomPluginArnUndefined: Self = StObject.set(x, "customPluginArn", js.undefined)
    
    inline def setCustomPluginState(value: CustomPluginState): Self = StObject.set(x, "customPluginState", value.asInstanceOf[js.Any])
    
    inline def setCustomPluginStateUndefined: Self = StObject.set(x, "customPluginState", js.undefined)
    
    inline def setName(value: string): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRevision(value: long): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
  }
}
