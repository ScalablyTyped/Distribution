package typings.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionId extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var layouts: js.UndefOr[js.Array[_]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_DescriptionId {
  @scala.inline
  def apply(
    description: String = null,
    id: String = null,
    language: String = null,
    layouts: js.Array[_] = null,
    name: String = null,
    `type`: String = null
  ): Anon_DescriptionId = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (language != null) __obj.updateDynamic("language")(language)
    if (layouts != null) __obj.updateDynamic("layouts")(layouts)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DescriptionId]
  }
}

