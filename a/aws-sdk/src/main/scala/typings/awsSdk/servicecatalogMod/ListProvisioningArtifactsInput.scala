package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListProvisioningArtifactsInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The product identifier.
    */
  var ProductId: Id
}
object ListProvisioningArtifactsInput {
  
  inline def apply(ProductId: Id): ListProvisioningArtifactsInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListProvisioningArtifactsInput]
  }
  
  extension [Self <: ListProvisioningArtifactsInput](x: Self) {
    
    inline def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    inline def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    inline def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
  }
}
