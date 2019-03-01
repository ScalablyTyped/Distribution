package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionId extends js.Object {
  var description: js.UndefOr[java.lang.String] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var language: js.UndefOr[java.lang.String] = js.undefined
  var layouts: js.UndefOr[js.Array[_]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_DescriptionId {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    id: java.lang.String = null,
    language: java.lang.String = null,
    layouts: js.Array[_] = null,
    name: java.lang.String = null,
    `type`: java.lang.String = null
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

