package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkflowTypeDetail extends js.Object {
  /**
    * Configuration settings of the workflow type registered through RegisterWorkflowType 
    */
  var configuration: WorkflowTypeConfiguration = js.native
  /**
    * General information about the workflow type. The status of the workflow type (returned in the WorkflowTypeInfo structure) can be one of the following.    REGISTERED – The type is registered and available. Workers supporting this type should be running.    DEPRECATED – The type was deprecated using DeprecateWorkflowType, but is still in use. You should keep workers supporting this type running. You cannot create new workflow executions of this type.  
    */
  var typeInfo: WorkflowTypeInfo = js.native
}

object WorkflowTypeDetail {
  @scala.inline
  def apply(configuration: WorkflowTypeConfiguration, typeInfo: WorkflowTypeInfo): WorkflowTypeDetail = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], typeInfo = typeInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkflowTypeDetail]
  }
}

