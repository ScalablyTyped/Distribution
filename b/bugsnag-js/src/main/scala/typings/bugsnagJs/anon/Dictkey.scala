package typings.bugsnagJs.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dictkey extends /* key */ StringDictionary[String] {
  var releaseStage: String
}

object Dictkey {
  @scala.inline
  def apply(releaseStage: String, StringDictionary: /* name */ StringDictionary[String] = null): Dictkey = {
    val __obj = js.Dynamic.literal(releaseStage = releaseStage.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Dictkey]
  }
}

