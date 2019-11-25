package typings.cryptex

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataKey extends js.Object {
  var dataKey: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
}

object Anon_DataKey {
  @scala.inline
  def apply(dataKey: String = null, region: String = null): Anon_DataKey = {
    val __obj = js.Dynamic.literal()
    if (dataKey != null) __obj.updateDynamic("dataKey")(dataKey.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DataKey]
  }
}

