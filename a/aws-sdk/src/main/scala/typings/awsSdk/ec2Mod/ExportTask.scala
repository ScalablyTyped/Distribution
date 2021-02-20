package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExportTask extends StObject {
  
  /**
    * A description of the resource being exported.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the export task.
    */
  var ExportTaskId: js.UndefOr[String] = js.native
  
  /**
    * Information about the export task.
    */
  var ExportToS3Task: js.UndefOr[typings.awsSdk.ec2Mod.ExportToS3Task] = js.native
  
  /**
    * Information about the instance to export.
    */
  var InstanceExportDetails: js.UndefOr[typings.awsSdk.ec2Mod.InstanceExportDetails] = js.native
  
  /**
    * The state of the export task.
    */
  var State: js.UndefOr[ExportTaskState] = js.native
  
  /**
    * The status message related to the export task.
    */
  var StatusMessage: js.UndefOr[String] = js.native
  
  /**
    * The tags for the export task.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ExportTask {
  
  @scala.inline
  def apply(): ExportTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportTask]
  }
  
  @scala.inline
  implicit class ExportTaskMutableBuilder[Self <: ExportTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setExportTaskId(value: String): Self = StObject.set(x, "ExportTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTaskIdUndefined: Self = StObject.set(x, "ExportTaskId", js.undefined)
    
    @scala.inline
    def setExportToS3Task(value: ExportToS3Task): Self = StObject.set(x, "ExportToS3Task", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportToS3TaskUndefined: Self = StObject.set(x, "ExportToS3Task", js.undefined)
    
    @scala.inline
    def setInstanceExportDetails(value: InstanceExportDetails): Self = StObject.set(x, "InstanceExportDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceExportDetailsUndefined: Self = StObject.set(x, "InstanceExportDetails", js.undefined)
    
    @scala.inline
    def setState(value: ExportTaskState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    @scala.inline
    def setStatusMessage(value: String): Self = StObject.set(x, "StatusMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusMessageUndefined: Self = StObject.set(x, "StatusMessage", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
