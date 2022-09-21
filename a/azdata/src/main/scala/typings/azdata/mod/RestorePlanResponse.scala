package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RestorePlanResponse extends StObject {
  
  var backupSetsToRestore: js.Array[DatabaseFileInfo]
  
  var canRestore: Boolean
  
  var databaseNamesFromBackupSets: js.Array[String]
  
  var dbFiles: js.Array[RestoreDatabaseFileInfo]
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var planDetails: StringDictionary[RestorePlanDetailInfo]
  
  var sessionId: String
}
object RestorePlanResponse {
  
  inline def apply(
    backupSetsToRestore: js.Array[DatabaseFileInfo],
    canRestore: Boolean,
    databaseNamesFromBackupSets: js.Array[String],
    dbFiles: js.Array[RestoreDatabaseFileInfo],
    planDetails: StringDictionary[RestorePlanDetailInfo],
    sessionId: String
  ): RestorePlanResponse = {
    val __obj = js.Dynamic.literal(backupSetsToRestore = backupSetsToRestore.asInstanceOf[js.Any], canRestore = canRestore.asInstanceOf[js.Any], databaseNamesFromBackupSets = databaseNamesFromBackupSets.asInstanceOf[js.Any], dbFiles = dbFiles.asInstanceOf[js.Any], planDetails = planDetails.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestorePlanResponse]
  }
  
  extension [Self <: RestorePlanResponse](x: Self) {
    
    inline def setBackupSetsToRestore(value: js.Array[DatabaseFileInfo]): Self = StObject.set(x, "backupSetsToRestore", value.asInstanceOf[js.Any])
    
    inline def setBackupSetsToRestoreVarargs(value: DatabaseFileInfo*): Self = StObject.set(x, "backupSetsToRestore", js.Array(value*))
    
    inline def setCanRestore(value: Boolean): Self = StObject.set(x, "canRestore", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNamesFromBackupSets(value: js.Array[String]): Self = StObject.set(x, "databaseNamesFromBackupSets", value.asInstanceOf[js.Any])
    
    inline def setDatabaseNamesFromBackupSetsVarargs(value: String*): Self = StObject.set(x, "databaseNamesFromBackupSets", js.Array(value*))
    
    inline def setDbFiles(value: js.Array[RestoreDatabaseFileInfo]): Self = StObject.set(x, "dbFiles", value.asInstanceOf[js.Any])
    
    inline def setDbFilesVarargs(value: RestoreDatabaseFileInfo*): Self = StObject.set(x, "dbFiles", js.Array(value*))
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setPlanDetails(value: StringDictionary[RestorePlanDetailInfo]): Self = StObject.set(x, "planDetails", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
