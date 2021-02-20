package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateServicePrimaryTaskSetResponse extends StObject {
  
  var taskSet: js.UndefOr[TaskSet] = js.native
}
object UpdateServicePrimaryTaskSetResponse {
  
  @scala.inline
  def apply(): UpdateServicePrimaryTaskSetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateServicePrimaryTaskSetResponse]
  }
  
  @scala.inline
  implicit class UpdateServicePrimaryTaskSetResponseMutableBuilder[Self <: UpdateServicePrimaryTaskSetResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTaskSet(value: TaskSet): Self = StObject.set(x, "taskSet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskSetUndefined: Self = StObject.set(x, "taskSet", js.undefined)
  }
}
