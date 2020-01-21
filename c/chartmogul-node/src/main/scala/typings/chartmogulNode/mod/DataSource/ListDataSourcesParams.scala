package typings.chartmogulNode.mod.DataSource

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataSourcesParams extends js.Object {
  var name: js.UndefOr[String] = js.undefined
  var system: js.UndefOr[String] = js.undefined
}

object ListDataSourcesParams {
  @scala.inline
  def apply(name: String = null, system: String = null): ListDataSourcesParams = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (system != null) __obj.updateDynamic("system")(system.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSourcesParams]
  }
}

