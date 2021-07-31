package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeServiceActionExecutionParametersInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The identifier of the provisioned product.
    */
  var ProvisionedProductId: Id
  
  /**
    * The self-service action identifier.
    */
  var ServiceActionId: Id
}
object DescribeServiceActionExecutionParametersInput {
  
  @scala.inline
  def apply(ProvisionedProductId: Id, ServiceActionId: Id): DescribeServiceActionExecutionParametersInput = {
    val __obj = js.Dynamic.literal(ProvisionedProductId = ProvisionedProductId.asInstanceOf[js.Any], ServiceActionId = ServiceActionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeServiceActionExecutionParametersInput]
  }
  
  @scala.inline
  implicit class DescribeServiceActionExecutionParametersInputMutableBuilder[Self <: DescribeServiceActionExecutionParametersInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setProvisionedProductId(value: Id): Self = StObject.set(x, "ProvisionedProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceActionId(value: Id): Self = StObject.set(x, "ServiceActionId", value.asInstanceOf[js.Any])
  }
}
