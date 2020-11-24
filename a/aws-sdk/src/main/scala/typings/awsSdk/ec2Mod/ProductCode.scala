package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductCode extends js.Object {
  
  /**
    * The product code.
    */
  var ProductCodeId: js.UndefOr[String] = js.native
  
  /**
    * The type of product code.
    */
  var ProductCodeType: js.UndefOr[ProductCodeValues] = js.native
}
object ProductCode {
  
  @scala.inline
  def apply(): ProductCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductCode]
  }
  
  @scala.inline
  implicit class ProductCodeOps[Self <: ProductCode] (val x: Self) extends AnyVal {
    
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
    def setProductCodeId(value: String): Self = this.set("ProductCodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCodeId: Self = this.set("ProductCodeId", js.undefined)
    
    @scala.inline
    def setProductCodeType(value: ProductCodeValues): Self = this.set("ProductCodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductCodeType: Self = this.set("ProductCodeType", js.undefined)
  }
}
