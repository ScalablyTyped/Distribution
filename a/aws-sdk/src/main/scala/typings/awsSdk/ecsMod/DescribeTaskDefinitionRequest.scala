package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeTaskDefinitionRequest extends StObject {
  
  /**
    * Determines whether to see the resource tags for the task definition. If TAGS is specified, the tags are included in the response. If this field is omitted, tags aren't included in the response.
    */
  var include: js.UndefOr[TaskDefinitionFieldList] = js.undefined
  
  /**
    * The family for the latest ACTIVE revision, family and revision (family:revision) for a specific revision in the family, or full Amazon Resource Name (ARN) of the task definition to describe.
    */
  var taskDefinition: String
}
object DescribeTaskDefinitionRequest {
  
  inline def apply(taskDefinition: String): DescribeTaskDefinitionRequest = {
    val __obj = js.Dynamic.literal(taskDefinition = taskDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeTaskDefinitionRequest]
  }
  
  extension [Self <: DescribeTaskDefinitionRequest](x: Self) {
    
    inline def setInclude(value: TaskDefinitionFieldList): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: TaskDefinitionField*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setTaskDefinition(value: String): Self = StObject.set(x, "taskDefinition", value.asInstanceOf[js.Any])
  }
}
