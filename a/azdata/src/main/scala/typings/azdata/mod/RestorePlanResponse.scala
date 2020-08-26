package typings.azdata.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestorePlanResponse extends js.Object {
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
  implicit class RestorePlanResponseOps[Self <: RestorePlanResponse] (val x: Self) extends AnyVal {
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
    def setBackupSetsToRestoreVarargs(value: DatabaseFileInfo*): Self = this.set("backupSetsToRestore", js.Array(value :_*))
    @scala.inline
    def setBackupSetsToRestore(value: js.Array[DatabaseFileInfo]): Self = this.set("backupSetsToRestore", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanRestore(value: Boolean): Self = this.set("canRestore", value.asInstanceOf[js.Any])
    @scala.inline
    def setDatabaseNamesFromBackupSetsVarargs(value: String*): Self = this.set("databaseNamesFromBackupSets", js.Array(value :_*))
    @scala.inline
    def setDatabaseNamesFromBackupSets(value: js.Array[String]): Self = this.set("databaseNamesFromBackupSets", value.asInstanceOf[js.Any])
    @scala.inline
    def setDbFilesVarargs(value: RestoreDatabaseFileInfo*): Self = this.set("dbFiles", js.Array(value :_*))
    @scala.inline
    def setDbFiles(value: js.Array[RestoreDatabaseFileInfo]): Self = this.set("dbFiles", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlanDetails(value: StringDictionary[RestorePlanDetailInfo]): Self = this.set("planDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def setSessionId(value: String): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
  
}

