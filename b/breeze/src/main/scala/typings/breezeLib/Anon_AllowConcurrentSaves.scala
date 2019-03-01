package typings
package breezeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowConcurrentSaves extends js.Object {
  var allowConcurrentSaves: js.UndefOr[scala.Boolean] = js.undefined
  var dataService: js.UndefOr[breezeLib.breezeNs.DataService] = js.undefined
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object Anon_AllowConcurrentSaves {
  @scala.inline
  def apply(
    allowConcurrentSaves: js.UndefOr[scala.Boolean] = js.undefined,
    dataService: breezeLib.breezeNs.DataService = null,
    resourceName: java.lang.String = null,
    tag: js.Any = null
  ): Anon_AllowConcurrentSaves = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowConcurrentSaves)) __obj.updateDynamic("allowConcurrentSaves")(allowConcurrentSaves)
    if (dataService != null) __obj.updateDynamic("dataService")(dataService)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[Anon_AllowConcurrentSaves]
  }
}

