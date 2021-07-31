package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSnapshotTask extends StObject {
  
  /**
    * A description of the import snapshot task.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the import snapshot task.
    */
  var ImportTaskId: js.UndefOr[String] = js.undefined
  
  /**
    * Describes an import snapshot task.
    */
  var SnapshotTaskDetail: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotTaskDetail] = js.undefined
  
  /**
    * The tags for the import snapshot task.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ImportSnapshotTask {
  
  @scala.inline
  def apply(): ImportSnapshotTask = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSnapshotTask]
  }
  
  @scala.inline
  implicit class ImportSnapshotTaskMutableBuilder[Self <: ImportSnapshotTask] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setImportTaskId(value: String): Self = StObject.set(x, "ImportTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTaskIdUndefined: Self = StObject.set(x, "ImportTaskId", js.undefined)
    
    @scala.inline
    def setSnapshotTaskDetail(value: SnapshotTaskDetail): Self = StObject.set(x, "SnapshotTaskDetail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotTaskDetailUndefined: Self = StObject.set(x, "SnapshotTaskDetail", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value :_*))
  }
}
