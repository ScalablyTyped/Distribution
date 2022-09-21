package typings.awsSdk.redshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyClusterSnapshotMessage extends StObject {
  
  /**
    * The number of days that a manual snapshot is retained. If the value is -1, the manual snapshot is retained indefinitely.  The value must be either -1 or an integer between 1 and 3,653. The default value is -1.
    */
  var ManualSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * The identifier of the cluster the source snapshot was created from. This parameter is required if your IAM user has a policy containing a snapshot resource element that specifies anything other than * for the cluster name. Constraints:   Must be the identifier for a valid cluster.  
    */
  var SourceSnapshotClusterIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    * The identifier for the source snapshot. Constraints:   Must be the identifier for a valid automated snapshot whose state is available.  
    */
  var SourceSnapshotIdentifier: String
  
  /**
    * The identifier given to the new manual snapshot. Constraints:   Cannot be null, empty, or blank.   Must contain from 1 to 255 alphanumeric characters or hyphens.   First character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.   Must be unique for the Amazon Web Services account that is making the request.  
    */
  var TargetSnapshotIdentifier: String
}
object CopyClusterSnapshotMessage {
  
  inline def apply(SourceSnapshotIdentifier: String, TargetSnapshotIdentifier: String): CopyClusterSnapshotMessage = {
    val __obj = js.Dynamic.literal(SourceSnapshotIdentifier = SourceSnapshotIdentifier.asInstanceOf[js.Any], TargetSnapshotIdentifier = TargetSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyClusterSnapshotMessage]
  }
  
  extension [Self <: CopyClusterSnapshotMessage](x: Self) {
    
    inline def setManualSnapshotRetentionPeriod(value: IntegerOptional): Self = StObject.set(x, "ManualSnapshotRetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setManualSnapshotRetentionPeriodUndefined: Self = StObject.set(x, "ManualSnapshotRetentionPeriod", js.undefined)
    
    inline def setSourceSnapshotClusterIdentifier(value: String): Self = StObject.set(x, "SourceSnapshotClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setSourceSnapshotClusterIdentifierUndefined: Self = StObject.set(x, "SourceSnapshotClusterIdentifier", js.undefined)
    
    inline def setSourceSnapshotIdentifier(value: String): Self = StObject.set(x, "SourceSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    inline def setTargetSnapshotIdentifier(value: String): Self = StObject.set(x, "TargetSnapshotIdentifier", value.asInstanceOf[js.Any])
  }
}
