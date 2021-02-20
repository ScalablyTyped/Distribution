package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CountPendingActivityTasksInput extends StObject {
  
  /**
    * The name of the domain that contains the task list.
    */
  var domain: DomainName = js.native
  
  /**
    * The name of the task list.
    */
  var taskList: TaskList = js.native
}
object CountPendingActivityTasksInput {
  
  @scala.inline
  def apply(domain: DomainName, taskList: TaskList): CountPendingActivityTasksInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountPendingActivityTasksInput]
  }
  
  @scala.inline
  implicit class CountPendingActivityTasksInputMutableBuilder[Self <: CountPendingActivityTasksInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
  }
}
