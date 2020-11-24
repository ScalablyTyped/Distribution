package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProvisionedProductOutputsInput extends js.Object {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The list of keys that the API should return with their values. If none are provided, the API will return all outputs of the provisioned product.
    */
  var OutputKeys: js.UndefOr[typings.awsSdk.servicecatalogMod.OutputKeys] = js.native
  
  /**
    * The maximum number of items to return with this call.
    */
  var PageSize: js.UndefOr[typings.awsSdk.servicecatalogMod.PageSize] = js.native
  
  /**
    * The page token for the next set of results. To retrieve the first set of results, use null.
    */
  var PageToken: js.UndefOr[typings.awsSdk.servicecatalogMod.PageToken] = js.native
  
  /**
    * The identifier of the provisioned product that you want the outputs from.
    */
  var ProvisionedProductId: js.UndefOr[Id] = js.native
  
  /**
    * The name of the provisioned product that you want the outputs from.
    */
  var ProvisionedProductName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisionedProductName] = js.native
}
object GetProvisionedProductOutputsInput {
  
  @scala.inline
  def apply(): GetProvisionedProductOutputsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetProvisionedProductOutputsInput]
  }
  
  @scala.inline
  implicit class GetProvisionedProductOutputsInputOps[Self <: GetProvisionedProductOutputsInput] (val x: Self) extends AnyVal {
    
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
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    
    @scala.inline
    def setOutputKeysVarargs(value: OutputKey*): Self = this.set("OutputKeys", js.Array(value :_*))
    
    @scala.inline
    def setOutputKeys(value: OutputKeys): Self = this.set("OutputKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputKeys: Self = this.set("OutputKeys", js.undefined)
    
    @scala.inline
    def setPageSize(value: PageSize): Self = this.set("PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSize: Self = this.set("PageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: PageToken): Self = this.set("PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageToken: Self = this.set("PageToken", js.undefined)
    
    @scala.inline
    def setProvisionedProductId(value: Id): Self = this.set("ProvisionedProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedProductId: Self = this.set("ProvisionedProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductName): Self = this.set("ProvisionedProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvisionedProductName: Self = this.set("ProvisionedProductName", js.undefined)
  }
}
