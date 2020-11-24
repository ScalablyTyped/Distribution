package typings.awsSdk.rdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ResultSetOptions extends js.Object {
  
  /**
    * A value that indicates how a field of DECIMAL type is represented in the response. The value of STRING, the default, specifies that it is converted to a String value. The value of DOUBLE_OR_LONG specifies that it is converted to a Long value if its scale is 0, or to a Double value otherwise.  Conversion to Double or Long can result in roundoff errors due to precision loss. We recommend converting to String, especially when working with currency values. 
    */
  var decimalReturnType: js.UndefOr[DecimalReturnType] = js.native
}
object ResultSetOptions {
  
  @scala.inline
  def apply(): ResultSetOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResultSetOptions]
  }
  
  @scala.inline
  implicit class ResultSetOptionsOps[Self <: ResultSetOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDecimalReturnType(value: DecimalReturnType): Self = this.set("decimalReturnType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDecimalReturnType: Self = this.set("decimalReturnType", js.undefined)
  }
}
