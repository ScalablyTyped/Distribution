package typings.azure

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey extends /* key */ StringDictionary[String] {
  var VersionEndpointEnvironmentName: String
}

object AnonDictkey {
  @scala.inline
  def apply(
    VersionEndpointEnvironmentName: String,
    StringDictionary: /* key */ StringDictionary[String] = null
  ): AnonDictkey = {
    val __obj = js.Dynamic.literal(VersionEndpointEnvironmentName = VersionEndpointEnvironmentName.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}

