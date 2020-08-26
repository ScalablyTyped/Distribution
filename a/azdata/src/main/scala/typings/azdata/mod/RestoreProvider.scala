package typings.azdata.mod

import typings.vscode.Thenable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RestoreProvider extends DataProvider {
  def cancelRestorePlan(connectionUri: String, restoreInfo: RestoreInfo): Thenable[Boolean] = js.native
  def getRestoreConfigInfo(connectionUri: String): Thenable[RestoreConfigInfo] = js.native
  def getRestorePlan(connectionUri: String, restoreInfo: RestoreInfo): Thenable[RestorePlanResponse] = js.native
  def restore(connectionUri: String, restoreInfo: RestoreInfo): Thenable[RestoreResponse] = js.native
}

object RestoreProvider {
  @scala.inline
  def apply(
    cancelRestorePlan: (String, RestoreInfo) => Thenable[Boolean],
    getRestoreConfigInfo: String => Thenable[RestoreConfigInfo],
    getRestorePlan: (String, RestoreInfo) => Thenable[RestorePlanResponse],
    providerId: String,
    restore: (String, RestoreInfo) => Thenable[RestoreResponse]
  ): RestoreProvider = {
    val __obj = js.Dynamic.literal(cancelRestorePlan = js.Any.fromFunction2(cancelRestorePlan), getRestoreConfigInfo = js.Any.fromFunction1(getRestoreConfigInfo), getRestorePlan = js.Any.fromFunction2(getRestorePlan), providerId = providerId.asInstanceOf[js.Any], restore = js.Any.fromFunction2(restore))
    __obj.asInstanceOf[RestoreProvider]
  }
  @scala.inline
  implicit class RestoreProviderOps[Self <: RestoreProvider] (val x: Self) extends AnyVal {
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
    def setCancelRestorePlan(value: (String, RestoreInfo) => Thenable[Boolean]): Self = this.set("cancelRestorePlan", js.Any.fromFunction2(value))
    @scala.inline
    def setGetRestoreConfigInfo(value: String => Thenable[RestoreConfigInfo]): Self = this.set("getRestoreConfigInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setGetRestorePlan(value: (String, RestoreInfo) => Thenable[RestorePlanResponse]): Self = this.set("getRestorePlan", js.Any.fromFunction2(value))
    @scala.inline
    def setRestore(value: (String, RestoreInfo) => Thenable[RestoreResponse]): Self = this.set("restore", js.Any.fromFunction2(value))
  }
  
}

