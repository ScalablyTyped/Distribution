package typings.azdata.mod.nb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKernelInfo extends js.Object {
  var display_name: js.UndefOr[String] = js.undefined
  var language: js.UndefOr[String] = js.undefined
  var name: String
}

object IKernelInfo {
  @scala.inline
  def apply(name: String, display_name: String = null, language: String = null): IKernelInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (display_name != null) __obj.updateDynamic("display_name")(display_name.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKernelInfo]
  }
}

