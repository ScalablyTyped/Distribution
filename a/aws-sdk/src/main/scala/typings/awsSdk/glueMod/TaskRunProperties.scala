package typings.awsSdk.glueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TaskRunProperties extends js.Object {
  
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
  implicit class TaskRunPropertiesOps[Self <: TaskRunProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExportLabelsTaskRunProperties(value: ExportLabelsTaskRunProperties): Self = this.set("ExportLabelsTaskRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportLabelsTaskRunProperties: Self = this.set("ExportLabelsTaskRunProperties", js.undefined)
    
    @scala.inline
    def setFindMatchesTaskRunProperties(value: FindMatchesTaskRunProperties): Self = this.set("FindMatchesTaskRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindMatchesTaskRunProperties: Self = this.set("FindMatchesTaskRunProperties", js.undefined)
    
    @scala.inline
    def setImportLabelsTaskRunProperties(value: ImportLabelsTaskRunProperties): Self = this.set("ImportLabelsTaskRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportLabelsTaskRunProperties: Self = this.set("ImportLabelsTaskRunProperties", js.undefined)
    
    @scala.inline
    def setLabelingSetGenerationTaskRunProperties(value: LabelingSetGenerationTaskRunProperties): Self = this.set("LabelingSetGenerationTaskRunProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelingSetGenerationTaskRunProperties: Self = this.set("LabelingSetGenerationTaskRunProperties", js.undefined)
    
    @scala.inline
    def setTaskType(value: TaskType): Self = this.set("TaskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskType: Self = this.set("TaskType", js.undefined)
  }
}
