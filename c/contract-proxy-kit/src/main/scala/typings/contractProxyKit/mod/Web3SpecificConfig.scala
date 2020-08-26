package typings.contractProxyKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Web3SpecificConfig
  extends CommonConfig
     with CPKConfig {
  var ownerAccount: js.UndefOr[String] = js.native
  var web3: js.Object = js.native
}

object Web3SpecificConfig {
  @scala.inline
  def apply(web3: js.Object): Web3SpecificConfig = {
    val __obj = js.Dynamic.literal(web3 = web3.asInstanceOf[js.Any])
    __obj.asInstanceOf[Web3SpecificConfig]
  }
  @scala.inline
  implicit class Web3SpecificConfigOps[Self <: Web3SpecificConfig] (val x: Self) extends AnyVal {
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
    def setWeb3(value: js.Object): Self = this.set("web3", value.asInstanceOf[js.Any])
    @scala.inline
    def setOwnerAccount(value: String): Self = this.set("ownerAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnerAccount: Self = this.set("ownerAccount", js.undefined)
  }
  
}

