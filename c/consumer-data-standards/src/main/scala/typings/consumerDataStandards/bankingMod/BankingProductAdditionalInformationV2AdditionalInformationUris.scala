package typings.consumerDataStandards.bankingMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BankingProductAdditionalInformationV2AdditionalInformationUris
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The URI describing the additional information
    */
  var additionalInfoUri: String
  
  /**
    * Display text providing more information about the document URI
    */
  var description: js.UndefOr[String | Null] = js.undefined
}
object BankingProductAdditionalInformationV2AdditionalInformationUris {
  
  inline def apply(additionalInfoUri: String): BankingProductAdditionalInformationV2AdditionalInformationUris = {
    val __obj = js.Dynamic.literal(additionalInfoUri = additionalInfoUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[BankingProductAdditionalInformationV2AdditionalInformationUris]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BankingProductAdditionalInformationV2AdditionalInformationUris] (val x: Self) extends AnyVal {
    
    inline def setAdditionalInfoUri(value: String): Self = StObject.set(x, "additionalInfoUri", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionNull: Self = StObject.set(x, "description", null)
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
  }
}
