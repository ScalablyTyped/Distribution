package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelCommandRequest extends StObject {
  
  /**
    * The ID of the command you want to cancel.
    */
  var CommandId: typings.awsSdk.ssmMod.CommandId
  
  /**
    * (Optional) A list of instance IDs on which you want to cancel the command. If not provided, the command is canceled on every instance on which it was requested.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.undefined
}
object CancelCommandRequest {
  
  @scala.inline
  def apply(CommandId: CommandId): CancelCommandRequest = {
    val __obj = js.Dynamic.literal(CommandId = CommandId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelCommandRequest]
  }
  
  @scala.inline
  implicit class CancelCommandRequestMutableBuilder[Self <: CancelCommandRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandId(value: CommandId): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIds(value: InstanceIdList): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    @scala.inline
    def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
  }
}
