package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProductCode extends StObject {
  
  /**
    * The product code information.
    */
  var Code: js.UndefOr[String] = js.undefined
  
  /**
    * The product code type.
    */
  var ProductType: js.UndefOr[String] = js.undefined
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
    def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setProductType(value: String): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
  }
}
