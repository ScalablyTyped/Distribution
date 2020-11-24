package typings.decimalJs.decimalGlobalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://mikemcl.github.io/decimal.js/#constructor-properties
@js.native
trait DecimalConfig extends js.Object {
  
  var crypto: js.UndefOr[Boolean] = js.native
  
  var defaults: js.UndefOr[Boolean] = js.native
  
  var maxE: js.UndefOr[Double] = js.native
  
  var minE: js.UndefOr[Double] = js.native
  
  var modulo: js.UndefOr[DecimalModulo] = js.native
  
  var precision: js.UndefOr[Double] = js.native
  
  var rounding: js.UndefOr[DecimalRounding] = js.native
  
  var toExpNeg: js.UndefOr[Double] = js.native
  
  var toExpPos: js.UndefOr[Double] = js.native
}
object DecimalConfig {
  
  @scala.inline
  def apply(): DecimalConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DecimalConfig]
  }
  
  @scala.inline
  implicit class DecimalConfigOps[Self <: DecimalConfig] (val x: Self) extends AnyVal {
    
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
    def setCrypto(value: Boolean): Self = this.set("crypto", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrypto: Self = this.set("crypto", js.undefined)
    
    @scala.inline
    def setDefaults(value: Boolean): Self = this.set("defaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaults: Self = this.set("defaults", js.undefined)
    
    @scala.inline
    def setMaxE(value: Double): Self = this.set("maxE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxE: Self = this.set("maxE", js.undefined)
    
    @scala.inline
    def setMinE(value: Double): Self = this.set("minE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinE: Self = this.set("minE", js.undefined)
    
    @scala.inline
    def setModulo(value: DecimalModulo): Self = this.set("modulo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulo: Self = this.set("modulo", js.undefined)
    
    @scala.inline
    def setPrecision(value: Double): Self = this.set("precision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrecision: Self = this.set("precision", js.undefined)
    
    @scala.inline
    def setRounding(value: DecimalRounding): Self = this.set("rounding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRounding: Self = this.set("rounding", js.undefined)
    
    @scala.inline
    def setToExpNeg(value: Double): Self = this.set("toExpNeg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToExpNeg: Self = this.set("toExpNeg", js.undefined)
    
    @scala.inline
    def setToExpPos(value: Double): Self = this.set("toExpPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToExpPos: Self = this.set("toExpPos", js.undefined)
  }
}
