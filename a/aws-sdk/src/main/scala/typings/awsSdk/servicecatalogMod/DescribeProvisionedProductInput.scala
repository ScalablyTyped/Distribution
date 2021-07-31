package typings.awsSdk.servicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeProvisionedProductInput extends StObject {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.undefined
  
  /**
    * The provisioned product identifier. You must provide the name or ID, but not both. If you do not provide a name or ID, or you provide both name and ID, an InvalidParametersException will occur.
    */
  var Id: js.UndefOr[typings.awsSdk.servicecatalogMod.Id] = js.undefined
  
  /**
    * The name of the provisioned product. You must provide the name or ID, but not both. If you do not provide a name or ID, or you provide both name and ID, an InvalidParametersException will occur.
    */
  var Name: js.UndefOr[ProvisionedProductName] = js.undefined
}
object DescribeProvisionedProductInput {
  
  @scala.inline
  def apply(): DescribeProvisionedProductInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeProvisionedProductInput]
  }
  
  @scala.inline
  implicit class DescribeProvisionedProductInputMutableBuilder[Self <: DescribeProvisionedProductInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = StObject.set(x, "AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguageUndefined: Self = StObject.set(x, "AcceptLanguage", js.undefined)
    
    @scala.inline
    def setId(value: Id): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setName(value: ProvisionedProductName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
