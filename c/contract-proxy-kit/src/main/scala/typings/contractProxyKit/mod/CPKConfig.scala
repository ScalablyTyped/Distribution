package typings.contractProxyKit.mod

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
  def Web3SpecificConfig(web3: js.Object): CPKConfig = {
    val __obj = js.Dynamic.literal(web3 = web3.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPKConfig]
  }
  @scala.inline
  def EthersSpecificConfig(
    ethers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ethers */ js.Any,
    signer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.Signer */ js.Any
  ): CPKConfig = {
    val __obj = js.Dynamic.literal(ethers = ethers.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CPKConfig]
  }
}

