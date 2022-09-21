package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ANZSIC_1292Dot0_2006_V1Dot0
import typings.consumerDataStandards.consumerDataStandardsStrings.ANZSIC_1292Dot0_2006_V2Dot0
import typings.consumerDataStandards.consumerDataStandardsStrings.COMPANY
import typings.consumerDataStandards.consumerDataStandardsStrings.GOVERNMENT_ENTITY
import typings.consumerDataStandards.consumerDataStandardsStrings.OTHER
import typings.consumerDataStandards.consumerDataStandardsStrings.PARTNERSHIP
import typings.consumerDataStandards.consumerDataStandardsStrings.SOLE_TRADER
import typings.consumerDataStandards.consumerDataStandardsStrings.TRUST
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgentFirstName
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Australian Business Number for the organisation
    */
  var abn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Australian Company Number for the organisation. Required only if an ACN is applicable for the organisation type
    */
  var acn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The first name of the individual providing access on behalf of the organisation. For people with single names this field need not be present.  The single name should be in the lastName field
    */
  var agentFirstName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The last name of the individual providing access on behalf of the organisation. For people with single names the single name should be in this field
    */
  var agentLastName: String
  
  /**
    * The role of the individual identified as the agent who is providing authorisation.  Expected to be used for display. Default to Unspecified if the role is not known
    */
  var agentRole: String
  
  /**
    * Name of the organisation
    */
  var businessName: String
  
  /**
    * The date the organisation described was established
    */
  var establishmentDate: js.UndefOr[String | Null] = js.undefined
  
  /**
    * A valid [ANZSIC](http://www.abs.gov.au/ANZSIC) code for the organisation. If the industry code held by the data holder is not one of the supported [ANZSIC](http://www.abs.gov.au/ANZSIC) versions, then it must not be supplied.
    */
  var industryCode: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The applicable [ANZSIC](http://www.abs.gov.au/ANZSIC) release version of the industry code provided. Should only be supplied if ``industryCode`` is also supplied. If ``industryCode`` is supplied but ``industryCodeVersion`` is absent, default is ``ANZSIC_1292.0_2006_V2.0``
    */
  var industryCodeVersion: js.UndefOr[ANZSIC_1292Dot0_2006_V1Dot0 | ANZSIC_1292Dot0_2006_V2Dot0 | Null] = js.undefined
  
  /**
    * True if registered with the ACNC.  False if not. Absent or null if not confirmed.
    */
  var isACNCRegistered: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * The date and time that this record was last updated by the customer. If no update has occurred then this date should reflect the initial creation date for the data
    */
  var lastUpdateTime: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Legal name, if different to the business name
    */
  var legalName: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Legal organisation type
    */
  var organisationType: COMPANY | GOVERNMENT_ENTITY | OTHER | PARTNERSHIP | SOLE_TRADER | TRUST
  
  /**
    * Array is mandatory but may be empty if no valid addresses are held. One and only one address may have the purpose of REGISTERED. Zero or one, and no more than one, record may have the purpose of MAIL. If zero then the REGISTERED address is to be used for mail
    */
  var physicalAddresses: js.Array[Paf]
  
  /**
    * Enumeration with values from [ISO 3166 Alpha-3](https://www.iso.org/iso-3166-country-codes.html) country codes.  Assumed to be AUS if absent
    */
  var registeredCountry: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Short name used for communication, if different to the business name
    */
  var shortName: js.UndefOr[String | Null] = js.undefined
}
object AgentFirstName {
  
  inline def apply(
    agentLastName: String,
    agentRole: String,
    businessName: String,
    organisationType: COMPANY | GOVERNMENT_ENTITY | OTHER | PARTNERSHIP | SOLE_TRADER | TRUST,
    physicalAddresses: js.Array[Paf]
  ): AgentFirstName = {
    val __obj = js.Dynamic.literal(agentLastName = agentLastName.asInstanceOf[js.Any], agentRole = agentRole.asInstanceOf[js.Any], businessName = businessName.asInstanceOf[js.Any], organisationType = organisationType.asInstanceOf[js.Any], physicalAddresses = physicalAddresses.asInstanceOf[js.Any])
    __obj.asInstanceOf[AgentFirstName]
  }
  
  extension [Self <: AgentFirstName](x: Self) {
    
    inline def setAbn(value: String): Self = StObject.set(x, "abn", value.asInstanceOf[js.Any])
    
    inline def setAbnNull: Self = StObject.set(x, "abn", null)
    
    inline def setAbnUndefined: Self = StObject.set(x, "abn", js.undefined)
    
    inline def setAcn(value: String): Self = StObject.set(x, "acn", value.asInstanceOf[js.Any])
    
    inline def setAcnNull: Self = StObject.set(x, "acn", null)
    
    inline def setAcnUndefined: Self = StObject.set(x, "acn", js.undefined)
    
    inline def setAgentFirstName(value: String): Self = StObject.set(x, "agentFirstName", value.asInstanceOf[js.Any])
    
    inline def setAgentFirstNameNull: Self = StObject.set(x, "agentFirstName", null)
    
    inline def setAgentFirstNameUndefined: Self = StObject.set(x, "agentFirstName", js.undefined)
    
    inline def setAgentLastName(value: String): Self = StObject.set(x, "agentLastName", value.asInstanceOf[js.Any])
    
    inline def setAgentRole(value: String): Self = StObject.set(x, "agentRole", value.asInstanceOf[js.Any])
    
    inline def setBusinessName(value: String): Self = StObject.set(x, "businessName", value.asInstanceOf[js.Any])
    
    inline def setEstablishmentDate(value: String): Self = StObject.set(x, "establishmentDate", value.asInstanceOf[js.Any])
    
    inline def setEstablishmentDateNull: Self = StObject.set(x, "establishmentDate", null)
    
    inline def setEstablishmentDateUndefined: Self = StObject.set(x, "establishmentDate", js.undefined)
    
    inline def setIndustryCode(value: String): Self = StObject.set(x, "industryCode", value.asInstanceOf[js.Any])
    
    inline def setIndustryCodeNull: Self = StObject.set(x, "industryCode", null)
    
    inline def setIndustryCodeUndefined: Self = StObject.set(x, "industryCode", js.undefined)
    
    inline def setIndustryCodeVersion(value: ANZSIC_1292Dot0_2006_V1Dot0 | ANZSIC_1292Dot0_2006_V2Dot0): Self = StObject.set(x, "industryCodeVersion", value.asInstanceOf[js.Any])
    
    inline def setIndustryCodeVersionNull: Self = StObject.set(x, "industryCodeVersion", null)
    
    inline def setIndustryCodeVersionUndefined: Self = StObject.set(x, "industryCodeVersion", js.undefined)
    
    inline def setIsACNCRegistered(value: Boolean): Self = StObject.set(x, "isACNCRegistered", value.asInstanceOf[js.Any])
    
    inline def setIsACNCRegisteredNull: Self = StObject.set(x, "isACNCRegistered", null)
    
    inline def setIsACNCRegisteredUndefined: Self = StObject.set(x, "isACNCRegistered", js.undefined)
    
    inline def setLastUpdateTime(value: String): Self = StObject.set(x, "lastUpdateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateTimeNull: Self = StObject.set(x, "lastUpdateTime", null)
    
    inline def setLastUpdateTimeUndefined: Self = StObject.set(x, "lastUpdateTime", js.undefined)
    
    inline def setLegalName(value: String): Self = StObject.set(x, "legalName", value.asInstanceOf[js.Any])
    
    inline def setLegalNameNull: Self = StObject.set(x, "legalName", null)
    
    inline def setLegalNameUndefined: Self = StObject.set(x, "legalName", js.undefined)
    
    inline def setOrganisationType(value: COMPANY | GOVERNMENT_ENTITY | OTHER | PARTNERSHIP | SOLE_TRADER | TRUST): Self = StObject.set(x, "organisationType", value.asInstanceOf[js.Any])
    
    inline def setPhysicalAddresses(value: js.Array[Paf]): Self = StObject.set(x, "physicalAddresses", value.asInstanceOf[js.Any])
    
    inline def setPhysicalAddressesVarargs(value: Paf*): Self = StObject.set(x, "physicalAddresses", js.Array(value*))
    
    inline def setRegisteredCountry(value: String): Self = StObject.set(x, "registeredCountry", value.asInstanceOf[js.Any])
    
    inline def setRegisteredCountryNull: Self = StObject.set(x, "registeredCountry", null)
    
    inline def setRegisteredCountryUndefined: Self = StObject.set(x, "registeredCountry", js.undefined)
    
    inline def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    inline def setShortNameNull: Self = StObject.set(x, "shortName", null)
    
    inline def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
  }
}
