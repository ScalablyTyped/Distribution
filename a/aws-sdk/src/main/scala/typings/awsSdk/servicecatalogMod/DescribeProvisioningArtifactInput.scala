package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProvisioningArtifactInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The product identifier.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  
  /**
    * The product name.
    */
  var ProductName: js.UndefOr[ProductViewName] = js.undefined
  
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  
  /**
    * The provisioning artifact name.
    */
  var ProvisioningArtifactName: js.UndefOr[typings.awsSdk.servicecatalogMod.ProvisioningArtifactName] = js.undefined
  
  /**
    * Indicates whether a verbose level of detail is enabled.
    */
  var Verbose: js.UndefOr[typings.awsSdk.servicecatalogMod.Verbose] = js.undefined
}
object DescribeProvisioningArtifactInput {
  
  @scala.inline
  def apply(): DescribeProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisioningArtifactInput]
  }
  
  @scala.inline
  implicit class DescribeProvisioningArtifactInputMutableBuilder[Self <: DescribeProvisioningArtifactInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductIdUndefined: Self = StObject.set(x, "ProductId", js.undefined)
    
    @scala.inline
    def setProductName(value: ProductViewName): Self = StObject.set(x, "ProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductNameUndefined: Self = StObject.set(x, "ProductName", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactIdUndefined: Self = StObject.set(x, "ProvisioningArtifactId", js.undefined)
    
    @scala.inline
    def setProvisioningArtifactName(value: ProvisioningArtifactName): Self = StObject.set(x, "ProvisioningArtifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvisioningArtifactNameUndefined: Self = StObject.set(x, "ProvisioningArtifactName", js.undefined)
    
    @scala.inline
    def setVerbose(value: Verbose): Self = StObject.set(x, "Verbose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerboseUndefined: Self = StObject.set(x, "Verbose", js.undefined)
  }
}
