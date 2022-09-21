package typings.awsSdkBuildTypes.customizationMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceCustomizationDefinition extends StObject {
  
  /**
    * The customization definitions that should be applied to a service client.
    */
  var client: js.Array[CustomizationDefinition]
  
  /**
    * The customization definitions that should be applied to individual
    * operations within a service client.
    */
  var commands: StringDictionary[js.Array[CustomizationDefinition]]
}
object ServiceCustomizationDefinition {
  
  inline def apply(
    client: js.Array[CustomizationDefinition],
    commands: StringDictionary[js.Array[CustomizationDefinition]]
  ): ServiceCustomizationDefinition = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCustomizationDefinition]
  }
  
  extension [Self <: ServiceCustomizationDefinition](x: Self) {
    
    inline def setClient(value: js.Array[CustomizationDefinition]): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    
    inline def setClientVarargs(value: CustomizationDefinition*): Self = StObject.set(x, "client", js.Array(value*))
    
    inline def setCommands(value: StringDictionary[js.Array[CustomizationDefinition]]): Self = StObject.set(x, "commands", value.asInstanceOf[js.Any])
  }
}
