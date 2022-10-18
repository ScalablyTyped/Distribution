package typings.awsSdk.clientsSwfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollForActivityTaskInput extends StObject {
  
  /**
    * The name of the domain that contains the task lists being polled.
    */
  var domain: DomainName
  
  /**
    * Identity of the worker making the request, recorded in the ActivityTaskStarted event in the workflow history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
    */
  var identity: js.UndefOr[Identity] = js.undefined
  
  /**
    * Specifies the task list to poll for activity tasks. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var taskList: TaskList
}
object PollForActivityTaskInput {
  
  inline def apply(domain: DomainName, taskList: TaskList): PollForActivityTaskInput = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], taskList = taskList.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollForActivityTaskInput]
  }
  
  extension [Self <: PollForActivityTaskInput](x: Self) {
    
    inline def setDomain(value: DomainName): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setIdentity(value: Identity): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setTaskList(value: TaskList): Self = StObject.set(x, "taskList", value.asInstanceOf[js.Any])
  }
}
