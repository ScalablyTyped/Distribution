package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteDBClusterMessage extends StObject {
  
  /**
    * The DB cluster identifier for the DB cluster to be deleted. This parameter isn't case-sensitive. Constraints:   Must match an existing DBClusterIdentifier.  
    */
  var DBClusterIdentifier: String = js.native
  
  /**
    *  The DB cluster snapshot identifier of the new DB cluster snapshot created when SkipFinalSnapshot is disabled.    Specifying this parameter and also skipping the creation of a final DB cluster snapshot with the SkipFinalShapshot parameter results in an error.  Constraints:   Must be 1 to 255 letters, numbers, or hyphens.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens  
    */
  var FinalDBSnapshotIdentifier: js.UndefOr[String] = js.native
  
  /**
    * A value that indicates whether to skip the creation of a final DB cluster snapshot before the DB cluster is deleted. If skip is specified, no DB cluster snapshot is created. If skip isn't specified, a DB cluster snapshot is created before the DB cluster is deleted. By default, skip isn't specified, and the DB cluster snapshot is created. By default, this parameter is disabled.  You must specify a FinalDBSnapshotIdentifier parameter if SkipFinalSnapshot is disabled. 
    */
  var SkipFinalSnapshot: js.UndefOr[Boolean] = js.native
}
object DeleteDBClusterMessage {
  
  @scala.inline
  def apply(DBClusterIdentifier: String): DeleteDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDBClusterMessage]
  }
  
  @scala.inline
  implicit class DeleteDBClusterMessageMutableBuilder[Self <: DeleteDBClusterMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBClusterIdentifier(value: String): Self = StObject.set(x, "DBClusterIdentifier", value.asInstanceOf[js.Any])
    
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
