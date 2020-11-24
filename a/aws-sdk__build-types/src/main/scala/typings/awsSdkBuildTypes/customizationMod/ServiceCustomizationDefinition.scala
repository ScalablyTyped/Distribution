package typings.awsSdkBuildTypes.customizationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceCustomizationDefinition extends js.Object {
  
  /**
    * The customization definitions that should be applied to a service client.
    */
  var client: js.Array[CustomizationDefinition] = js.native
  
  /**
    * The customization definitions that should be applied to individual
    * operations within a service client.
    */
  var commands: StringDictionary[js.Array[CustomizationDefinition]] = js.native
}
object ServiceCustomizationDefinition {
  
  @scala.inline
  def apply(
    client: js.Array[CustomizationDefinition],
    commands: StringDictionary[js.Array[CustomizationDefinition]]
  ): ServiceCustomizationDefinition = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCustomizationDefinition]
  }
  
  @scala.inline
  implicit class ServiceCustomizationDefinitionOps[Self <: ServiceCustomizationDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClientVarargs(value: CustomizationDefinition*): Self = this.set("client", js.Array(value :_*))
    
    @scala.inline
    def setClient(value: js.Array[CustomizationDefinition]): Self = this.set("client", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommands(value: StringDictionary[js.Array[CustomizationDefinition]]): Self = this.set("commands", value.asInstanceOf[js.Any])
  }
}
