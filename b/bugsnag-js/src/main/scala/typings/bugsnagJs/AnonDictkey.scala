package typings.bugsnagJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictkey extends /* key */ StringDictionary[String] {
  var releaseStage: String
}

object AnonDictkey {
  @scala.inline
  def apply(releaseStage: String, StringDictionary: /* key */ StringDictionary[String] = null): AnonDictkey = {
    val __obj = js.Dynamic.literal(releaseStage = releaseStage.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[AnonDictkey]
  }
}

