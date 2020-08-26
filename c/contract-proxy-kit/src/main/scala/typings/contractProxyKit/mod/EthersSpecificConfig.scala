package typings.contractProxyKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EthersSpecificConfig
  extends CommonConfig
     with CPKConfig {
  var ethers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ethers */ js.Any = js.native
  var signer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.Signer */ js.Any = js.native
}

object EthersSpecificConfig {
  @scala.inline
  def apply(
    ethers: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ethers */ js.Any,
    signer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.Signer */ js.Any
  ): EthersSpecificConfig = {
    val __obj = js.Dynamic.literal(ethers = ethers.asInstanceOf[js.Any], signer = signer.asInstanceOf[js.Any])
    __obj.asInstanceOf[EthersSpecificConfig]
  }
  @scala.inline
  implicit class EthersSpecificConfigOps[Self <: EthersSpecificConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEthers(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ethers */ js.Any): Self = this.set("ethers", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigner(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ethers.Signer */ js.Any
    ): Self = this.set("signer", value.asInstanceOf[js.Any])
  }
  
}

