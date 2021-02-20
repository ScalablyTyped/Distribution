package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RestorePlanResponse extends StObject {
  
  var backupSetsToRestore: js.Array[DatabaseFileInfo] = js.native
  
  var canRestore: Boolean = js.native
  
  var databaseNamesFromBackupSets: js.Array[String] = js.native
  
  var dbFiles: js.Array[RestoreDatabaseFileInfo] = js.native
  
  var errorMessage: String = js.native
  
  var planDetails: StringDictionary[RestorePlanDetailInfo] = js.native
  
  var sessionId: String = js.native
}
object RestorePlanResponse {
  
  @scala.inline
  def apply(
    backupSetsToRestore: js.Array[DatabaseFileInfo],
    canRestore: Boolean,
    databaseNamesFromBackupSets: js.Array[String],
    dbFiles: js.Array[RestoreDatabaseFileInfo],
    errorMessage: String,
    planDetails: StringDictionary[RestorePlanDetailInfo],
    sessionId: String
  ): RestorePlanResponse = {
    val __obj = js.Dynamic.literal(backupSetsToRestore = backupSetsToRestore.asInstanceOf[js.Any], canRestore = canRestore.asInstanceOf[js.Any], databaseNamesFromBackupSets = databaseNamesFromBackupSets.asInstanceOf[js.Any], dbFiles = dbFiles.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], planDetails = planDetails.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestorePlanResponse]
  }
  
  @scala.inline
  implicit class RestorePlanResponseMutableBuilder[Self <: RestorePlanResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackupSetsToRestore(value: js.Array[DatabaseFileInfo]): Self = StObject.set(x, "backupSetsToRestore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackupSetsToRestoreVarargs(value: DatabaseFileInfo*): Self = StObject.set(x, "backupSetsToRestore", js.Array(value :_*))
    
    @scala.inline
    def setCanRestore(value: Boolean): Self = StObject.set(x, "canRestore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNamesFromBackupSets(value: js.Array[String]): Self = StObject.set(x, "databaseNamesFromBackupSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatabaseNamesFromBackupSetsVarargs(value: String*): Self = StObject.set(x, "databaseNamesFromBackupSets", js.Array(value :_*))
    
    @scala.inline
    def setDbFiles(value: js.Array[RestoreDatabaseFileInfo]): Self = StObject.set(x, "dbFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDbFilesVarargs(value: RestoreDatabaseFileInfo*): Self = StObject.set(x, "dbFiles", js.Array(value :_*))
    
    @scala.inline
    def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlanDetails(value: StringDictionary[RestorePlanDetailInfo]): Self = StObject.set(x, "planDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
