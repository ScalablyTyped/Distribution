package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountPendingDecisionTasksInput extends StObject {
  
  /**
    * The name of the domain that contains the task list.
    */
  var domain: DomainName
  
  /**
    * The name of the task list.
    */
  var taskList: TaskList
}
object CountPendingDecisionTasksInput {
  
  @scala.inline
  def apply(domain: DomainName, taskList: TaskList): CountPendingDecisionTasksInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountPendingDecisionTasksInput]
  }
  
  @scala.inline
  implicit class CountPendingDecisionTasksInputMutableBuilder[Self <: CountPendingDecisionTasksInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
  }
}
