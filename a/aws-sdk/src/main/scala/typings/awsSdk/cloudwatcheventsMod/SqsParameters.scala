package typings.awsSdk.cloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqsParameters extends StObject {
  
  /**
    * The FIFO message group ID to use as the target.
    */
  var MessageGroupId: js.UndefOr[typings.awsSdk.cloudwatcheventsMod.MessageGroupId] = js.undefined
}
object SqsParameters {
  
  inline def apply(): SqsParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqsParameters]
  }
  
  extension [Self <: SqsParameters](x: Self) {
    
    inline def setMessageGroupId(value: MessageGroupId): Self = StObject.set(x, "MessageGroupId", value.asInstanceOf[js.Any])
    
    inline def setMessageGroupIdUndefined: Self = StObject.set(x, "MessageGroupId", js.undefined)
  }
}
