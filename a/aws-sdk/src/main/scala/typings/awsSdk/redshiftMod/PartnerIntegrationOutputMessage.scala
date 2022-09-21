package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerIntegrationOutputMessage extends StObject {
  
  /**
    * The name of the database that receives data from the partner.
    */
  var DatabaseName: js.UndefOr[PartnerIntegrationDatabaseName] = js.undefined
  
  /**
    * The name of the partner that is authorized to send data.
    */
  var PartnerName: js.UndefOr[PartnerIntegrationPartnerName] = js.undefined
}
object PartnerIntegrationOutputMessage {
  
  inline def apply(): PartnerIntegrationOutputMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerIntegrationOutputMessage]
  }
  
  extension [Self <: PartnerIntegrationOutputMessage](x: Self) {
    
    inline def setDatabaseName(value: PartnerIntegrationDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setPartnerName(value: PartnerIntegrationPartnerName): Self = StObject.set(x, "PartnerName", value.asInstanceOf[js.Any])
    
    inline def setPartnerNameUndefined: Self = StObject.set(x, "PartnerName", js.undefined)
  }
}
