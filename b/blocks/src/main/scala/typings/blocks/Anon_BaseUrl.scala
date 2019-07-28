package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var create: js.UndefOr[Anon_Url] = js.undefined
  var destroy: js.UndefOr[Anon_Url] = js.undefined
  var idAttr: js.UndefOr[String] = js.undefined
  var read: js.UndefOr[Anon_Url] = js.undefined
  var update: js.UndefOr[Anon_Url] = js.undefined
}

object Anon_BaseUrl {
  @scala.inline
  def apply(
    baseUrl: String = null,
    create: Anon_Url = null,
    destroy: Anon_Url = null,
    idAttr: String = null,
    read: Anon_Url = null,
    update: Anon_Url = null
  ): Anon_BaseUrl = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl)
    if (create != null) __obj.updateDynamic("create")(create)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (idAttr != null) __obj.updateDynamic("idAttr")(idAttr)
    if (read != null) __obj.updateDynamic("read")(read)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[Anon_BaseUrl]
  }
}

