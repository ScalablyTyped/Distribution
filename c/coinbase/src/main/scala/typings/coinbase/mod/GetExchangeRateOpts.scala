package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetExchangeRateOpts extends js.Object {
  
  /**
    * Base currency, default USD
    */
  var currency: js.UndefOr[String] = js.native
}
object GetExchangeRateOpts {
  
  @scala.inline
  def apply(): GetExchangeRateOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetExchangeRateOpts]
  }
  
  @scala.inline
  implicit class GetExchangeRateOptsOps[Self <: GetExchangeRateOpts] (val x: Self) extends AnyVal {
    
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
  }
}
