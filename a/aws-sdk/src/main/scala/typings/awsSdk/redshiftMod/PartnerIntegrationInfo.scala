package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerIntegrationInfo extends StObject {
  
  /**
    * The date (UTC) that the partner integration was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the database that receives data from a partner.
    */
  var DatabaseName: js.UndefOr[PartnerIntegrationDatabaseName] = js.undefined
  
  /**
    * The name of the partner.
    */
  var PartnerName: js.UndefOr[PartnerIntegrationPartnerName] = js.undefined
  
  /**
    * The partner integration status.
    */
  var Status: js.UndefOr[PartnerIntegrationStatus] = js.undefined
  
  /**
    * The status message provided by the partner.
    */
  var StatusMessage: js.UndefOr[PartnerIntegrationStatusMessage] = js.undefined
  
  /**
    * The date (UTC) that the partner integration status was last updated by the partner.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object PartnerIntegrationInfo {
  
  inline def apply(): PartnerIntegrationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartnerIntegrationInfo]
  }
  
  extension [Self <: PartnerIntegrationInfo](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setDatabaseName(value: PartnerIntegrationDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNameUndefined: Self = StObject.set(x, "DatabaseName", js.undefined)
    
    inline def setPartnerName(value: PartnerIntegrationPartnerName): Self = StObject.set(x, "PartnerName", value.asInstanceOf[js.Any])
    
    inline def setPartnerNameUndefined: Self = StObject.set(x, "PartnerName", js.undefined)
    
    inline def setStatus(value: PartnerIntegrationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: PartnerIntegrationStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
