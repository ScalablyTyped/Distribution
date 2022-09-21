package typings.consumerDataStandards.registerMod

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.anon.LogoUri
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.INACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.REMOVED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataRecipientBrandMetaData
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Data Recipient Brand name
    */
  var brandName: String
  
  /**
    * Unique id of the Data Recipient brand issued by the CDR Register
    */
  var dataRecipientBrandId: String
  
  /**
    * Data Recipient Brand logo URI
    */
  var logoUri: String
  
  var softwareProducts: js.UndefOr[js.Array[LogoUri] | Null] = js.undefined
  
  /**
    * Data Recipient Brand status in the CDR Register
    */
  var status: ACTIVE | INACTIVE | REMOVED
}
object DataRecipientBrandMetaData {
  
  inline def apply(
    brandName: String,
    dataRecipientBrandId: String,
    logoUri: String,
    status: ACTIVE | INACTIVE | REMOVED
  ): DataRecipientBrandMetaData = {
    val __obj = js.Dynamic.literal(brandName = brandName.asInstanceOf[js.Any], dataRecipientBrandId = dataRecipientBrandId.asInstanceOf[js.Any], logoUri = logoUri.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataRecipientBrandMetaData]
  }
  
  extension [Self <: DataRecipientBrandMetaData](x: Self) {
    
    inline def setBrandName(value: String): Self = StObject.set(x, "brandName", value.asInstanceOf[js.Any])
    
    inline def setDataRecipientBrandId(value: String): Self = StObject.set(x, "dataRecipientBrandId", value.asInstanceOf[js.Any])
    
    inline def setLogoUri(value: String): Self = StObject.set(x, "logoUri", value.asInstanceOf[js.Any])
    
    inline def setSoftwareProducts(value: js.Array[LogoUri]): Self = StObject.set(x, "softwareProducts", value.asInstanceOf[js.Any])
    
    inline def setSoftwareProductsNull: Self = StObject.set(x, "softwareProducts", null)
    
    inline def setSoftwareProductsUndefined: Self = StObject.set(x, "softwareProducts", js.undefined)
    
    inline def setSoftwareProductsVarargs(value: LogoUri*): Self = StObject.set(x, "softwareProducts", js.Array(value*))
    
    inline def setStatus(value: ACTIVE | INACTIVE | REMOVED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
