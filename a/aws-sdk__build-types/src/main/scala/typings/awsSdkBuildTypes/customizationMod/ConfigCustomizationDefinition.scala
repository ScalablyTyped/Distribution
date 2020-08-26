package typings.awsSdkBuildTypes.customizationMod

import typings.awsSdkBuildTypes.awsSdkBuildTypesStrings.Configuration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigCustomizationDefinition extends CustomizationDefinition {
  var configuration: ConfigurationDefinition = js.native
  var `type`: Configuration = js.native
}

object ConfigCustomizationDefinition {
  @scala.inline
  def apply(configuration: ConfigurationDefinition, `type`: Configuration): ConfigCustomizationDefinition = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigCustomizationDefinition]
  }
  @scala.inline
  implicit class ConfigCustomizationDefinitionOps[Self <: ConfigCustomizationDefinition] (val x: Self) extends AnyVal {
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
    def setConfiguration(value: ConfigurationDefinition): Self = this.set("configuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: Configuration): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

