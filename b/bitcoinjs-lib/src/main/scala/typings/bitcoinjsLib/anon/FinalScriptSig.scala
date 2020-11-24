package typings.bitcoinjsLib.anon

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FinalScriptSig extends js.Object {
  
  var finalScriptSig: js.UndefOr[Buffer] = js.native
  
  var finalScriptWitness: js.UndefOr[Buffer] = js.native
}
object FinalScriptSig {
  
  @scala.inline
  def apply(): FinalScriptSig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FinalScriptSig]
  }
  
  @scala.inline
  implicit class FinalScriptSigOps[Self <: FinalScriptSig] (val x: Self) extends AnyVal {
    
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
    def setFinalScriptSig(value: Buffer): Self = this.set("finalScriptSig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalScriptSig: Self = this.set("finalScriptSig", js.undefined)
    
    @scala.inline
    def setFinalScriptWitness(value: Buffer): Self = this.set("finalScriptWitness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFinalScriptWitness: Self = this.set("finalScriptWitness", js.undefined)
  }
}
