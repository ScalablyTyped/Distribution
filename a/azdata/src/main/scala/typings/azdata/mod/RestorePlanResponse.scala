package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestorePlanResponse extends js.Object {
  var backupSetsToRestore: js.Array[DatabaseFileInfo]
  var canRestore: Boolean
  var databaseNamesFromBackupSets: js.Array[String]
  var dbFiles: js.Array[RestoreDatabaseFileInfo]
  var errorMessage: String
  var planDetails: StringDictionary[RestorePlanDetailInfo]
  var sessionId: String
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
}

