package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.REVOKED
import typings.consumerDataStandards.consumerDataStandardsStrings.SPONSORED
import typings.consumerDataStandards.consumerDataStandardsStrings.SURRENDERED
import typings.consumerDataStandards.consumerDataStandardsStrings.SUSPENDED
import typings.consumerDataStandards.consumerDataStandardsStrings.UNRESTRICTED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccreditationLevel
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Accreditation level of the Data Recipient in the CDR Register
    */
  var accreditationLevel: UNRESTRICTED | SPONSORED
  
  /**
    * CDR Register issued human readable unique number given to Data Recipients upon accreditation
    */
  var accreditationNumber: String
  
  var dataRecipientBrands: js.UndefOr[js.Array[DataRecipientBrandId] | Null] = js.undefined
  
  /**
    * The date/time that the Legal Entity was last updated in the CDR Register
    */
  var lastUpdated: String
  
  /**
    * Unique id of the Data Recipient Legal Entity issued by the CDR Register.
    */
  var legalEntityId: String
  
  /**
    * Legal name of the Data Recipient
    */
  var legalEntityName: String
  
  /**
    * Legal Entity logo URI
    */
  var logoUri: String
  
  /**
    * Data Recipient status in the CDR Register
    */
  var status: ACTIVE | SUSPENDED | REVOKED | SURRENDERED
}
object AccreditationLevel {
  
  inline def apply(
    accreditationLevel: UNRESTRICTED | SPONSORED,
    accreditationNumber: String,
    lastUpdated: String,
    legalEntityId: String,
    legalEntityName: String,
    logoUri: String,
    status: ACTIVE | SUSPENDED | REVOKED | SURRENDERED
  ): AccreditationLevel = {
    val __obj = js.Dynamic.literal(accreditationLevel = accreditationLevel.asInstanceOf[js.Any], accreditationNumber = accreditationNumber.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], legalEntityId = legalEntityId.asInstanceOf[js.Any], legalEntityName = legalEntityName.asInstanceOf[js.Any], logoUri = logoUri.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccreditationLevel]
  }
  
  extension [Self <: AccreditationLevel](x: Self) {
    
    inline def setAccreditationLevel(value: UNRESTRICTED | SPONSORED): Self = StObject.set(x, "accreditationLevel", value.asInstanceOf[js.Any])
    
    inline def setAccreditationNumber(value: String): Self = StObject.set(x, "accreditationNumber", value.asInstanceOf[js.Any])
    
    inline def setDataRecipientBrands(value: js.Array[DataRecipientBrandId]): Self = StObject.set(x, "dataRecipientBrands", value.asInstanceOf[js.Any])
    
    inline def setDataRecipientBrandsNull: Self = StObject.set(x, "dataRecipientBrands", null)
    
    inline def setDataRecipientBrandsUndefined: Self = StObject.set(x, "dataRecipientBrands", js.undefined)
    
    inline def setDataRecipientBrandsVarargs(value: DataRecipientBrandId*): Self = StObject.set(x, "dataRecipientBrands", js.Array(value*))
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLegalEntityId(value: String): Self = StObject.set(x, "legalEntityId", value.asInstanceOf[js.Any])
    
    inline def setLegalEntityName(value: String): Self = StObject.set(x, "legalEntityName", value.asInstanceOf[js.Any])
    
    inline def setLogoUri(value: String): Self = StObject.set(x, "logoUri", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ACTIVE | SUSPENDED | REVOKED | SURRENDERED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
