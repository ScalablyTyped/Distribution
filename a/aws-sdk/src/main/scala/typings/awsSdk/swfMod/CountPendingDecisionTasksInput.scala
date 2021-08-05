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
  
  inline def apply(domain: DomainName, taskList: TaskList): CountPendingDecisionTasksInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountPendingDecisionTasksInput]
  }
  
  extension [Self <: CountPendingDecisionTasksInput](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
  }
}
