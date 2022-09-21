package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.banking
import typings.consumerDataStandards.consumerDataStandardsStrings.energy
import typings.consumerDataStandards.consumerDataStandardsStrings.telco
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHolderBrandSummary
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
    * Australian Registered Body Number.  ARBNs are issued to registrable Australian bodies and foreign companies
    */
  var arbn: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of Data Holder Brand
    */
  var brandName: String
  
  /**
    * Unique id of the Data Holder Brand issued by the CDR Register
    */
  var dataHolderBrandId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The industries the Data Holder Brand belongs to. Please note that the CDR Register entity model is constrained to one industry per brand which is planned to be relaxed in the future.
    */
  var industries: js.Array[banking | energy | telco]
  
  /**
    * Interim id of the Data Holder Brand issued by the CDR Register. This is to be used to uniquely identify the record when dataHolderBrandId is not populated and is not to be reused
    */
  var interimId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The date/time that the Data Holder Brand data was last updated in the Register
    */
  var lastUpdated: String
  
  /**
    * Brand logo URI
    */
  var logoUri: String
  
  /**
    * Base URI for the Data Holder's Consumer Data Standard public endpoints
    */
  var publicBaseUri: String
}
object DataHolderBrandSummary {
  
  inline def apply(
    brandName: String,
    industries: js.Array[banking | energy | telco],
    lastUpdated: String,
    logoUri: String,
    publicBaseUri: String
  ): DataHolderBrandSummary = {
    val __obj = js.Dynamic.literal(brandName = brandName.asInstanceOf[js.Any], industries = industries.asInstanceOf[js.Any], lastUpdated = lastUpdated.asInstanceOf[js.Any], logoUri = logoUri.asInstanceOf[js.Any], publicBaseUri = publicBaseUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataHolderBrandSummary]
  }
  
  extension [Self <: DataHolderBrandSummary](x: Self) {
    
    inline def setAbn(value: String): Self = StObject.set(x, "abn", value.asInstanceOf[js.Any])
    
    inline def setAbnNull: Self = StObject.set(x, "abn", null)
    
    inline def setAbnUndefined: Self = StObject.set(x, "abn", js.undefined)
    
    inline def setAcn(value: String): Self = StObject.set(x, "acn", value.asInstanceOf[js.Any])
    
    inline def setAcnNull: Self = StObject.set(x, "acn", null)
    
    inline def setAcnUndefined: Self = StObject.set(x, "acn", js.undefined)
    
    inline def setArbn(value: String): Self = StObject.set(x, "arbn", value.asInstanceOf[js.Any])
    
    inline def setArbnNull: Self = StObject.set(x, "arbn", null)
    
    inline def setArbnUndefined: Self = StObject.set(x, "arbn", js.undefined)
    
    inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    inline def setDataHolderBrandId(value: String): Self = StObject.set(x, "dataHolderBrandId", value.asInstanceOf[js.Any])
    
    inline def setDataHolderBrandIdNull: Self = StObject.set(x, "dataHolderBrandId", null)
    
    inline def setDataHolderBrandIdUndefined: Self = StObject.set(x, "dataHolderBrandId", js.undefined)
    
    inline def setIndustries(value: js.Array[banking | energy | telco]): Self = StObject.set(x, "industries", value.asInstanceOf[js.Any])
    
    inline def setIndustriesVarargs(value: (banking | energy | telco)*): Self = StObject.set(x, "industries", js.Array(value*))
    
    inline def setInterimId(value: String): Self = StObject.set(x, "interimId", value.asInstanceOf[js.Any])
    
    inline def setInterimIdNull: Self = StObject.set(x, "interimId", null)
    
    inline def setInterimIdUndefined: Self = StObject.set(x, "interimId", js.undefined)
    
    inline def setLastUpdated(value: String): Self = StObject.set(x, "lastUpdated", value.asInstanceOf[js.Any])
    
    inline def setLogoUri(value: String): Self = StObject.set(x, "logoUri", value.asInstanceOf[js.Any])
    
    inline def setPublicBaseUri(value: String): Self = StObject.set(x, "publicBaseUri", value.asInstanceOf[js.Any])
  }
}
