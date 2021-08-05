package typings.awsSdk.docdbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifyDBClusterSnapshotAttributeMessage extends StObject {
  
  /**
    * The name of the cluster snapshot attribute to modify. To manage authorization for other AWS accounts to copy or restore a manual cluster snapshot, set this value to restore.
    */
  var AttributeName: String
  
  /**
    * The identifier for the cluster snapshot to modify the attributes for.
    */
  var DBClusterSnapshotIdentifier: String
  
  /**
    * A list of cluster snapshot attributes to add to the attribute specified by AttributeName. To authorize other AWS accounts to copy or restore a manual cluster snapshot, set this list to include one or more AWS account IDs. To make the manual cluster snapshot restorable by any AWS account, set it to all. Do not add the all value for any manual cluster snapshots that contain private information that you don't want to be available to all AWS accounts.
    */
  var ValuesToAdd: js.UndefOr[AttributeValueList] = js.undefined
  
  /**
    * A list of cluster snapshot attributes to remove from the attribute specified by AttributeName. To remove authorization for other AWS accounts to copy or restore a manual cluster snapshot, set this list to include one or more AWS account identifiers. To remove authorization for any AWS account to copy or restore the cluster snapshot, set it to all . If you specify all, an AWS account whose account ID is explicitly added to the restore attribute can still copy or restore a manual cluster snapshot.
    */
  var ValuesToRemove: js.UndefOr[AttributeValueList] = js.undefined
}
object ModifyDBClusterSnapshotAttributeMessage {
  
  inline def apply(AttributeName: String, DBClusterSnapshotIdentifier: String): ModifyDBClusterSnapshotAttributeMessage = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName.asInstanceOf[js.Any], DBClusterSnapshotIdentifier = DBClusterSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBClusterSnapshotAttributeMessage]
  }
  
  extension [Self <: ModifyDBClusterSnapshotAttributeMessage](x: Self) {
    
    inline def setAttributeName(value: String): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setDBClusterSnapshotIdentifier(value: String): Self = StObject.set(x, "DBClusterSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setValuesToAdd(value: AttributeValueList): Self = StObject.set(x, "ValuesToAdd", value.asInstanceOf[js.Any])
    
    inline def setValuesToAddUndefined: Self = StObject.set(x, "ValuesToAdd", js.undefined)
    
    inline def setValuesToAddVarargs(value: String*): Self = StObject.set(x, "ValuesToAdd", js.Array(value :_*))
    
    inline def setValuesToRemove(value: AttributeValueList): Self = StObject.set(x, "ValuesToRemove", value.asInstanceOf[js.Any])
    
    inline def setValuesToRemoveUndefined: Self = StObject.set(x, "ValuesToRemove", js.undefined)
    
    inline def setValuesToRemoveVarargs(value: String*): Self = StObject.set(x, "ValuesToRemove", js.Array(value :_*))
  }
}
