package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PartnerIntegrationInputMessage extends StObject {
  
  /**
    * The Amazon Web Services account ID that owns the cluster.
    */
  var AccountId: PartnerIntegrationAccountId
  
  /**
    * The cluster identifier of the cluster that receives data from the partner.
    */
  var ClusterIdentifier: PartnerIntegrationClusterIdentifier
  
  /**
    * The name of the database that receives data from the partner.
    */
  var DatabaseName: PartnerIntegrationDatabaseName
  
  /**
    * The name of the partner that is authorized to send data.
    */
  var PartnerName: PartnerIntegrationPartnerName
}
object PartnerIntegrationInputMessage {
  
  inline def apply(
    AccountId: PartnerIntegrationAccountId,
    ClusterIdentifier: PartnerIntegrationClusterIdentifier,
    DatabaseName: PartnerIntegrationDatabaseName,
    PartnerName: PartnerIntegrationPartnerName
  ): PartnerIntegrationInputMessage = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any], PartnerName = PartnerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartnerIntegrationInputMessage]
  }
  
  extension [Self <: PartnerIntegrationInputMessage](x: Self) {
    
    inline def setAccountId(value: PartnerIntegrationAccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setClusterIdentifier(value: PartnerIntegrationClusterIdentifier): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: PartnerIntegrationDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
    
    inline def setPartnerName(value: PartnerIntegrationPartnerName): Self = StObject.set(x, "PartnerName", value.asInstanceOf[js.Any])
  }
}
