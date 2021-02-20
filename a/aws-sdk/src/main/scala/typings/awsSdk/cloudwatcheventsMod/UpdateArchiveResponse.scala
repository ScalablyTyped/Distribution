package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateArchiveResponse extends StObject {
  
  /**
    * The ARN of the archive.
    */
  var ArchiveArn: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.ArchiveArn] = js.native
  
  /**
    * The time at which the archive was updated.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The state of the archive.
    */
  var State: js.UndefOr[ArchiveState] = js.native
  
  /**
    * The reason that the archive is in the current state.
    */
  var StateReason: js.UndefOr[ArchiveStateReason] = js.native
}
object UpdateArchiveResponse {
  
  @scala.inline
  def apply(): UpdateArchiveResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateArchiveResponse]
  }
  
  @scala.inline
  implicit class UpdateArchiveResponseMutableBuilder[Self <: UpdateArchiveResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArchiveArn(value: ArchiveArn): Self = StObject.set(x, "ArchiveArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArchiveArnUndefined: Self = StObject.set(x, "ArchiveArn", js.undefined)
    
    @scala.inline
    def setCreationTime(value: Timestamp): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    @scala.inline
    def setState(value: ArchiveState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReason(value: ArchiveStateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
