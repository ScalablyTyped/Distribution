package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SqsParameters extends StObject {
  
  /**
    * The FIFO message group ID to use as the target.
    */
  var MessageGroupId: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.MessageGroupId] = js.native
}
object SqsParameters {
  
  @scala.inline
  def apply(): SqsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqsParameters]
  }
  
  @scala.inline
  implicit class SqsParametersMutableBuilder[Self <: SqsParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessageGroupId(value: MessageGroupId): Self = StObject.set(x, "MessageGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageGroupIdUndefined: Self = StObject.set(x, "MessageGroupId", js.undefined)
  }
}
