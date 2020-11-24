package typings.bitcoinjsLib.psbtMod

import typings.bitcoinjsLib.networksMod.Network
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PsbtOptsOptional extends js.Object {
  
  var maximumFeeRate: js.UndefOr[Double] = js.native
  
  var network: js.UndefOr[Network] = js.native
}
object PsbtOptsOptional {
  
  @scala.inline
  def apply(): PsbtOptsOptional = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PsbtOptsOptional]
  }
  
  @scala.inline
  implicit class PsbtOptsOptionalOps[Self <: PsbtOptsOptional] (val x: Self) extends AnyVal {
    
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
    def setMaximumFeeRate(value: Double): Self = this.set("maximumFeeRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaximumFeeRate: Self = this.set("maximumFeeRate", js.undefined)
    
    @scala.inline
    def setNetwork(value: Network): Self = this.set("network", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
  }
}
