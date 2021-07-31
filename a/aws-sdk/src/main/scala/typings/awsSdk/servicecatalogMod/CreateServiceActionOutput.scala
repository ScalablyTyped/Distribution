package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateServiceActionOutput extends StObject {
  
  /**
    * An object containing information about the self-service action.
    */
  var ServiceActionDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionDetail] = js.undefined
}
object CreateServiceActionOutput {
  
  @scala.inline
  def apply(): CreateServiceActionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateServiceActionOutput]
  }
  
  @scala.inline
  implicit class CreateServiceActionOutputMutableBuilder[Self <: CreateServiceActionOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setServiceActionDetail(value: ServiceActionDetail): Self = StObject.set(x, "ServiceActionDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionDetailUndefined: Self = StObject.set(x, "ServiceActionDetail", js.undefined)
  }
}
