package typings.awsSdkBuildTypes.customizationMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceCustomizationDefinition extends js.Object {
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
  @scala.inline
  def apply(
    client: js.Array[CustomizationDefinition],
    commands: StringDictionary[js.Array[CustomizationDefinition]]
  ): ServiceCustomizationDefinition = {
    val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], commands = commands.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceCustomizationDefinition]
  }
}

