package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteProvisionedProductPlanInput extends js.Object {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
    */
  var IgnoreErrors: js.UndefOr[typings.awsSdk.servicecatalogMod.IgnoreErrors] = js.native
  
  /**
    * The plan identifier.
    */
  var PlanId: Id = js.native
}
object DeleteProvisionedProductPlanInput {
  
  @scala.inline
  def apply(PlanId: Id): DeleteProvisionedProductPlanInput = {
    val __obj = js.Dynamic.literal(PlanId = PlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteProvisionedProductPlanInput]
  }
  
  @scala.inline
  implicit class DeleteProvisionedProductPlanInputOps[Self <: DeleteProvisionedProductPlanInput] (val x: Self) extends AnyVal {
    
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
    def setPlanId(value: Id): Self = this.set("PlanId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    
    @scala.inline
    def setIgnoreErrors(value: IgnoreErrors): Self = this.set("IgnoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("IgnoreErrors", js.undefined)
  }
}
