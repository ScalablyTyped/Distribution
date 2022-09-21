package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdatePartnerStatusInputMessage extends StObject {
  
  /**
    * The Amazon Web Services account ID that owns the cluster.
    */
  var AccountId: PartnerIntegrationAccountId
  
  /**
    * The cluster identifier of the cluster whose partner integration status is being updated.
    */
  var ClusterIdentifier: PartnerIntegrationClusterIdentifier
  
  /**
    * The name of the database whose partner integration status is being updated.
    */
  var DatabaseName: PartnerIntegrationDatabaseName
  
  /**
    * The name of the partner whose integration status is being updated.
    */
  var PartnerName: PartnerIntegrationPartnerName
  
  /**
    * The value of the updated status.
    */
  var Status: PartnerIntegrationStatus
  
  /**
    * The status message provided by the partner.
    */
  var StatusMessage: js.UndefOr[PartnerIntegrationStatusMessage] = js.undefined
}
object UpdatePartnerStatusInputMessage {
  
  inline def apply(
    AccountId: PartnerIntegrationAccountId,
    ClusterIdentifier: PartnerIntegrationClusterIdentifier,
    DatabaseName: PartnerIntegrationDatabaseName,
    PartnerName: PartnerIntegrationPartnerName,
    Status: PartnerIntegrationStatus
  ): UpdatePartnerStatusInputMessage = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], PartnerName = PartnerName.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePartnerStatusInputMessage]
  }
  
  extension [Self <: UpdatePartnerStatusInputMessage](x: Self) {
    
    inline def setAccountId(value: PartnerIntegrationAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifier(value: PartnerIntegrationClusterIdentifier): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: PartnerIntegrationDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setPartnerName(value: PartnerIntegrationPartnerName): Self = StObject.set(x, "PartnerName", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: PartnerIntegrationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: PartnerIntegrationStatusMessage): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
  }
}
