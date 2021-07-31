package typings.awsSdk.neptuneMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteDBInstanceMessage extends StObject {
  
  /**
    * The DB instance identifier for the DB instance to be deleted. This parameter isn't case-sensitive. Constraints:   Must match the name of an existing DB instance.  
    */
  var DBInstanceIdentifier: String
  
  /**
    *  The DBSnapshotIdentifier of the new DBSnapshot created when SkipFinalSnapshot is set to false.  Specifying this parameter and also setting the SkipFinalShapshot parameter to true results in an error.  Constraints:   Must be 1 to 255 letters or numbers.   First character must be a letter   Cannot end with a hyphen or contain two consecutive hyphens   Cannot be specified when deleting a Read Replica.  
    */
  var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.undefined
  
  /**
    *  Determines whether a final DB snapshot is created before the DB instance is deleted. If true is specified, no DBSnapshot is created. If false is specified, a DB snapshot is created before the DB instance is deleted. Note that when a DB instance is in a failure state and has a status of 'failed', 'incompatible-restore', or 'incompatible-network', it can only be deleted when the SkipFinalSnapshot parameter is set to "true". Specify true when deleting a Read Replica.  The FinalDBSnapshotIdentifier parameter must be specified if SkipFinalSnapshot is false.  Default: false 
    */
  var SkipFinalSnapshot: js.UndefOr[Boolean] = js.undefined
}
object DeleteDBInstanceMessage {
  
  @scala.inline
  def apply(DBInstanceIdentifier: String): DeleteDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBInstanceMessage]
  }
  
  @scala.inline
  implicit class DeleteDBInstanceMessageMutableBuilder[Self <: DeleteDBInstanceMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalDBSnapshotIdentifier(value: String): Self = StObject.set(x, "FinalDBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinalDBSnapshotIdentifierUndefined: Self = StObject.set(x, "FinalDBSnapshotIdentifier", js.undefined)
    
    @scala.inline
    def setSkipFinalSnapshot(value: Boolean): Self = StObject.set(x, "SkipFinalSnapshot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipFinalSnapshotUndefined: Self = StObject.set(x, "SkipFinalSnapshot", js.undefined)
  }
}
