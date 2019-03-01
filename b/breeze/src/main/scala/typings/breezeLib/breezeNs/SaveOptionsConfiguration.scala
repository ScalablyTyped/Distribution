package typings
package breezeLib.breezeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptionsConfiguration extends js.Object {
  var allowConcurrentSaves: js.UndefOr[scala.Boolean] = js.undefined
  var dataService: js.UndefOr[DataService] = js.undefined
  var resourceName: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[js.Object] = js.undefined
}

object SaveOptionsConfiguration {
  @scala.inline
  def apply(
    allowConcurrentSaves: js.UndefOr[scala.Boolean] = js.undefined,
    dataService: DataService = null,
    resourceName: java.lang.String = null,
    tag: js.Object = null
  ): SaveOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowConcurrentSaves)) __obj.updateDynamic("allowConcurrentSaves")(allowConcurrentSaves)
    if (dataService != null) __obj.updateDynamic("dataService")(dataService)
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[SaveOptionsConfiguration]
  }
}

