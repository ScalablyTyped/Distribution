package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import typings.consumerDataStandards.consumerDataStandardsStrings.ACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.INACTIVE
import typings.consumerDataStandards.consumerDataStandardsStrings.REMOVED
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogoUri
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * Software product logo URI
    */
  var logoUri: String
  
  /**
    * Description of the software product
    */
  var softwareProductDescription: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique id of the Data Recipient software product issued by the CDR Register
    */
  var softwareProductId: String
  
  /**
    * Name of the software product
    */
  var softwareProductName: String
  
  /**
    * Software Product status in the CDR Register
    */
  var status: ACTIVE | INACTIVE | REMOVED
}
object LogoUri {
  
  inline def apply(
    logoUri: String,
    softwareProductId: String,
    softwareProductName: String,
    status: ACTIVE | INACTIVE | REMOVED
  ): LogoUri = {
    val __obj = js.Dynamic.literal(logoUri = logoUri.asInstanceOf[js.Any], softwareProductId = softwareProductId.asInstanceOf[js.Any], softwareProductName = softwareProductName.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogoUri]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LogoUri] (val x: Self) extends AnyVal {
    
    inline def setLogoUri(value: String): Self = StObject.set(x, "logoUri", value.asInstanceOf[js.Any])
    
    inline def setSoftwareProductDescription(value: String): Self = StObject.set(x, "softwareProductDescription", value.asInstanceOf[js.Any])
    
    inline def setSoftwareProductDescriptionNull: Self = StObject.set(x, "softwareProductDescription", null)
    
    inline def setSoftwareProductDescriptionUndefined: Self = StObject.set(x, "softwareProductDescription", js.undefined)
    
    inline def setSoftwareProductId(value: String): Self = StObject.set(x, "softwareProductId", value.asInstanceOf[js.Any])
    
    inline def setSoftwareProductName(value: String): Self = StObject.set(x, "softwareProductName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ACTIVE | INACTIVE | REMOVED): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
