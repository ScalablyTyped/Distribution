package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceActionDetail extends js.Object {
  
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
  implicit class ServiceActionDetailOps[Self <: ServiceActionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDefinition(value: ServiceActionDefinitionMap): Self = this.set("Definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinition: Self = this.set("Definition", js.undefined)
    
    @scala.inline
    def setServiceActionSummary(value: ServiceActionSummary): Self = this.set("ServiceActionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceActionSummary: Self = this.set("ServiceActionSummary", js.undefined)
  }
}
