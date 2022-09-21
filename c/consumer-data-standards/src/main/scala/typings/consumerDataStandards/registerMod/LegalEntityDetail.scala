package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.COMPANY
import typings.consumerDataStandards.consumerDataStandardsStrings.GOVERNMENT_ENTITY
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PARTNERSHIP
import typings.consumerDataStandards.consumerDataStandardsStrings.REMOVED
import typings.consumerDataStandards.consumerDataStandardsStrings.SOLE_TRADER
import typings.consumerDataStandards.consumerDataStandardsStrings.TRUST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegalEntityDetail
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Australian Business Number for the organisation
    */
  var abn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Australian Company Number for the organisation
    */
  var acn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ANZSIC division of the organisation. **[[ANZSIC-2006]](#iref-ANZSIC-2006)**
    */
  var anzsicDivision: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Australian Registered Body Number.  ARBNs are issued to registrable Australian bodies and foreign companies
    */
  var arbn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique id of the organisation issued by the CDR Register
    */
  var legalEntityId: String
  
  /**
    * Unique legal name of the organisation
    */
  var legalEntityName: String
  
  /**
    * Legal Entity logo URI
    */
  var logoUri: String
  
  /**
    * Legal organisation type
    */
  var organisationType: js.UndefOr[SOLE_TRADER | COMPANY | PARTNERSHIP | TRUST | GOVERNMENT_ENTITY | OTHER | Null] = js.undefined
  
  /**
    * Country of registeration (if the company is registered outside Australia)
    */
  var registeredCountry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Date of registration (if the company is registered outside Australia)
    */
  var registrationDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique registration number (if the company is registered outside Australia)
    */
  var registrationNumber: js.UndefOr[String | Null] = js.undefined
  
  var status: ACTIVE | REMOVED
}
object LegalEntityDetail {
  
  inline def apply(legalEntityId: String, legalEntityName: String, logoUri: String, status: ACTIVE | REMOVED): LegalEntityDetail = {
    val __obj = js.Dynamic.literal(legalEntityId = legalEntityId.asInstanceOf[js.Any], legalEntityName = legalEntityName.asInstanceOf[js.Any], logoUri = logoUri.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegalEntityDetail]
  }
  
  extension [Self <: LegalEntityDetail](x: Self) {
    
    inline def setAbn(value: String): Self = StObject.set(x, "abn", value.asInstanceOf[js.Any])
    
    inline def setAbnNull: Self = StObject.set(x, "abn", null)
    
    inline def setAbnUndefined: Self = StObject.set(x, "abn", js.undefined)
    
    inline def setAcn(value: String): Self = StObject.set(x, "acn", value.asInstanceOf[js.Any])
    
    inline def setAcnNull: Self = StObject.set(x, "acn", null)
    
    inline def setAcnUndefined: Self = StObject.set(x, "acn", js.undefined)
    
    inline def setAnzsicDivision(value: String): Self = StObject.set(x, "anzsicDivision", value.asInstanceOf[js.Any])
    
    inline def setAnzsicDivisionNull: Self = StObject.set(x, "anzsicDivision", null)
    
    inline def setAnzsicDivisionUndefined: Self = StObject.set(x, "anzsicDivision", js.undefined)
    
    inline def setArbn(value: String): Self = StObject.set(x, "arbn", value.asInstanceOf[js.Any])
    
    inline def setArbnNull: Self = StObject.set(x, "arbn", null)
    
    inline def setArbnUndefined: Self = StObject.set(x, "arbn", js.undefined)
    
    inline def setLegalEntityId(value: String): Self = StObject.set(x, "legalEntityId", value.asInstanceOf[js.Any])
    
    inline def setLegalEntityName(value: String): Self = StObject.set(x, "legalEntityName", value.asInstanceOf[js.Any])
    
    inline def setLogoUri(value: String): Self = StObject.set(x, "logoUri", value.asInstanceOf[js.Any])
    
    inline def setOrganisationType(value: SOLE_TRADER | COMPANY | PARTNERSHIP | TRUST | GOVERNMENT_ENTITY | OTHER): Self = StObject.set(x, "organisationType", value.asInstanceOf[js.Any])
    
    inline def setOrganisationTypeNull: Self = StObject.set(x, "organisationType", null)
    
    inline def setOrganisationTypeUndefined: Self = StObject.set(x, "organisationType", js.undefined)
    
    inline def setRegisteredCountry(value: String): Self = StObject.set(x, "registeredCountry", value.asInstanceOf[js.Any])
    
    inline def setRegisteredCountryNull: Self = StObject.set(x, "registeredCountry", null)
    
    inline def setRegisteredCountryUndefined: Self = StObject.set(x, "registeredCountry", js.undefined)
    
    inline def setRegistrationDate(value: String): Self = StObject.set(x, "registrationDate", value.asInstanceOf[js.Any])
    
    inline def setRegistrationDateNull: Self = StObject.set(x, "registrationDate", null)
    
    inline def setRegistrationDateUndefined: Self = StObject.set(x, "registrationDate", js.undefined)
    
    inline def setRegistrationNumber(value: String): Self = StObject.set(x, "registrationNumber", value.asInstanceOf[js.Any])
    
    inline def setRegistrationNumberNull: Self = StObject.set(x, "registrationNumber", null)
    
    inline def setRegistrationNumberUndefined: Self = StObject.set(x, "registrationNumber", js.undefined)
    
    inline def setStatus(value: ACTIVE | REMOVED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
