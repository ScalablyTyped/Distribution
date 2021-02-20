package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetProvisionedProductOutputsInput extends StObject {
  
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
  implicit class GetProvisionedProductOutputsInputMutableBuilder[Self <: GetProvisionedProductOutputsInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setOutputKeys(value: OutputKeys): Self = StObject.set(x, "OutputKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputKeysUndefined: Self = StObject.set(x, "OutputKeys", js.undefined)
    
    @scala.inline
    def setOutputKeysVarargs(value: OutputKey*): Self = StObject.set(x, "OutputKeys", js.Array(value :_*))
    
    @scala.inline
    def setPageSize(value: PageSize): Self = StObject.set(x, "PageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageSizeUndefined: Self = StObject.set(x, "PageSize", js.undefined)
    
    @scala.inline
    def setPageToken(value: PageToken): Self = StObject.set(x, "PageToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTokenUndefined: Self = StObject.set(x, "PageToken", js.undefined)
    
    @scala.inline
    def setProvisionedProductId(value: Id): Self = StObject.set(x, "ProvisionedProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductIdUndefined: Self = StObject.set(x, "ProvisionedProductId", js.undefined)
    
    @scala.inline
    def setProvisionedProductName(value: ProvisionedProductName): Self = StObject.set(x, "ProvisionedProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisionedProductNameUndefined: Self = StObject.set(x, "ProvisionedProductName", js.undefined)
  }
}
