package typings.contractProxyKit.mod

import typings.contractProxyKit.anon.Typeofethers
import typings.ethers.mod.ethers.Signer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EthersSpecificConfig
  extends CommonConfig
     with CPKConfig {
  
  var ethers: Typeofethers = js.native
  
  var signer: Signer = js.native
}
object EthersSpecificConfig {
  
  @scala.inline
  def apply(ethers: Typeofethers, signer: Signer): EthersSpecificConfig = {
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
    def setEthers(value: Typeofethers): Self = this.set("ethers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigner(value: Signer): Self = this.set("signer", value.asInstanceOf[js.Any])
  }
}
