package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportSnapshotResult extends StObject {
  
  /**
    * A description of the import snapshot task.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * The ID of the import snapshot task.
    */
  var ImportTaskId: js.UndefOr[String] = js.native
  
  /**
    * Information about the import snapshot task.
    */
  var SnapshotTaskDetail: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotTaskDetail] = js.native
  
  /**
    * Any tags assigned to the snapshot being imported.
    */
  var Tags: js.UndefOr[TagList] = js.native
}
object ImportSnapshotResult {
  
  @scala.inline
  def apply(): ImportSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSnapshotResult]
  }
  
  @scala.inline
  implicit class ImportSnapshotResultMutableBuilder[Self <: ImportSnapshotResult] (val x: Self) extends AnyVal {
    
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
