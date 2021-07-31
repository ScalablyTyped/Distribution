package typings.awsSdk.discoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDeleteImportDataRequest extends StObject {
  
  /**
    * The IDs for the import tasks that you want to delete.
    */
  var importTaskIds: ToDeleteIdentifierList
}
object BatchDeleteImportDataRequest {
  
  @scala.inline
  def apply(importTaskIds: ToDeleteIdentifierList): BatchDeleteImportDataRequest = {
    val __obj = js.Dynamic.literal(importTaskIds = importTaskIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchDeleteImportDataRequest]
  }
  
  @scala.inline
  implicit class BatchDeleteImportDataRequestMutableBuilder[Self <: BatchDeleteImportDataRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setImportTaskIds(value: ToDeleteIdentifierList): Self = StObject.set(x, "importTaskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImportTaskIdsVarargs(value: ImportTaskIdentifier*): Self = StObject.set(x, "importTaskIds", js.Array(value :_*))
  }
}
