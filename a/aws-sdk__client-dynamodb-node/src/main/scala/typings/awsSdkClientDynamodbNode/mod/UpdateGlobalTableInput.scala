package typings.awsSdkClientDynamodbNode.mod

import typings.awsSdkClientDynamodbNode.typesReplicaUpdateMod.ReplicaUpdate
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalTableInput
  extends StObject
     with typings.awsSdkClientDynamodbNode.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
object UpdateGlobalTableInput {
  
  inline def apply(GlobalTableName: String, ReplicaUpdates: js.Array[ReplicaUpdate] | Iterable[ReplicaUpdate]): UpdateGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableInput]
  }
}
