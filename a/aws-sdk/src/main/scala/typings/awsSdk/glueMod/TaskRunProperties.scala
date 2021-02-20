package typings.awsSdk.glueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskRunProperties extends StObject {
  
  /**
    * The configuration properties for an exporting labels task run.
    */
  var ExportLabelsTaskRunProperties: js.UndefOr[typings.awsSdk.glueMod.ExportLabelsTaskRunProperties] = js.native
  
  /**
    * The configuration properties for a find matches task run.
    */
  var FindMatchesTaskRunProperties: js.UndefOr[typings.awsSdk.glueMod.FindMatchesTaskRunProperties] = js.native
  
  /**
    * The configuration properties for an importing labels task run.
    */
  var ImportLabelsTaskRunProperties: js.UndefOr[typings.awsSdk.glueMod.ImportLabelsTaskRunProperties] = js.native
  
  /**
    * The configuration properties for a labeling set generation task run.
    */
  var LabelingSetGenerationTaskRunProperties: js.UndefOr[typings.awsSdk.glueMod.LabelingSetGenerationTaskRunProperties] = js.native
  
  /**
    * The type of task run.
    */
  var TaskType: js.UndefOr[typings.awsSdk.glueMod.TaskType] = js.native
}
object TaskRunProperties {
  
  @scala.inline
  def apply(): TaskRunProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRunProperties]
  }
  
  @scala.inline
  implicit class TaskRunPropertiesMutableBuilder[Self <: TaskRunProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExportLabelsTaskRunProperties(value: ExportLabelsTaskRunProperties): Self = StObject.set(x, "ExportLabelsTaskRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportLabelsTaskRunPropertiesUndefined: Self = StObject.set(x, "ExportLabelsTaskRunProperties", js.undefined)
    
    @scala.inline
    def setFindMatchesTaskRunProperties(value: FindMatchesTaskRunProperties): Self = StObject.set(x, "FindMatchesTaskRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindMatchesTaskRunPropertiesUndefined: Self = StObject.set(x, "FindMatchesTaskRunProperties", js.undefined)
    
    @scala.inline
    def setImportLabelsTaskRunProperties(value: ImportLabelsTaskRunProperties): Self = StObject.set(x, "ImportLabelsTaskRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportLabelsTaskRunPropertiesUndefined: Self = StObject.set(x, "ImportLabelsTaskRunProperties", js.undefined)
    
    @scala.inline
    def setLabelingSetGenerationTaskRunProperties(value: LabelingSetGenerationTaskRunProperties): Self = StObject.set(x, "LabelingSetGenerationTaskRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelingSetGenerationTaskRunPropertiesUndefined: Self = StObject.set(x, "LabelingSetGenerationTaskRunProperties", js.undefined)
    
    @scala.inline
    def setTaskType(value: TaskType): Self = StObject.set(x, "TaskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskTypeUndefined: Self = StObject.set(x, "TaskType", js.undefined)
  }
}
