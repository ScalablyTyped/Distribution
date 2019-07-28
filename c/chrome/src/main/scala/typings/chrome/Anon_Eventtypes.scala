package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Eventtypes extends js.Object {
  var event_types: js.UndefOr[js.Array[String]] = js.undefined
  var gender: js.UndefOr[String] = js.undefined
  var lang: js.UndefOr[String] = js.undefined
  var voice_name: String
}

object Anon_Eventtypes {
  @scala.inline
  def apply(
    voice_name: String,
    event_types: js.Array[String] = null,
    gender: String = null,
    lang: String = null
  ): Anon_Eventtypes = {
    val __obj = js.Dynamic.literal(voice_name = voice_name)
    if (event_types != null) __obj.updateDynamic("event_types")(event_types)
    if (gender != null) __obj.updateDynamic("gender")(gender)
    if (lang != null) __obj.updateDynamic("lang")(lang)
    __obj.asInstanceOf[Anon_Eventtypes]
  }
}

