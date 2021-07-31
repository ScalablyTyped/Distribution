package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceActionOutput extends StObject {
  
  /**
    * Detailed information about the self-service action.
    */
  var ServiceActionDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionDetail] = js.undefined
}
object UpdateServiceActionOutput {
  
  @scala.inline
  def apply(): UpdateServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServiceActionOutput]
  }
  
  @scala.inline
  implicit class UpdateServiceActionOutputMutableBuilder[Self <: UpdateServiceActionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceActionDetail(value: ServiceActionDetail): Self = StObject.set(x, "ServiceActionDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionDetailUndefined: Self = StObject.set(x, "ServiceActionDetail", js.undefined)
  }
}
