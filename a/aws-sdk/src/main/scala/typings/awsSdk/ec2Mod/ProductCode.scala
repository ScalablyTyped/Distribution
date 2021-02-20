package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProductCode extends StObject {
  
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
  implicit class ProductCodeMutableBuilder[Self <: ProductCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductCodeId(value: String): Self = StObject.set(x, "ProductCodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeIdUndefined: Self = StObject.set(x, "ProductCodeId", js.undefined)
    
    @scala.inline
    def setProductCodeType(value: ProductCodeValues): Self = StObject.set(x, "ProductCodeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductCodeTypeUndefined: Self = StObject.set(x, "ProductCodeType", js.undefined)
  }
}
