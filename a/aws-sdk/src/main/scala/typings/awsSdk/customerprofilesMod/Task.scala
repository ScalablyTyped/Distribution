package typings.awsSdk.customerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Task extends StObject {
  
  /**
    * The operation to be performed on the provided source fields.
    */
  var ConnectorOperator: js.UndefOr[typings.awsSdk.customerprofilesMod.ConnectorOperator] = js.undefined
  
  /**
    * A field in a destination connector, or a field value against which Amazon AppFlow validates a source field.
    */
  var DestinationField: js.UndefOr[typings.awsSdk.customerprofilesMod.DestinationField] = js.undefined
  
  /**
    * The source fields to which a particular task is applied.
    */
  var SourceFields: typings.awsSdk.customerprofilesMod.SourceFields
  
  /**
    * A map used to store task-related information. The service looks for particular information based on the TaskType.
    */
  var TaskProperties: js.UndefOr[TaskPropertiesMap] = js.undefined
  
  /**
    * Specifies the particular task implementation that Amazon AppFlow performs.
    */
  var TaskType: typings.awsSdk.customerprofilesMod.TaskType
}
object Task {
  
  inline def apply(SourceFields: SourceFields, TaskType: TaskType): Task = {
    val __obj = js.Dynamic.literal(SourceFields = SourceFields.asInstanceOf[js.Any], TaskType = TaskType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Task]
  }
  
  extension [Self <: Task](x: Self) {
    
    inline def setConnectorOperator(value: ConnectorOperator): Self = StObject.set(x, "ConnectorOperator", value.asInstanceOf[js.Any])
    
    inline def setConnectorOperatorUndefined: Self = StObject.set(x, "ConnectorOperator", js.undefined)
    
    inline def setDestinationField(value: DestinationField): Self = StObject.set(x, "DestinationField", value.asInstanceOf[js.Any])
    
    inline def setDestinationFieldUndefined: Self = StObject.set(x, "DestinationField", js.undefined)
    
    inline def setSourceFields(value: SourceFields): Self = StObject.set(x, "SourceFields", value.asInstanceOf[js.Any])
    
    inline def setSourceFieldsVarargs(value: stringTo2048*): Self = StObject.set(x, "SourceFields", js.Array(value*))
    
    inline def setTaskProperties(value: TaskPropertiesMap): Self = StObject.set(x, "TaskProperties", value.asInstanceOf[js.Any])
    
    inline def setTaskPropertiesUndefined: Self = StObject.set(x, "TaskProperties", js.undefined)
    
    inline def setTaskType(value: TaskType): Self = StObject.set(x, "TaskType", value.asInstanceOf[js.Any])
  }
}
