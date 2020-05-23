package typings.azureArmResource.anon

import org.scalablytyped.runtime.StringDictionary
import typings.azureArmResource.libModelsMod.Appliance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Parameters extends js.Object {
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.undefined
  var parameters: js.UndefOr[Appliance] = js.undefined
}

object Parameters {
  @scala.inline
  def apply(customHeaders: StringDictionary[String] = null, parameters: Appliance = null): Parameters = {
    val __obj = js.Dynamic.literal()
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parameters]
  }
}

