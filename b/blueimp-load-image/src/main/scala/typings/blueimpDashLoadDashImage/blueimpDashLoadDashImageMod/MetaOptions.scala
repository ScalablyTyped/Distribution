package typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod

import typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageBooleans.`false`
import typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod.MetaTrueOptions
  - typings.blueimpDashLoadDashImage.blueimpDashLoadDashImageMod.MetaFalseOptions
*/
trait MetaOptions extends js.Object

object MetaOptions {
  @scala.inline
  def MetaTrueOptions(orientation: Orientation, meta: `true` = null): MetaOptions = {
    val __obj = js.Dynamic.literal(orientation = orientation.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaOptions]
  }
  @scala.inline
  def MetaFalseOptions(meta: `false` = null): MetaOptions = {
    val __obj = js.Dynamic.literal()
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaOptions]
  }
}

