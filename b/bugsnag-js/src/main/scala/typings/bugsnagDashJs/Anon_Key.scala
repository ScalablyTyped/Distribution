package typings.bugsnagDashJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key extends /* key */ StringDictionary[String] {
  var releaseStage: String
}

object Anon_Key {
  @scala.inline
  def apply(releaseStage: String, StringDictionary: /* key */ StringDictionary[String] = null): Anon_Key = {
    val __obj = js.Dynamic.literal(releaseStage = releaseStage.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

