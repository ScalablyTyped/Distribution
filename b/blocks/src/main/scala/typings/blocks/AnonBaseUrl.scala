package typings.blocks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBaseUrl extends js.Object {
  var baseUrl: js.UndefOr[String] = js.undefined
  var create: js.UndefOr[AnonUrl] = js.undefined
  var destroy: js.UndefOr[AnonUrl] = js.undefined
  var idAttr: js.UndefOr[String] = js.undefined
  var read: js.UndefOr[AnonUrl] = js.undefined
  var update: js.UndefOr[AnonUrl] = js.undefined
}

object AnonBaseUrl {
  @scala.inline
  def apply(
    baseUrl: String = null,
    create: AnonUrl = null,
    destroy: AnonUrl = null,
    idAttr: String = null,
    read: AnonUrl = null,
    update: AnonUrl = null
  ): AnonBaseUrl = {
    val __obj = js.Dynamic.literal()
    if (baseUrl != null) __obj.updateDynamic("baseUrl")(baseUrl.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy.asInstanceOf[js.Any])
    if (idAttr != null) __obj.updateDynamic("idAttr")(idAttr.asInstanceOf[js.Any])
    if (read != null) __obj.updateDynamic("read")(read.asInstanceOf[js.Any])
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBaseUrl]
  }
}

