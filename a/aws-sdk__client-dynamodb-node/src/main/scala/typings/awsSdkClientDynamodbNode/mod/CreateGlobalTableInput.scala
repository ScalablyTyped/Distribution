package typings.awsSdkClientDynamodbNode.mod

import typings.awsSdkClientDynamodbNode.typesReplicaMod.Replica
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateGlobalTableInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesCreateGlobalTableInputMod.CreateGlobalTableInput
object CreateGlobalTableInput {
  
  @scala.inline
  def apply(GlobalTableName: String, ReplicationGroup: js.Array[Replica] | Iterable[Replica]): CreateGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicationGroup = ReplicationGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateGlobalTableInput]
  }
}
