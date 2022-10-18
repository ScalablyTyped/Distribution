package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.AnzsicDivision
import typings.consumerDataStandards.anon.ExtensionBaseUri
import typings.consumerDataStandards.anon.JwksEndpoint
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.INACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.REMOVED
import typings.consumerDataStandards.consumerDataStandardsStrings.banking
import typings.consumerDataStandards.consumerDataStandardsStrings.energy
import typings.consumerDataStandards.consumerDataStandardsStrings.telco
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterDataHolderBrand
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  var authDetails: js.Array[JwksEndpoint]
  
  /**
    * The name of Data Holder Brand
    */
  var brandName: String
  
  /**
    * Unique id of the Data Holder Brand issued by the CDR Register
    */
  var dataHolderBrandId: String
  
  /**
    * Endpoints related to Data Holder Brand services
    */
  var endpointDetail: ExtensionBaseUri
  
  /**
    * The industries the Data Holder Brand belongs to
    */
  var industries: js.Array[banking | energy | telco]
  
  /**
    * The date/time that the Data Holder Brand data was last updated in the Register
    */
  var lastUpdated: String
  
  /**
    * The data that is common to all organisations, regardless of the type (e.g. company, trust, partnership, government)
    */
  var legalEntity: AnzsicDivision
  
  /**
    * Brand logo URI
    */
  var logoUri: String
  
  var status: ACTIVE | INACTIVE | REMOVED
}
object RegisterDataHolderBrand {
  
  inline def apply(
    authDetails: js.Array[JwksEndpoint],
    brandName: String,
    dataHolderBrandId: String,
    endpointDetail: ExtensionBaseUri,
    industries: js.Array[banking | energy | telco],
    lastUpdated: String,
    legalEntity: AnzsicDivision,
    logoUri: String,
    status: ACTIVE | INACTIVE | REMOVED
  ): RegisterDataHolderBrand = {
    val __obj = js.Dynamic.literal(authDetails = authDetails.asInstanceOf[js.Any], brandName = brandName.asInstanceOf[js.Any], dataHolderBrandId = dataHolderBrandId.asInstanceOf[js.Any], endpointDetail = endpointDetail.asInstanceOf[js.Any], industries = industries.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], legalEntity = legalEntity.asInstanceOf[js.Any], logoUri = logoUri.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterDataHolderBrand]
  }
  
  extension [Self <: RegisterDataHolderBrand](x: Self) {
    
    inline def setAuthDetails(value: js.Array[JwksEndpoint]): Self = StObject.set(x, "authDetails", value.asInstanceOf[js.Any])
    
    inline def setAuthDetailsVarargs(value: JwksEndpoint*): Self = StObject.set(x, "authDetails", js.Array(value*))
    
    inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    inline def setDataHolderBrandId(value: String): Self = StObject.set(x, "dataHolderBrandId", value.asInstanceOf[js.Any])
    
    inline def setEndpointDetail(value: ExtensionBaseUri): Self = StObject.set(x, "endpointDetail", value.asInstanceOf[js.Any])
    
    inline def setIndustries(value: js.Array[banking | energy | telco]): Self = StObject.set(x, "industries", value.asInstanceOf[js.Any])
    
    inline def setIndustriesVarargs(value: (banking | energy | telco)*): Self = StObject.set(x, "industries", js.Array(value*))
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLegalEntity(value: AnzsicDivision): Self = StObject.set(x, "legalEntity", value.asInstanceOf[js.Any])
    
    inline def setLogoUri(value: String): Self = StObject.set(x, "logoUri", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ACTIVE | INACTIVE | REMOVED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
