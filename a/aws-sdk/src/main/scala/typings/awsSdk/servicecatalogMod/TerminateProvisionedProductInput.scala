package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TerminateProvisionedProductInput extends js.Object {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * If set to true, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources.
    */
  var IgnoreErrors: js.UndefOr[typings.awsSdk.servicecatalogMod.IgnoreErrors] = js.native
  
  /**
    * The identifier of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the provisioned product. You cannot specify both ProvisionedProductName and ProvisionedProductId.
    */
  var ProvisionedProductName: js.UndefOr[ProvisionedProductNameOrArn] = js.native
  
  /**
    * When this boolean parameter is set to true, the TerminateProvisionedProduct API deletes the Service Catalog provisioned product. However, it does not remove the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is false.
    */
  var RetainPhysicalResources: js.UndefOr[typings.awsSdk.servicecatalogMod.RetainPhysicalResources] = js.native
  
  /**
    * An idempotency token that uniquely identifies the termination request. This token is only valid during the termination process. After the provisioned product is terminated, subsequent requests to terminate the same provisioned product always return ResourceNotFound.
    */
  var TerminateToken: IdempotencyToken = js.native
}
object TerminateProvisionedProductInput {
  
  @scala.inline
  def apply(TerminateToken: IdempotencyToken): TerminateProvisionedProductInput = {
    val __obj = js.Dynamic.literal(TerminateToken = TerminateToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[TerminateProvisionedProductInput]
  }
  
  @scala.inline
  implicit class TerminateProvisionedProductInputOps[Self <: TerminateProvisionedProductInput] (val x: Self) extends AnyVal {
    
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
    def setTerminateToken(value: IdempotencyToken): Self = this.set("TerminateToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    
    @scala.inline
    def setIgnoreErrors(value: IgnoreErrors): Self = this.set("IgnoreErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreErrors: Self = this.set("IgnoreErrors", js.undefined)
    
    @scala.inline
    def setProvisionedProductId(value: Id): Self = this.set("ProvisionedProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedProductId: Self = this.set("ProvisionedProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductNameOrArn): Self = this.set("ProvisionedProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedProductName: Self = this.set("ProvisionedProductName", js.undefined)
    
    @scala.inline
    def setRetainPhysicalResources(value: RetainPhysicalResources): Self = this.set("RetainPhysicalResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetainPhysicalResources: Self = this.set("RetainPhysicalResources", js.undefined)
  }
}
