package typings.cordovaPluginAppVersion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetAppName extends js.Object {
  def getAppName(): js.Promise[String]
  def getPackageName(): js.Promise[String]
  def getVersionCode(): js.Promise[String]
  def getVersionNumber(): js.Promise[String]
}

object AnonGetAppName {
  @scala.inline
  def apply(
    getAppName: () => js.Promise[String],
    getPackageName: () => js.Promise[String],
    getVersionCode: () => js.Promise[String],
    getVersionNumber: () => js.Promise[String]
  ): AnonGetAppName = {
    val __obj = js.Dynamic.literal(getAppName = js.Any.fromFunction0(getAppName), getPackageName = js.Any.fromFunction0(getPackageName), getVersionCode = js.Any.fromFunction0(getVersionCode), getVersionNumber = js.Any.fromFunction0(getVersionNumber))
  
    __obj.asInstanceOf[AnonGetAppName]
  }
}

