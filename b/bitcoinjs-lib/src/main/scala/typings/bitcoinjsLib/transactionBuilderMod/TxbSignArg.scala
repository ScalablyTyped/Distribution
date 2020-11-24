package typings.bitcoinjsLib.transactionBuilderMod

import typings.bitcoinjsLib.ecpairMod.Signer
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TxbSignArg extends js.Object {
  
  var hashType: js.UndefOr[Double] = js.native
  
  var keyPair: Signer = js.native
  
  var prevOutScriptType: String = js.native
  
  var redeemScript: js.UndefOr[Buffer] = js.native
  
  var vin: Double = js.native
  
  var witnessScript: js.UndefOr[Buffer] = js.native
  
  var witnessValue: js.UndefOr[Double] = js.native
}
object TxbSignArg {
  
  @scala.inline
  def apply(keyPair: Signer, prevOutScriptType: String, vin: Double): TxbSignArg = {
    val __obj = js.Dynamic.literal(keyPair = keyPair.asInstanceOf[js.Any], prevOutScriptType = prevOutScriptType.asInstanceOf[js.Any], vin = vin.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxbSignArg]
  }
  
  @scala.inline
  implicit class TxbSignArgOps[Self <: TxbSignArg] (val x: Self) extends AnyVal {
    
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
    def setKeyPair(value: Signer): Self = this.set("keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrevOutScriptType(value: String): Self = this.set("prevOutScriptType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVin(value: Double): Self = this.set("vin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashType(value: Double): Self = this.set("hashType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashType: Self = this.set("hashType", js.undefined)
    
    @scala.inline
    def setRedeemScript(value: Buffer): Self = this.set("redeemScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedeemScript: Self = this.set("redeemScript", js.undefined)
    
    @scala.inline
    def setWitnessScript(value: Buffer): Self = this.set("witnessScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWitnessScript: Self = this.set("witnessScript", js.undefined)
    
    @scala.inline
    def setWitnessValue(value: Double): Self = this.set("witnessValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWitnessValue: Self = this.set("witnessValue", js.undefined)
  }
}
