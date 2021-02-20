package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceActionDetail extends StObject {
  
  /**
    * A map that defines the self-service action.
    */
  var Definition: js.UndefOr[ServiceActionDefinitionMap] = js.native
  
  /**
    * Summary information about the self-service action.
    */
  var ServiceActionSummary: js.UndefOr[typings.awsSdk.servicecatalogMod.ServiceActionSummary] = js.native
}
object ServiceActionDetail {
  
  @scala.inline
  def apply(): ServiceActionDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceActionDetail]
  }
  
  @scala.inline
  implicit class ServiceActionDetailMutableBuilder[Self <: ServiceActionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: ServiceActionDefinitionMap): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
    
    @scala.inline
    def setServiceActionSummary(value: ServiceActionSummary): Self = StObject.set(x, "ServiceActionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionSummaryUndefined: Self = StObject.set(x, "ServiceActionSummary", js.undefined)
  }
}
