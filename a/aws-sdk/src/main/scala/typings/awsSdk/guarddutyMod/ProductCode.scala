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
  
  inline def apply(): ProductCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductCode]
  }
  
  extension [Self <: ProductCode](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setProductType(value: String): Self = StObject.set(x, "ProductType", value.asInstanceOf[js.Any])
    
    inline def setProductTypeUndefined: Self = StObject.set(x, "ProductType", js.undefined)
  }
}
