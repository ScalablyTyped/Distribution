package typings.awsSdk.rdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDBSnapshotMessage extends StObject {
  
  /**
    * The identifier of the DB instance that you want to create the snapshot of. Constraints:   Must match the identifier of an existing DBInstance.  
    */
  var DBInstanceIdentifier: String
  
  /**
    * The identifier for the DB snapshot. Constraints:   Can't be null, empty, or blank   Must contain from 1 to 255 letters, numbers, or hyphens   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens   Example: my-snapshot-id 
    */
  var DBSnapshotIdentifier: String
  
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateDBSnapshotMessage {
  
  @scala.inline
  def apply(DBInstanceIdentifier: String, DBSnapshotIdentifier: String): CreateDBSnapshotMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier.asInstanceOf[js.Any], DBSnapshotIdentifier = DBSnapshotIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDBSnapshotMessage]
  }
  
  @scala.inline
  implicit class CreateDBSnapshotMessageMutableBuilder[Self <: CreateDBSnapshotMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDBInstanceIdentifier(value: String): Self = StObject.set(x, "DBInstanceIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDBSnapshotIdentifier(value: String): Self = StObject.set(x, "DBSnapshotIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
