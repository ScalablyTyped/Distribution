package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTypeDetail extends StObject {
  
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
  
  @scala.inline
  implicit class WorkflowTypeDetailMutableBuilder[Self <: WorkflowTypeDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: WorkflowTypeConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeInfo(value: WorkflowTypeInfo): Self = StObject.set(x, "typeInfo", value.asInstanceOf[js.Any])
  }
}
