package typings.cryptoJs.anon

import typings.cryptoJs.mod.CipherStatic
import typings.cryptoJs.mod.Format_
import typings.cryptoJs.mod.Mode_
import typings.cryptoJs.mod.Padding
import typings.cryptoJs.mod.global.CryptoJS.lib.WordArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<crypto-js.crypto-js.<global>.CryptoJS.lib.CipherParams> */
@js.native
trait PartialCipherParams extends js.Object {
  
  var algorithm: js.UndefOr[CipherStatic] = js.native
  
  var blockSize: js.UndefOr[Double] = js.native
  
  var ciphertext: js.UndefOr[WordArray] = js.native
  
  var formatter: js.UndefOr[Format_] = js.native
  
  var iv: js.UndefOr[WordArray] = js.native
  
  var key: js.UndefOr[WordArray] = js.native
  
  var mode: js.UndefOr[Mode_] = js.native
  
  var padding: js.UndefOr[Padding] = js.native
  
  var salt: js.UndefOr[WordArray] = js.native
  
  @JSName("toString")
  var toString_FPartialCipherParams: js.UndefOr[js.Function1[/* formatter */ js.UndefOr[Format_], String]] = js.native
}
object PartialCipherParams {
  
  @scala.inline
  def apply(): PartialCipherParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialCipherParams]
  }
  
  @scala.inline
  implicit class PartialCipherParamsOps[Self <: PartialCipherParams] (val x: Self) extends AnyVal {
    
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
    def setAlgorithm(value: CipherStatic): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setBlockSize(value: Double): Self = this.set("blockSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlockSize: Self = this.set("blockSize", js.undefined)
    
    @scala.inline
    def setCiphertext(value: WordArray): Self = this.set("ciphertext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCiphertext: Self = this.set("ciphertext", js.undefined)
    
    @scala.inline
    def setFormatter(value: Format_): Self = this.set("formatter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    
    @scala.inline
    def setIv(value: WordArray): Self = this.set("iv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIv: Self = this.set("iv", js.undefined)
    
    @scala.inline
    def setKey(value: WordArray): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setMode(value: Mode_): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setPadding(value: Padding): Self = this.set("padding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    
    @scala.inline
    def setSalt(value: WordArray): Self = this.set("salt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSalt: Self = this.set("salt", js.undefined)
    
    @scala.inline
    def setToString(value: /* formatter */ js.UndefOr[Format_] => String): Self = this.set("toString", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToString: Self = this.set("toString", js.undefined)
  }
}
