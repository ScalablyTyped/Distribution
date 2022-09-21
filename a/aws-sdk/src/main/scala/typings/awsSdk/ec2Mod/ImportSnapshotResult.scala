package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportSnapshotResult extends StObject {
  
  /**
    * A description of the import snapshot task.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * The ID of the import snapshot task.
    */
  var ImportTaskId: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the import snapshot task.
    */
  var SnapshotTaskDetail: js.UndefOr[typings.awsSdk.ec2Mod.SnapshotTaskDetail] = js.undefined
  
  /**
    * Any tags assigned to the import snapshot task.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object ImportSnapshotResult {
  
  inline def apply(): ImportSnapshotResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportSnapshotResult]
  }
  
  extension [Self <: ImportSnapshotResult](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setImportTaskId(value: String): Self = StObject.set(x, "ImportTaskId", value.asInstanceOf[js.Any])
    
    inline def setImportTaskIdUndefined: Self = StObject.set(x, "ImportTaskId", js.undefined)
    
    inline def setSnapshotTaskDetail(value: SnapshotTaskDetail): Self = StObject.set(x, "SnapshotTaskDetail", value.asInstanceOf[js.Any])
    
    inline def setSnapshotTaskDetailUndefined: Self = StObject.set(x, "SnapshotTaskDetail", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
