package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceActionSummary extends js.Object {
  
  /**
    * The self-service action definition type. For example, SSM_AUTOMATION.
    */
  var DefinitionType: js.UndefOr[ServiceActionDefinitionType] = js.native
  
  /**
    * The self-service action description.
    */
  var Description: js.UndefOr[ServiceActionDescription] = js.native
  
  /**
    * The self-service action identifier.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.native
  
  /**
    * The self-service action name.
    */
  var Name: js.UndefOr[ServiceActionName] = js.native
}
object ServiceActionSummary {
  
  @scala.inline
  def apply(): ServiceActionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceActionSummary]
  }
  
  @scala.inline
  implicit class ServiceActionSummaryOps[Self <: ServiceActionSummary] (val x: Self) extends AnyVal {
    
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
    def setDefinitionType(value: ServiceActionDefinitionType): Self = this.set("DefinitionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefinitionType: Self = this.set("DefinitionType", js.undefined)
    
    @scala.inline
    def setDescription(value: ServiceActionDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = this.set("Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("Id", js.undefined)
    
    @scala.inline
    def setName(value: ServiceActionName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
}
