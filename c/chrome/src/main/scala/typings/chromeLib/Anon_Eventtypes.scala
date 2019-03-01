package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Eventtypes extends js.Object {
  var event_types: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var gender: js.UndefOr[java.lang.String] = js.undefined
  var lang: js.UndefOr[java.lang.String] = js.undefined
  var voice_name: java.lang.String
}

object Anon_Eventtypes {
  @scala.inline
  def apply(
    voice_name: java.lang.String,
    event_types: js.Array[java.lang.String] = null,
    gender: java.lang.String = null,
    lang: java.lang.String = null
  ): Anon_Eventtypes = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("voice_name")(voice_name)
    if (event_types != null) __obj.updateDynamic("event_types")(event_types)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    __obj.asInstanceOf[Anon_Eventtypes]
  }
}

