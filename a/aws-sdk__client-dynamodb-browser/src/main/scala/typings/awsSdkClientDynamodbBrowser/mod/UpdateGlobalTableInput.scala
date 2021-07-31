package typings.awsSdkClientDynamodbBrowser.mod

import typings.awsSdkClientDynamodbBrowser.typesReplicaUpdateMod.ReplicaUpdate
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateGlobalTableInput
  extends StObject
     with typings.awsSdkClientDynamodbBrowser.typesUpdateGlobalTableInputMod.UpdateGlobalTableInput
object UpdateGlobalTableInput {
  
  @scala.inline
  def apply(GlobalTableName: String, ReplicaUpdates: js.Array[ReplicaUpdate] | Iterable[ReplicaUpdate]): UpdateGlobalTableInput = {
    val __obj = js.Dynamic.literal(GlobalTableName = GlobalTableName.asInstanceOf[js.Any], ReplicaUpdates = ReplicaUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGlobalTableInput]
  }
}
