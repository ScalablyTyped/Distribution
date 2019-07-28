package typings.breeze

import typings.breeze.breezeNs.DataService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowConcurrentSaves extends js.Object {
  var allowConcurrentSaves: js.UndefOr[Boolean] = js.undefined
  var dataService: js.UndefOr[DataService] = js.undefined
  var resourceName: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[js.Any] = js.undefined
}

object Anon_AllowConcurrentSaves {
  @scala.inline
  def apply(
    allowConcurrentSaves: js.UndefOr[Boolean] = js.undefined,
    dataService: DataService = null,
    resourceName: String = null,
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

