package typings.consumerDataStandards.energyMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.Classification
import typings.consumerDataStandards.consumerDataStandardsStrings.ACT
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.ALL
import typings.consumerDataStandards.consumerDataStandardsStrings.DE_ENERGISED
import typings.consumerDataStandards.consumerDataStandardsStrings.DISTRIBUTION_WHOLESALE
import typings.consumerDataStandards.consumerDataStandardsStrings.EXTERNAL_PROFILE
import typings.consumerDataStandards.consumerDataStandardsStrings.EXTINCT
import typings.consumerDataStandards.consumerDataStandardsStrings.GENERATOR
import typings.consumerDataStandards.consumerDataStandardsStrings.GREENFIELD
import typings.consumerDataStandards.consumerDataStandardsStrings.LARGE
import typings.consumerDataStandards.consumerDataStandardsStrings.NEM
import typings.consumerDataStandards.consumerDataStandardsStrings.NON_CONTEST_UNMETERED_LOAD
import typings.consumerDataStandards.consumerDataStandardsStrings.NON_REGISTERED_EMBEDDED_GENERATOR
import typings.consumerDataStandards.consumerDataStandardsStrings.NSW
import typings.consumerDataStandards.consumerDataStandardsStrings.OFF_MARKET
import typings.consumerDataStandards.consumerDataStandardsStrings.QLD
import typings.consumerDataStandards.consumerDataStandardsStrings.SA
import typings.consumerDataStandards.consumerDataStandardsStrings.SMALL
import typings.consumerDataStandards.consumerDataStandardsStrings.TAS
import typings.consumerDataStandards.consumerDataStandardsStrings.VIC
import typings.consumerDataStandards.consumerDataStandardsStrings.WHOLESALE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnergyServicePoint
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var consumerProfile: js.UndefOr[Classification | Null] = js.undefined
  
  /**
    * This flag determines whether the energy at this connection point is to be treated as consumer load or as a generating unit(this may include generator auxiliary loads). If absent defaults to false. <br>**Note:** Only applicable for scheduled or semischeduled generators, does not indicate on site generation by consumer
    */
  var isGenerator: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Jurisdiction code to which the service point belongs.This code defines the jurisdictional rules which apply to the service point. Note the details of enumeration values below:<ul><li>**ALL** - All Jurisdictions</li><li>**ACT** - Australian Capital Territory</li><li>**NEM** - National Electricity Market</li><li>**NSW** - New South Wales</li><li>**QLD** - Queensland</li><li>**SA** - South Australia</li><li>**TAS** - Tasmania</li><li>**VIC** - Victoria</li></ul>
    */
  var jurisdictionCode: ALL | ACT | NEM | NSW | QLD | SA | TAS | VIC
  
  /**
    * The date and time that the information for this service point was modified
    */
  var lastUpdateDateTime: String
  
  /**
    * The independent ID of the service point, known in the industry as the NMI
    */
  var nationalMeteringId: String
  
  /**
    * The classification of the service point as defined in MSATS procedures
    */
  var servicePointClassification: EXTERNAL_PROFILE | GENERATOR | LARGE | SMALL | WHOLESALE | NON_CONTEST_UNMETERED_LOAD | NON_REGISTERED_EMBEDDED_GENERATOR | DISTRIBUTION_WHOLESALE
  
  /**
    * Tokenised ID of the service point to be used for referring to the service point in the CDR API suite. To be created in accordance with CDR ID permanence requirements
    */
  var servicePointId: String
  
  /**
    * Code used to indicate the status of the service point. Note the details for the enumeration values below:<ul><li>**ACTIVE** - An active, energised, service point</li><li>**DE_ENERGISED** - The service point exists but is deenergised</li><li>**EXTINCT** - The service point has been permanently decommissioned</li><li>**GREENFIELD** - Applies to a service point that has never been energised</li><li>**OFF_MARKET** - Applies when the service point is no longer settled in the NEM</li></ul>
    */
  var servicePointStatus: ACTIVE | DE_ENERGISED | EXTINCT | GREENFIELD | OFF_MARKET
  
  /**
    * The start date from which this service point first became valid
    */
  var validFromDate: String
}
object EnergyServicePoint {
  
  inline def apply(
    jurisdictionCode: ALL | ACT | NEM | NSW | QLD | SA | TAS | VIC,
    lastUpdateDateTime: String,
    nationalMeteringId: String,
    servicePointClassification: EXTERNAL_PROFILE | GENERATOR | LARGE | SMALL | WHOLESALE | NON_CONTEST_UNMETERED_LOAD | NON_REGISTERED_EMBEDDED_GENERATOR | DISTRIBUTION_WHOLESALE,
    servicePointId: String,
    servicePointStatus: ACTIVE | DE_ENERGISED | EXTINCT | GREENFIELD | OFF_MARKET,
    validFromDate: String
  ): EnergyServicePoint = {
    val __obj = js.Dynamic.literal(jurisdictionCode = jurisdictionCode.asInstanceOf[js.Any], lastUpdateDateTime = lastUpdateDateTime.asInstanceOf[js.Any], nationalMeteringId = nationalMeteringId.asInstanceOf[js.Any], servicePointClassification = servicePointClassification.asInstanceOf[js.Any], servicePointId = servicePointId.asInstanceOf[js.Any], servicePointStatus = servicePointStatus.asInstanceOf[js.Any], validFromDate = validFromDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnergyServicePoint]
  }
  
  extension [Self <: EnergyServicePoint](x: Self) {
    
    inline def setConsumerProfile(value: Classification): Self = StObject.set(x, "consumerProfile", value.asInstanceOf[js.Any])
    
    inline def setConsumerProfileNull: Self = StObject.set(x, "consumerProfile", null)
    
    inline def setConsumerProfileUndefined: Self = StObject.set(x, "consumerProfile", js.undefined)
    
    inline def setIsGenerator(value: Boolean): Self = StObject.set(x, "isGenerator", value.asInstanceOf[js.Any])
    
    inline def setIsGeneratorNull: Self = StObject.set(x, "isGenerator", null)
    
    inline def setIsGeneratorUndefined: Self = StObject.set(x, "isGenerator", js.undefined)
    
    inline def setJurisdictionCode(value: ALL | ACT | NEM | NSW | QLD | SA | TAS | VIC): Self = StObject.set(x, "jurisdictionCode", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateDateTime(value: String): Self = StObject.set(x, "lastUpdateDateTime", value.asInstanceOf[js.Any])
    
    inline def setNationalMeteringId(value: String): Self = StObject.set(x, "nationalMeteringId", value.asInstanceOf[js.Any])
    
    inline def setServicePointClassification(
      value: EXTERNAL_PROFILE | GENERATOR | LARGE | SMALL | WHOLESALE | NON_CONTEST_UNMETERED_LOAD | NON_REGISTERED_EMBEDDED_GENERATOR | DISTRIBUTION_WHOLESALE
    ): Self = StObject.set(x, "servicePointClassification", value.asInstanceOf[js.Any])
    
    inline def setServicePointId(value: String): Self = StObject.set(x, "servicePointId", value.asInstanceOf[js.Any])
    
    inline def setServicePointStatus(value: ACTIVE | DE_ENERGISED | EXTINCT | GREENFIELD | OFF_MARKET): Self = StObject.set(x, "servicePointStatus", value.asInstanceOf[js.Any])
    
    inline def setValidFromDate(value: String): Self = StObject.set(x, "validFromDate", value.asInstanceOf[js.Any])
  }
}
