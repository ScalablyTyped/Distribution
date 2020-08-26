package typings.cordovaPluginAppVersion.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetAppName extends js.Object {
  def getAppName(): js.Promise[String] = js.native
  def getPackageName(): js.Promise[String] = js.native
  def getVersionCode(): js.Promise[String] = js.native
  def getVersionNumber(): js.Promise[String] = js.native
}

object GetAppName {
  @scala.inline
  def apply(
    getAppName: () => js.Promise[String],
    getPackageName: () => js.Promise[String],
    getVersionCode: () => js.Promise[String],
    getVersionNumber: () => js.Promise[String]
  ): GetAppName = {
    val __obj = js.Dynamic.literal(getAppName = js.Any.fromFunction0(getAppName), getPackageName = js.Any.fromFunction0(getPackageName), getVersionCode = js.Any.fromFunction0(getVersionCode), getVersionNumber = js.Any.fromFunction0(getVersionNumber))
    __obj.asInstanceOf[GetAppName]
  }
  @scala.inline
  implicit class GetAppNameOps[Self <: GetAppName] (val x: Self) extends AnyVal {
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
    def setGetAppName(value: () => js.Promise[String]): Self = this.set("getAppName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetPackageName(value: () => js.Promise[String]): Self = this.set("getPackageName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVersionCode(value: () => js.Promise[String]): Self = this.set("getVersionCode", js.Any.fromFunction0(value))
    @scala.inline
    def setGetVersionNumber(value: () => js.Promise[String]): Self = this.set("getVersionNumber", js.Any.fromFunction0(value))
  }
  
}

