package typings.contractProxyKit.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonConfig extends js.Object {
  var networks: js.UndefOr[StringDictionary[NetworkConfigEntry]] = js.undefined
}

object CommonConfig {
  @scala.inline
  def apply(networks: StringDictionary[NetworkConfigEntry] = null): CommonConfig = {
    val __obj = js.Dynamic.literal()
    if (networks != null) __obj.updateDynamic("networks")(networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonConfig]
  }
}

