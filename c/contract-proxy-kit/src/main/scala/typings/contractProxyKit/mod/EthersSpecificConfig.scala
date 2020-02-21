package typings.contractProxyKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.contractProxyKit.Typeofethers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EthersSpecificConfig
  extends CommonConfig
     with CPKConfig {
  var ethers: Typeofethers
  var signer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.Signer */ js.Any
}

object EthersSpecificConfig {
  @scala.inline
  def apply(
    ethers: Typeofethers,
    signer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.Signer */ js.Any,
    networks: StringDictionary[NetworkConfigEntry] = null
  ): EthersSpecificConfig = {
    val __obj = js.Dynamic.literal(ethers = ethers.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
    if (networks != null) __obj.updateDynamic("networks")(networks.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthersSpecificConfig]
  }
}

