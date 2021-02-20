package typings.awsSdk.dataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OriginDetails extends StObject {
  
  var ProductId: string = js.native
}
object OriginDetails {
  
  @scala.inline
  def apply(ProductId: string): OriginDetails = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginDetails]
  }
  
  @scala.inline
  implicit class OriginDetailsMutableBuilder[Self <: OriginDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProductId(value: string): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
  }
}
