package typings.breeze.breeze

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveOptionsConfiguration extends js.Object {
  var allowConcurrentSaves: js.UndefOr[Boolean] = js.undefined
  var dataService: js.UndefOr[DataService] = js.undefined
  var resourceName: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[js.Object] = js.undefined
}

object SaveOptionsConfiguration {
  @scala.inline
  def apply(
    allowConcurrentSaves: js.UndefOr[Boolean] = js.undefined,
    dataService: DataService = null,
    resourceName: String = null,
    tag: js.Object = null
  ): SaveOptionsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowConcurrentSaves)) __obj.updateDynamic("allowConcurrentSaves")(allowConcurrentSaves.get.asInstanceOf[js.Any])
    if (dataService != null) __obj.updateDynamic("dataService")(dataService.asInstanceOf[js.Any])
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveOptionsConfiguration]
  }
}

