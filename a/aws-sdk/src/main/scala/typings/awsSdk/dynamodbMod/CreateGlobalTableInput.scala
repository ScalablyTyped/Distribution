package typings.awsSdk.dynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalTableInput extends StObject {
  
  /**
    * The global table name.
    */
  var GlobalTableName: TableName
  
  /**
    * The Regions where the global table needs to be created.
    */
  var ReplicationGroup: ReplicaList
}
object CreateGlobalTableInput {
  
  @scala.inline
  def apply(GlobalTableName: TableName, ReplicationGroup: ReplicaList): CreateGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalTableInput]
  }
  
  @scala.inline
  implicit class CreateGlobalTableInputMutableBuilder[Self <: CreateGlobalTableInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGlobalTableName(value: TableName): Self = StObject.set(x, "GlobalTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroup(value: ReplicaList): Self = StObject.set(x, "ReplicationGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationGroupVarargs(value: Replica*): Self = StObject.set(x, "ReplicationGroup", js.Array(value :_*))
  }
}
