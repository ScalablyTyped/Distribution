package typings.contractProxyKit.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Web3SpecificConfig
  extends CommonConfig
     with CPKConfig {
  var ownerAccount: js.UndefOr[String] = js.undefined
  var web3: js.Object
}

object Web3SpecificConfig {
  @scala.inline
  def apply(
    web3: js.Object,
    networks: StringDictionary[NetworkConfigEntry] = null,
    ownerAccount: String = null
  ): Web3SpecificConfig = {
    val __obj = js.Dynamic.literal(web3 = web3.asInstanceOf[js.Any])
    if (networks != null) __obj.updateDynamic("networks")(networks.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Web3SpecificConfig]
  }
}

