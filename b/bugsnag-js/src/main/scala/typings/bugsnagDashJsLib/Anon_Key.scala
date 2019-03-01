package typings
package bugsnagDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Key
  extends /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] {
  var releaseStage: java.lang.String
}

object Anon_Key {
  @scala.inline
  def apply(
    releaseStage: java.lang.String,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Anon_Key = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("releaseStage")(releaseStage)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[Anon_Key]
  }
}

