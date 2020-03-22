package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RestoreProvider extends DataProvider {
  def cancelRestorePlan(connectionUri: String, restoreInfo: RestoreInfo): Thenable[Boolean]
  def getRestoreConfigInfo(connectionUri: String): Thenable[RestoreConfigInfo]
  def getRestorePlan(connectionUri: String, restoreInfo: RestoreInfo): Thenable[RestorePlanResponse]
  def restore(connectionUri: String, restoreInfo: RestoreInfo): Thenable[RestoreResponse]
}

object RestoreProvider {
  @scala.inline
  def apply(
    cancelRestorePlan: (String, RestoreInfo) => Thenable[Boolean],
    getRestoreConfigInfo: String => Thenable[RestoreConfigInfo],
    getRestorePlan: (String, RestoreInfo) => Thenable[RestorePlanResponse],
    providerId: String,
    restore: (String, RestoreInfo) => Thenable[RestoreResponse],
    handle: Int | Double = null
  ): RestoreProvider = {
    val __obj = js.Dynamic.literal(cancelRestorePlan = js.Any.fromFunction2(cancelRestorePlan), getRestoreConfigInfo = js.Any.fromFunction1(getRestoreConfigInfo), getRestorePlan = js.Any.fromFunction2(getRestorePlan), providerId = providerId.asInstanceOf[js.Any], restore = js.Any.fromFunction2(restore))
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    __obj.asInstanceOf[RestoreProvider]
  }
}

