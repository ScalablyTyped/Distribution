package typings.chrome.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Eventtypes extends js.Object {
  var event_types: js.UndefOr[js.Array[String]] = js.undefined
  var gender: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var voice_name: String
}

object Eventtypes {
  @scala.inline
  def apply(
    voice_name: String,
    event_types: js.Array[String] = null,
    gender: String = null,
    lang: String = null
  ): Eventtypes = {
    val __obj = js.Dynamic.literal(voice_name = voice_name.asInstanceOf[js.Any])
    if (event_types != null) __obj.updateDynamic("event_types")(event_types.asInstanceOf[js.Any])
    if (gender != null) __obj.updateDynamic("gender")(gender.asInstanceOf[js.Any])
    if (lang != null) __obj.updateDynamic("lang")(lang.asInstanceOf[js.Any])
    __obj.asInstanceOf[Eventtypes]
  }
}

