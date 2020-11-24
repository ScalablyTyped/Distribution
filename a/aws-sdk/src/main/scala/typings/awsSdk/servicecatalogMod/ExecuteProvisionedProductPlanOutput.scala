package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExecuteProvisionedProductPlanOutput extends js.Object {
  
  /**
    * Information about the result of provisioning the product.
    */
  var RecordDetail: js.UndefOr[typings.awsSdk.servicecatalogMod.RecordDetail] = js.native
}
object ExecuteProvisionedProductPlanOutput {
  
  @scala.inline
  def apply(): ExecuteProvisionedProductPlanOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExecuteProvisionedProductPlanOutput]
  }
  
  @scala.inline
  implicit class ExecuteProvisionedProductPlanOutputOps[Self <: ExecuteProvisionedProductPlanOutput] (val x: Self) extends AnyVal {
    
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
    def setRecordDetail(value: RecordDetail): Self = this.set("RecordDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordDetail: Self = this.set("RecordDetail", js.undefined)
  }
}
