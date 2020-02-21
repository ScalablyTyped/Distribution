package typings.contractProxyKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.contractProxyKit.Typeofethers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.contractProxyKit.mod.Web3SpecificConfig
  - typings.contractProxyKit.mod.EthersSpecificConfig
*/
trait CPKConfig extends js.Object

object CPKConfig {
  @scala.inline
  def Web3SpecificConfig(
    web3: js.Object,
    networks: StringDictionary[NetworkConfigEntry] = null,
    ownerAccount: String = null
  ): CPKConfig = {
    val __obj = js.Dynamic.literal(web3 = web3.asInstanceOf[js.Any])
    if (networks != null) __obj.updateDynamic("networks")(networks.asInstanceOf[js.Any])
    if (ownerAccount != null) __obj.updateDynamic("ownerAccount")(ownerAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPKConfig]
  }
  @scala.inline
  def EthersSpecificConfig(
    ethers: Typeofethers,
    signer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.Signer */ js.Any,
    networks: StringDictionary[NetworkConfigEntry] = null
  ): CPKConfig = {
    val __obj = js.Dynamic.literal(ethers = ethers.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
    if (networks != null) __obj.updateDynamic("networks")(networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPKConfig]
  }
}

