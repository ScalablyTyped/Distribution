package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConstraintDetail extends js.Object {
  
  /**
    * The identifier of the constraint.
    */
  var ConstraintId: js.UndefOr[Id] = js.native
  
  /**
    * The description of the constraint.
    */
  var Description: js.UndefOr[ConstraintDescription] = js.native
  
  /**
    * The owner of the constraint.
    */
  var Owner: js.UndefOr[AccountId] = js.native
  
  /**
    * The identifier of the portfolio the product resides in. The constraint applies only to the instance of the product that lives within this portfolio.
    */
  var PortfolioId: js.UndefOr[Id] = js.native
  
  /**
    * The identifier of the product the constraint applies to. Note that a constraint applies to a specific instance of a product within a certain portfolio.
    */
  var ProductId: js.UndefOr[Id] = js.native
  
  /**
    * The type of constraint.    LAUNCH     NOTIFICATION    STACKSET    TEMPLATE   
    */
  var Type: js.UndefOr[ConstraintType] = js.native
}
object ConstraintDetail {
  
  @scala.inline
  def apply(): ConstraintDetail = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConstraintDetail]
  }
  
  @scala.inline
  implicit class ConstraintDetailOps[Self <: ConstraintDetail] (val x: Self) extends AnyVal {
    
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
    def setConstraintId(value: Id): Self = this.set("ConstraintId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConstraintId: Self = this.set("ConstraintId", js.undefined)
    
    @scala.inline
    def setDescription(value: ConstraintDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setOwner(value: AccountId): Self = this.set("Owner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwner: Self = this.set("Owner", js.undefined)
    
    @scala.inline
    def setPortfolioId(value: Id): Self = this.set("PortfolioId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePortfolioId: Self = this.set("PortfolioId", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = this.set("ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProductId: Self = this.set("ProductId", js.undefined)
    
    @scala.inline
    def setType(value: ConstraintType): Self = this.set("Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("Type", js.undefined)
  }
}
