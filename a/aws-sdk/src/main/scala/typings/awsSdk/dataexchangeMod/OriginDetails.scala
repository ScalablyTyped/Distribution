package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginDetails extends StObject {
  
  /**
    * The product ID of the origin of the data set.
    */
  var ProductId: string
}
object OriginDetails {
  
  inline def apply(ProductId: string): OriginDetails = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginDetails]
  }
  
  extension [Self <: OriginDetails](x: Self) {
    
    inline def setProductId(value: string): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
  }
}
